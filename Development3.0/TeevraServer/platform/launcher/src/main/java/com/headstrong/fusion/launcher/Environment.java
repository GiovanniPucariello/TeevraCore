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
 * $Id: FusionEnvironment.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 31, 2009 
 */

package com.headstrong.fusion.launcher;

/**
 * This class contains the fusion environment details for the server startup.
 */
public final class Environment {

	private Environment() {
		// private constructor.
	}

	/**
	 * Application root.
	 */
	public static final String APP_ROOT = "..";

	/**
	 * Default embedded exec property.
	 */
	public static final String DEFAULT_EMBEDDED_EXEC = "true";

	/**
	 * Default Cache profile.
	 */
	public static final String DEFAULT_CACHE_PROFILE = "launcher";
	/**
	 * Default cache directory.
	 */
	public static final String DEFAULT_CACHE_DIR = "fusionlauncher";

	/**
	 * Default log file name.
	 */
	public static final String DEFAULT_LOG_FILE = "fusion.log";

	/**
	 * Log file name
	 */
	public static String LOG_FILE = DEFAULT_LOG_FILE;
	/**
	 * Log file property name
	 */
	public static final String LOG_FILE_PROP = "log.file";

	/**
	 * Default lib directory.
	 */
	public static final String DEFAULT_LIB_DIR = ".";
	/**
	 * lib directory, default is current directory.
	 */
	public static String LIB_DIR = DEFAULT_LIB_DIR;

	/**
	 * lib directory is the root of bundles. This variable represents the System
	 * property name which can be set to give a custom lib directory name.
	 */
	public static final String LIB_DIR_PROP = "lib.dir";

	/**
	 * Default conf directory.
	 */
	public static final String DEFAULT_CONF_DIR = APP_ROOT + "/conf";

	/**
	 * conf directory, default directory is ../conf
	 */
	public static String CONF_DIR = DEFAULT_CONF_DIR;
	/**
	 * conf directory contains the fusion.properties file. This variable
	 * represents the System property name which can be set to give a custom
	 * configuration directory name.
	 */
	public static final String CONF_DIR_PROP = "conf.dir";

	/**
	 * properties file name
	 */
	public static final String DEFAULT_PROPERTIES_FILE = "fusion.properties";

	/**
	 * properties file name
	 */
	public static String PROPERTIES_FILE = DEFAULT_PROPERTIES_FILE;

	/**
	 * property file name can be overridden using this property.
	 */
	public static final String PROPERTIES_FILE_PROP = "prop.file";

}
