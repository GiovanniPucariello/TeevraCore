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
 * $Id: ProcessPublishException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 16, 2008 
 */

package com.headstrong.teevra.services.processadmin.exception;

/**
 * When the process is started while it is not yet published
 */
public class ProcessPublishException extends ProcessAdminServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 7801629927944055076L;
	
	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ProcessPublishException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ProcessPublishException() {
		super();
	}
}
