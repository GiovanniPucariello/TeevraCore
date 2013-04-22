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
 * $Id: ClusterCommunicationException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 6, 2009 
 */

package com.headstrong.fusion.failover.exception;

/**
 * This is the parent class for all Jgroups/Clustered Related Exception.
 * 
 */
public class ClusterCommunicationException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClusterCommunicationException() {
		super();
	}

	public ClusterCommunicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClusterCommunicationException(String message) {
		super(message);
	}

	public ClusterCommunicationException(Throwable cause) {
		super(cause);
	}

}
