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
 * Id: LmeConnectorActivator.java
 * Revision:
 * Author: Saurabh
 * $DateTime: Mar 16, 2011 
 */

package com.headstrong.fusion.connector.exchange.fix;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.messaging.model.endpoint.EndPointModelerFactory;


/*This class is used to register the component with
 *the OSGi framework. The start and stop methods
 *are used when the process containing this component
 *is started or stopped.
 */
public class FixConnectorActivator implements BundleActivator {

	
	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FixConnectorActivator.class);
	
	/*
	 * (non-Javadoc)
	 *
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {

		logger.info("Starting JMS Persistor bundle.");	
		
		BundleContextManager.init(bundleContext);
		
		EndPointModelerFactory.addEndPointModeler("FIX",
				new FixBindingEndPointModeler(bundleContext));	
	
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		logger.info("Stopping FIX bundle.");
		BundleContextManager.destroy();
	}
}
