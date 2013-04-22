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
 * $Id: MapperFactoryTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 29, 2010 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.message.commons.adapter.mapper.config.FieldMapping;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.SwitchCaseStatement;

import junit.framework.TestCase;

/**
 * 
 */
public class MapperFactoryTest extends TestCase {

	public void testGetMapper() {
		Map<String, Mapper> mapperMap = new HashMap<String, Mapper>();
		mapperMap.put(FieldMapping.class.getName(), new FieldMapper());
		mapperMap.put(SwitchCaseStatement.class.getName(),
				new SwitchCaseMapper());
		FieldMapper filedMapper = new FieldMapper();
		SwitchCaseMapper switchCaseMapper = new SwitchCaseMapper();

		MapperFactory.setMapper(FieldMapping.class.getName(), filedMapper);
		MapperFactory.setMapper(SwitchCaseStatement.class.getName(),
				switchCaseMapper);

		assertEquals(filedMapper, MapperFactory.getMapper(FieldMapping.class
				.getName()));
		assertEquals(switchCaseMapper, MapperFactory
				.getMapper(SwitchCaseStatement.class.getName()));
	}
}
