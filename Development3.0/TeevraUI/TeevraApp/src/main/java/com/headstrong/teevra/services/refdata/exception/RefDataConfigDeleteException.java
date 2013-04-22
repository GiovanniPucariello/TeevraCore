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
 * $Id: RefDataConfigDeleteException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jan 7, 2009 
 */

package com.headstrong.teevra.services.refdata.exception;

/**
 * when there is no such reference data name exists
 */
public class RefDataConfigDeleteException extends RefDataServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -2707275098554007497L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public RefDataConfigDeleteException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public RefDataConfigDeleteException() {
		super();
	}

}
