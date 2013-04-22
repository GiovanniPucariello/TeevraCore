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
 * $Id: ProcessModellingException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.commons.exception;

/**
 * 
 */
public class ProcessModellingException extends FusionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2743529026715206347L;

	/**
	 * 
	 */
	public ProcessModellingException() {
	}

	/**
	 * @param message
	 */
	public ProcessModellingException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ProcessModellingException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ProcessModellingException(String message, Throwable cause) {
		super(message, cause);
	}

}
