/**
 * 
 */
package com.headstrong.fusion.configGenerator.core;

import java.util.Properties;

/**
 * Property Manager.
 */
public class PropertyManager {
	private Properties properties;
	private static PropertyManager propertyManager;

	private PropertyManager(Properties properties) {
		this.properties = properties;
	}

	public static PropertyManager getInstance(Properties properties) {
		synchronized (PropertyManager.class) {
			if (propertyManager == null) {
				propertyManager = new PropertyManager(properties);
			}
		}
		return propertyManager;
	}

	public Properties getProperties() {
		return this.properties;
	}

	public static PropertyManager getInstance() {
		return propertyManager;
	}

	public Object getProperty(String name) {
		return this.properties.getProperty(name);
	}
}
