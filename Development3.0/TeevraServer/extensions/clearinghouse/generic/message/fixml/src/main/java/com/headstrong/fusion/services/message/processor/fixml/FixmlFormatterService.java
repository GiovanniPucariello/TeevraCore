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
 * $Id: FixmlParserService.java
 * $Revision$ 
 * $Author$
 * $DateTime$ 
 */

package com.headstrong.fusion.services.message.processor.fixml;

import com.headstrong.fusion.commons.MediationService;

/**
 * FIXML Message Formatter service
 */
public interface FixmlFormatterService extends MediationService {
	String FIXML_SCHEMA = "SCHEMA";
	String DEFAULT_SCHEMA = "DEFAULT";
	String NAMESPACE_REQD = "NAMESPACE_REQUIRED";
}
