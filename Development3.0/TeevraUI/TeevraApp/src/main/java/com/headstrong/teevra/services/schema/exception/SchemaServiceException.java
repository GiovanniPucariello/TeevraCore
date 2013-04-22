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
 * $Id: SchemaServiceException.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.schema.exception;

/**
 * Root exceptions for all methods exposed by SchemaService
 */
public class SchemaServiceException extends Exception {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -2355124023488940576L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public SchemaServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public SchemaServiceException() {
		super();
	}
}
