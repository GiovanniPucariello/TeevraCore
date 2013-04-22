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
 * $Id: TdBindingConfigurationParserImplTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.td;

import junit.framework.TestCase;

import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

public class TdBindingConfigurationParserImplTest extends TestCase {

	@SuppressWarnings("unchecked")
	public void testParseSingleDimentionData() throws Exception {
		String configuration = "<binding><field name=\"id\" index=\"1\"></field><field name=\"name\" index=\"2\"></field></binding>";
		TdBindConfigParserImpl parser = new TdBindConfigParserImpl();

		SchemaDescriptor<ColumnIndexBinding> schemaDesc = (SchemaDescriptor<ColumnIndexBinding>) parser
				.parseConfiguration(configuration);

		assertEquals(1, schemaDesc.getChildren().get(0).getBinding()
				.getColumnIndex());
		assertEquals(2, schemaDesc.getChildren().get(1).getBinding()
				.getColumnIndex());
	}

	@SuppressWarnings("unchecked")
	public void testParseHierarchicalData() throws Exception {
		String configuration = "<binding> 	<field name=\"id\" index=\"1\"></field><field name=\"name\" index=\"2\"></field><field name=\"address.line1\" index=\"3\"></field><field name=\"address.line2\" index=\"4\"></field></binding>";
		TdBindConfigParserImpl parser = new TdBindConfigParserImpl();

		SchemaDescriptor<ColumnIndexBinding> schemaDesc = (SchemaDescriptor<ColumnIndexBinding>) parser
				.parseConfiguration(configuration);
		assertEquals(1, schemaDesc.getChildren().get(0).getBinding()
				.getColumnIndex());
		assertEquals(2, schemaDesc.getChildren().get(1).getBinding()
				.getColumnIndex());
		assertEquals(3, schemaDesc.getChildren().get(2).getChildren().get(0)
				.getBinding().getColumnIndex());
		assertEquals(4, schemaDesc.getChildren().get(2).getChildren().get(1)
				.getBinding().getColumnIndex());

	}

}
