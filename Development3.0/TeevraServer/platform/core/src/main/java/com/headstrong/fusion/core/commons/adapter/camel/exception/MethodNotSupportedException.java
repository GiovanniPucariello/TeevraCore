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
 * $Id: MethodNotSupportedException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel.exception;

/**
 * thrown if method is not supported by the class.
 */
public class MethodNotSupportedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7638988780333171866L;

	/**
	 * 
	 */
	public MethodNotSupportedException() {
	}

	/**
	 * @param message
	 */
	public MethodNotSupportedException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public MethodNotSupportedException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MethodNotSupportedException(String message, Throwable cause) {
		super(message, cause);
	}

}
