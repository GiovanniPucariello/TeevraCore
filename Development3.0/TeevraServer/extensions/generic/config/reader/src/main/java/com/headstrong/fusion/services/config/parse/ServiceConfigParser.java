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
 * $Id: ServiceConfigurationFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 29, 2008
 */

package com.headstrong.fusion.services.config.parse;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;

/**
 * Service Configuration Reader reads all the configuration and caches it
 * locally. Any service which might require this configuration may have to parse
 * the configuration also if the configuration is in some other format. e.g. XML
 * or JSON etc.
 * <p>
 * Service Configuration module provides an interface to parse the configuration
 * any service which requires to parse the configuration at the time of caching
 * would have to register a {@link ServiceConfigParser} with the Service
 * Configuration module.
 * 
 */
public interface ServiceConfigParser {

	/**
	 * Parses the configuration.
	 * 
	 * @param configuration
	 * @return
	 * @throws ServiceConfigurationParseException
	 */
	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException;
}
