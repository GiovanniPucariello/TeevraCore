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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;

/**
 * Resolves a service using OSGI Service Registry.
 * 
 */
public class ServiceAliasResolverImpl<T> implements ServiceResolver<T> {

	private static Logger logger = LoggerFactory
			.getLogger(ServiceAliasResolverImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.resolver.ServiceResolver#getService(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public T getService(String alias, long timeToWait) {
		T service = null;

		try {
			service = (T) ServiceAliasManager.getInstance().getServiceByAlias(
					alias, timeToWait);
		} catch (ServiceUnavailableException e) {
			logger.error("Error resolving service alias " + alias);
			// Null would be returned.
		}
		return service;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.resolver.ServiceResolver#isServiceAvailable(java.lang.String,
	 *      long)
	 */
	@SuppressWarnings("unchecked")
	public boolean isServiceAvailable(String alias, long timeToWait) {
		T service = null;
		boolean available = false;

		try {
			service = (T) ServiceAliasManager.getInstance().getServiceByAlias(
					alias, timeToWait);
		} catch (ServiceUnavailableException e) {
			logger.error("Error resolving service alias " + alias);
			// Null would be returned.
		}

		available = service != null ? true : false;
		return available;
	}
}
