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
 * $Id: FlParserServiceActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.fusion.services.message.parser.fl;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.parser.fl.impl.FlParserServiceImpl;

/**
 * 
 */
public class FlParserServiceActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(FlParserServiceActivator.class);

	public void start(BundleContext context) throws Exception {
		FlParserService flParser = new FlParserServiceImpl();
		// Initialize the service.
		flParser.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, FlParserService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion FL Parser Implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :" + FlParserService.class.getName());

		context.registerService(FlParserService.class.getName(), flParser,
				props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				FlParserService.class.getSimpleName(),
				FlParserService.class.getName());
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
