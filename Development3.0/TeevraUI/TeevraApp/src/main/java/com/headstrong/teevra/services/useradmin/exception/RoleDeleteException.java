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
 * $Id: RoleDeleteException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2009 
 */

package com.headstrong.teevra.services.useradmin.exception;

/**
 * When there is no such role exists
 */
public class RoleDeleteException extends UserAdminServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 7352991582469185600L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public RoleDeleteException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public RoleDeleteException() {
		super();
	}
}
