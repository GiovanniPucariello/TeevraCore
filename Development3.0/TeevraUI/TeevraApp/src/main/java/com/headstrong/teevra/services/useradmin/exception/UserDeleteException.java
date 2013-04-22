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
 * $Id: UserDeleteException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 22, 2009 
 */

package com.headstrong.teevra.services.useradmin.exception;

/**
 * When there is no such user exists or dependencies exist on the user
 */
public class UserDeleteException extends UserAdminServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 5084270385468127273L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UserDeleteException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UserDeleteException() {
		super();
	}

}
