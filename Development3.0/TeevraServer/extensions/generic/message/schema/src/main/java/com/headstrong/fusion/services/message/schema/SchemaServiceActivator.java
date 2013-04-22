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
 * $Id: SchemaServiceActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.fusion.services.message.schema;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.StateChangeObserverService;
import com.headstrong.fusion.failover.StateObserver;
import com.headstrong.fusion.remote.ManagedBeanCreator;
import com.headstrong.fusion.services.message.schema.remoting.SchemaRemoteAccess;
import com.headstrong.fusion.services.message.schema.remoting.SchemaRemoteAccessMBean;

/**
 * Activates Schema Service
 */
public class SchemaServiceActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(SchemaServiceActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		FusionSchemaService schemaService = new FusionSchemaService();
		schemaService.reloadCache();
		// Register Mbean
		this.registerRemoteBean(context, schemaService);

		// Register state change observer.
		this.registerStateObserver(context, schemaService);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {

	}

	/**
	 * Registers a remote M-bean.
	 * 
	 * @param bundleContext
	 * @throws Exception
	 */
	private void registerRemoteBean(BundleContext bundleContext,
			FusionSchemaService schemaService) throws Exception {
		logger.info("Registering remote administration JMX Mbean");
		SchemaRemoteAccessMBean remoteAccess = new SchemaRemoteAccess(
				schemaService);
		ServiceReference sRef = bundleContext
				.getServiceReference(ManagedBeanCreator.class.getName());
		if (sRef != null) {
			ManagedBeanCreator managedCreator = (ManagedBeanCreator) bundleContext
					.getService(sRef);
			managedCreator.registerMBean(remoteAccess, "Schema Context",
					"SchemaContext");
		}
		logger.info("Remote administration JMX Mbean registration complete.");
	}

	/**
	 * Registers an state change observer with bundle context. Admin module
	 * sends an update singal to all the admin module on state change.
	 * 
	 * @see StateObserver#update(java.util.Observable, Object)
	 * @param bundleContext
	 */
	private void registerStateObserver(BundleContext bundleContext,
			FusionSchemaService schemaService) {
		logger.info("Registering state change observers for schema service.");
		StateChangeObserverService stateChangeObserverService = new SchemaServiceStateObserver(
				schemaService);
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, StateChangeObserverService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Schema Service state observer Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		bundleContext.registerService(StateChangeObserverService.class
				.getName(), stateChangeObserverService, props);
		logger
				.info("State change observers registration complete for schema service.");
	}
}
