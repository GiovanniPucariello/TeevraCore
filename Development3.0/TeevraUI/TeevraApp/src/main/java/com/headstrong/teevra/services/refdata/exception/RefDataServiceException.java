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
 * $Id: RefdataServiceException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.services.refdata.exception;

/**
 * Root exceptions for all methods exposed by RefdataService
 */
public class RefDataServiceException extends Exception {

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
	public RefDataServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public RefDataServiceException() {
		super();
	}
}
