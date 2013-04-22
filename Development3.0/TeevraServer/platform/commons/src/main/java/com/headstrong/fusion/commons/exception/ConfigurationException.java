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
 * $Id: ConfigurationException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 15, 2008 
 */

package com.headstrong.fusion.commons.exception;

/**
 * 
 */
public class ConfigurationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3613697918903277893L;

	/**
	 * 
	 */
	public ConfigurationException() {
	}

	/**
	 * @param message
	 */
	public ConfigurationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ConfigurationException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

}
