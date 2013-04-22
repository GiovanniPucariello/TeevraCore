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
 * $Id: UniqueDataSourceConfigException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 18, 2009 
 */

package com.headstrong.teevra.services.refdata.exception;

/**
 * When the data source name given for saving already exists in the system
 */
public class UniqueDataSourceConfigException extends RefDataServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = -4978241558189991517L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueDataSourceConfigException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UniqueDataSourceConfigException() {
		super();
	}
}
