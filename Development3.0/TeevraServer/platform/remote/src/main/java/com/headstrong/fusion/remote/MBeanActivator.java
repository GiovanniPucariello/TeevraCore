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
 * $Id: MBeanActivator.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.remote;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

import com.headstrong.fusion.remote.impl.ManagedBeanCreatorImpl;

/**
 * The <code>MBeanActivator</code> class is the <code>BundleActivator</code>
 * for the Fusion-Remote service bundle. This activator sets up JMX connection
 * registers the <code>ManagedBeanCreator</code>. When the bundle is stopped,
 * the beanCreator is shutdown.
 */
public class MBeanActivator implements BundleActivator {

	public static final String FUSION_JMX_URL = "fusion.jmx.url";
	public static final String FUSION_JMX_PORT = "fusion.jmx.port";
	public static final String FUSION_JMX_USERNAME = "fusion.jmx.username";
	public static final String FUSION_JMX_PASSWORD = "fusion.jmx.password";
	public static  String FUSION_JMX_USERNAME_VAL; 
	public static  String FUSION_JMX_PASSWORD_VAL ;
	private ManagedBeanCreator beanCreator;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		
		int jmxPort = Integer.parseInt(context.getProperty(FUSION_JMX_PORT));
		String jmxUrl = context.getProperty(FUSION_JMX_URL);
		FUSION_JMX_USERNAME_VAL = context.getProperty(FUSION_JMX_USERNAME);
		FUSION_JMX_PASSWORD_VAL = context.getProperty(FUSION_JMX_PASSWORD);
		
		beanCreator = new ManagedBeanCreatorImpl(jmxPort, jmxUrl);
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, beanCreator.getClass().getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion managedbean creator Implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		context.registerService(ManagedBeanCreator.class.getName(),
				beanCreator, props);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {

		beanCreator.destroy();
	}

}
