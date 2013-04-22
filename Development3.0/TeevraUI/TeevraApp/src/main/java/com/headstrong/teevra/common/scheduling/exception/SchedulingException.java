/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2010 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: SchedulingException.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 01, 2010 
 */

package com.headstrong.teevra.common.scheduling.exception;

/**
 * Scheduling Exception
 */
public class SchedulingException extends Exception {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -9135059060623042247L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public SchedulingException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public SchedulingException() {
		super();
	}
}
