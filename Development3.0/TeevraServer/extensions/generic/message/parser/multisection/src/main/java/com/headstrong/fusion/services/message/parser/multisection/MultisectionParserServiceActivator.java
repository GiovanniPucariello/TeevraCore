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
 * $Id: MultisectionParserServiceActivator.java
 * $Revision:
 * $Author: ssoni
 * $DateTime: Nov 26, 2008
 */

package com.headstrong.fusion.services.message.parser.multisection;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.parser.multisection.impl.MultisectionConfigParserImpl;
import com.headstrong.fusion.services.message.parser.multisection.impl.MultisectionParserServiceImpl;

/**
 * Registers multi-section parser service with the bundle context with name
 * "MultisectionParserService"
 */
public class MultisectionParserServiceActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(MultisectionParserServiceActivator.class);

	/**
	 * Invoked when the bundle is installed during start-up
	 */
	public void start(BundleContext context) throws Exception {
		MultisectionParserService multisectionParser = new MultisectionParserServiceImpl();
		// Initialize and register the parser service
		multisectionParser.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, MultisectionParserService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion Multisection Parser Implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :"
				+ MultisectionParserService.class.getName());
		context.registerService(MultisectionParserService.class.getName(),
				multisectionParser, props);
		ServiceAliasManager.getInstance().registerServiceAlias(
				MultisectionParserService.class.getSimpleName(),
				MultisectionParserService.class.getName());

		logger.info("Registering configuration parser for "
				+ "multi-section parser service ");
		MultisectionConfigParser configParser = MultisectionConfigParserImpl.getInstance();
		props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, MultisectionConfigParserImpl.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Config Parser for Multisection Parser");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		context.registerService(MultisectionConfigParser.class.getName(),
				configParser, props);
		ServiceAliasManager.getInstance().registerServiceAlias(
				MultisectionConfigParser.class.getSimpleName(),
				MultisectionConfigParser.class.getName());

	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
	}

}
