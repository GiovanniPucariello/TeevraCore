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
 * $Id: ConnectException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 13, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq.exception;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * Thrown if not able to connect to IBM MQ.
 */
public class ConnectException extends FusionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2419575018960371420L;

	public ConnectException() {
		super();
	}

	public ConnectException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectException(String message) {
		super(message);
	}

	public ConnectException(Throwable cause) {
		super(cause);
	}

}
