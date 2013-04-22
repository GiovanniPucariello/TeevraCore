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
 * $Id: FusionActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 15, 2008 
 */

package com.headstrong.fusion.core;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ApplicationContextService;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.ServiceAliasResolverImpl;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.commons.resolver.exception.DuplicateAliasException;
import com.headstrong.fusion.commons.resolver.exception.ServiceAliasManagerInitializationException;
import com.headstrong.fusion.config.manager.ClusteredConfigurationManager;
import com.headstrong.fusion.config.manager.ClusteredProcessDefinitionManager;
import com.headstrong.fusion.config.manager.XmlProcessDefinitionParser;
import com.headstrong.fusion.core.recovery.DbRecoveryDataStore;
import com.headstrong.fusion.core.recovery.RecoveryDataStore;
import com.headstrong.fusion.core.recovery.RecoveryManager;
import com.headstrong.fusion.core.recovery.RecoveryManagerImpl;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.failover.StateChangeObserverService;
import com.headstrong.fusion.failover.StateObserver;
import com.headstrong.fusion.failover.request.data.ClusteredStateManager;
import com.headstrong.fusion.remote.ManagedBeanCreator;
import com.headstrong.fusion.scheduler.QuartzScheduler;

/**
 * {@link FusionActivator} initializes {@link ApplicationContext} and delegates
 * the initialization to {@link BootstrapManager}.
 * 
 * {@link ApplicationContext} is not directly dependent on
 * {@link FusionActivator} or {@link BootstrapManager}. These are two classes
 * which facilitates the initialization of <b>Fusion</b> when invoked using
 * OSGI container.
 * <p>
 * {@link FusionActivator} delegates the bootstrap responsibilities to
 * {@link BootstrapManager} which start the Fusion and sets the state of the
 * application as <b>ACTIVE</b>. Fusion startup depends on the startup type of
 * the application. If running in clustered mode, Bootstrap happens only if the
 * instance is Master or else the activator puts the instance on STANDBY mode
 * which would be activated as per the fail over strategies when the master goes
 * down.
 * <p>
 * Also when the <b>Fusion</b> is shutting down it takes the responsibility of
 * graceful shutdown all the processes.
 * 
 */
public class FusionActivator implements BundleActivator {
	private static Logger logger = LoggerFactory
			.getLogger(FusionActivator.class);
	private ApplicationContext applicationContext;
	private ServiceResolver<AdminService> adminServiceResolver;

	public static int FIRST_MSG_DELAY_VAL = 0;
	public static String FIRST_MSG_DELAY = "FirstMessageDelay";
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		logger.info("Fusion core activation sequence started.");
		try {
			BundleContextManager.init(bundleContext);
			this.adminServiceResolver = new ServiceResolverImpl<AdminService>(
					bundleContext);
			// Initialize Application Context.
			this.applicationContext = this
					.initApplicationContext(bundleContext);
			// Register Remote Access M-Bean
			this.registerRemoteBean(bundleContext);
			// Register state change observer.
			this.registerStateObserver(bundleContext);
			// registered clustered configuration managers.
			this.registerClusteredConfigManagers();
			// Final startup handling is based on properties.
			// check member state
			this.handleBootstrap(bundleContext);
			// Register Application Context service.
			this.registerApplicationContextService(bundleContext,
					applicationContext);
			FIRST_MSG_DELAY_VAL = Integer.parseInt(bundleContext.getProperty(FIRST_MSG_DELAY));
		} catch (Exception ex) {
			logger.error("Error activating Application instance.", ex);
			throw ex;
		}
		logger.info("Fusion core activation sequence finised.");
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 */
	private void registerClusteredConfigManagers() throws Exception {
		AdminService adminService = this.adminServiceResolver.getService(
				AdminService.class.getName(), 100);
		if (adminService != null) {
			logger.info("Registering clustered configuration managers");
			ClusteredStateManager clusteredStateManager = adminService
					.getClusteredStateManager();
			if (clusteredStateManager != null) {
				// Configuration Manager.
				clusteredStateManager.registerDataHandler(
						this.applicationContext.getConfigurationManager()
								.getClass().getName(),
						(ClusteredConfigurationManager) this.applicationContext
								.getConfigurationManager());
				// Process definition manager.
				clusteredStateManager
						.registerDataHandler(
								this.applicationContext
										.getProcessDefinitionManager()
										.getClass().getName(),
								(ClusteredProcessDefinitionManager) this.applicationContext
										.getProcessDefinitionManager());
			}
			logger
					.info("Clustered configuration managers registration complete.");
		}
	}

	/**
	 * Registers an state change observer with bundle context. Admin module
	 * sends an update singal to all the admin module on state change.
	 * 
	 * @see StateObserver#update(java.util.Observable, Object)
	 * @param bundleContext
	 */
	private void registerStateObserver(BundleContext bundleContext) {
		logger.info("Registering state change observers.");
		StateChangeObserverService stateChangeObserverService = new FusionCoreStateObserver(
				this.applicationContext.getBootstrapManager(),
				this.adminServiceResolver);
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, StateChangeObserverService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion core state observer Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		bundleContext.registerService(StateChangeObserverService.class
				.getName(), stateChangeObserverService, props);
		logger.info("State change observers registration complete.");
	}

	/**
	 * Handles the bootstrap of the application. Checks if the member state is
	 * ACTIVE starts the processes.
	 * 
	 * @param bundleContext
	 * @throws Exception
	 */
	private void handleBootstrap(BundleContext bundleContext) throws Exception {
		AdminService adminService = adminServiceResolver.getService(
				AdminService.class.getName(), 100);
		if (adminService != null) {
			if (adminService.getMemberState() != null
					&& adminService.getMemberState().equals(State.ACTIVE)) {
				this.applicationContext.bootStrap();
				// on successful bootstrap set the status to RUNNING.
				adminService.getMemberInfo().setState(State.RUNNING);
			}
		}

	}

	/**
	 * This method Initializes the Fusion Application Context. The Application
	 * by default is in stand-by mode. Controller checks if the application is
	 * the master application and on confirmation bootstraps the fusion.
	 * 
	 * @param bundleContext
	 * @return {@link ApplicationContext}
	 */
	private ApplicationContext initApplicationContext(
			BundleContext bundleContext) throws Exception {
		logger.info("Initialzing application context");
		// 1: create ApplicationContext.
		DefaultApplicationContext applicationContext = DefaultApplicationContext.getInstance(
				bundleContext);
		// Initialize the default MediationServiceResolver
		applicationContext
				.setMediationServiceResolver(new ServiceAliasResolverImpl<MediationService>());
		// Set default Process scheduler.
		applicationContext.setQuartzScheduler(new QuartzScheduler(
				bundleContext));
		// Set default Process Definition handler ( generates PCM from XML )
		applicationContext
				.setProcessDefinitionHandler(new XmlProcessDefinitionParser(
						bundleContext));
		// set Default Fusion Configuration Manager.
		applicationContext
				.setConfigurationManager(new ClusteredConfigurationManager(
						bundleContext));
		// set process definition manager.
		applicationContext
				.setProcessDefinitionManager(new ClusteredProcessDefinitionManager(
						bundleContext));
		// set the bootstrap manager.
		BootstrapManager bootstrapManager = new FusionBootstrapManager(
				applicationContext);
		applicationContext.setBootstrapManager(bootstrapManager);
		
		// register recovery manager.
		RecoveryManager recoveryManager = new RecoveryManagerImpl();
		RecoveryDataStore recoveryDataStore = new DbRecoveryDataStore();
		recoveryManager.setRecoveryDataStore(recoveryDataStore);
		applicationContext.setRecoveryManager(recoveryManager);
		
		logger.info("Application initialization complete.");
		return applicationContext;
	}

	/**
	 * Registers a remote M-bean.
	 * 
	 * @param bundleContext
	 * @throws Exception
	 */
	private void registerRemoteBean(BundleContext bundleContext)
			throws Exception {
		logger.info("Registering remote administration JMX Mbean");
		FusionRemoteAccessMBean remoteAccess = new FusionRemoteAccess(
				applicationContext);
		ServiceReference sRef = bundleContext
				.getServiceReference(ManagedBeanCreator.class.getName());
		if (sRef != null) {
			ManagedBeanCreator managedCreator = (ManagedBeanCreator) bundleContext
					.getService(sRef);
			managedCreator.registerMBean(remoteAccess, "Application Context",
					"ApplicationContext");
		}
		logger.info("Remote administration JMX Mbean registration complete.");
	}

	/**
	 * Registers an Application Context service with OSGi bundle context.
	 * 
	 * @param bundleContext
	 *            OSGi Bundle Context.
	 * @param applicationContext
	 *            Application Context.
	 * @throws ServiceAliasManagerInitializationException
	 * @throws DuplicateAliasException
	 */
	private void registerApplicationContextService(BundleContext bundleContext,
			ApplicationContext applicationContext)
			throws ServiceAliasManagerInitializationException,
			DuplicateAliasException {
		ApplicationContextService applicationContextService = new ApplicationContextServiceImpl(
				applicationContext);

		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, ApplicationContextService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Application Context Service");
		props.put(Constants.SERVICE_VENDOR, FusionConstants.VENDOR_NAME);
		bundleContext.registerService(
				ApplicationContextService.class.getName(),
				applicationContextService, props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				ApplicationContextService.class.getSimpleName(),
				ApplicationContextService.class.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		// 2: Application context shutdown
		applicationContext.shutDown();
	}
}
