package com.headstrong.fusion.core;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.core.commons.adapter.camel.exception.ContextNotInitializedException;

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
