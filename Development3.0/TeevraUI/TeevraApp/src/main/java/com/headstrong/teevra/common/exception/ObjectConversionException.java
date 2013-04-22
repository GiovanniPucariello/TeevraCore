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
 * $Id: ObjectConversionException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jul 29, 2009 
 */

package com.headstrong.teevra.common.exception;

/**
 * Exception while converting object to primitive type
 */
public class ObjectConversionException extends Exception {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -592076180195553775L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public ObjectConversionException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public ObjectConversionException() {
		super();
	}
}
