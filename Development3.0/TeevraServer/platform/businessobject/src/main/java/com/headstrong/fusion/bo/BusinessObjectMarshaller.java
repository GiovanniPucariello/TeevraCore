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
 * $Id: BusinessObjectMarshaller.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jul 1, 2009 
 */

package com.headstrong.fusion.bo;

import java.io.Writer;

/**
 * marshals the business object.
 */
public interface BusinessObjectMarshaller {

	public void marshal(BusinessObject businessObject, Writer writer)
			throws Exception;
}
