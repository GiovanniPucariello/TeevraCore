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
 * $Id: ConditionalDBActivator.java
 * $Revision: 
 * $Author: 
 * $DateTime: 
 */

package com.headstrong.fusion.connector.conditionaldb;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.component.FusionComponentFactory;

/**
 * conditonalDB Activator.
 * 
 */
public class ConditionalDBActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext arg0) throws Exception {
		ConditionalDBComponent condDBComponent = new ConditionalDBComponent();
		FusionComponentFactory.addComponent(ConditionalDBComponent.class
				.getSimpleName(), condDBComponent);
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
