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
 * $Id: XMLMessageParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.fusion.services.message.parser.xml.impl;

import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XPathBinding;

/**
 * 
 */
public interface XmlMessageParser {

	public void parse(DefaultBusinessObject defaultBusinessObject,
			SchemaDescriptor<XPathBinding> schemaDesc, String xml)
			throws Exception;

}
