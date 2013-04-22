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
 * $Id: StartupServlet.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Jan 3, 2009 
 */

package com.headstrong.teevra.controller;

import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.config.ConfigurationReader;
import com.headstrong.teevra.common.exception.ConfigurationReaderException;
import com.headstrong.teevra.services.process.dao.impl.ProcessDAOImpl;

/**
 * Startup servlet for teevra Application
 */
public class StartupServlet extends HttpServlet {

	/**
	 * Logger for StartupServlet
	 */
	private static Logger logger = LoggerFactory
			.getLogger(StartupServlet.class);

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -3985150824680234685L;

	private static String rootApplicationFolder = null;
	private static final String PROPERTIES_FILE = "/properties/teevraApp.properties";

	public void init() {
		rootApplicationFolder = getServletConfig().getServletContext()
				.getRealPath("/");

		try {
			ConfigurationReader.getInstance().loadBundle(PROPERTIES_FILE);
		} catch (ConfigurationReaderException e) {
			logger.error("Exception while loading startup servlet ", e);
		}

	}

	public static String getRootApplicationFolder() {
		return rootApplicationFolder;
	}

}
