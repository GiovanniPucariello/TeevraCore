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
 * $Id: UniqueSchemaException.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 12, 2008 
 */

package com.headstrong.teevra.services.schema.exception;

/**
 * When there exists a schema with the same name in the system
 */
public class UniqueSchemaException extends SchemaServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1116551355150341207L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueSchemaException(String string) {
		super(string);
	}
	
	/**
	 * Default constructor
	 */
	public UniqueSchemaException() {
		super();
	}
}
