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
 * $Id: BindingConfig.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 2, 2009 
 */

package com.headstrong.fusion.commons;

import java.util.Map;

import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.exception.ErrorHandler;

/**
 * BindingComponent {@link FusionComponent} related configuration.
 * 
 */
public interface BindingConfig {

	/**
	 * This method returns the value of the property.
	 * 
	 * @precondition name != null
	 * @param name
	 *            Name of property key.
	 * @return value property value.
	 */
	public String getProperty(String name);
	
	/**
	 * This method returns the value of the property.
	 * 
	 * @precondition name != null
	 * @param name
	 *            Name of property key.
	 * @return value property value.
	 */
	public String getProperty(String name, String defaultValue);

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
	 * Returns property map.
	 * 
	 * @return property map.
	 */
	public Map<String, String> getProperties();

	/**
	 * Return Error handler if configured or else returns null.
	 * 
	 * @return Error Handler.
	 */
	public ErrorHandler getErrorHandler();
}
