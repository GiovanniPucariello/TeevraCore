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
 * $Id: Server.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 6, 2010 
 */

package com.headstrong.fusion.launcher;

import java.util.Map;

import com.headstrong.fusion.launcher.exception.FusionStartupException;

/**
 * Represent the teevra server. This is the starting point of teevra server.
 * It reads the configuration and launches the server. on server shutdown
 * destroy method is invoked.
 */
public interface Server {

	/**
	 * starts the server.
	 * 
	 * @throws Exception
	 */
	void start(Map<String, String> props) throws FusionStartupException;

	/**
	 * Performs any operation required on server shutdown.
	 * 
	 * @throws Exception
	 */
	void destroy() throws Exception;
}
