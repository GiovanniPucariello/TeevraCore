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
 * $Id: ErrorFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.commons;

import com.headstrong.fusion.commons.exception.ErrorContext;

/**
 * Any Formatter that formats the incoming error will implement this interface..
 * Including the formatter which are runtime.
 */
public interface ErrorFormatter {

	public Object format(ErrorContext errorContext) throws Exception;
}
