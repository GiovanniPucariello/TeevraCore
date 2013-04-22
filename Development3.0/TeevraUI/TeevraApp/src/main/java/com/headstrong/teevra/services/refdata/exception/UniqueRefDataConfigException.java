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
 * $Id: UniqueRefDataConfigException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 18, 2009 
 */

package com.headstrong.teevra.services.refdata.exception;

/**
 * When the reference data name given for saving already exists in the system
 */
public class UniqueRefDataConfigException extends RefDataServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 496873134502837518L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueRefDataConfigException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UniqueRefDataConfigException() {
		super();
	}
}
