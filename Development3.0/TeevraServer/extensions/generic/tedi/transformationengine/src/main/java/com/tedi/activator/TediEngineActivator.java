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
 * $Id: TediEngineActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 8, 2010 
 */

package com.tedi.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.tedi.TediService;
import com.tedi.impl.TediServiceImpl;

/**
 * Activates Tedi engine.
 */
public class TediEngineActivator implements BundleActivator {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(TediEngineActivator.class);

	/*
	 * Initialize and register the service.
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {

		logger.info("Starting TEDI bundle");
		// Initialize BundleContextManager.
		BundleContextManager.init(context);

		// Initialize the service.
		TediService tediService = new TediServiceImpl();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, TediServiceImpl.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "TEDI Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		// Register the service.
		logger.info("Registering service :" + TediService.class.getName());
		context
				.registerService(TediService.class.getName(), tediService,
						props);
		ServiceAliasManager.getInstance().registerServiceAlias(
				TediService.class.getSimpleName(), TediService.class.getName());

	}

	/*
	 * Deactivate the bundle context manager when the bundle is stopped.
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		logger.info("Stopping TEDI bundle.");
		BundleContextManager.destroy();
	}
}
