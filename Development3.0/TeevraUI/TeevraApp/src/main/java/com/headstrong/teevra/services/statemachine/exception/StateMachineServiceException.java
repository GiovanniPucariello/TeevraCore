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
 * $Id: StateMachineServiceException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.teevra.services.statemachine.exception;

/**
 * Root exception for all methods exposed by StateMachineService
 */
public class StateMachineServiceException extends Exception {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 6930905431635758615L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public StateMachineServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public StateMachineServiceException() {
		super();
	}
}
