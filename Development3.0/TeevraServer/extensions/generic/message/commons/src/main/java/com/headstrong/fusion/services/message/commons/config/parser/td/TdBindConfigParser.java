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
 * $Id: TdBindingConfigurationParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 1, 2008
 */

package com.headstrong.fusion.services.message.commons.config.parser.td;

import org.jdom.Element;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.config.parse.ServiceConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

/**
 * Base interface for configuration parser for Tag Delimited parser.
 */
public interface TdBindConfigParser extends ServiceConfigParser {
	/**
	 * Parses the binding.
	 * 
	 * @param binding
	 * @param tagDelimitedSchemaDescriptor
	 * @throws ServiceConfigurationParseException
	 */
	@SuppressWarnings("unchecked")
	public void parseBinding(Element binding,
			SchemaDescriptor<ColumnIndexBinding> tagDelimitedSchemaDescriptor)
			throws ServiceConfigurationParseException;
}
