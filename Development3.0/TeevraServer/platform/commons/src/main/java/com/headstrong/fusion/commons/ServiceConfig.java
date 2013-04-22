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
 * $Id: ServiceConfig.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 11, 2008 
 */

package com.headstrong.fusion.commons;

import com.headstrong.fusion.commons.exception.ErrorHandler;

/**
 * Service configuration for the mediation service
 * this would be passed to the called service.
 * 
 * It's a subset of MediatorConfig. Extra information about the 
 * service e.g. <code>OnErrorConfig</code> will not be passed
 * as same is required by the service. Handling will be part 
 * of the core framework.
 */
public interface ServiceConfig {

	/**
	 * This method returns the value of the 
	 * property.
	 * 
	 * @precondition name != null
	 * @param name Name of property key.
	 * @return value property value.
	 */
	public Object getProperty(String name);
	
	/**
	 * This method returns the value of the 
	 * property. Returns the supplied default value if the property is non-existent, i.e. null.
	 * 
	 * @precondition name != null
	 * @param name Name of property key.
	 * @param defaultValue Value to be returned in case the property is null.
	 * @return value property value.
	 */
	public Object getProperty(String name, Object defaultValue);

	/**
	 * # Not in use now.
	 * idea was to have some configuration that can be
	 * used across configuration. Need to re-look at the
	 * usability of the same.
	 * 
	 * @return Service Context.
	 */
	public ServiceContext getServiceContext();

	/**
	 * Service Type.
	 * 
	 * @return Service Type.
	 */
	public String getServiceType();

	/**
	 *
	 * @return Unique process identifier.
	 */
	public String getProcessId();

	/**
	 * @return Service identifier.
	 */
	public String getServiceId();

	/**
	 *
	 * @return Error Handler.
	 */
	public ErrorHandler getErrorHandler();
}
