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
 * $Id: InitializationException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 18, 2008 
 */

package com.headstrong.fusion.commons.exception;

/**
 * 
 */
public class InitializationException extends FusionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7489298202317325445L;

	/**
	 * 
	 */
	public InitializationException() {
	}

	/**
	 * @param message
	 */
	public InitializationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public InitializationException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InitializationException(String message, Throwable cause) {
		super(message, cause);
	}

}
