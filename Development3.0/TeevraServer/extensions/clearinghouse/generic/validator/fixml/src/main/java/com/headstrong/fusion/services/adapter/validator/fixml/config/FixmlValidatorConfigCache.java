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
 * $Id: FixmlValidatorConfigCache.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 22, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml.config;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfig;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfigParser;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfigParserImpl;

/**
 * Fixml Validator Configuration Cache.
 */
public class FixmlValidatorConfigCache {

	/**
	 * validator configuration cache.
	 */
	private static Map<String, ValidatorServiceConfig> validatorServiceConfigCache = new HashMap<String, ValidatorServiceConfig>();

	private static ValidatorServiceConfigParser validatorServiceConfigParser = new ValidatorServiceConfigParserImpl();

	private FixmlValidatorConfigCache() {
	}

	/**
	 * Initialize the cache.
	 * 
	 * @throws Exception
	 */
	public static void init() throws Exception {
		File configurationDirectory = new File("src/main/resources");
		if (!configurationDirectory.exists()) {
			throw new Exception("FIXML configuration directory not present.");
		} else {
			File[] configurationFiles = configurationDirectory
					.listFiles(new FileFilter() {
						@Override
						public boolean accept(File pathname) {
							if (pathname.getName().endsWith(".xml")) {
								return true;
							}
							return false;
						}
					});
			if (configurationFiles != null && configurationFiles.length > 0) {
				for (File configurationFile : configurationFiles) {
					addValidatorServiceConfig(
							configurationFile.getName().replace(".xml", ""),
							(ValidatorServiceConfig) validatorServiceConfigParser
									.parseConfiguration(configurationFile));
				}
			}
		}
	}

	/**
	 * Initialize the cache.
	 * @param bundleContext
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void init(BundleContext bundleContext) throws Exception {
		Enumeration<String> filePaths = bundleContext.getBundle()
				.getEntryPaths("/");
		ArrayList<URL> configFileURLList = new ArrayList<URL>();

		while (filePaths.hasMoreElements()) {
			String filePath = filePaths.nextElement();
			if (filePath.endsWith(".xml")) {
				configFileURLList.add(bundleContext.getBundle().getEntry(
						filePath));
			}
		}
		if (configFileURLList != null && configFileURLList.size() > 0) {
			for (URL configFileURL : configFileURLList) {
				addValidatorServiceConfig(configFileURL.getFile().replace(
						".xml", "").replace("/", ""),
						(ValidatorServiceConfig) validatorServiceConfigParser
								.parseConfiguration(configFileURL));
			}
		}
	}

	/**
	 * Add a new FIXML validator configuration.
	 * 
	 * @param key
	 * @param validatorServiceConfig
	 */
	public static void addValidatorServiceConfig(String key,
			ValidatorServiceConfig validatorServiceConfig) {
		validatorServiceConfigCache.put(key, validatorServiceConfig);
	}

	/**
	 * Return a new FIXML validator configuration.
	 * 
	 * @param key
	 * @return FIXML validator service configuration.
	 */
	public static ValidatorServiceConfig getValidatorServiceConfig(String key) {
		return validatorServiceConfigCache.get(key);
	}
}
