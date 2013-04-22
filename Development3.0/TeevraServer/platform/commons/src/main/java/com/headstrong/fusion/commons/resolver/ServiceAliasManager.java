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
 * $Id: ServiceAliasManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 11, 2008 
 */

package com.headstrong.fusion.commons.resolver;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.exception.DuplicateAliasException;
import com.headstrong.fusion.commons.resolver.exception.ServiceAliasManagerInitializationException;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;

/**
 * OSGI services are registered using service interface names.
 * 
 */
public class ServiceAliasManager {

	private static Logger logger = LoggerFactory
			.getLogger(ServiceAliasManager.class);
	/**
	 * Apache Felix ( OSGI ) Bundle Context. Service are finally registered with
	 * apache bundle context. Service Alias manager only keeps a local copy of
	 * ServiceTracker with alias name as the key.
	 */
	private BundleContext bundleContext;

	/**
	 * Singleton Instance
	 */
	private static ServiceAliasManager aliasManager = new ServiceAliasManager();

	private Map<String, ServiceTracker> serviceRegistry;

	/**
	 * this is set to true when the bundleContext is set.
	 */
	private boolean initialized = false;

	private static long DEFAULT_WAIT_TIME = 0;

	private ServiceAliasManager() {
		this.serviceRegistry = new HashMap<String, ServiceTracker>();
	}

	public static ServiceAliasManager getInstance() {
		return aliasManager;
	}

	/**
	 * Initializes the {@link BundleContext}
	 * 
	 * @param bundleContext
	 */
	public synchronized void initialize(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
		this.setInitialized(true);
	}

	/**
	 * @return the initialized
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * @param initialized
	 *            the initialized to set
	 */
	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	/**
	 * Registers a service with OSGI bundle context. also keeps a local copy of
	 * {@link ServiceTracker} using the alias name.
	 * 
	 * @throws ServiceAliasManagerInitializationException
	 * @throws DuplicateAliasException
	 * 
	 */
	public synchronized void registerServiceAlias(String alias, String type)
			throws ServiceAliasManagerInitializationException,
			DuplicateAliasException {
		if (!this.isInitialized()) {
			throw new ServiceAliasManagerInitializationException(
					"Service Alias Manager not initialized yet.");
		}
		logger.info("registering service " + type + " for alias " + alias);
		// Register the service with the BundleContext.
		// check if the service is already registered.
		ServiceTracker tracker = serviceRegistry.get(alias);
		if (tracker != null) {
			Object existingService = tracker.getService();
			if (existingService != null
					&& !existingService.getClass().getName().equals(type)) {
				// ie already a service is registered with the same alias
				// but different interface.
				throw new DuplicateAliasException("Already a service "
						+ existingService.getClass().getName()
						+ " registered with the same alias " + alias);

			}
		}

		// create a service tracker for the same and keep a local registry using
		// the alias name.
		ServiceTracker serviceTracker = new ServiceTracker(this.bundleContext,
				type, null);
		serviceTracker.open();
		this.serviceRegistry.put(alias, serviceTracker);
	}

	/**
	 * 
	 * @param alias
	 * @return
	 * @throws ServiceUnavailableException
	 */
	public Object getServiceByAlias(String alias, long timeToWait)
			throws ServiceUnavailableException {

		// TODO :: Need to check if there is a need to synchronization
		ServiceTracker serviceTracker = this.serviceRegistry.get(alias.trim());
		if (serviceTracker == null) {
			throw new ServiceUnavailableException(
					"No service found for service alias " + alias);
		}
		// 
		Object service = null;
		try {
			if (timeToWait == 0) {
				timeToWait = DEFAULT_WAIT_TIME;
			}
			service = serviceTracker.waitForService(timeToWait);
		} catch (InterruptedException e) {
			// Error is ignored as this would anyway return null
			// which should be handled by the caller.
			logger.error("Error fetching service from registry.", e);
		}
		return service;
	}
}
