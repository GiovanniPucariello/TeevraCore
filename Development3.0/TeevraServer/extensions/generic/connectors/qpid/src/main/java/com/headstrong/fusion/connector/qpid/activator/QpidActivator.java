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
 * $Id: QpidActivator.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Apr 12, 2011 
 */

package com.headstrong.fusion.connector.qpid.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.connector.qpid.BundleContextManager;
import com.headstrong.fusion.connector.qpid.QpidComponent;

/**
 * Qpid Activator.
 * 
 */
public class QpidActivator implements BundleActivator {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(QpidActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {

		BundleContextManager.init(bundleContext);

		QpidComponent qpidComponent = new QpidComponent();
		FusionComponentFactory.addComponent(
				QpidComponent.class.getSimpleName(), qpidComponent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		logger.info("Removing QpidComponent.");
		FusionComponentFactory.removeComponent(QpidComponent.class
				.getSimpleName());
	}

}
