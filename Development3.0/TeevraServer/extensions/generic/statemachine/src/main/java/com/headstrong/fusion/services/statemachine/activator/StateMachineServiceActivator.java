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
 * $Id: StateMachineServiceActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 17, 2009 
 */

package com.headstrong.fusion.services.statemachine.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.exception.DuplicateAliasException;
import com.headstrong.fusion.commons.resolver.exception.ServiceAliasManagerInitializationException;
import com.headstrong.fusion.services.statemachine.StateMachineService;
import com.headstrong.fusion.services.statemachine.StateMachineServiceImpl;
import com.headstrong.fusion.services.statemachine.action.StartProcess;
import com.headstrong.fusion.services.statemachine.action.StopProcess;
import com.headstrong.fusion.services.statemachine.cache.StateModelLoader;

/**
 * 
 */
public class StateMachineServiceActivator implements BundleActivator {
	private static final Logger logger = LoggerFactory
			.getLogger(StateMachineServiceActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		logger.info("Registering State Machine service");
		StateMachineService stateMachineService = new StateMachineServiceImpl();
		// Initialize the service.
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, StateMachineService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "State Machine Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		context.registerService(StateMachineService.class.getName(),
				stateMachineService, props);
		ServiceAliasManager.getInstance().registerServiceAlias(
				StateMachineService.class.getSimpleName(),
				StateMachineService.class.getName());
		// Initialize state model cache.
		StateModelLoader.reloadConfiguration();
		//
		this.registerAction(context);
	}

	/**
	 * Registers StartProcess/StopProcess Action.
	 * 
	 * @param bundleContext
	 * @throws ServiceAliasManagerInitializationException
	 * @throws DuplicateAliasException
	 */
	private void registerAction(BundleContext bundleContext)
			throws ServiceAliasManagerInitializationException,
			DuplicateAliasException {
		this.registerStartProcessAction(bundleContext);
		this.registerStopProcessAction(bundleContext);
	}

	/**
	 * Registers Start process action.
	 * 
	 * @param bundleContext
	 * @throws ServiceAliasManagerInitializationException
	 * @throws DuplicateAliasException
	 */
	private void registerStartProcessAction(BundleContext bundleContext)
			throws ServiceAliasManagerInitializationException,
			DuplicateAliasException {
		StartProcess startProcess = new StartProcess();
		// Initialize the service.
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, StartProcess.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Start Process Action");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		bundleContext.registerService(StartProcess.class.getName(),
				startProcess, props);
		ServiceAliasManager.getInstance().registerServiceAlias(
				StartProcess.class.getSimpleName(),
				StartProcess.class.getName());
	}

	/**
	 * Registers StopProcess action.

	 * @param bundleContext
	 * @throws ServiceAliasManagerInitializationException
	 * @throws DuplicateAliasException
	 */
	private void registerStopProcessAction(BundleContext bundleContext)
			throws ServiceAliasManagerInitializationException,
			DuplicateAliasException {
		StopProcess stopProcess = new StopProcess();
		// Initialize the service.
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, StopProcess.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Stop Process Action");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		bundleContext.registerService(StopProcess.class.getName(), stopProcess,
				props);
		ServiceAliasManager.getInstance().registerServiceAlias(
				StopProcess.class.getSimpleName(), StopProcess.class.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.info("Stopping State Machine service");
	}

}
