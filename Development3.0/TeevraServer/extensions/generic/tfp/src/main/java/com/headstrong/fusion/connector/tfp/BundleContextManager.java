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
 * $Id: BundleContextManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 28, 2010 
 */

package com.headstrong.fusion.connector.tfp;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manages {@link BundleContext}
 */
public class BundleContextManager {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(BundleContextManager.class);

	/**
	 * Bundle Context Manager
	 */
	private static BundleContextManager contextManager;
	/**
	 * {@link BundleContext}
	 */
	private BundleContext bundleContext;

	/**
	 * Constructor
	 * 
	 * @param bundleContext
	 */
	private BundleContextManager(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/**
	 * Returns BundlecontectManager instance.
	 * 
	 * @return The bundle context.
	 */
	public static synchronized BundleContextManager getInstance() {
		if (contextManager == null) {
			String errStr = "BundleContextManager not initialized.";
			logger.error(errStr);
			throw new ContextNotInitializedException(errStr);
		}
		return contextManager;
	}

	/**
	 * Initializes the manager.
	 * 
	 * @param bundleContext
	 *            The bundle context
	 */
	public static void init(BundleContext bundleContext) {
		logger.info("Initiallizing TFP BundlecontextManager");
		contextManager = new BundleContextManager(bundleContext);
	}

	/**
	 * Returns the BundleContext
	 * 
	 * @return Returns the BundleContext
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * Deactivates the singleton manager.
	 */
	public static void destroy() {
		contextManager = null;
	}
}
