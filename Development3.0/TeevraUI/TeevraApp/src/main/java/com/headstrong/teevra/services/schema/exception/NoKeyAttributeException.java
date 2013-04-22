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
 * $Id: NoKeyAttributeException.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.schema.exception;

/**
 * When no key attribute is specified for a schema
 */
public class NoKeyAttributeException extends SchemaServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -7190420642398699491L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public NoKeyAttributeException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public NoKeyAttributeException() {
		super();
	}
}
