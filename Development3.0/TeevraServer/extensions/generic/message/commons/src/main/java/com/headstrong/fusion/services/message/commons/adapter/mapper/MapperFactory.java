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
 * $Id: MapperFactory.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 15, 2009 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.message.commons.adapter.mapper.config.FieldMapping;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.SwitchCaseStatement;

/**
 * 
 */
public class MapperFactory {
	private static final Map<String, Mapper> mapperMap = new HashMap<String, Mapper>();

	static {
		mapperMap.put(FieldMapping.class.getName(), new FieldMapper());
		mapperMap.put(SwitchCaseStatement.class.getName(),
				new SwitchCaseMapper());
	}

	public static Mapper getMapper(String mapperName) {
		return mapperMap.get(mapperName);
	}

	public static void setMapper(String mapperName, Mapper mapper) {
		mapperMap.put(mapperName, mapper);
	}
}
