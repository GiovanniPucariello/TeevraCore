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
 * $Id: RemoteSchemaReloadException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 16, 2009 
 */

package com.headstrong.teevra.services.schema.exception;

/**
 * Exception while reloading the schema cache on server
 */
public class RemoteSchemaReloadException extends SchemaServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -3149241722513796061L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public RemoteSchemaReloadException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public RemoteSchemaReloadException() {
		super();
	}
}
