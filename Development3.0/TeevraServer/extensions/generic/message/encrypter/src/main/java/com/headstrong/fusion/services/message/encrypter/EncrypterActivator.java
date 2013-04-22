package com.headstrong.fusion.services.message.encrypter;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.encrypter.EncrypterActivator;
import com.headstrong.fusion.services.message.encrypter.MessageEncrypterService;
import com.headstrong.fusion.services.message.encrypter.impl.MessageEncrypterServiceImpl;


public class EncrypterActivator implements BundleActivator {
	private static Logger logger = LoggerFactory
			.getLogger(EncrypterActivator.class);

	public void start(BundleContext context) throws Exception {
		MessageEncrypterService extractor = new MessageEncrypterServiceImpl();
		// Initialize the service.
		extractor.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, MessageEncrypterService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Message Encrypter");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :"
				+ MessageEncrypterService.class.getName());

		context.registerService(MessageEncrypterService.class.getName(),
				extractor, props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				MessageEncrypterService.class.getSimpleName(),
				MessageEncrypterService.class.getName());
	}

	public void stop(BundleContext context) throws Exception {
		logger.info("Stopping service " + MessageEncrypterService.class.getName());
	}

}
