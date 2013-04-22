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
 * $Id: ConfigurationReaderException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 14, 2009 
 */

package com.headstrong.teevra.common.exception;

/**
 * Exception while loading properties from the application's properties file.
 */
public class ConfigurationReaderException extends Exception {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7701038639196993487L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ConfigurationReaderException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ConfigurationReaderException() {
		super();
	}
}
