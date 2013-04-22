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
 * $Id: InactiveUserException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Sep 3, 2009 
 */

package com.headstrong.teevra.services.userauthentication.exception;

/**
 * When the user tries to login is in INACTIVE status
 */
public class InactiveUserException extends UserAuthenticationServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -3004898602544133498L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public InactiveUserException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public InactiveUserException() {
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
