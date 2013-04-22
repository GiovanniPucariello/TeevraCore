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

package com.headstrong.fusion.services.message.formatter.binary;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.formatter.binary.impl.BinaryFormatterServiceImpl;
import com.headstrong.fusion.services.message.formatter.binary.impl.BinaryParserServiceImpl;
import com.headstrong.fusion.services.message.formatter.binary.impl.BinaryServiceConfigParserImpl;
/**
 * Registers BinaryParserService and BinaryFormatterService
 */
public class BinaryParserFormatterServiceActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
	.getLogger(BinaryParserFormatterServiceActivator.class);

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// register template formatter service configuration parser.
		ServiceAliasManager serviceAliasManager = ServiceAliasManager
				.getInstance();
		
		logger.info("registering Binary parser service.");
		BinaryParserService fixmlParser = new BinaryParserServiceImpl();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, BinaryParserService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Binary Parser Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ BinaryParserService.class.getName());
		context.registerService(BinaryParserService.class.getName(),
				fixmlParser, props);
		serviceAliasManager.registerServiceAlias(
				BinaryParserService.class.getSimpleName(),
				BinaryParserService.class.getName());

		logger.info("registering Binary formatter service.");
		BinaryFormatterService fixmlFormatter = new BinaryFormatterServiceImpl();
		props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, BinaryFormatterService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"FIXML Formatter Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ BinaryFormatterService.class.getName());
		context.registerService(BinaryFormatterService.class.getName(),
				fixmlFormatter, props);
		serviceAliasManager.registerServiceAlias(
				BinaryFormatterService.class.getSimpleName(),
				BinaryFormatterService.class.getName());
		
		logger.info("registering configuration parser for Binary parser & formatter service ");
		BinaryServiceConfigParser configParser = new BinaryServiceConfigParserImpl();
		props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, BinaryServiceConfigParser.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Config Parser for BinaryParserFormatterService");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ BinaryServiceConfigParser.class.getName());
		context.registerService(BinaryServiceConfigParser.class.getName(),
				configParser, props);
		serviceAliasManager.registerServiceAlias(
				BinaryServiceConfigParser.class.getSimpleName(),
				BinaryServiceConfigParser.class.getName());

	}

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
	}

}
