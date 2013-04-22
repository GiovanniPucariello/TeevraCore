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
 * $Id: TdParserServiceActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.parser.td;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.parser.td.impl.TdParserServiceImpl;

/**
 * 
 */
public class TdParserServiceActivator implements BundleActivator {
	private static final Logger logger = LoggerFactory
			.getLogger(TdParserServiceActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		logger.info("Registering TD Parser service");
		TdParserService tdParserService = new TdParserServiceImpl();
		// Initialize the service.
		tdParserService.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, TdParserService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Tag-Delimited Parser");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		context.registerService(TdParserService.class.getName(),
				tdParserService, props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				TdParserService.class.getSimpleName(),
				TdParserService.class.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		logger.info("Stopping Tag-Delimited parser service");
	}

}
