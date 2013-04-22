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
 * $Id: InvalidConfigurationException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 2, 2009 
 */

package com.headstrong.fusion.services.message.commons.config.exception;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * Thrown if the configuration provided for the service is invalid.
 * 
 */
public class InvalidConfigurationException extends FusionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 479095534180942834L;

	/**
	 * 
	 */
	public InvalidConfigurationException() {
	}

	/**
	 * @param message
	 */
	public InvalidConfigurationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InvalidConfigurationException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

}
