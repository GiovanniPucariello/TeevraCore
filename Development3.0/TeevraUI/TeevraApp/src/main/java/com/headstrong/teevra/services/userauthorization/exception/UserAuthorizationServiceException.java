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
 * $Id: UserAuthorizationException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 20, 2009 
 */

package com.headstrong.teevra.services.userauthorization.exception;

/**
 * Root Exception for all the methods exposed by UserAuthorizationService
 */
public class UserAuthorizationServiceException extends Exception {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 3577340715727057905L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UserAuthorizationServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UserAuthorizationServiceException() {
		super();
	}
}
