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
 * $Id: ConfigurationReader.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Jan 6, 2009 
 */

package com.headstrong.teevra.common.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.exception.ConfigurationReaderException;

/**
 * Configuration reader for Teevra application. Loads all the properties from
 * the application's properties file.
 */
public class ConfigurationReader {

	/**
	 * Logger for ConfigurationReader
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ConfigurationReader.class);

	private static ConfigurationReader instance = new ConfigurationReader();
	private Properties properties = null;
	private String propertiesFileName = null;

	/**
	 * Private constructor for singleton
	 */
	private ConfigurationReader() {

	}

	/**
	 * Returns singleton instance that is created at the time of class loading
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public static ConfigurationReader getInstance() {
		return instance;
	}

	/**
	 * Loads the given properties File. It should have the path from the
	 * classpath root.
	 * 
	 * @precondition
	 * @postcondition
	 * @param propertiesFileName
	 */
	public void loadBundle(String propertiesFileName)
			throws ConfigurationReaderException {
		this.propertiesFileName = propertiesFileName;
		properties = new Properties();
		try {
			properties.load(this.getClass().getResourceAsStream(
					propertiesFileName));
		} catch (IOException e) {
			logger.error("Exception while loading the properties ", e);
			throw new ConfigurationReaderException(e.getMessage());
		}
	}

	/**
	 * Returns the value of the given key as specified in the properties file.
	 * 
	 * @precondition loadBundle is invoked
	 * @postcondition
	 * @param key
	 * @return
	 */
	public String getConfigValue(String key) {
		if (properties == null)
			return null;

		return properties.getProperty(key);
	}

	/**
	 * Sets configuration value for given key in case configurations can be
	 * changed dynamically
	 * 
	 * @precondition
	 * @postcondition
	 * @param key
	 * @param value
	 */
	public void setConfigValue(String key, String value) {
		if (properties == null) {
			properties = new Properties();
		}

		properties.setProperty(key, value);
	}

	/**
	 * Save the current state of the configurations back to the loaded
	 * properties file.
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void saveConfigurations() throws ConfigurationReaderException {
		if ((properties == null) || (propertiesFileName == null))
			return;
		URL prop = this.getClass().getResource(propertiesFileName);
		try {
			properties
					.store(new FileOutputStream(new File(prop.toURI())), null);
		} catch (FileNotFoundException e) {
			logger.error("File not found while saving configurations ", e);
			throw new ConfigurationReaderException(e.getMessage());
		} catch (IOException e) {
			logger.error("Exception while saving configurations ", e);
			throw new ConfigurationReaderException(e.getMessage());
		} catch (URISyntaxException e) {
			logger.error("Exception while saving configurations ", e);
			throw new ConfigurationReaderException(e.getMessage());
		}
	}
}
