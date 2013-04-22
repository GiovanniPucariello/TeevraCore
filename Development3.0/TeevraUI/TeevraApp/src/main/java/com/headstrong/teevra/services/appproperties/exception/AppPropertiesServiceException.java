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
 * $Id: AppPropertiesServiceException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 3, 2009 
 */

package com.headstrong.teevra.services.appproperties.exception;

/**
 * Root exceptions for all methods exposed by AppPropertiesService
 */
public class AppPropertiesServiceException extends Exception {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 7872610870945199483L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public AppPropertiesServiceException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public AppPropertiesServiceException() {
		super();
	}
}
