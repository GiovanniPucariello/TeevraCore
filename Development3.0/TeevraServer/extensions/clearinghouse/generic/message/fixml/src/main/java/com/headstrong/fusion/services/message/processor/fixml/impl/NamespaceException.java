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
 * $Id: FixmlNamespaceException.java
 * $Revision: 
 * $Author: SuAggarwal
 * $DateTime: April 19, 2011 
 */
package com.headstrong.fusion.services.message.processor.fixml.impl;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * Thrown when there is any error in getting namespace value from FIXML Message
 * or if namespace provided in UI and message are not matching.
 * 
 * @author SuAggarwal
 */

public class NamespaceException extends FusionException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 2239500679971429656L;

	/**
	 * 
	 */
	public NamespaceException() {
		super();
	}

	/**
	 * Constructs a new NamespaceException with the specified detail message
	 * 
	 * @param message
	 */
	public NamespaceException(String message) {
		super(message);
	}

	/**
	 * Constructs a new NamespaceException with cause.
	 * 
	 * @param cause
	 */
	public NamespaceException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new NamespaceException with the specified detail message and
	 * cause.
	 * 
	 * @param message
	 * @param cause
	 */
	public NamespaceException(String message, Throwable cause) {
		super(message, cause);
	}

}
