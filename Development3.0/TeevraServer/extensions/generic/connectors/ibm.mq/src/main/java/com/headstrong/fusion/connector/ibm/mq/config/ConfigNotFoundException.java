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
 * $Id: ConfigNotFoundException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 12, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq.config;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * Exception, if required configuration is not present.
 */
public class ConfigNotFoundException extends FusionException {

	/**
	 * serial version id.
	 */
	private static final long serialVersionUID = -1465870959265023660L;

	/**
	 * Initializes a {@link ConfigNotFoundException}
	 */
	public ConfigNotFoundException() {
		super();
	}

	/**
	 * Initializes a {@link ConfigNotFoundException} with the custom message and
	 * with cause.
	 * 
	 * @param message
	 * @param cause
	 */
	public ConfigNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Initializes a {@link ConfigNotFoundException} with the custom message.
	 * 
	 * @param message
	 */
	public ConfigNotFoundException(String message) {
		super(message);
	}

	/**
	 * Initializes a {@link ConfigNotFoundException} with with cause
	 * 
	 * @param cause
	 */
	public ConfigNotFoundException(Throwable cause) {
		super(cause);
	}

}
