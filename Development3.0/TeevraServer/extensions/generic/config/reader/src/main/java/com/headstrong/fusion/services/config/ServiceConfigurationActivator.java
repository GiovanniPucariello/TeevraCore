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
 * $Id: SchemaServiceActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.fusion.services.config;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ConfigurationService;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;

/**
 * This activates the Process Service Configuration.
 * {@link ConfigurationServiceImpl#reloadConfiguration()} is invoked that loads service
 * configuration from STRIDEhub Database.
 * 
 */
public class ServiceConfigurationActivator implements BundleActivator {
	private static final Logger logger = LoggerFactory
			.getLogger(ServiceConfigurationActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// 1: Initialize the cache
		logger.info("Initializing service configuration cache.");
		ConfigurationService schemaService = new ConfigurationServiceImpl();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, ConfigurationService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Configuration Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		context.registerService(ConfigurationService.class.getName(),
				schemaService, props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				ConfigurationService.class.getSimpleName(),
				ConfigurationService.class.getName());
		
		// Loading happens at process start so 
		// initial loading is not required.
//		schemaService.reloadConfiguration();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.info("service configuration cache de-activating.");
	}
}
