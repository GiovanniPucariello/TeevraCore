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
 * $Id: ServerAdminServiceException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin.exception;

/**
 * Root exception for all methods exposed by ServerAdminService
 */
public class ServerAdminServiceException extends Exception {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -3425605963693558081L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ServerAdminServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ServerAdminServiceException() {
		super();
	}
}
