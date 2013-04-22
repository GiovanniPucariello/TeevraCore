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
 * $Id: ParseException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.parser;

/**
 * 
 */
public class ParseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1930001150573719530L;

	/**
	 * 
	 */
	public ParseException() {
	}

	/**
	 * @param message
	 */
	public ParseException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ParseException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ParseException(String message, Throwable cause) {
		super(message, cause);
	}
}
