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
 * $Id: MediationServiceResolver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.commons.resolver;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Resolves a service using OSGI Service Registry.
 * 
 */
public class ServiceResolverImpl<T> implements ServiceResolver<T> {

	private static Logger logger = LoggerFactory
			.getLogger(ServiceResolverImpl.class);

	/**
	 * If timeToWait is not specified ( passed 0 ). Service
	 * Resolver takes default time as timeToWait.
	 * 
	 */
	private static long DEFAULT_WAIT_TIME = 10000;
	/**
	 * A BundleContext is OSGI {@link BundleContext}
	 */
	private BundleContext bundleContext;
	private Map<String, ServiceTracker> serviceRegistry = new HashMap<String, ServiceTracker>();

	public ServiceResolverImpl(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.resolver.ServiceResolver#getService(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public T getService(String type, long timeToWait) {
		// TODO :: Need to check if there is a need to synchronization
		ServiceTracker serviceTracker = serviceRegistry.get(type);
		if (serviceTracker == null) {
			serviceTracker = this.registerServiceTracker(type);
		}
		// 
		T service = null;
		try {
			if (timeToWait == 0) {
				timeToWait = DEFAULT_WAIT_TIME;
			}
			service = (T) serviceTracker.waitForService(timeToWait);
		} catch (InterruptedException e) {
			// Error is ignored as this would anyway return null 
			// which should be handled by the caller.
			logger.error("Error while fetching service from registry", e);
		}
		return service;
	}

	/**
	 * Private method to intialize a service tracker for 
	 * a particular service type.
	 * 
	 * @param type
	 * @return
	 */
	private ServiceTracker registerServiceTracker(String type) {
		ServiceTracker serviceTracker = new ServiceTracker(this.bundleContext,
				type, null);
		serviceTracker.open();
		this.serviceRegistry.put(type, serviceTracker);
		return serviceTracker;
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.resolver.ServiceResolver#isServiceAvailable(java.lang.String, long)
	 */
	@SuppressWarnings("unchecked")
	public boolean isServiceAvailable(String type, long timeToWait) {
		boolean isAvailable = true;
		// TODO :: Need to check if there is a need to synchronization
		ServiceTracker serviceTracker = serviceRegistry.get(type);
		if (serviceTracker == null) {
			serviceTracker = this.registerServiceTracker(type);
		}
		// 
		T service = null;
		try {
			if (timeToWait == 0) {
				timeToWait = DEFAULT_WAIT_TIME;
			}
			service = (T) serviceTracker.waitForService(timeToWait);
		} catch (InterruptedException e) {
			// Error is ignored as this would anyway return null 
			// which should be handled by the caller.
			logger.error("Error while fetching service from registry", e);
			isAvailable = false;

		}
		if (service == null) {
			isAvailable = false;
		}
		return isAvailable;
	}

	/**
	 * @return the serviceRegistry
	 */
	public Map<String, ServiceTracker> getServiceRegistry() {
		return serviceRegistry;
	}

	/**
	 * @param serviceRegistry the serviceRegistry to set
	 */
	public void setServiceRegistry(Map<String, ServiceTracker> serviceRegistry) {
		this.serviceRegistry = serviceRegistry;
	}
}
