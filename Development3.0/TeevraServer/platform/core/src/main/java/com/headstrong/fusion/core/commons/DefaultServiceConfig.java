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
 * $Id: DefaultServiceConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 18, 2008 
 */

package com.headstrong.fusion.core.commons;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.ServiceContext;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.error.DefaultErrorHandler;

/**
 * Default service configuration.
 */
public class DefaultServiceConfig implements ServiceConfig {

	/**
	 * Service configuration properties.
	 */
	private Map<String, Object> properties = new HashMap<String, Object>();

	/**
	 * Service type.
	 */
	private String serviceType;

	/**
	 * Unique process identifier.
	 */
	private String processId;

	/**
	 * Unique service identifier within the process context.
	 */
	private String serviceId;

	/**
	 * Error Handler for the service.
	 */
	private ErrorHandler errorHandler;

	/**
	 * @param properties
	 */
	public DefaultServiceConfig(CamelProcessContext processContext,
			String serviceType, String serviceId, String processId,
			Map<String, Object> properties,
			List<OnErrorConfig> onErrorConfigList) {
		this.serviceType = serviceType;
		this.processId = processId;
		this.serviceId = serviceId;
		// To avoid null pointer in case the property map is null
		if (properties != null) {
			this.properties.putAll(properties);
		}
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getProperty(java.lang.String)
	 */
	/**
	 * 
	 * Check is the property is present if not returns null. In case the
	 * property is defined but the value is null or empty. it return the key as
	 * the value. Required for complex configuration. In these cases the value
	 * would be empty.
	 */
	public Object getProperty(String name) {
		if (!this.properties.containsKey(name)) {
			return null;
		}
		Object value = this.properties.get(name);
		if (value == null || ((String) value).equals("")) {
			value = name;
		}
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getServiceContext()
	 */
	public ServiceContext getServiceContext() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getServiceType()
	 */
	public String getServiceType() {
		return this.serviceType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getProcessId()
	 */
	public String getProcessId() {
		return this.processId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getServiceId()
	 */
	public String getServiceId() {
		return this.serviceId;
	}

	public ErrorHandler getErrorHandler() {
		return this.errorHandler;
	}

	/**
	 * @param errorHandler
	 *            the errorHandler to set
	 */
	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.ServiceConfig#getProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public Object getProperty(String name, Object defaultValue) {
		Object obj = getProperty(name);
		obj=(null==obj)?defaultValue:obj;
		return obj;
	}

}
