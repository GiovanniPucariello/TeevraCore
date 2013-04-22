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
 * $Id: UniqueServerException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin.exception;

/**
 * When there exists a server with the same name in the system
 */
public class UniqueServerException extends ServerAdminServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1415208584973977444L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueServerException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public UniqueServerException() {
		super();
	}
}
