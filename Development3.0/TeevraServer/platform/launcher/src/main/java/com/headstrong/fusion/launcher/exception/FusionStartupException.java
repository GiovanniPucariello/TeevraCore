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
 * $Id: FusionStartupException.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 23, 2008 
 */


package com.headstrong.fusion.launcher.exception;

/**
 * FusionStartupException is the exception that is thrown whenever there is 
 * any error in the fusion launcher application. It wraps any exception
 * occuring during startup. 
 */
public class FusionStartupException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4458886554629876295L;

	/** 
	 * {@link Exception}
	 * @param msg
	 * 			Message associated with the exception
	 * @param t
	 * 			The throwable object containing the actual exception
	 */
	public FusionStartupException(String msg, Throwable t) {
		super(msg, t);
	}

	
	/** 
	 * {@link Exception}
	 * @param msg
	 * 			Message associated with the exception
	 */
	
	public FusionStartupException(String msg) {
		super(msg);
	}
}
