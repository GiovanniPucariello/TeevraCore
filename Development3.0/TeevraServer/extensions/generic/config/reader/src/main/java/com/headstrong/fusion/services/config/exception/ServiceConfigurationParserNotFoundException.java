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
 * $Id: ServiceConfigurationParserNotFoundException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 28, 2008
 */

package com.headstrong.fusion.services.config.exception;

/**
 * 
 */
public class ServiceConfigurationParserNotFoundException extends Exception {

	/**
	 * 
	 */
	public ServiceConfigurationParserNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public ServiceConfigurationParserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ServiceConfigurationParserNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceConfigurationParserNotFoundException(String message,
			Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
