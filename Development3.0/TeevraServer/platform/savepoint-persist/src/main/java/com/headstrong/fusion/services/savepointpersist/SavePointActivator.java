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
 * $Id: SavePointActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Sep 23, 2008 
 */

package com.headstrong.fusion.services.savepointpersist;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.core.recovery.RecoveryManager;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.remote.ManagedBeanCreator;
import com.headstrong.fusion.services.savepointpersist.impl.SavePointServiceImpl;

/**
 * The <code>SavePointActivator</code> class is the
 * <code>BundleActivator</code> for the Fusion-Savepoint message persistence
 * bundle. This activator persists message in the database. It registers the
 * savepoint bean with JMX server. The context can be started/stopped remotely.
 * When the camel is shutdown, the context is stopped and the bean is
 * unregistered.
 * 
 */
public class SavePointActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(SavePointActivator.class);
	private SavePointBootstrapManager manager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// register recovery manager service.
		RecoveryManager recoveryManager = new DefaultRecoveryManager();
		// Initialize the recovery manager.
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, RecoveryManager.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Recovery Manager.");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :" + RecoveryManager.class.getName());

		// Register service with Apache Felix Context.
		context.registerService(RecoveryManager.class.getName(),
				recoveryManager, props);

		// Register a service alias with Fusion.
		ServiceAliasManager.getInstance().registerServiceAlias(
				RecoveryManager.class.getSimpleName(),
				RecoveryManager.class.getName());

		logger.info("Starting savepoint bundle.");
		SavePointServiceImpl savepoint = new SavePointServiceImpl(context);
		savepoint.createRouteForSavepoint();
		manager = new SavePointBootstrapManager(savepoint);
		this.handleBootstrap(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.debug("Stopping savepoint services.");
		this.manager.pause();
		ServiceReference sRef = context
				.getServiceReference(ManagedBeanCreator.class.getName());
		if (sRef != null) {
			ManagedBeanCreator managedCreator = (ManagedBeanCreator) context
					.getService(sRef);
			try {
				managedCreator.unRegisterMBean("MessageInfoPersistence",
						"Process");
			} catch (Throwable e) {
				// ignore.
				// FIXME
			}
		}
	}

	/**
	 * Handles the bootstrap of the application. Checks if the member state is
	 * ACTIVE starts the processes.
	 * 
	 * @param bundleContext
	 * @throws Exception
	 */
	private void handleBootstrap(BundleContext context) throws Exception {
		ServiceReference serviceReference = context
				.getServiceReference(AdminService.class.getName());
		if (serviceReference != null) {
			AdminService adminService = (AdminService) context
					.getService(serviceReference);
			if (adminService != null) {
				if (adminService.getMemberState() != null
						&& (adminService.getMemberState().equals(State.ACTIVE) || adminService
								.getMemberState().equals(State.RUNNING))) {
					ServiceReference sRef = context
							.getServiceReference(ManagedBeanCreator.class
									.getName());
					if (sRef != null) {
						ManagedBeanCreator managedCreator = (ManagedBeanCreator) context
								.getService(sRef);
						managedCreator.registerMBean(this.manager
								.getSavepoint(), "MessageInfoPersistence",
								"Process");

					} else {
						logger
								.info("No service found for managing the saveopoint service, starting by default");
						this.manager.bootstrap();
					}

					String autoStart = context
							.getProperty(FusionConstants.SAVEPOINT_AUTO_START);
					try {
						if (Boolean.parseBoolean(autoStart)) {
							this.manager.bootstrap();
						}
					} catch (Exception e) {
						logger
								.info("Error in reading property savepoint auto start, starting by default");
						this.manager.bootstrap();
					}
				}
			}
		}

	}

}
