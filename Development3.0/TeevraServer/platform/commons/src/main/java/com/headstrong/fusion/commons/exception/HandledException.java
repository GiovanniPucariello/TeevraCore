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
 * $Id: HandledException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 5, 2009 
 */

package com.headstrong.fusion.commons.exception;

/**
 * 
 */
public class HandledException extends FusionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2902629485246864430L;

	public HandledException() {
		super();
	}

	public HandledException(String message, Throwable cause) {
		super(message, cause);
	}

	public HandledException(String message) {
		super(message);
	}

	public HandledException(Throwable cause) {
		super(cause);
	}

}
