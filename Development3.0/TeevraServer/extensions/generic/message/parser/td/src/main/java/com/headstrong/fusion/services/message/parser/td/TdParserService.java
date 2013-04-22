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
 * $Id: TdParserService.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.parser.td;

import com.headstrong.fusion.commons.MediationService;

/**
 * 
 */
public interface TdParserService extends MediationService {

	public static final String DELIMITER = "delimiter";
	public static final String TYPE = "parseType";
	public static final String HEADER_LINE = "line";
	public static final String BODY_START_LINE = "msgStartLine";
	public static final String FOOTER_PATTERN = "footerPattern";
	public static final String PARSE_TYPE_HEADER = "header";
	public static final String PARSE_TYPE_BODY = "body";
	public static final String PATTERNS_DELIMITER = ",";
	public static final String CONSIDER_QUOTE = "quoteConsider";
}
