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
 * $Id: DbFormatterServiceActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 13, 2008 
 */

package com.headstrong.fusion.services.message.formatter.db;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.formatter.db.impl.DbFormatterServiceImpl;

/**
 * 
 */
public class DbFormatterServiceActivator implements BundleActivator {

	ServiceAliasManager aliasManager = ServiceAliasManager.getInstance();
	private static final Logger logger = LoggerFactory
			.getLogger(DbFormatterServiceActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		DbFormatterService dbFormatter = new DbFormatterServiceImpl();
		// Initialize the Service.
		dbFormatter.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, DbFormatterService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion DB Formatter Implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :"
				+ DbFormatterService.class.getName());

		context.registerService(DbFormatterService.class.getName(),
				dbFormatter, props);
		/**
		 * Register service alias for Db Formatter
		 */
		aliasManager.registerServiceAlias(DbFormatterService.class
				.getSimpleName(), DbFormatterService.class.getName());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		logger.info("Stopping service " + DbFormatterService.class.getName());
	}

}
