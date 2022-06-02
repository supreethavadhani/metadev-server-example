package in.cognitron.lms;

import org.simplity.fm.core.app.App;
import org.simplity.fm.core.app.AppConfigProvider;
import org.simplity.fm.core.http.JettyHandler;

/**
 * main class to be run
 *
 * @author simplity.org
 *
 */
public class Server {
	/**
	 * start jetty server on port 8080. To be extended to get run-time parameter
	 * for port, and error handling if port is in-use etc..
	 * <br/>
	 * Simply invoke this as java app to run the server (of course the class
	 * path etc.. are to be taken care of)
	 *
	 * @param args
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {
		final AppConfigProvider ap = new Bootstrapper();
		App.configureApp(ap.getConfig());
		Integer server_port = 8080;	
		if(args.length > 0) {
			server_port = Integer.parseInt(args[0]);
		}
		JettyHandler.serve(server_port, false);
	}
}
