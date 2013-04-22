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
 * $Id: ServiceConfigurationCache.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 22, 2008 
 */

package com.headstrong.fusion.services.config;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationNotFoundException;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;

/**
 * Service configurations are stored centrally in STRIDEHub database.
 * All service configurations are cached locally on the system startup.
 * 
 */
public class ServiceConfigurationCache {

	// TODO ServiceConfigurationCache is singleton class. So any other bundle using 
	// this will continue to use the cache even when the bundle is stopped. Need 
	// to check if this case has to be handled. and if yes then how to handle it.
	
	private static ServiceConfigurationCache cache = new ServiceConfigurationCache();
	private Map<ServiceConfiguration, Object> serviceConfigurationMap;

	/**
	 * private constructor required to make the cache singleton.
	 *  
	 */
	private ServiceConfigurationCache() {
		serviceConfigurationMap = new HashMap<ServiceConfiguration, Object>();
	}

	/**
	 * Returns singleton instance.
	 * 
	 * @return {@link ServiceConfigurationCache}
	 */
	public static ServiceConfigurationCache getInstance() {
		return cache;
	}

	/**
	 * Adds a new configuration in the cache.
	 * 
	 * @param processId
	 * @param serviceId
	 * @param propertyId
	 * @return
	 */
	public Object getPropertyConfiguration(
			ServiceConfiguration serviceConfiguration)
			throws ServiceConfigurationNotFoundException {
		Object configuration = serviceConfigurationMap
				.get(serviceConfiguration);
		if (configuration == null) {
			throw new ServiceConfigurationNotFoundException(
					"No configuration found for service configuration "
							+ serviceConfiguration);
		}
		return configuration;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param serviceConfiguration
	 * @param propertyConfig
	 */
	public void addPropertyConfiguration(
			ServiceConfiguration serviceConfiguration, Object propertyConfig) {
		this.serviceConfigurationMap.put(serviceConfiguration, propertyConfig);
	}

}
