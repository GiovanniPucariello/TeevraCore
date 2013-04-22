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
 * $Id: ProcessServiceException.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.process.exception;

/**
 * Root exceptions for all methods exposed by ProcessService
 */
public class ProcessServiceException extends Exception {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -9135059060623042247L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ProcessServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ProcessServiceException() {
		super();
	}
}
