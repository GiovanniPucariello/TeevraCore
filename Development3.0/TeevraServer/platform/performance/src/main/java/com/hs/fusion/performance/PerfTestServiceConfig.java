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
 * $Id: PerfTestServiceConfig.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

package com.hs.fusion.performance;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.ServiceContext;
import com.headstrong.fusion.commons.exception.ErrorHandler;

/**
 * Perf test service config implementation.
 * 
 */
public class PerfTestServiceConfig implements ServiceConfig {
	private String processId;
	private String serviceId;
	private String serviceType;
	private Map<String, Object> properties;
	
	public PerfTestServiceConfig() {
		this.properties = new HashMap<String, Object>();
	}

	public PerfTestServiceConfig(String serviceType, String serviceId,
			String processId, Map<String, Object> properties) {
		this.serviceType = serviceType;
		this.serviceId = serviceId;
		this.processId = processId;
		this.properties = properties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getErrorHandler()
	 */
	@Override
	public ErrorHandler getErrorHandler() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getProcessId()
	 */
	@Override
	public String getProcessId() {
		return this.processId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getProperty(java.lang.String)
	 */
	@Override
	public Object getProperty(String name) {
		return this.properties.get(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getServiceContext()
	 */
	@Override
	public ServiceContext getServiceContext() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getServiceId()
	 */
	@Override
	public String getServiceId() {
		return this.serviceId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ServiceConfig#getServiceType()
	 */
	@Override
	public String getServiceType() {
		return this.serviceType;
	}

}
