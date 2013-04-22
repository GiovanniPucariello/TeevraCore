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
 * $Id: FelixManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 19, 2008 
 */

package com.headstrong.fusion.core;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.exception.InitializationException;

/**
 * {@link FelixManager} gives access to Felix {@link BundleContext}.
 * 
 */
public final class FelixManager {

	private static FelixManager felixManager;
	private final BundleContext context;
	/**
	 * 
	 */
	private FelixManager(BundleContext context) {
		this.context = context;
	}

	/**
	 * Initializes the singleton {@link FelixManager} instance.
	 * 
	 * @precondition context != null
	 * @param context
	 */
	public static FelixManager createInstance(BundleContext context) {
		synchronized (FelixManager.class) {
			if (felixManager == null) {
				felixManager = new FelixManager(context);
			}
		}
		return felixManager;
	}

	/**
	 * Returns the singleton {@link FelixManager} instance.
	 * 
	 * @return {@link FelixManager} 
	 * @throws InitializationException
	 */
	public static FelixManager getInstance()
			throws InitializationException {
		synchronized (FelixManager.class) {
			if (felixManager == null) {
				throw new InitializationException(
						"FelixManager not initialized yet.");
			} else {
				return felixManager;
			}
		}
	}

	/**
	 *
	 * @postcondition context != null 	
	 * @return context {@link BundleContext}
	 */
	public BundleContext getBundleContext() {
		return this.context;
	}
}
