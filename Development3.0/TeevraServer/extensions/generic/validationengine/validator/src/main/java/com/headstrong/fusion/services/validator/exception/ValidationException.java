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
 * $Id: ValidationException.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.validator.exception;

/**
 * <code>ValidationException</code> is the exception which is thrown whenever
 * there is any error during the validation of the message.
 */
public class ValidationException extends Exception {

	public ValidationException(Exception e) {
		super(e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * {@link Exception} Constructs a new exception with the specified detail
	 * message.
	 * 
	 * @param message
	 */
	public ValidationException(String message) {
		super(message);
	}

	/**
	 * {@link Exception} Constructs a new exception with the specified detail
	 * message and cause.
	 * 
	 * @param message
	 * @param t
	 */
	public ValidationException(String message, Throwable t) {
		super(message, t);
	}

}
