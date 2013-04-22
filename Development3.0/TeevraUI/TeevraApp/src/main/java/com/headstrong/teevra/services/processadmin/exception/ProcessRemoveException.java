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
 * $Id: ProcessRemoveException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 16, 2009 
 */

package com.headstrong.teevra.services.processadmin.exception;

/**
 * While removing the process from a server
 */
public class ProcessRemoveException extends ProcessAdminServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -4457140456998957301L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ProcessRemoveException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ProcessRemoveException() {
		super();
	}
}
