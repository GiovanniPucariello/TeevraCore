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
 * $Id: UniqueUserException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.teevra.services.useradmin.exception;

/**
 * When there exists an user with the same name in the system
 */
public class UniqueUserException extends UserAdminServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -6239449087683558740L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueUserException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public UniqueUserException() {
		super();
	}

}
