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
 * $Id: UniqueRoleException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2009 
 */

package com.headstrong.teevra.services.useradmin.exception;

/**
 * When there exists a role with the same name in the system
 */
public class UniqueRoleException extends UserAdminServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7425446225219722498L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueRoleException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public UniqueRoleException() {
		super();
	}

}
