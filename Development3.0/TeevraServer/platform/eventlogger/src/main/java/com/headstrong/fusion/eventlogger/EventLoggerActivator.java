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
 * $Id: EventLoggerActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 1, 2008 
 */

package com.headstrong.fusion.eventlogger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.eventlogger.factory.EventLogPersistorFactory;
import com.headstrong.fusion.eventlogger.factory.EventLogWriterFactory;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;
import com.headstrong.fusion.eventlogger.logmanager.EventLogManager;
import com.headstrong.fusion.eventlogger.logmanager.EventLogQueue;
import com.headstrong.fusion.eventlogger.persistor.EventLogPersistor;
import com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccess;
import com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccessMBean;
import com.headstrong.fusion.remote.ManagedBeanCreator;

/**
 * The <code>EventLoggerActivator</code> class is the
 * <code>BundleActivator</code> for the Fusion-Eventlogger bundle. This bundle
 * initializes the event logger factory and makes it available for the
 * application to log events.
 */
public class EventLoggerActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(EventLoggerActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		EventLoggerFactory.createEventLoggerFactory(context);
		EventLogWriterFactory.createEventLogWriterFactory(context);
		EventLogPersistorFactory.createEventLogPersistorFactory(context);
		// create eventlog queue
		EventLogQueue.createEventlogQueue(context);
		// start polling in-memory queue to store event logs
		EventLogManager.logEvents();
		// Register Mbean
		this.registerRemoteBean(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		// stop eventlog persisting threads
		EventLogPersistor persistor = EventLogPersistorFactory
				.getEventLogPersistor(context
						.getProperty(Properties.EVENT_LOG_STORAGE));
		persistor.stopPersistProcessEventLogs();
		persistor.stopPersistMessageEventLogs();
		persistor.stopPersistComponentEventLogs();
		// stop writing from queue to storage
		EventLogManager.stopLogEvents();
	}

	/**
	 * Registers a remote M-bean.
	 * 
	 * @precondition
	 * @postcondition
	 * @param bundleContext
	 * @throws Exception
	 */
	private void registerRemoteBean(BundleContext bundleContext)
			throws Exception {
		logger.info("Registering remote administration JMX Mbean");
		EventLogRemoteAccessMBean remoteAccess = new EventLogRemoteAccess(
				bundleContext);
		ServiceReference sRef = bundleContext
				.getServiceReference(ManagedBeanCreator.class.getName());
		if (sRef != null) {
			ManagedBeanCreator managedCreator = (ManagedBeanCreator) bundleContext
					.getService(sRef);
			managedCreator.registerMBean(remoteAccess, "EventLog Context",
					"EventLogContext");
		}
		logger.info("Remote administration JMX Mbean registration complete.");
	}
}
