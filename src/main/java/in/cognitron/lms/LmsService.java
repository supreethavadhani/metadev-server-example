package in.cognitron.lms;

import org.simplity.fm.core.serialize.IInputObject;
import org.simplity.fm.core.service.IService;
import org.simplity.fm.core.service.IServiceContext;

/**
 * Service implementATION for the project. This common abstract class helps us
 * in plugging any common task to be carried out before/after a service
 * execution. Every Lms Service MUST extend this abstract service
 *
 * @author cognitron.in
 *
 */
public abstract class LmsService implements IService {

	@Override
	public void serve(final IServiceContext ctx, final IInputObject inputObject) throws Exception {
		this.execute((LmsServiceContext) ctx, inputObject);
	}

	@Override
	public boolean serveGuests() {
		return true;
	}

	/**
	 * @param ctx
	 * @param inputObject
	 */
	protected abstract void execute(LmsServiceContext ctx, IInputObject inputObject) throws Exception;
}
