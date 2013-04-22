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
 * $Id: SchemaDeleteException.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.schema.exception;

/**
 * When dependencies exist for the schema specified for delete
 */
public class SchemaDeleteException extends SchemaServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -6838846676779709914L;
	
	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public SchemaDeleteException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public SchemaDeleteException() {
		super();
	}
}
