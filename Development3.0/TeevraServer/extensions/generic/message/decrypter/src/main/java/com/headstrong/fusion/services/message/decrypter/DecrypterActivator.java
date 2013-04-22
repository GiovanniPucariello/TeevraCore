package com.headstrong.fusion.services.message.decrypter;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.decrypter.impl.MessageDecrypterServiceImpl;

public class DecrypterActivator implements BundleActivator {
	private static Logger logger = LoggerFactory
			.getLogger(DecrypterActivator.class);

	public void start(BundleContext context) throws Exception {
		MessageDecrypterService extractor = new MessageDecrypterServiceImpl();
		// Initialize the service.
		extractor.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, MessageDecrypterService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Message Decrypter");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :"
				+ MessageDecrypterService.class.getName());

		context.registerService(MessageDecrypterService.class.getName(),
				extractor, props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				MessageDecrypterService.class.getSimpleName(),
				MessageDecrypterService.class.getName());
	}

	public void stop(BundleContext context) throws Exception {
		logger.info("Stopping service " + MessageDecrypterService.class.getName());
	}

}
