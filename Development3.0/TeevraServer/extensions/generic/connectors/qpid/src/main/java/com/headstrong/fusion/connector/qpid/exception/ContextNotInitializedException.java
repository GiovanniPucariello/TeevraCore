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
 * $Id: ContextNotInitializedException.java
 * $Revision: 
 * $Author: Nbagchi
 * $DateTime: Apr 12, 2011 
 */

package com.headstrong.fusion.connector.qpid.exception;

/**
 * Thrown if the {@link BundleContextManager} is not initialized
 */
public class ContextNotInitializedException extends RuntimeException {

	private static final long serialVersionUID = 4423941217681556812L;

	public ContextNotInitializedException() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 *            The error message.
	 * @param cause
	 *            The exception instance to get more details about the instance.
	 */
	public ContextNotInitializedException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 *            The error message.
	 */
	public ContextNotInitializedException(String message) {
		super(message);
	}

	/**
	 * Constructor
	 * 
	 * @param cause
	 *            The exception instance to get more details about the instance.
	 */
	public ContextNotInitializedException(Throwable cause) {
		super(cause);
	}
}
