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
 * $Id: ServerUnregisterException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Feb 10, 2009 
 */

package com.headstrong.teevra.services.serveradmin.exception;

/**
 * When dependencies exist for the server specified to unregister
 */
public class ServerUnregisterException extends ServerAdminServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 2426758296567390468L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ServerUnregisterException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public ServerUnregisterException() {
		super();
	}
}
