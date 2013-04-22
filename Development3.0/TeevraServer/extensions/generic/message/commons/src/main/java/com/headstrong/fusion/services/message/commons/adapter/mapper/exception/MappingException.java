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
 * $Id: MappingException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 15, 2009 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper.exception;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * 
 */
public class MappingException extends FusionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8377917931895281438L;

	/**
	 * 
	 */
	public MappingException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public MappingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public MappingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MappingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
