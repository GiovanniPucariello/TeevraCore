/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: TemplateFormatterServiceActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.message.formatter.template;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.formatter.template.impl.TemplateFormatterServiceImpl;
import com.headstrong.fusion.services.message.formatter.template.serviceconfig.TemplateServiceConfigParser;
import com.headstrong.fusion.services.message.formatter.template.serviceconfig.TemplateServiceConfigParserImpl;

/**
 * Template Formatter service Bundle Activator.
 * 
 */
public class TemplateFormatterServiceActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(TemplateFormatterServiceActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// register template formatter service configuration parser.
		ServiceAliasManager serviceAliasManager = ServiceAliasManager
				.getInstance();

		logger
				.info("registering template formatter service configuration parser.");

		/**
		 * Template configuration parser service registration.
		 */
		TemplateServiceConfigParser templateServiceConfigParser = new TemplateServiceConfigParserImpl();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, TemplateServiceConfigParser.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Template service Configuration Parser");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ TemplateServiceConfigParser.class.getName());
		context.registerService(TemplateServiceConfigParser.class.getName(),
				templateServiceConfigParser, props);

		serviceAliasManager.registerServiceAlias(
				TemplateServiceConfigParser.class.getSimpleName(),
				TemplateServiceConfigParser.class.getName());

		/**
		 * Registering Template formatter service.
		 */

		TemplateFormatterService templateFormatter = new TemplateFormatterServiceImpl();
		// Initialize the service.
		templateFormatter.init();
		Dictionary<String, String> formatterProps = new Hashtable<String, String>();
		formatterProps.put(Constants.SERVICE_PID,
				TemplateFormatterService.class.getName());
		formatterProps.put(Constants.SERVICE_DESCRIPTION, "Template Formatter");
		formatterProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ TemplateFormatterService.class.getName());

		context.registerService(TemplateFormatterService.class.getName(),
				templateFormatter, formatterProps);

		serviceAliasManager.registerServiceAlias(
				TemplateFormatterService.class.getSimpleName(),
				TemplateFormatterService.class.getName());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		logger.info("Stopping service "
				+ TemplateFormatterService.class.getName());

	}

}
