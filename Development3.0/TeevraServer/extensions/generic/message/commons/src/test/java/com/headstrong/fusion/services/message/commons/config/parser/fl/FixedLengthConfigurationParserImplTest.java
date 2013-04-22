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
 * $Id: FixedLengthConfigurationParserImplTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.fl;

import junit.framework.TestCase;

import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;


/**
 * {@link FlConfigParserImpl} unit test class.
 */
public class FixedLengthConfigurationParserImplTest extends TestCase {

	@SuppressWarnings("unchecked")
	public void testParseSingleDimentionData() throws Exception {
		String configuration = "<binding><field name=\"id\" start=\"0\" end=\"3\"/><field name=\"name\" start=\"4\" end=\"8\"/></binding>";
		FlConfigParser parser = new FlConfigParserImpl();

		SchemaDescriptor<FlBinding> schemaDesc = (SchemaDescriptor<FlBinding>) parser
				.parseConfiguration(configuration);

		assertEquals(0, schemaDesc.getChildren().get(0).getBinding()
				.getStartIndex());
		assertEquals(3, schemaDesc.getChildren().get(0).getBinding()
				.getEndIndex());
		assertEquals(4, schemaDesc.getChildren().get(1).getBinding()
				.getStartIndex());
		assertEquals(8, schemaDesc.getChildren().get(1).getBinding()
				.getEndIndex());
	}

	@SuppressWarnings("unchecked")
	public void testParseHierarchicalData() throws Exception {
		String configuration = "<binding> <field name=\"id\" start=\"0\" end=\"3\"/><field name=\"name\" start=\"4\" end=\"8\"/><field name=\"address.line1\" start=\"9\" end=\"20\"/><field name=\"address.line2\" start=\"21\" end=\"25\"/> </binding>";
		FlConfigParser parser = new FlConfigParserImpl();

		SchemaDescriptor<FlBinding> schemaDesc = (SchemaDescriptor<FlBinding>) parser
				.parseConfiguration(configuration);

		assertEquals(0, schemaDesc.getChildren().get(0).getBinding()
				.getStartIndex());
		assertEquals(3, schemaDesc.getChildren().get(0).getBinding()
				.getEndIndex());
		assertEquals(4, schemaDesc.getChildren().get(1).getBinding()
				.getStartIndex());
		assertEquals(8, schemaDesc.getChildren().get(1).getBinding()
				.getEndIndex());

		assertEquals(9, schemaDesc.getChildren().get(2).getChildren().get(0)
				.getBinding().getStartIndex());
		assertEquals(20, schemaDesc.getChildren().get(2).getChildren().get(0)
				.getBinding().getEndIndex());
		assertEquals(21, schemaDesc.getChildren().get(2).getChildren().get(1)
				.getBinding().getStartIndex());
		assertEquals(25, schemaDesc.getChildren().get(2).getChildren().get(1)
				.getBinding().getEndIndex());
	}

}
