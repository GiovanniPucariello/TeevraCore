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
 * $Id: IBMMQComponentActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 12, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.connector.ibm.mq.IBMMQComponent;

/**
 * IBMMQ Component Activator.
 */
public class IBMMQComponentActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		IBMMQComponent ibmmqComponent = new IBMMQComponent(context);
		FusionComponentFactory.addComponent(IBMMQComponent.class
				.getSimpleName(), ibmmqComponent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext arg0) throws Exception {
		FusionComponentFactory.removeComponent(IBMMQComponent.class
				.getSimpleName());
	}

}
