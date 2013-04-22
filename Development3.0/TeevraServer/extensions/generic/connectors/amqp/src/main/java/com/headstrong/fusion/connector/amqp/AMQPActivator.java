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
 * $Id: AMQPActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 16, 2009 
 */

package com.headstrong.fusion.connector.amqp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.component.FusionComponentFactory;

/**
 * AMQP Activator.
 * 
 */
public class AMQPActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext arg0) throws Exception {
		AMQPComponent amComponent = new AMQPComponent();
		FusionComponentFactory.addComponent(AMQPComponent.class
				.getSimpleName(), amComponent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
	}

}
