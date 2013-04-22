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
 * $Id: DbFieldBindingConfigurationParserImplTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.db;

import java.util.List;

import junit.framework.TestCase;

import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

/**
 * 
 */
public class DbFieldBindingConfigurationParserImplTest extends TestCase {

	@SuppressWarnings("unchecked")
	public void testParseSingleDimentionData() throws Exception {
		String configuration = "<binding><field name=\"id\" mapto=\"id\" ></field><field name=\"name\" mapto=\"name\"></field></binding>";
		DbFieldBindConfigParserImpl parser = new DbFieldBindConfigParserImpl();
		SchemaDescriptor<DbFieldBinding> schema = null;
		schema = (SchemaDescriptor<DbFieldBinding>) parser
				.parseConfiguration(configuration);

		// verify the assertions.
		List<SchemaDescriptor<DbFieldBinding>> children = schema.getChildren();
		assertEquals("id", children.get(0).getFieldName());
		assertEquals("id", children.get(0).getBinding().getDbField());
		assertEquals("name", children.get(1).getFieldName());
		assertEquals("name", children.get(1).getBinding().getDbField());
	}

	@SuppressWarnings("unchecked")
	public void testHierarchicalData() throws Exception {
		String configuration = "<binding><field name=\"id\" mapto=\"id\"></field><field name=\"name\" mapto=\"name\"></field><field name=\"address.line2\" mapto=\"line2\"></field><field name=\"address.line1\" mapto=\"line1\"></field></binding>";
		DbFieldBindConfigParserImpl parser = new DbFieldBindConfigParserImpl();
		SchemaDescriptor<DbFieldBinding> schema = null;
		schema = (SchemaDescriptor<DbFieldBinding>) parser
				.parseConfiguration(configuration);

		// verify the assertions.
		List<SchemaDescriptor<DbFieldBinding>> children = schema.getChildren();
		assertEquals("id", children.get(0).getFieldName());
		assertEquals("id", children.get(0).getBinding().getDbField());
		assertEquals("name", children.get(1).getFieldName());
		assertEquals("name", children.get(1).getBinding().getDbField());
		assertEquals("address", children.get(2).getFieldName());
		assertEquals("line1", children.get(2).getChildren().get(1)
				.getFieldName());
		assertEquals("line1", children.get(2).getChildren().get(1).getBinding()
				.getDbField());
		assertEquals("line2", children.get(2).getChildren().get(0)
				.getFieldName());
		assertEquals("line2", children.get(2).getChildren().get(0).getBinding()
				.getDbField());
	}
}
