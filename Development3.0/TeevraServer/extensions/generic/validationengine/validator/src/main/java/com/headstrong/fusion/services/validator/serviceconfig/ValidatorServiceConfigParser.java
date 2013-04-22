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
 * $Id: ValidatorServiceConfigParser.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.validator.serviceconfig;

import java.io.File;
import java.net.URL;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.config.parse.ServiceConfigParser;

/**
 * 
 */
public interface ValidatorServiceConfigParser extends ServiceConfigParser {
	public Object parseConfiguration(File configFile)
			throws ServiceConfigurationParseException;

	public Object parseConfiguration(URL configFileURL)
			throws ServiceConfigurationParseException;

}
