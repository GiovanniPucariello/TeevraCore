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
 * $Id: XmlErrorFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.messaging.error.formatter;

import com.headstrong.fusion.commons.ErrorFormatter;
import com.headstrong.fusion.commons.exception.ErrorContext;

/**
 * Converts the Error Context into XML format.
 */
public class FixmlErrorFormatter implements ErrorFormatter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ErrorFormatter#format(java.lang.Object)
	 */
	public Object format(ErrorContext errorContext) throws Exception {

//		if (errorContext.getFixmlVersion().equals("sp1")) {
//			return ErrorContextFormatter.formatToFixml(errorContext);
//		} else {
//			return ErrorContextFormatter.formatToFixmlSp2(errorContext);
//		}
		return ErrorContextFormatter.formatToFixmlSp2(errorContext);
	}

}
