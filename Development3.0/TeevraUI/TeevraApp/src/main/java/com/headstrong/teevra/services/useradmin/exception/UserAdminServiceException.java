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
 * $Id: UserAdminServiceException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.teevra.services.useradmin.exception;

/**
 * Root exceptions for all methods exposed by UserAdminService
 */
public class UserAdminServiceException extends Exception {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 6210264466811407812L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UserAdminServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UserAdminServiceException() {
		super();
	}
}
