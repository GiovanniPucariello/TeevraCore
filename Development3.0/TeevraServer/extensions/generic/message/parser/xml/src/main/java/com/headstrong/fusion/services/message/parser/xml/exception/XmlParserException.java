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
 * $Id: XMLParserException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 20, 2008 
 */

package com.headstrong.fusion.services.message.parser.xml.exception;

/**
 * 
 */
public class XmlParserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2945748265003282390L;

	/**
	 * 
	 */
	public XmlParserException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public XmlParserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public XmlParserException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public XmlParserException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
