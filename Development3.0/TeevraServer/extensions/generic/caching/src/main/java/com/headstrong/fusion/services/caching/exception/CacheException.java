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
 * $Id: CacheException.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 10, 2010 
 */

package com.headstrong.fusion.services.caching.exception;

/**
 * <code>CacheException</code> is an {@link Exception} which is thrown if
 * there is error while performing operations on cache.
 */
public class CacheException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3102934347915960750L;

	/**
	 * @param message
	 * @param cause
	 */
	public CacheException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public CacheException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 */
	public CacheException(String message) {
		super(message);
	}

}
