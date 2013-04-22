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
 * $Id: PerformanceTestActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

package com.hs.fusion.performance;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.headstrong.fusion.remote.ManagedBeanCreator;
import com.hs.fusion.performance.mbean.RemotePerfTest;
import com.hs.fusion.performance.mbean.RemotePerfTestMBean;

/**
 * Starts the performance tests on the service.
 * 
 */
public class PerformanceTestActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		PerformanceDataLogger logger = new PerformanceDataLogger();
		PerformanceTester tester = new PerformanceTester(context, logger);
		RemotePerfTestMBean remoteAccess = new RemotePerfTest(tester);
		ServiceReference sRef = context
				.getServiceReference(ManagedBeanCreator.class.getName());
		if (sRef != null) {
			ManagedBeanCreator managedCreator = (ManagedBeanCreator) context
					.getService(sRef);
			managedCreator.registerMBean(remoteAccess, "Performance Tester",
					"PerformanceTest");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
	}
}
