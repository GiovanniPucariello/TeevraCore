/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2010 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: CachingServiceActivator.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 06, 2010
 */

package com.headstrong.fusion.services.caching;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Caching service.
 * 
 */
public class CachingServiceActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(CachingServiceActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		logger.info("Caching Service bundle started.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.info("Caching Service bundle stopped.");
	}

}
