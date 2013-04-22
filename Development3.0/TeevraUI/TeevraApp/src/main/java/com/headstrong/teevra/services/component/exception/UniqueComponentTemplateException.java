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
 * $Id: UniqueComponentTemplateException.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 27, 2009 
 */

package com.headstrong.teevra.services.component.exception;


/**
 * When there exists template with the same combination of component id and
 * component template name
 */
public class UniqueComponentTemplateException extends ComponentServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 2230974445073374432L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public UniqueComponentTemplateException(String message) {
		super(message);
	}

	/**
	 * Default constructor
	 */
	public UniqueComponentTemplateException() {
		super();
	}

}
