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
 * $Id: ServiceConfigurationParserRegistry.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 28, 2008
 */

package com.headstrong.fusion.services.config.parse;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParserNotFoundException;

/**
 * All services would register service configuration parser with this class.
 * 
 */
public class ServiceConfigurationParserRegistry {

	private static final Logger logger = LoggerFactory
			.getLogger(ServiceConfigurationParserRegistry.class);

	private static ServiceConfigurationParserRegistry serviceConfigurationParserRegistry = new ServiceConfigurationParserRegistry();

	private Map<String, Map<String, String>> servicePropertyParserMap;

	private ServiceConfigurationParserRegistry() {
		servicePropertyParserMap = new HashMap<String, Map<String, String>>();
	}

	/**
	 * @return
	 */
	public static ServiceConfigurationParserRegistry getInstance() {
		return serviceConfigurationParserRegistry;
	}

	/**
	 * @param serviceType
	 * @param propertyType
	 * @param parserType
	 */
	public synchronized void registerServiceConfigurationParser(
			String serviceType, String propertyType, String parserType) {
		if (logger.isInfoEnabled()) {
			logger.info("Registering configuration parser for service type "
					+ serviceType + " and property type " + propertyType);
		}
		Map<String, String> propertyParserMap;
		if (servicePropertyParserMap.containsKey(serviceType)) {
			propertyParserMap = servicePropertyParserMap.get(serviceType);
		} else {
			propertyParserMap = new HashMap<String, String>();
			servicePropertyParserMap.put(serviceType, propertyParserMap);
		}
		propertyParserMap.put(propertyType, parserType);
	}

	/**
	 * @param serviceType
	 * @param propertyType
	 * @return
	 * @throws ServiceConfigurationParserNotFoundException
	 */
	public String getServiceConfigurationParser(String serviceType,
			String propertyType)
			throws ServiceConfigurationParserNotFoundException {
		String parserType = null;
		Map<String, String> propertyParserMap;
		if (servicePropertyParserMap.containsKey(serviceType)) {
			propertyParserMap = servicePropertyParserMap.get(serviceType);
			parserType = propertyParserMap.get(propertyType);
		}
		if (parserType == null) {
			throw new ServiceConfigurationParserNotFoundException(
					"No property parser defined for service " + serviceType
							+ " and property type " + propertyType);
		}
		return parserType;
	}
}
