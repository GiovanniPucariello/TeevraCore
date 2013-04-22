/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: MessageSchemaDAOTestcase.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 23, 2008 
 */

package com.headstrong.teevra.services.schema.dao;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.schema.dao.MessageSchemaDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaEO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaRawEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * 
 */
public class MessageSchemaDAOTest extends AbstractDAOTestCase {

	private MessageSchemaDAO messageSchemaDAO;

	public void onSetUp() {
		messageSchemaDAO = (MessageSchemaDAO) getBean("messageSchemaDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_message_schema_Table);
		HibernateUtil
				.createTable(CreateQueries.create_message_schema_attribute_Table);
		HibernateUtil
				.createTable(CreateQueries.create_message_schema_raw_table);
	}

	public void testSaveSchema() {
		// TODO- saveSchema is not being used. 
	}

	public void testLoadSchema() {
		// TODO- loadSchema is not being used
	}

	public void testLoadSchemaTree() {
		// TODO- loadSchema(rootSchemaName) is not being used.
	}

	public void testDeleteSchema() {
		// TODO- deleteSchema(schemaName) is not being used.
	}

	public void testDeleteSchemaTree() {
		System.out.println("Testing deleteSchemaTree");

		addPrimitiveSchemas();

		List<Object> schemaParams1 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(8), "TradeMessageTest",
						"TradeMessageTest", false, new Long(0), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, true);
		List<Object> schemaParams2 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(9), "TradeMasterTest",
						"TradeMasterTest", false, new Long(0), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, false);

		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams1);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams2);
		Assert.assertEquals(2 + 7, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema));

		// 4 schema attributes
		List<Object> schemaAttributeParams1 = InsertParamsGenerator
				.setMessageSchemaAttributeParams(new Long(1), new Long(8),
						"MsgId", new Long(1), false, "121", null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> schemaAttributeParams2 = InsertParamsGenerator
				.setMessageSchemaAttributeParams(new Long(2), new Long(8),
						"Activity", new Long(9), false, "121", null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> schemaAttributeParams3 = InsertParamsGenerator
				.setMessageSchemaAttributeParams(new Long(3), new Long(9),
						"TradeId", new Long(2), false, "121", null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_message_schema_attribute,
				schemaAttributeParams1);
		HibernateUtil.insertData(InsertQueries.insert_message_schema_attribute,
				schemaAttributeParams2);
		HibernateUtil.insertData(InsertQueries.insert_message_schema_attribute,
				schemaAttributeParams3);

		Assert.assertEquals(3, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_attributes));

		// schema raw for root schema
		List<Object> messageSchemaRawParams = InsertParamsGenerator
				.setMessageSchemaRawParams(new Long(8), "HTML Formatted Text",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_message_schema_raw,
				messageSchemaRawParams);

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_raw));

		try {
			messageSchemaDAO.deleteSchemaTree(new Long(8));
		} catch (SchemaServiceException e) {
			fail("Failed while deleting the schema tree");
			e.printStackTrace();
		}

		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_raw));
		Assert.assertEquals(7, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema));
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_attributes));
	}

	public void testGetSchemas() {
		System.out.println("Testing getSchemas  ");

		List<Object> schemaParams1 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(1), "string", "STRING", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> schemaParams2 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(2), "long", "LONG", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> schemaParams3 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(3), "rietveld", "rietveld",
						false, new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						true);

		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams1);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams2);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams3);

		List<MessageSchemaEO> schemaList = new ArrayList<MessageSchemaEO>();
		try {
			schemaList = messageSchemaDAO.getSchemas();
		} catch (SchemaServiceException e) {
			fail("Failed while retrieving all the schemas in the system");
			e.printStackTrace();
		}

		Assert.assertEquals(3, schemaList.size());
	}

	public void testCriteriaBasedGetSchemas() {
		System.out.println("Testing criteria based getSchemas ");

		List<Object> schemaParams1 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(1), "string", "STRING", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> schemaParams2 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(2), "long", "LONG", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);

		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams1);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams2);

		MessageSchemaEO criteria = new MessageSchemaEO();
		criteria.setSchemaId(new Long(2));

		MessageSchemaEO schema = new MessageSchemaEO();
		try {
			schema = messageSchemaDAO.getSchemas(criteria).get(0);
		} catch (SchemaServiceException e) {
			fail("Failed while retrieving all the schemas in the system");
			e.printStackTrace();
		}

		Assert.assertEquals(new Long(2), schema.getSchemaId());
		Assert.assertEquals("long", schema.getSchemaName());
		Assert.assertEquals("LONG", schema.getSchemaDesc());
		Assert.assertEquals(true, schema.isSchemaIsPrimitive());
		Assert.assertEquals(false, schema.isSchemaIsPublic());
	}

	public void testGetPublicSchemas() {
		System.out.println("Testing getPublicSchemas ");

		List<Object> schemaParams1 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(1), "string", "STRING", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> schemaParams2 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(2), "long", "LONG", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> schemaParams3 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(3), "rietveld", "rietveld",
						false, new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						true);
		List<Object> schemaParams4 = InsertParamsGenerator
				.setMessageSchemaParams(new Long(4), "EquityExercise123",
						"TEST", false, new Long(0), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, false);

		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams1);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams2);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams3);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				schemaParams4);

		Assert.assertEquals(4, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema));

		List<MessageSchemaEO> schemaList = new ArrayList<MessageSchemaEO>();
		try {
			schemaList = messageSchemaDAO.getPublicSchemas();
		} catch (SchemaServiceException e) {
			fail("Failed while retrieving all the public schemas in the system");
			e.printStackTrace();
		}

		Assert.assertEquals(1, schemaList.size());
		Assert.assertEquals(new Long(3), schemaList.get(0).getSchemaId());
	}

	public void testSaveXMLSchema() {
		System.out.println("Testing saveXMLSchema ");

		addPrimitiveSchemas();

		String schemaString = "";
		MessageSchemaEO schema = new MessageSchemaEO();
		// schema.setSchemaName("TradeMessageTest");
		schema.setSchemaDesc("TESTING SAVE XML SCHEMA");
		MessageSchemaRawEO schemaRaw = new MessageSchemaRawEO();
		schemaRaw.setSchemaFormattedText("HTML SCHEMA TEXT");
		schema.setSchemaRaw(schemaRaw);
		schema.setCreatedBy(System.getProperty("user.name"));
		schema.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		try {

			// FileInputStream fstream = new FileInputStream(
			// "E:\\sample\\sample.xsd");
			FileInputStream fstream = new FileInputStream(
					"src/test/resources/sample_schema.xsd");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				schemaString = schemaString + strLine;
			}
			System.out.println("SCHEMA STRING: " + schemaString);
			in.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		MessageSchemaEO savedSchema = new MessageSchemaEO();
		try {
			savedSchema = messageSchemaDAO.saveXMLSchema(schema, schemaString);
		} catch (SchemaServiceException e) {
			e.printStackTrace();
		}

		Assert.assertEquals(new Long(8), savedSchema.getSchemaId());
		Assert.assertEquals("TradeMessageTest", savedSchema.getSchemaName());
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_raw));
		Assert.assertEquals(4 + 7, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema));
		Assert.assertEquals(20 + 23 + 2 + 11, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_attributes));
	}

	private void addPrimitiveSchemas() {

		List<Object> stringParams = InsertParamsGenerator
				.setMessageSchemaParams(new Long(1), "string", "STRING", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> longParams = InsertParamsGenerator.setMessageSchemaParams(
				new Long(2), "long", "LONG", true, new Long(0), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null, false);
		List<Object> integerParams = InsertParamsGenerator
				.setMessageSchemaParams(new Long(3), "integer", "INTEGER",
						true, new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> doubleParams = InsertParamsGenerator
				.setMessageSchemaParams(new Long(4), "double", "DOUBLE", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> booleanParams = InsertParamsGenerator
				.setMessageSchemaParams(new Long(5), "boolean", "BOOLEAN",
						true, new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> floatParams = InsertParamsGenerator
				.setMessageSchemaParams(new Long(6), "float", "FLOAT", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);
		List<Object> shortParams = InsertParamsGenerator
				.setMessageSchemaParams(new Long(7), "short", "SHORT", true,
						new Long(0), System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						false);

		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				stringParams);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				longParams);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				integerParams);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				doubleParams);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				booleanParams);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				floatParams);
		HibernateUtil.insertData(InsertQueries.insert_message_schema,
				shortParams);

		List<Object> teevraSequenceParams = InsertParamsGenerator
				.setTeevraSequenceParams("message_schema", new Long(8));
		HibernateUtil.insertData(InsertQueries.insert_teevra_sequence,
				teevraSequenceParams);

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_message_schema_raw_table);
		HibernateUtil
				.executeQuery(DropQueries.drop_message_schema_attribute_Table);
		HibernateUtil.executeQuery(DropQueries.drop_message_schema_Table);
		HibernateUtil.shutDown();
	}
}
