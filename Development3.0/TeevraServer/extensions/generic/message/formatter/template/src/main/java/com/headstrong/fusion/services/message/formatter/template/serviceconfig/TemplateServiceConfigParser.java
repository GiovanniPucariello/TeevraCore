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
 * $Id: TemplateServiceConfigParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.message.formatter.template.serviceconfig;

import com.headstrong.fusion.services.config.parse.ServiceConfigParser;

/**
 * Actual templates stored by the user just contains the field names.
 * {@link TemplateServiceConfigParser} modifies the template and replaces
 * all the field names with the actual getter methods on the message.
 * 
 */
public interface TemplateServiceConfigParser extends ServiceConfigParser {

}
