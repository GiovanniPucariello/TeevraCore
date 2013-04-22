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
 * $Id: DefaultBindingConfig.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 2, 2009 
 */

package com.headstrong.fusion.core.commons;

import java.util.List;
import java.util.Map;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.error.DefaultErrorHandler;

/**
 * Default binding configuration implementation.
 */
public class DefaultBindingConfig implements BindingConfig {

	/**
	 * unique process identifier.
	 */
	private String processId;

	/**
	 * service identifier.
	 */
	private String serviceId;

	/**
	 * configuration properties.
	 */
	private Map<String, String> properties;

	/**
	 * configured error handler.
	 */
	private ErrorHandler errorHandler;

	public DefaultBindingConfig(CamelProcessContext processContext,
			String processId, String serviceId, Map<String, String> properties,
			List<OnErrorConfig> onErrorConfigList) {
		this.processId = processId;
		this.serviceId = serviceId;
		this.properties = properties;
		this.configureErrorHandler(processContext, onErrorConfigList);
	}

	/**
	 * Configures Error Handler for the mediation service.
	 * 
	 * @precondition Error Configuration is provided.
	 * @param onErrorConfigList
	 *            List of Error Configuration
	 */
	private void configureErrorHandler(CamelProcessContext camelProcessContext,
			List<OnErrorConfig> onErrorConfigList) {
		if (onErrorConfigList != null && !onErrorConfigList.isEmpty()) {
			this.errorHandler = new DefaultErrorHandler(camelProcessContext,
					onErrorConfigList);
		}
	}

	/**
	 * @return the processId
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * @param processId
	 *            the processId to set
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public String getProperty(String name) {
		return this.properties.get(name);
	}
	
	@Override
	public String getProperty(String name, String defaultValue) {
		String value = getProperty(name);
		return (null==value)?defaultValue:value;
	}

	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}

	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	

}
