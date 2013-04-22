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
 * $Id: EncryptionException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 4, 2009 
 */

package com.headstrong.teevra.common.exception;

/**
 * When encryption of a message fails
 */
public class EncryptionException extends Exception {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 7246169303597003442L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public EncryptionException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public EncryptionException() {
		super();
	}
}
