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
 * $Id: TemplateFormatterService.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.message.formatter.template;

import com.headstrong.fusion.commons.MediationService;

/**
 * Template formatter service generates a message output
 * based on the template and the data provided.
 * 
 */
public interface TemplateFormatterService extends MediationService {
	public static final String HEADER = "header";
	public static final String MESSAGE = "message";
}
