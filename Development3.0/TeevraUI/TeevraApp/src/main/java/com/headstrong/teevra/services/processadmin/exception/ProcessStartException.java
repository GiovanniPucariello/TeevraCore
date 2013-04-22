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
 * $Id: ProcessStartException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 16, 2008 
 */

package com.headstrong.teevra.services.processadmin.exception;

/**
 * When the process is already running and tried to start it
 */
public class ProcessStartException extends ProcessAdminServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 8510687583527935753L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ProcessStartException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ProcessStartException() {
		super();
	}
}
