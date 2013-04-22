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
 * $Id: DbParser.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.fusion.services.message.parser.db;

import com.headstrong.fusion.commons.MediationService;

/**
 * Parser service is registered using this interface.
 * 
 */
public interface DBParserService extends MediationService {
	public static final String SCHEMA_TYPE = "schemaType";
}
