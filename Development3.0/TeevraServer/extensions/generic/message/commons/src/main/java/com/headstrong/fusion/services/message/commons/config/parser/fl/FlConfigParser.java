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
 * $Id: FixedLengthConfigurationParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.fl;

import org.jdom.Element;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.config.parse.ServiceConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

/**
 * Base interface for configuration parser for Fixed length parser.
 */
public interface FlConfigParser extends ServiceConfigParser {

	/**
	 * Parses the binding.
	 * 
	 * @precondition
	 * @postcondition
	 * @param binding
	 * @param fixedLengthSchemaDescriptor
	 * @throws ServiceConfigurationParseException
	 */
	public void parseBinding(Element binding,
			SchemaDescriptor<FlBinding> fixedLengthSchemaDescriptor)
			throws ServiceConfigurationParseException;
}
