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
 * $Id: InvalidAttributeSchemaException.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.schema.exception;

/**
 * When the schema specified for the attribute doesn?t exist
 */
public class InvalidAttributeSchemaException extends SchemaServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -7917752930990056469L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public InvalidAttributeSchemaException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public InvalidAttributeSchemaException() {
		super();
	}
}
