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
 * $Id: ProcessStopException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jan 19, 2009 
 */

package com.headstrong.teevra.services.processadmin.exception;

/**
 * When the process is stopped and tried to stop it
 */
public class ProcessStopException extends ProcessAdminServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -940490979148381501L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error Message
	 */
	public ProcessStopException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ProcessStopException() {
		super();
	}

}
