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
 * $Id: DbErrorFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.messaging.error.formatter;

import com.headstrong.fusion.commons.ErrorFormatter;
import com.headstrong.fusion.commons.exception.ErrorContext;

/**
 * 
 */
public class DbErrorFormatter implements ErrorFormatter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ErrorFormatter#format(java.lang.Object)
	 */
	public Object format(ErrorContext errorContext) throws Exception {
		return ErrorContextFormatter.formatToList(errorContext);
	}

}
