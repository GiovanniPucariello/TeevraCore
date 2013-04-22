package com.headstrong.fusion.connector.processLauncher;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;

/**
 * ProcessLauncherConfiguration class for setting and retrieving the Component's
 * configuration
 * 
 * @author PBansal
 * 
 */
public class ProcessLauncherConfiguration {

	/**
	 * Path of external application to be launched
	 */

	private String applicationPath;

	/**
	 * Provides a configurable option for the control to wait for or return from
	 * the Application Execution
	 */

	private boolean waitFor;

	/**
	 * Process Launcher Binding Configuration properties defines as constants
	 */
	private static final String APPLICATION_PATH = "applicationPath";
	private static final String WAIT_FOR = "waitFor";

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ProcessLauncherConfiguration.class);

	public ProcessLauncherConfiguration() {
	}

	/**
	 * Constructor, sets all the configuration properties of the connector
	 * 
	 * @param properties
	 *            Properties to initialize the configuration.
	 */

	public ProcessLauncherConfiguration(Map<String, String> properties)
			throws Exception {

		this.waitFor = Boolean.parseBoolean(properties.get(WAIT_FOR)
				.toString());

		String appPathName = properties.get(APPLICATION_PATH);
		if (appPathName != null && !appPathName.trim().equals("")) {
			this.applicationPath = appPathName;
		} else {
			String errStr = "Invalid Application Path";
			logger.error(errStr);
			throw new InitializationException(errStr);
		}
	}

	/**
	 * @return application path of the executable
	 */

	public String getApplicationPath() {
		return applicationPath;
	}

	/**
	 * @param filesToProcess
	 *            sets the application path
	 */
	public void setApplicationPath(String applicationPath) {
		this.applicationPath = applicationPath;
	}

	public boolean isWaitFor() {
		return waitFor;
	}

	public void setWaitFor(boolean waitFor) {
		this.waitFor = waitFor;
	}
}
