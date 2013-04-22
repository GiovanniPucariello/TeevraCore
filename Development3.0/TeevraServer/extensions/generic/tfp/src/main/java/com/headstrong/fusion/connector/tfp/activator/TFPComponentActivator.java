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
 * $Id: TFPComponentActivator.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.tfp.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.connector.tfp.BundleContextManager;
import com.headstrong.fusion.connector.tfp.TFPComponent;
import com.tfp.manager.PropertiesManager;

/**
 * TFP Component Activator.
 */
public class TFPComponentActivator implements BundleActivator {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(TFPComponentActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {

		logger.info("Starting Bundle TFP...");
		BundleContextManager.init(bundleContext);
		TFPComponent tfpComponent = new TFPComponent();
		FusionComponentFactory.addComponent(TFPComponent.class.getSimpleName(),
				tfpComponent);
		logger.info("Added TFP component.");

		PropertiesManager.init();
		logger.info("PropertiesManager initiallized.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext arg0) throws Exception {
		logger.info("TFPComponentActivator.stop(). Removing TFPComponent.");
		FusionComponentFactory.removeComponent(TFPComponent.class
				.getSimpleName());
	}
}
