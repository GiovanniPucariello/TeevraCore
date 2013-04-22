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
 * $Id: LogManager.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.logger;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.cm.ManagedServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.logger.slf4j.LogConfigManager;

/**
 * The <code>LogManager</code> manages the loggers used by the LogService and
 * the rest of the system.
 */
public class LogManager {

	public static final String LOG_LEVEL = "com.headstrong.fusion.logger.level";

	public static final String LOG_FILE = "com.headstrong.fusion.logger.file";

	public static final String LOG_ARCHIVE_DIR = "com.headstrong.fusion.logger.archive.dir";

	public static final String LOG_FILE_NUMBER = "com.headstrong.fusion.logger.file.number";

	public static final String LOG_ARCHIVE_NUMBER = "com.headstrong.fusion.logger.archive.number";	// Added for fixed number of archived files

	public static final String LOG_FILE_SIZE = "com.headstrong.fusion.logger.file.size";

	public static final String LOG_PATTERN = "com.headstrong.fusion.logger.pattern";

	public static final String LOG_PATTERN_DEFAULT = "{7} {0,date,dd.MM.yyyy HH:mm:ss.SSS} *{4}* [{2}] {3} {5}";

	public static final String LOG_LOGGERS = "com.headstrong.fusion.logger.names";

	public static final String LOG_LEVEL_DEFAULT = "INFO";

	public static final int LOG_FILE_NUMBER_DEFAULT = 5;

	public static final int LOG_FILE_ARCHIVE_NUMBER_DEFAULT = Integer.MAX_VALUE;	// Added for fixed number of archived files

	public static final String LOG_FILE_SIZE_DEFAULT = "10M";

	public static final String PID = LogManager.class.getName();

	public static final String FACTORY_PID_WRITERS = PID + ".factory.writer";

	public static final String FACTORY_PID_CONFIGS = PID + ".factory.config";
	
	public static final String ERROR_LOG_FILE = "com.headstrong.fusion.error.logger.file";
	
	public static final String ERROR_LOG_ARCHIVE_DIR = "com.headstrong.fusion.logger.archive.error.dir";

	public static final String ERROR_LOG_ARCHIVE_NUMBER = "com.headstrong.fusion.logger.archive.error.number";	// Added for fixed number of archived files
	
	private final LogConfigManager logConfigManager;

	/**
	 * default log category - set during init()
	 */
	private Logger log;

	private ServiceRegistration loggingConfigurable;

	private ServiceRegistration writerConfigurer;

	private ServiceRegistration configConfigurer;

	LogManager(final BundleContext context) throws ConfigurationException {

		// set the root folder for relative log file names
		logConfigManager = LogConfigManager.getInstance();
		logConfigManager.setRoot(context.getProperty("fusion.home"));

		// Global configuration handler and update this configuration
		// immediately
		ManagedService globalConfigurator = new GlobalConfigurator(
				logConfigManager, getBundleConfiguration(context));
		globalConfigurator.updated(null);

		// get our own logger
		log = LoggerFactory.getLogger(LogServiceFactory.class);
		log.info("LogManager: Logging set up from context");

		// prepare registration properties (will be reused)
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		// register for official (global) configuration now
		props.put(Constants.SERVICE_PID, PID);
		props.put(Constants.SERVICE_DESCRIPTION,
				"LogManager Configuration Admin support");
		loggingConfigurable = context.registerService(ManagedService.class
				.getName(), globalConfigurator, props);

		// register for log writer configuration
		ManagedServiceFactory msf = new LogWriterManagedServiceFactory(
				logConfigManager);
		props.put(Constants.SERVICE_PID, FACTORY_PID_WRITERS);
		props.put(Constants.SERVICE_DESCRIPTION, msf.getName());
		writerConfigurer = context.registerService(ManagedServiceFactory.class
				.getName(), msf, props);

		// register for log configuration
		msf = new LoggerManagedServiceFactory(logConfigManager);
		props.put(Constants.SERVICE_PID, FACTORY_PID_CONFIGS);
		props.put(Constants.SERVICE_DESCRIPTION, msf.getName());
		configConfigurer = context.registerService(ManagedServiceFactory.class
				.getName(), msf, props);
	}

	void shutdown() {
		if (loggingConfigurable != null) {
			loggingConfigurable.unregister();
			loggingConfigurable = null;
		}

		if (writerConfigurer != null) {
			writerConfigurer.unregister();
			writerConfigurer = null;
		}

		if (configConfigurer != null) {
			configConfigurer.unregister();
			configConfigurer = null;
		}

		// shutdown the log manager
		logConfigManager.close();
	}

	// ---------- ManagedService interface -------------------------------------

	private Dictionary<String, String> getBundleConfiguration(
			BundleContext bundleContext) {
		Dictionary<String, String> config = new Hashtable<String, String>();

		// Added properties entry for error log file and error log archive.
		final String[] props = { LOG_LEVEL, LOG_LEVEL, LOG_FILE,
				LOG_FILE_NUMBER, LOG_FILE_SIZE, LOG_PATTERN, LOG_ARCHIVE_DIR, LOG_ARCHIVE_NUMBER, ERROR_LOG_FILE, ERROR_LOG_ARCHIVE_DIR, ERROR_LOG_ARCHIVE_NUMBER };	// Updated for fixed number of archived files
		for (String prop : props) {
			String value = bundleContext.getProperty(prop);
			if (value != null) {
				config.put(prop, value);
			}
		}

		// ensure sensible default values for required configuration field(s)
		if (config.get(LOG_LEVEL) == null) {
			config.put(LOG_LEVEL, LOG_LEVEL_DEFAULT);
		}

		return config;
	}

	private static class GlobalConfigurator implements ManagedService {

		private final LogConfigManager logConfigManager;

		private final Dictionary<String, String> defaultConfiguration;

		GlobalConfigurator(LogConfigManager logConfigManager,
				Dictionary<String, String> defaultConfiguration) {
			this.logConfigManager = logConfigManager;
			this.defaultConfiguration = defaultConfiguration;
		}

		@SuppressWarnings("unchecked")
		public void updated(Dictionary properties)
				throws ConfigurationException { // unchecked

			// fallback to start default settings when the config is deleted
			if (properties == null) {
				properties = defaultConfiguration;
			}

			// set the logger name to a special value to indicate the global

			properties.put(LOG_LOGGERS, LogConfigManager.ROOT);

			// update the default log writer and logger configuration
			logConfigManager.updateLogWriter(PID, properties);
			logConfigManager.updateLoggerConfiguration(PID, properties);
		}

	}

	private static class LogWriterManagedServiceFactory implements
			ManagedServiceFactory {

		private final LogConfigManager logConfigManager;

		LogWriterManagedServiceFactory(LogConfigManager logConfigManager) {
			this.logConfigManager = logConfigManager;
		}

		public String getName() {
			return "LogWriter configurator";
		}

		@SuppressWarnings("unchecked")
		public void updated(String pid, Dictionary configuration)
				throws ConfigurationException {
			logConfigManager.updateLogWriter(pid, configuration);
		}

		public void deleted(String pid) {
			try {
				logConfigManager.updateLogWriter(pid, null);
			} catch (ConfigurationException ce) {
				// not expected
				LogConfigManager.internalFailure(
						"Unexpected Configuration Problem", ce);
			}
		}
	}

	private static class LoggerManagedServiceFactory implements
			ManagedServiceFactory {

		private final LogConfigManager logConfigManager;

		LoggerManagedServiceFactory(LogConfigManager logConfigManager) {
			this.logConfigManager = logConfigManager;
		}

		public String getName() {
			return "Logger configurator";
		}

		@SuppressWarnings("unchecked")
		public void updated(String pid, Dictionary configuration)
				throws ConfigurationException {
			logConfigManager.updateLoggerConfiguration(pid, configuration);
		}

		public void deleted(String pid) {
			try {
				logConfigManager.updateLoggerConfiguration(pid, null);
			} catch (ConfigurationException ce) {
				// not expected
				LogConfigManager.internalFailure(
						"Unexpected Configuration Problem", ce);
			}
		}
	}
}
