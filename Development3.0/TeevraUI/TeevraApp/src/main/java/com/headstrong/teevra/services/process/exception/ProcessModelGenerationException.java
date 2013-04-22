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
 * $Id: ProcessModelGenerationException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 8, 2009 
 */

package com.headstrong.teevra.services.process.exception;

/**
 * When there are issues in generating PCM
 */
public class ProcessModelGenerationException extends ProcessServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 8911759046826578590L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ProcessModelGenerationException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ProcessModelGenerationException() {
		super();
	}
}
