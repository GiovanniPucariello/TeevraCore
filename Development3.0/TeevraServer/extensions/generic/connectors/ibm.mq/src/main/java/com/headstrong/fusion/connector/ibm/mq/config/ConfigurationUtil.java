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
 * $Id: ConfigurationUtl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 12, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq.config;

import com.headstrong.fusion.commons.BindingConfig;
import com.ibm.msg.client.wmq.WMQConstants;

/**
 * Configuration Utility class.
 */
public class ConfigurationUtil {

	/**
	 * Configurable parameters
	 */
	public enum Config {
		brokerUrl, 
		port, 
		queueManager, 
		channel, 
		deliveryMode {
			/**
			 * If delivery mode is not specified by default persistent
			 * delivery is assumed.
			 */
			public String getDefault() {
				return Integer.toString(WMQConstants.DELIVERY_PERSISTENT);
			}
		},
		userName,
		password,
		destination,
		replyToQ {
			public String getDefault() {
				return "";
		}},
		replyToQMGR {
			public String getDefault() {
				return "";
		}},
		applIdDataLocation{
			public String getDefault() {
				return null;
		}},
		sslEnabled {
		public String getDefault() {
			return Boolean.toString(false);
		}}, 
		sslCipherSuite, 
		sslKeyStorePassword {
			public String getDefault() {
				return "";
		}}, 
		sslFipsRequired {
			public String getDefault() {
				return Boolean.toString(false);
		}},  
		sslAlgorithm, 
		sslKeyStoreLocation, 
		sslTrustStoreLocation;
		
		public String getDefault() {
			return null;
		}
	}

	/**
	 * returns the configuration value, throws exception if not provided.
	 * 
	 * @param key
	 *            property key.
	 * @return property value.
	 * @throws ConfigNotFoundException
	 */
	public static String getConfig(BindingConfig bindingConfig, Config key)
			throws ConfigNotFoundException {
		return getConfig(bindingConfig, key, false);
	}

	/**
	 * returns the configuration value, throws exception if not provided.
	 * 
	 * @param key
	 *            property key.
	 * @return property value.
	 * @throws ConfigNotFoundException
	 */
	public static String getConfig(BindingConfig bindingConfig, Config key,
			boolean defaultIfNull) throws ConfigNotFoundException {
		String value = bindingConfig.getProperty(key.toString());
		if (value == null) {
			if (defaultIfNull) {
				value = key.getDefault();
			} else {
				throw new ConfigNotFoundException("property " + key
						+ " not provided.");
			}
		}
		return value;
	}
	
	/**
	 * Checks if the value is present in the configuration or not.
	 * 
	 * @precondition
	 * @postcondition
	 * @param bindingConfig
	 * @param key
	 * @return
	 */
	public static boolean isPresent(BindingConfig bindingConfig, Config key) {
		String value = bindingConfig.getProperty(key.toString());
		if (value == null) {
			return false;
		}
		return true;
	}
}
