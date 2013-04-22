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
 * $Id: UniqueProcessException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 16, 2008 
 */

package com.headstrong.teevra.services.process.exception;

/**
 * When the process name given for saving already exists in the system
 */
public class UniqueProcessException extends ProcessServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -1497070011598614185L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueProcessException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UniqueProcessException() {
		super();
	}
}
