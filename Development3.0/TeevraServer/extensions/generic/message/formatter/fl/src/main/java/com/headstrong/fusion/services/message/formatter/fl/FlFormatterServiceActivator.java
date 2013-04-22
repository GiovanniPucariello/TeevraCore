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
 * $Id: FlFormatterServiceActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.fusion.services.message.formatter.fl;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.formatter.fl.impl.FlFormatterServiceImpl;

/**
 * Fixed Length Formatter Service Activator.
 * @see BundleActivator
 * 
 */
public class FlFormatterServiceActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(FlFormatterServiceActivator.class);

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {

		ServiceAliasManager aliasManager = ServiceAliasManager.getInstance();

		FlFormatterService flFormatter = new FlFormatterServiceImpl();
		//Initialize the service.
		flFormatter.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, FlFormatterService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion Fixed-Length mssage formatter service.");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ FlFormatterService.class.getName());

		// Register service with Apache Felix Context.
		context.registerService(FlFormatterService.class.getName(),
				flFormatter, props);

		// Register a service alias with Fusion.
		aliasManager.registerServiceAlias(FlFormatterService.class
				.getSimpleName(), FlFormatterService.class.getName());
	}

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.info("Stopping service " + FlFormatterService.class.getName());
	}

}
