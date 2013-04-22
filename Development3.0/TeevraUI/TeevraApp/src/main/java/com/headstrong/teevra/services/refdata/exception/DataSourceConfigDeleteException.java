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
 * $Id: DataSourceConfigDeleteException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jan 7, 2009 
 */

package com.headstrong.teevra.services.refdata.exception;

/**
 * when there are dependencies on the data source
 */
public class DataSourceConfigDeleteException extends RefDataServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -7776322232790212923L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public DataSourceConfigDeleteException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public DataSourceConfigDeleteException() {
		super();
	}

}
