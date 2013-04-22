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
 * $Id: FusionLauncher.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.launcher.main;

import java.util.HashMap;

import org.apache.felix.framework.Logger;

import com.headstrong.fusion.launcher.Fusion;
import com.headstrong.fusion.launcher.Environment;
import com.headstrong.fusion.launcher.exception.FusionStartupException;
import com.headstrong.fusion.launcher.resourceprovider.ClassLoaderResourceProvider;
import com.headstrong.fusion.launcher.resourceprovider.ResourceProvider;

/**
 * FusionLauncher is the launch pad for the stand-alone fusion application. It
 * loads the Fusion which is the starting point for the entire application. An
 * Shutdown hook is added which is destroy the Fusion framework.
 */

public class FusionLauncher {

	private static Logger logger;

	/*
	 * Starting point for the Stand-alone fusion application.
	 */
	public static void main(String[] args) {
		try {
			logger = new Logger();
			logger.setLogLevel(Logger.LOG_INFO);

			logger.log(Logger.LOG_INFO, "Starting teevra server launcher...");
			initEnvironment();
			ResourceProvider resourceProvider = new ClassLoaderResourceProvider(
					Thread.currentThread().getContextClassLoader());
			// create the server.
			Fusion fusion = new Fusion(logger, resourceProvider);
			// start the server.
			fusion.start(new HashMap<String, String>());
			// add shutdown hook.
			Runtime.getRuntime().addShutdownHook(new TerminateFusion(fusion));
		} catch (FusionStartupException e) {
			logger.log(Logger.LOG_ERROR, "Error starting teevra server...");
			System.exit(-1);
		}
	}

	/**
	 * Some of the environment parameters can be modified.
	 * 
	 */
	protected static void initEnvironment() {
		if (System.getProperty(Environment.LIB_DIR_PROP) != null) {
			// set the lib dir prop/
			Environment.LIB_DIR = System.getProperty(Environment.LIB_DIR_PROP);
		}
		if (System.getProperty(Environment.CONF_DIR_PROP) != null) {
			// set the conf dir prop/
			Environment.CONF_DIR = System
					.getProperty(Environment.CONF_DIR_PROP);
		}
		if (System.getProperty(Environment.PROPERTIES_FILE_PROP) != null) {
			// set the property file name
			Environment.PROPERTIES_FILE = System
					.getProperty(Environment.PROPERTIES_FILE_PROP);
		}
		if (System.getProperty(Environment.LOG_FILE_PROP) != null) {
			// set the log file name
			Environment.LOG_FILE = System
					.getProperty(Environment.LOG_FILE_PROP);
		}

	}

	/**
	 * TerminateFusion class implements Thread class which is called when the
	 * system is shut down.
	 */
	private static class TerminateFusion extends Thread {
		private final Fusion fusion;

		TerminateFusion(Fusion fusion) {
			super("teevra server shutdown Thread.");
			this.fusion = fusion;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Thread#run()
		 */
		public void run() {
			if (this.fusion != null) {
				this.fusion.destroy();
			}
			logger.log(Logger.LOG_INFO, "teevra server shutdown complete.");
		}
	}

}
