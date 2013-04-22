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
 * $Id: FusionCommonsActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 11, 2008 
 */

package com.headstrong.fusion.commons.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;

/**
 * Initializes commons services.
 * 
 */
public class FusionCommonsActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(FusionCommonsActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// Initialize Service Alias Manager.
		logger.info("starting bundle fusion commons");
		ServiceAliasManager aliasManager = ServiceAliasManager.getInstance();
		logger.info("initializing service alias manager.");
		aliasManager.initialize(context);
		logger.info("fusion commons startup complete");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		/*
		 * ServiceAliasManager aliasManager = ServiceAliasManager.getInstance();
		 * aliasManager.setInitialized(false);
		 */
		logger.info("fusion commons bundle stopped.");
	}

}
