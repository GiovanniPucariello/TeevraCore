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
 * $Id: LogConfigManager.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.logger.slf4j;

import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.osgi.service.cm.ConfigurationException;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import com.headstrong.fusion.logger.LogManager;

public class LogConfigManager implements ILoggerFactory {

	public static final String ROOT = "";

	// the singleton instance of this class
	private static LogConfigManager instance = new LogConfigManager();

	// map of log writers indexed by configuration PID
	private final Map<String, FusionLoggerWriter> writerByPid;

	// map of log writers indexed by (absolute) file name. This map does
	// not contain writers writing to standard out
	private final Map<String, FusionLoggerWriter> writerByFileName;

	// map of log configurations by configuration PID
	private final Map<String, FusionLoggerConfig> configByPid;

	// map of log configurations by the categories they are configured with
	private final Map<String, FusionLoggerConfig> configByCategory;

	// map of all loggers supplied by getLogger(String) by their names. Each
	// entry is in fact a SoftReference to the actual logger, such that the
	// loggers may be cleaned up if no used any more.
	// There is no ReferenceQueue handling currently for removed loggers
	private final Map<String, SoftReference<FusionLogger>> loggersByCategory;

	// the logger used by this instance
	private final Logger log;

	// the default logger configuration set up by the constructor and managed
	// by the global logger configuration
	private final FusionLoggerConfig defaultLoggerConfig;

	// the default writer configuration set up by the constructor and managed
	// by the global logger configuration
	private final FusionLoggerWriter defaultWriter;
	
	// default error writer configuration set up by the constructor and managed
	// by the global logger configuration.
	private final FusionLoggerWriter defaultErrorWriter;

	// the root folder to make relative writer paths absolute
	private File rootDir;

	/**
	 * Returns the single instance of this log configuration instance.
	 */
	public static LogConfigManager getInstance() {
		return instance;
	}

	/**
	 * Logs a message an optional stack trace to error output. This method is
	 * used by the logging system in case of errors writing to the correct
	 * logging output.
	 */
	public static void internalFailure(String message, Throwable t) {
		System.err.println(message);
		if (t != null) {
			t.printStackTrace(System.err);
		}
	}

	/**
	 * Sets up this log configuration manager by creating the default writers
	 * and logger configuration
	 */
	private LogConfigManager() {
		writerByPid = new HashMap<String, FusionLoggerWriter>();
		writerByFileName = new HashMap<String, FusionLoggerWriter>();
		configByPid = new HashMap<String, FusionLoggerConfig>();
		configByCategory = new HashMap<String, FusionLoggerConfig>();
		loggersByCategory = new HashMap<String, SoftReference<FusionLogger>>();

		// configure the default writer to write to stdout (for now)
		// and register for PID only
		defaultWriter = new FusionLoggerWriter(LogManager.PID);
		try {
			defaultWriter.configure(null, 0, "0", null, LogManager.LOG_FILE_ARCHIVE_NUMBER_DEFAULT);	// Updated for fixed number of archived files
		} catch (IOException ioe) {
			internalFailure("Cannot initialize default FusionLoggerWriter", ioe);
		}
		
		// Configure the default error writer also to write to standard output.
		// Later it gets reconfigured to point to the configured error log file.
		defaultErrorWriter = new FusionLoggerWriter(LogManager.PID+"Error");
		try {
			defaultErrorWriter.configure(null, 0, "0", null, LogManager.LOG_FILE_ARCHIVE_NUMBER_DEFAULT);	// Updated for fixed number of archived files
		} catch (IOException ioe) {
			internalFailure("Cannot initialize Error FusionLoggerWriter", ioe);
		}
		
		writerByPid.put(LogManager.PID, defaultWriter);
		writerByPid.put(LogManager.PID+"Error", defaultErrorWriter);		

		// set up the default configuration using the default logger
		// writing at INFO level to start with
		Set<String> defaultCategories = new HashSet<String>();
		defaultCategories.add(ROOT);
		defaultLoggerConfig = new FusionLoggerConfig(LogManager.PID,
				LogManager.LOG_PATTERN_DEFAULT, defaultCategories,
				FusionLoggerLevel.INFO, defaultWriter, defaultErrorWriter);
		configByPid.put(LogManager.PID, defaultLoggerConfig);
		configByCategory.put(ROOT, defaultLoggerConfig);

		// get me my logger
		log = getLogger(getClass().getName());
	}

	/**
	 * Sets the root (folder) to be used to make relative paths absolute.
	 */
	public void setRoot(String root) {
		rootDir = new File((root == null) ? "" : root).getAbsoluteFile();
	}

	/**
	 * Shuts this configuration manager down by dropping all references to
	 * existing configurations, dropping all stored loggers and closing all log
	 * writers.
	 * <p>
	 * After this methods is called, this instance should not be used again.
	 */
	public void close() {
		writerByPid.clear();
		writerByFileName.clear();
		configByPid.clear();
		configByCategory.clear();

		// remove references to the loggers
		for (SoftReference<FusionLogger> logger : loggersByCategory.values()) {
			logger.clear();
		}
		loggersByCategory.clear();

		// shutdown the default and error writers
		try {
			defaultWriter.close();
			defaultErrorWriter.close();
		} catch (IOException e) {
			log.info("Error closing default Writer", e);
			// don't care for this
		}
	}

	// ---------- ILoggerFactory -----------------------------------------------

	/**
	 * Returns the name logger. If no logger for the name already exists, it is
	 * created and configured on the fly and returned. If a logger of the same
	 * name already exists, that logger is returned.
	 */
	public Logger getLogger(String name) {
		SoftReference<FusionLogger> logger = loggersByCategory.get(name);
		FusionLogger fusionLogger = (logger != null) ? logger.get() : null;

		// no logger at all or reference has been collected, create a new one
		if (fusionLogger == null) {
			fusionLogger = new FusionLogger(name);
			fusionLogger.setLoggerConfig(getLoggerConfig(name));
			loggersByCategory.put(name, new SoftReference<FusionLogger>(
					fusionLogger));
		}

		return fusionLogger;
	}

	// ---------- Configuration support ----------------------------------------

	/**
	 * Updates or removes the log writer configuration identified by the
	 * <code>pid</code>. In case of log writer removal, any logger
	 * configuration referring to the removed log writer is modified to now log
	 * to the default log writer.
	 * <p>
	 * The configuration object is expected to contain the following properties:
	 * <dl>
	 * <dt>{@link LogManager#LOG_FILE}</dt>
	 * <dd>The relative of absolute path/name of the file to log to. If this
	 * property is missing or an empty string, the writer writes to standard
	 * output</dd>
	 * <dt>{@link LogManager#LOG_FILE_SIZE}</dt>
	 * <dd>The maximum size of the log file to write before rotating the log
	 * file. This property must be a number of be convertible to a number. The
	 * actual value may also be suffixed by a size indicator <code>k</code>,
	 * <code>kb</code>, <code>m</code>, <code>mb</code>, <code>g</code>
	 * or <code>gb</code> representing the respective factors of kilo, mega
	 * and giga.If this property is missing or cannot be converted to a number,
	 * the default value {@link LogManager#LOG_FILE_SIZE_DEFAULT} is assumed. If
	 * the writer writes standard output this property is ignored.</dd>
	 * <dt>{@link LogManager#LOG_FILE_NUMBER}</dt>
	 * <dd>The maximum number of rotated log files to keep. This property must
	 * be a number of be convertible to a number. If this property is missing or
	 * cannot be converted to a number, the default value
	 * {@link LogManager#LOG_FILE_NUMBER_DEFAULT} is assumed. If the writer
	 * writes standard output this property is ignored.</dd>
	 * </dl>
	 * 
	 * @param pid
	 *            The identifier of the log writer to update or remove
	 * @param configuration
	 *            New configuration setting for the log writer or
	 *            <code>null</code> to indicate to remove the log writer.
	 * @throws ConfigurationException
	 *             If another log writer already exists for the same file as
	 *             configured for the given log writer or if configuring the log
	 *             writer fails.
	 */
	public void updateLogWriter(String pid, Dictionary<?, ?> configuration)
			throws ConfigurationException {

		if (configuration != null) {
			FusionLoggerWriter slw = writerByPid.get(pid);
			// Configuration for error writer to append Error with the Pid.
			FusionLoggerWriter errorLogWriter = writerByPid.get(pid+"Error");

			// get the log file parameter and normalize empty string to null
			String logFileName = (String) configuration
					.get(LogManager.LOG_FILE);
			String archiveDir = (String) configuration
					.get(LogManager.LOG_ARCHIVE_DIR);
			if (logFileName != null && logFileName.trim().length() == 0) {
				logFileName = null;
			}
			
			// get the error log file parameter and normalize empty string to null
			String errorLogFileName = (String) configuration.get(LogManager.ERROR_LOG_FILE);
			String errorArchiveDir = (String) configuration.get(LogManager.ERROR_LOG_ARCHIVE_DIR);
			
			if (errorLogFileName != null && errorLogFileName.trim().length() == 0) {
				errorLogFileName = null;
			}

			// if we have a file name, make it absolute and correct for our
			// environment and verify there is no other writer already existing
			// for the same file
			if (logFileName != null) {

				// ensure absolute path
				logFileName = getAbsoluteLogFile(logFileName);

				// ensure unique configuration of the log writer
				FusionLoggerWriter existingWriter = writerByFileName
						.get(logFileName);
				if (existingWriter != null
						&& existingWriter.getConfigurationPID().equals(pid)) {
					// this file is already configured by another LOG_PID
					throw new ConfigurationException(LogManager.LOG_FILE,
							"LogFile " + logFileName
									+ " already configured by configuration "
									+ existingWriter.getConfigurationPID());
				}
			}
			if (errorLogFileName != null) {

				errorLogFileName = getAbsoluteLogFile(errorLogFileName);
				
				// Check if this file is already configured.
				FusionLoggerWriter existingErrorLogWriter = writerByFileName.get(errorLogFileName);
				if (existingErrorLogWriter != null && existingErrorLogWriter.getConfigurationPID().equals(pid)) {

					throw new ConfigurationException(LogManager.ERROR_LOG_FILE,
							"ErrorLogFile " + errorLogFileName
									+ " already configured by configuration "
									+ existingErrorLogWriter.getConfigurationPID());
				}
			}

			// get number of files and ensure minimum and default
			Object fileNumProp = configuration.get(LogManager.LOG_FILE_NUMBER);
			int fileNum = -1;
			if (fileNumProp instanceof Number) {
				fileNum = ((Number) fileNumProp).intValue();
			} else if (fileNumProp != null) {
				try {
					fileNum = Integer.parseInt(fileNumProp.toString());
				} catch (NumberFormatException nfe) {
					log.error("Error parsing file number property", nfe);
				}
			}
			if (fileNum <= 0) {
				fileNum = LogManager.LOG_FILE_NUMBER_DEFAULT;
			}

			// get the log file size
			Object fileSizeProp = configuration.get(LogManager.LOG_FILE_SIZE);
			String fileSize = null;
			if (fileSizeProp != null) {
				fileSize = fileSizeProp.toString();
			}
			if (fileSize == null || fileSize.length() == 0) {
				fileSize = LogManager.LOG_FILE_SIZE_DEFAULT;
			}
			
			// START: Added for fixed number of archived files
			
			// get number of archived files and ensure minimum and default
			Object logArchiveNumProp = configuration.get(LogManager.LOG_ARCHIVE_NUMBER);
			int logArchiveNum = -1;
			if (logArchiveNumProp instanceof Number) {
				logArchiveNum = ((Number) logArchiveNumProp).intValue();
			} else if (logArchiveNumProp != null) {
				try {
					logArchiveNum = Integer.parseInt(logArchiveNumProp.toString());
				} catch (NumberFormatException nfe) {
					log.error("Error parsing archive number property", nfe);
				}
			}
			if (logArchiveNum < 0) {
				logArchiveNum = LogManager.LOG_FILE_ARCHIVE_NUMBER_DEFAULT;
			}

			// get number of archived error files and ensure minimum and default
			Object errorArchiveNumProp = configuration.get(LogManager.ERROR_LOG_ARCHIVE_NUMBER);
			int errorArchiveNum = -1;
			if (errorArchiveNumProp instanceof Number) {
				errorArchiveNum = ((Number) errorArchiveNumProp).intValue();
			} else if (errorArchiveNumProp != null) {
				try {
					errorArchiveNum = Integer.parseInt(errorArchiveNumProp.toString());
				} catch (NumberFormatException nfe) {
					log.error("Error parsing error archive number property", nfe);
				}
			}
			if (errorArchiveNum < 0) {
				errorArchiveNum = LogManager.LOG_FILE_ARCHIVE_NUMBER_DEFAULT;
			}
			
			// END: Added for fixed number of archived files
			
			try {
				if (slw == null) {
					slw = new FusionLoggerWriter(pid);
					slw.configure(logFileName, fileNum, fileSize, archiveDir, logArchiveNum);	// Updated for fixed number of archived files
					writerByPid.put(pid, slw);

					if (logFileName != null) {
						writerByFileName.put(logFileName, slw);
					}
				} else {
					slw.configure(logFileName, fileNum, fileSize, archiveDir, logArchiveNum);	// Updated for fixed number of archived files
				}
				// Configuring Error Writer
				if (errorLogWriter == null) {
					errorLogWriter = new FusionLoggerWriter(pid+"Error");
					errorLogWriter.configure(errorLogFileName, fileNum, fileSize, errorArchiveDir, errorArchiveNum);	// Updated for fixed number of archived files
					writerByPid.put(pid+"Error", errorLogWriter);

					if (errorLogFileName != null) {
						writerByFileName.put(errorLogFileName, errorLogWriter);
					}
				} else {
					errorLogWriter.configure(errorLogFileName, fileNum, fileSize, errorArchiveDir, errorArchiveNum);	// Updated for fixed number of archived files
				}
				
			} catch (IOException ioe) {
				internalFailure("Cannot create log file " + logFileName + "or the error log file " + errorLogFileName, ioe);
				internalFailure("Logging to the console", null);
				throw new ConfigurationException(LogManager.LOG_FILE +" "+ LogManager.ERROR_LOG_FILE,
						"Cannot create writer for log file " + logFileName + "or the error log file " + errorLogFileName);
			}

		} else {

			FusionLoggerWriter logWriter = writerByPid.remove(pid);
			FusionLoggerWriter errorLogWriter = writerByPid.remove(pid+"Error");
			if (logWriter != null) {

				// if the writer is writing to a file, remove the file mapping
				String path = logWriter.getPath();
				if (path != null) {
					writerByFileName.remove(path);
				}
				// make sure, no configuration is referring to this writer
				// any more
				for (FusionLoggerConfig config : configByPid.values()) {
					if (config.getLogWriter() == logWriter) {
						log
								.info(
										"updateLogWriter: Resetting configuration {} to the standard log writer",
										config.getConfigPid());
						config.setLogWriter(defaultWriter);
					}
				}	
			}
			// Changes done to remove the file mapping and reconfigure the writer to point to standard output
			if (errorLogWriter != null) {

				String errorLogPath = errorLogWriter.getPath();
				if (errorLogPath != null) {
					writerByFileName.remove(errorLogPath);
				}
				for (FusionLoggerConfig config : configByPid.values()) {
					FusionLoggerWriter configWriter = config.getLogWriter();
					if ( configWriter == errorLogWriter) {
						log
								.info(
										"updateLogWriter: Resetting configuration {} to the standard log writer",
										config.getConfigPid());
						config.setLogWriter(defaultErrorWriter);
					}
				}
			}

			// close the removed log writer
			try {
				if (logWriter != null)
					logWriter.close();
				if (errorLogWriter != null)
					errorLogWriter.close();
			} catch (IOException ioe) {
				log.error("Error closing log writer", ioe);
			}
		}
	}
	
	/**
	 * Updates or removes the logger configuration indicated by the given
	 * <code>pid</code>. If the case of modified categories or removal of the
	 * logger configuration, existing loggers will be modified to reflect the
	 * correct logger configurations available.
	 * <p>
	 * The configuration object is expected to contain the following properties:
	 * <dl>
	 * <dt>{@link LogManager#LOG_PATTERN}</dt>
	 * <dd>The <code>MessageFormat</code> pattern to apply to format the log
	 * message before writing it to the log writer. If this property is missing
	 * or the empty string the default pattern
	 * {@link LogManager#LOG_PATTERN_DEFAULT} is used.</dd>
	 * <dt>{@link LogManager#LOG_LEVEL}</dt>
	 * <dd>The log level to use for log message limitation. The supported
	 * values are <code>trace</code>, <code>debug</code>,
	 * <code>info</code>, <code>warn</code> and <code>error</code>. Case
	 * does not matter. If this property is missing a
	 * <code>ConfigurationException</code> is thrown and this logger
	 * configuration is not used.</dd>
	 * <dt>{@link LogManager#LOG_LOGGERS}</dt>
	 * <dd>The logger names to which this configuration applies. As logger
	 * names form a hierarchy like Java packages, the listed names also apply to
	 * "child names" unless more specific configuration applies for such
	 * children. This property may be a single string, an array of strings or a
	 * vector of strings. Each string may itself be a comma-separated list of
	 * logger names. If this property is missing a
	 * <code>ConfigurationException</code> is thrown.</dd>
	 * <dt>{@link LogManager#LOG_FILE}</dt>
	 * <dd>The name of the log writer to use. This may be the name of a log
	 * file configured for any log writer or it may be the configuration PID of
	 * such a writer. If this property is missing or empty or does not refer to
	 * an existing log writer configuration, the default log writer is used.</dd>
	 * 
	 * @param pid
	 *            The name of the configuration to update or remove.
	 * @param configuration
	 *            The configuration object.
	 * @throws ConfigurationException
	 *             If the log level and logger names properties are not
	 *             configured for the given configuration.
	 */
	public void updateLoggerConfiguration(String pid,
			Dictionary<?, ?> configuration) throws ConfigurationException {

		// assume we have to reconfigure the loggers
		boolean reconfigureLoggers = true;

		if (configuration != null) {

			String pattern = (String) configuration.get(LogManager.LOG_PATTERN);
			String level = (String) configuration.get(LogManager.LOG_LEVEL);
			String file = (String) configuration.get(LogManager.LOG_FILE);
			String errorFile = (String) configuration.get(LogManager.ERROR_LOG_FILE);
			Set<String> categories = toCategoryList(configuration
					.get(LogManager.LOG_LOGGERS));

			// verify categories
			if (categories == null) {
				throw new ConfigurationException(LogManager.LOG_LOGGERS,
						"Missing categories in configuration " + pid);
			}

			// verify no other configuration has any of the categories
			for (String cat : categories) {
				FusionLoggerConfig cfg = configByCategory.get(cat);
				if (cfg != null && !pid.equals(cfg.getConfigPid())) {
					throw new ConfigurationException(LogManager.LOG_LOGGERS,
							"Category " + cat
									+ " already defined by configuration "
									+ pid);
				}
			}

			// verify writer
			FusionLoggerWriter writer;
			if (file != null && file.length() > 0) {
				writer = writerByPid.get(file);
				if (writer == null) {
					writer = writerByFileName.get(file);
					if (writer == null) {
						file = getAbsoluteLogFile(file);
						writer = writerByFileName.get(file);
						if (writer == null) {
							writer = defaultWriter;
						}
					}
				}
			} else {
				writer = defaultWriter;
			}
			
			FusionLoggerWriter errorWriter;
			if (errorFile != null && errorFile.length() > 0) {
				errorWriter = writerByPid.get(errorFile);
				if (errorWriter == null) {
					errorWriter = writerByFileName.get(errorFile);
					if (errorWriter == null) {
						errorFile = getAbsoluteLogFile(errorFile);
						errorWriter = writerByFileName.get(errorFile);
						if (errorWriter == null) {
							errorWriter = defaultErrorWriter;
						}
					}
				}
			} else {
				errorWriter = defaultErrorWriter;
			}

			// verify log level
			if (level == null) {
				throw new ConfigurationException(LogManager.LOG_LEVEL,
						"Value required");
			}
			FusionLoggerLevel logLevel = FusionLoggerLevel.valueOf(level
					.toUpperCase());

			// verify pattern
			if (pattern == null || pattern.length() == 0) {
				pattern = LogManager.LOG_PATTERN_DEFAULT;
			}

			// create or modify existing configuration object
			FusionLoggerConfig config = configByPid.get(pid);
			if (config == null) {

				// create and store new configuration
				config = new FusionLoggerConfig(pid, pattern, categories,
						logLevel, writer, errorWriter);
				configByPid.put(pid, config);

			} else {

				// remove category to configuration mappings
				Set<String> oldCategories = config.getCategories();

				// reconfigure the configuration
				config.configure(pattern, categories, logLevel, writer, errorWriter);

				if (categories.equals(oldCategories)) {

					// remove the old categories if different from the new ones
					configByCategory.keySet().removeAll(oldCategories);

				} else {

					// no need to change category registrations, clear them
					// also no need to reconfigure the loggers
					categories.clear();
					reconfigureLoggers = false;

				}

			}

			// relink categories
			for (String cat : categories) {
				configByCategory.put(cat, config);
			}

		} else {

			// configuration deleted if null

			// remove configuration from pid list
			FusionLoggerConfig config = configByPid.remove(pid);

			// remove all configured categories
			if (config != null) {
				configByCategory.keySet().removeAll(config.getCategories());
			}

		}

		// reconfigure existing loggers
		if (reconfigureLoggers) {
			reconfigureLoggers();
		}
	}

	// ---------- Internal helpers ---------------------------------------------

	/**
	 * Returns the <code>logFileName</code> argument converted into an
	 * absolute path name. If <code>logFileName</code> is already absolute it
	 * is returned unmodified. Otherwise it is made absolute by resolving it
	 * relative to the root directory set on this instance by the
	 * {@link #setRoot(String)} method.
	 * 
	 * @throws NullPointerException
	 *             if <code>logFileName</code> is <code>null</code>.
	 */
	private String getAbsoluteLogFile(String logFileName) {
		// ensure proper separator in the path (esp. for systems, which do
		// not use "slash" as a separator, e.g Windows)
		logFileName = logFileName.replace('/', File.separatorChar);

		// create a file instance and check whether this is absolute. If not
		// create a new absolute file instance with the root dir and get
		// the absolute path name from that
		File logFile = new File(logFileName);
		if (!logFile.isAbsolute()) {
			logFile = new File(rootDir, logFileName);
			logFileName = logFile.getAbsolutePath();
		}

		// return the correct log file name
		return logFileName;
	}

	/**
	 * Reconfigures all loggers such that each logger is supplied with the
	 * {@link FusionLoggerConfig} most appropriate to its name. If a registered
	 * logger is not used any more, it is removed from the list.
	 */
	private void reconfigureLoggers() {
		// assign correct logger configs to all existing/known loggers
		for (Iterator<SoftReference<FusionLogger>> si = loggersByCategory
				.values().iterator(); si.hasNext();) {
			FusionLogger logger = si.next().get();
			if (logger != null) {
				logger.setLoggerConfig(getLoggerConfig(logger.getName()));
			} else {
				// if the logger has been GC-ed, remove the entry from the map
				si.remove();
			}
		}
	}

	/**
	 * Returns a {@link FusionLoggerConfig} instance applicable to the given
	 * <code>logger</code> name. This is the instance applicable to a longest
	 * match log. If no such instance exists, the default logger configuration
	 * is returned.
	 */
	private FusionLoggerConfig getLoggerConfig(String logger) {
		for (;;) {
			FusionLoggerConfig config = configByCategory.get(logger);
			if (config != null) {
				return config;
			}

			if (logger.length() == 0) {
				break;
			}

			int dot = logger.lastIndexOf('.');
			if (dot < 0) {
				logger = ROOT;
			} else {
				logger = logger.substring(0, dot);
			}
		}

		return defaultLoggerConfig;
	}

	/**
	 * Decomposes the <code>loggers</code> configuration object into a set of
	 * logger names. The <code>loggers</code> object may be a single string,
	 * an array of strings or a vector of strings. Each string may in turn be a
	 * comma-separated list of strings. Each entry makes up an entry in the
	 * resulting set.
	 * 
	 * @param loggers
	 *            The configuration object to be decomposed. If this is
	 *            <code>null</code>, <code>null</code> is returned
	 *            immediately
	 * @return The set of logger names provided by the <code>loggers</code>
	 *         object or <code>null</code> if the <code>loggers</code>
	 *         object itself is <code>null</code>.
	 */
	private Set<String> toCategoryList(Object loggers) {

		// quick exit if there is no configuration
		if (loggers == null) {
			return null;
		}

		// prepare set of names (used already in case loggers == ROOT)
		Set<String> loggerNames = new HashSet<String>();

		// in case of the special setting ROOT, return a set of just the

		if (loggers == ROOT) {
			loggerNames.add(ROOT);
			return loggerNames;
		}

		// convert the loggers object to an array
		Object[] loggersArray;
		if (loggers.getClass().isArray()) {
			loggersArray = (Object[]) loggers;
		} else if (loggers instanceof Vector) {
			loggersArray = ((Vector<?>) loggers).toArray();
		} else {
			loggersArray = new Object[] { loggers };
		}

		// conver the array of potentially comma-separated logger names
		// into the set of logger names
		for (Object loggerObject : loggersArray) {
			if (loggerObject != null) {
				String[] splitLoggers = loggerObject.toString().split(",");
				for (String logger : splitLoggers) {
					logger = logger.trim();
					if (logger.length() > 0) {
						loggerNames.add(logger);
					}
				}
			}
		}

		// return those names
		return loggerNames;
	}

}
