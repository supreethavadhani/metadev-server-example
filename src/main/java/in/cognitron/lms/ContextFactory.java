package in.cognitron.lms;

import org.simplity.fm.core.UserContext;
import org.simplity.fm.core.app.ApplicationError;
import org.simplity.fm.core.conf.IServiceContextFactory;
import org.simplity.fm.core.serialize.ISerializer;

/**
 * @author cognitron.in
 *
 */
public class ContextFactory implements IServiceContextFactory {

	@Override
	public LmsServiceContext newContext(final UserContext session, final ISerializer output) {
		if (session == null) {
			return new LmsServiceContext(null, output);
		}
		if (session instanceof LmsUserContext) {
			return new LmsServiceContext((LmsUserContext) session, output);
		}

		throw new ApplicationError("Session object is " + session.getClass().getName() + " while it should be "
				+ LmsUserContext.class.getName());
	}

}
