/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright Â© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: TestConnectorAcitvator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.connector.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.remote.ManagedBeanCreator;

/**
 * 
 */
public class TestConnectorAcitvator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		TestComponent component = new TestComponent();
		FusionComponentFactory.addComponent(
				TestComponent.class.getSimpleName(), component);
		registerQueueBean(bundleContext);
	}

	private void registerQueueBean(BundleContext bundleContext)
			throws Exception {
		QueueManagerAccessorMBean mbean = new QueueManagerAccessor(QueueManager
				.getInstance());
		ServiceReference sRef = bundleContext
				.getServiceReference(ManagedBeanCreator.class.getName());
		if (sRef != null) {
			ManagedBeanCreator managedCreator = (ManagedBeanCreator) bundleContext
					.getService(sRef);
			managedCreator.registerMBean(mbean, "Test Qeueue Manager",
					"QueueManager");
		}
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
