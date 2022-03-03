
package in.cognitron.lms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.simplity.fm.core.conf.ITexter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simplity.org
 *
 */
public class Texter implements ITexter {
	private static final Logger logger = LoggerFactory.getLogger(Texter.class);
	private static final String AUTH_KEY = "229467ArqIPY27lKdx5b62a295";
	private static final String MAIN_URL = "http://api.msg91.com/api/sendhttp.php";
	private static final String URL_TEXT = MAIN_URL + "?route=4&authkey=" + AUTH_KEY + "&sender=";
	private static final String UTF_8 = StandardCharsets.UTF_8.toString();

	@Override
	public void sendText(final String senderId, final String numbers, final String sms) {
		final StringBuilder sbf = new StringBuilder(URL_TEXT);
		sbf.append(senderId).append("&mobiles=").append(numbers).append("&message=");
		try {
			sbf.append(URLEncoder.encode(sms, UTF_8));
		} catch (final UnsupportedEncodingException ignore) {
			// we know it is supported
		}

		final String urlText = sbf.toString();
		logger.info("Sending url to Texter : {}", urlText);

		try {
			final URL url = new URL(urlText);
			final URLConnection con = url.openConnection();
			con.connect();
			try (final BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
				String line;
				while ((line = reader.readLine()) != null) {
					logger.info("Response: {}", line);
				}
			}
		} catch (final IOException e) {
			logger.error("Error while sending SMS through the gateway", e);
		}
	}
}
