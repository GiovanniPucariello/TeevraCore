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
 * $Id: UserNotFoundException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 7, 2009 
 */

package com.headstrong.teevra.services.userauthentication.exception;

/**
 * When there exists no user matching with the given username and password
 */
public class UserAuthenticationException extends
		UserAuthenticationServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -7182910105748515427L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UserAuthenticationException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UserAuthenticationException() {
		super();
	}
}
