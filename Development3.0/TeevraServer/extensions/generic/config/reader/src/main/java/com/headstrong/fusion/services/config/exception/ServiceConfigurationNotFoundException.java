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
 * $Id: ServiceConfigurationNotFoundException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 30, 2008
 */

package com.headstrong.fusion.services.config.exception;

/**
 * thrown by Service Configuration Cache in case the service configuration
 * is not present.
 * 
 */
public class ServiceConfigurationNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4129692350128058166L;

	/**
	 * 
	 */
	public ServiceConfigurationNotFoundException() {
	}

	/**
	 * @param message
	 */
	public ServiceConfigurationNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ServiceConfigurationNotFoundException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceConfigurationNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
