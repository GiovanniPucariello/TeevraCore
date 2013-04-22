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
 * $Id: AbstractRecordParser.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.fusion.services.message.parser.fl.impl;

import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;

/**
 * This class currently defines a single method which would be used by both
 * header and body parser to get the value of the schema.
 * 
 */
public class AbstractRecordParser {
	public Object getValue(String record, SchemaDescriptor<FlBinding> schema, int offset) {
		int startIndex = schema.getBinding().getStartIndex() + offset;
		int endIndex = schema.getBinding().getEndIndex() + offset;

		Object value = record.substring(startIndex - 1, endIndex).trim();
		return value;
	}

}
