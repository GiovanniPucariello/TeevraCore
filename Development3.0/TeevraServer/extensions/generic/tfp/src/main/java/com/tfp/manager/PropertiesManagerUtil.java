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
 * $Id: PropertiesManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */
package com.tfp.manager;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.connector.tfp.BundleContextManager;
import com.tfp.properties.MCH;

/**
 * This file is provided by MCH team for TFP integration. 
 */
public class PropertiesManagerUtil {

	/**
	 * Logger
	 */
	private static Logger logger = LoggerFactory
			.getLogger(PropertiesManagerUtil.class);

	/**
	 * PACKAGE_NAME constant.
	 */
	private static final String PACKAGE_NAME = "com.tfp.properties";

	/**
	 * PROP_FILE constant.
	 */
	private static final String PROP_FILE = "tfp_config.xml";

	/**
	 * Load Properties
	 * @return The MCH properties.
	 * @throws Exception
	 */
	public static MCH loadProperties() throws Exception {
		MCH mch = null;
		try {
			InputStream stream = BundleContextManager.getInstance()
					.getBundleContext().getBundle().getResource(PROP_FILE)
					.openStream();
			ClassLoader cl = com.tfp.manager.PropertiesManagerUtil.class.getClassLoader();
			JAXBContext context = JAXBContext.newInstance(PACKAGE_NAME, cl);
			Unmarshaller u = context.createUnmarshaller();
			mch = (MCH) u.unmarshal(stream);
			stream.close();

		} catch (Exception e) {
			String errStr = "Error loading TFP properties from " + PROP_FILE;
			logger.error(errStr, e);
			throw new RuntimeException(errStr);
		}
		return mch;
	}
}
