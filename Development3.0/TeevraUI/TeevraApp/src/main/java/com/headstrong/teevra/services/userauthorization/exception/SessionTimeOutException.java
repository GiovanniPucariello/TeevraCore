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
 * $Id: SessionTimeOutException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 5, 2009 
 */

package com.headstrong.teevra.services.userauthorization.exception;

/**
 * 
 */
public class SessionTimeOutException extends Exception {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -8862223213666405522L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public SessionTimeOutException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public SessionTimeOutException() {
		super();
	}

	/**
	 * Returns the name(without package structure) of the exception. Is used
	 * from Flex fault handler
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public String getName() {
		return getClass().getSimpleName();
	}
}
