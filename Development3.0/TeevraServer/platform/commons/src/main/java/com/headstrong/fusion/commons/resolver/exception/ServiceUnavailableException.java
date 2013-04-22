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
 * $Id: ServiceUnavailableException.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Oct 5, 2008
 */

package com.headstrong.fusion.commons.resolver.exception;

import com.headstrong.fusion.commons.exception.FusionException;


public class ServiceUnavailableException extends FusionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2985330081126446255L;

	/**
	 * 
	 */
	public ServiceUnavailableException() {
	}

	/**
	 * @param message
	 */
	public ServiceUnavailableException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ServiceUnavailableException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceUnavailableException(String message, Throwable cause) {
		super(message, cause);
	}

}
