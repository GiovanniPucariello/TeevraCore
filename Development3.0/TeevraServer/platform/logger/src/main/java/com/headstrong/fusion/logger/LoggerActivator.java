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
 * $Id: Activator.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.logger;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;

/**
 * The <code>LoggerActivator</code> class is the <code>BundleActivator</code> for
 * the log service bundle. This activator sets up logging in NLog4J and
 * registers the <code>LogService</code> and <code>LogReaderService</code>.
 * When the bundle is stopped, the NLog4J subsystem is simply shutdown.
 */
public class LoggerActivator implements BundleActivator {

	private LogManager logManager;

	private LogSupport logSupport;

	public void start(BundleContext context) throws Exception {
		logManager = new LogManager(context);

		logSupport = new LogSupport();
		context.addBundleListener(logSupport);
		context.addFrameworkListener(logSupport);
		context.addServiceListener(logSupport);

		LogServiceFactory lsf = new LogServiceFactory(logSupport);
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, lsf.getClass().getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion LogService implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		context.registerService(LogService.class.getName(), lsf, props);

		LogReaderServiceFactory lrsf = new LogReaderServiceFactory(logSupport);
		props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, lrsf.getClass().getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion LogReaderService implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		context.registerService(LogReaderService.class.getName(), lrsf, props);
	}

	public void stop(BundleContext context) throws Exception {
		if (logSupport != null) {
			logSupport.shutdown();
			logSupport = null;
		}

		if (logManager != null) {
			logManager.shutdown();
			logManager = null;
		}
	}
}
