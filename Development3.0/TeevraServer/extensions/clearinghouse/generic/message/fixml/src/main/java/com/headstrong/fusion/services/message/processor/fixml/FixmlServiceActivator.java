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
 * $Id: FixmlParserServiceActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 26, 2009 
 */

package com.headstrong.fusion.services.message.processor.fixml;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.java.FixmlContextFactory;
import com.headstrong.fusion.bo.java.FixmlNamespace;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.processor.fixml.impl.FixmlFormatterServiceImpl;
import com.headstrong.fusion.services.message.processor.fixml.impl.FixmlParserServiceImpl;

/**
 * Fixml processor activator.
 */
public class FixmlServiceActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(FixmlServiceActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// register template formatter service configuration parser.
		ServiceAliasManager serviceAliasManager = ServiceAliasManager
				.getInstance();

		logger.info("registering FIXML parser service.");
		FixmlParserService fixmlParser = new FixmlParserServiceImpl();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, FixmlParserService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "FIXML Parser Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ FixmlParserService.class.getName());
		context.registerService(FixmlParserService.class.getName(),
				fixmlParser, props);

		serviceAliasManager.registerServiceAlias(FixmlParserService.class
				.getSimpleName(), FixmlParserService.class.getName());

		logger.info("registering FIXML formatter service.");
		FixmlFormatterService fixmlFormatter = new FixmlFormatterServiceImpl();
		props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, FixmlFormatterService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "FIXML Formatter Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ FixmlFormatterService.class.getName());
		context.registerService(FixmlFormatterService.class.getName(),
				fixmlFormatter, props);

		serviceAliasManager.registerServiceAlias(FixmlFormatterService.class
				.getSimpleName(), FixmlFormatterService.class.getName());
		
		//initialize FixmlContextFactory for the default namespace - SP2
		FixmlContextFactory.init(FixmlNamespace.DEFAULT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
	}
}
