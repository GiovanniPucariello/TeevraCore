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
 * $Id: ServiceConfigurationParseException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 29, 2008
 */

package com.headstrong.fusion.services.config.exception;

/**
 * 
 */
public class ServiceConfigurationParseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7676006502979885248L;

	/**
	 * 
	 */
	public ServiceConfigurationParseException() {
		super();
	}

	/**
	 * @param message
	 */
	public ServiceConfigurationParseException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ServiceConfigurationParseException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceConfigurationParseException(String message, Throwable cause) {
		super(message, cause);
	}

}
