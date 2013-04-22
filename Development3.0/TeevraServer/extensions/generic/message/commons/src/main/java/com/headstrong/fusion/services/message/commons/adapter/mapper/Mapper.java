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
 * $Id: Mapper.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 15, 2009 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper;

import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.Statement;
import com.headstrong.fusion.services.message.commons.adapter.mapper.exception.MappingException;

/**
 * Mapper intrface... maps source data to target data.
 */
public interface Mapper {

	public void map(Map<String, Object> headers, Statement statement,
			BusinessObject source, BusinessObject target)
			throws MappingException,InvalidAttributeExpressionException;
}
