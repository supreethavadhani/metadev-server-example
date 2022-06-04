package in.cognitron.lms.service;

import org.simplity.fm.core.Message;
import org.simplity.fm.core.MessageType;
import org.simplity.fm.core.serialize.IInputObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import in.cognitron.lms.LmsService;
import in.cognitron.lms.LmsServiceContext;

public class Hello extends LmsService {
	protected static final Logger logger = LoggerFactory.getLogger(Hello.class);
	private static final String SERVICE_NAME = "Hello";

	@Override
	public String getId() {
		return SERVICE_NAME;
	}

	@Override
	public void execute(final LmsServiceContext ctx, final IInputObject inputObject) throws Exception {
		ctx.addMessage(Message.newMessage(MessageType.Info, "Hello From the other side"));
	}

}
