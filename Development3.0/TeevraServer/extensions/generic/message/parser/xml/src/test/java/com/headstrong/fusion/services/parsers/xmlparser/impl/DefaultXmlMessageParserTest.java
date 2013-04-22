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
 * $Id: DefaultXMLMessageParserTest.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Oct 19, 2008
 */

package com.headstrong.fusion.services.parsers.xmlparser.impl;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XPathBinding;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XmlBindConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XmlBindConfigParserImpl;
import com.headstrong.fusion.services.message.parser.xml.impl.DefaultXmlMessageParser;
import com.headstrong.fusion.services.message.parser.xml.impl.XmlMessageParser;
import com.headstrong.fusion.services.message.schema.FusionSchemaService;

/**
 * Default XML Message Parser.
 * 
 */

public class DefaultXmlMessageParserTest extends TestCase {

	private static Properties prop = new Properties();

	public DefaultXmlMessageParserTest() throws Exception {
		prop
				.load(new FileInputStream(
						"src/test/resources/test_data.properties"));
	}

	private void setUpDbPool() throws Exception {
		Map<String, String> dbProps = new HashMap<String, String>();
		dbProps
				.put(FusionConstants.DATABASE_CLASSNAME,
						"org.hsqldb.jdbcDriver");
		dbProps.put(FusionConstants.DATABASE_USERNAME, "sa");
		dbProps.put(FusionConstants.DATABASE_PASSWORD, "");
		dbProps.put(FusionConstants.DATABASE_URL, "jdbc:hsqldb:mem:fusion");
		dbProps.put(FusionConstants.JDBCINITIALSIZE, "2");
		dbProps.put(FusionConstants.JDBCMAXACTIVE, "5");
		dbProps.put(FusionConstants.JDBCMAXOPENACTIVEPREP, "-1");
		dbProps.put(FusionConstants.MINEVICTABLEIDLETIMEMILLIS, "60000");
		dbProps.put(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS, "300000");
		
		DbPool dbPool = null;

		dbPool = DatabaseManager.setupDBPool(dbProps);
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, dbPool);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.setUpDbPool();

		// create schema and schema attribute tables.

		Connection connection = DatabaseManager.getInstance(
				FusionConstants.FUSIONDB).getConnection();
		Statement tables = connection.createStatement();
		// MESSAGE_SCHEMA table.
		String message_schema = "CREATE TABLE message_schema (   "
				+ "schema_id bigint NOT NULL,   "
				+ "schema_name character varying(50),   "
				+ "schema_desc character varying(200),   "
				+ "schema_visibility_prcs_id bigint,   "
				+ "schema_visibility_prcs_grp_id bigint,   "
				+ "schema_is_primitive boolean ,   "
				+ "parent_schema_id bigint,   "
				+ "created_by character varying(50) NOT NULL,   "
				+ "created_date timestamp,   " + "modified_by character,   "
				+ "modified_date timestamp)";
		// MESSAGE_SCHEMA_ATTRIBUTE table.
		String message_schema_attr = "CREATE TABLE message_schema_attribute (   "
				+ "schema_attr_id bigint NOT NULL,   "
				+ "schema_id bigint NOT NULL,   "
				+ "schema_attr_name character,   "
				+ "schema_attr_type bigint,   "
				+ "schema_attr_is_key character(1),   "
				+ "schema_attr_relation character(3),   "
				+ "schema_m2m_type bigint,   "
				+ "created_by character varying(50) NOT NULL,   "
				+ "created_date timestamp ,   "
				+ "modified_by character varying(50),   "
				+ "modified_date timestamp)   ";
		tables.addBatch(message_schema);
		tables.addBatch(message_schema_attr);

		tables.executeBatch();
		tables.close();

		connection.close();

	}

	public void setUpSchema() throws Exception {
		Connection connection = DatabaseManager.getInstance(
				FusionConstants.FUSIONDB).getConnection();

		Statement inserts = connection.createStatement();
		// MESSAGE SCHEMA
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (1, 'string', 'STRING', true, 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (2, 'requestQuote', 'requestQuote', 'N', 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (3, 'header', 'header', 'N', 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (4, 'creditDefaultSwap', 'creditDefaultSwap', 'N', 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (5, 'generalTerms', 'generalTerms', 'N', 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (6, 'scheduledTerminationDate', 'scheduledTerminationDate', 'N', 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (7, 'referenceInformation', 'referenceInformation', 'N', 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (8, 'referenceEntity', 'referenceEntity', 'N', 'system_user', now(), 'system_user', now())");

		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (9, 'long', 'LONG', true, 'system_user', now(), 'system_user', now())");

		// MESSAGE_SCHEMA_ATTRIBUTE
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (1,2,'header',3,'121','system_user',now(),'system_user',now())");

		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (2,2,'creditDefaultSwap',4,'121','system_user',now(),'system_user',now())");
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (3,3,'messageId',9,'121','system_user',now(),'system_user',now())");
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (4,3,'sentBy',1,'121','system_user',now(),'system_user',now())");
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (5,4,'generalTerms',5,'121','system_user',now(),'system_user',now())");
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (6,5,'scheduledTerminationDate',6,'121','system_user',now(),'system_user',now())");
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (7,6,'unadjustedDate',1,'121','system_user',now(),'system_user',now())");
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (8,5,'referenceInformation',7,'121','system_user',now(),'system_user',now())");

		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (9,7,'referenceEntity',8,'121','system_user',now(),'system_user',now())");

		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (10,8,'id',1,'121','system_user',now(),'system_user',now())");

		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (11,8,'entityName',1,'121','system_user',now(),'system_user',now())");

		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (12,8,'entityId',1,'121','system_user',now(),'system_user',now())");

		inserts.executeBatch();
		inserts.close();
		connection.close();
	}

	public void testParse() throws Exception {
		// Setup schema
		this.setUpSchema();

		FusionSchemaService fusionSchemaService = new FusionSchemaService();
		fusionSchemaService.reloadCache();
		ObjectDescriptorCache cache = ObjectDescriptorCache.getInstance();

		ObjectDescriptor desc = cache.getDescriptor("requestQuote");
		SchemaDescriptor<XPathBinding> schemaDesc = null;
		schemaDesc = readSchemaDescriptor();
		XmlMessageParser parser = new DefaultXmlMessageParser();
		DefaultBusinessObject defaultBusinessObject = new DefaultBusinessObject();
		defaultBusinessObject.setObjectDescriptor(desc);
		parser.parse(defaultBusinessObject, schemaDesc, prop
				.getProperty("DefaultXmlMessageParserTest.testParse.message"));

		// verify business object.
		assertEquals(new Long(1), defaultBusinessObject.getValue("header.messageId"));

		assertEquals("som soni", defaultBusinessObject.getValue("header.sentBy"));

		assertEquals(
				"2007-09-06Z",
				defaultBusinessObject
						.getValue("creditDefaultSwap.generalTerms.scheduledTerminationDate.unadjustedDate"));
		assertEquals(
				"referenceEntity",
				defaultBusinessObject
						.getValue("creditDefaultSwap.generalTerms.referenceInformation.referenceEntity.id"));
		assertEquals(
				"Tenet Healthcare Corporation",
				defaultBusinessObject
						.getValue("creditDefaultSwap.generalTerms.referenceInformation.referenceEntity.entityName"));
		assertEquals(
				"8G836J",
				defaultBusinessObject
						.getValue("creditDefaultSwap.generalTerms.referenceInformation.referenceEntity.entityId"));
	}

	@SuppressWarnings("unchecked")
	private SchemaDescriptor<XPathBinding> readSchemaDescriptor()
			throws Exception {
		SchemaDescriptor<XPathBinding> schemaDesc = null;
		XmlBindConfigParser parser = new XmlBindConfigParserImpl();
		schemaDesc = (SchemaDescriptor<XPathBinding>) parser
				.parseConfiguration(prop
						.getProperty("DefaultXmlMessageParserTest.testParse.configuration"));
		return schemaDesc;
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		Connection connection = DatabaseManager.getInstance(
				FusionConstants.FUSIONDB).getConnection();
		// Remove tables.
		Statement stmt = connection.createStatement();
		stmt.addBatch("drop table message_schema");
		stmt.addBatch("drop table message_schema_attribute");
		stmt.executeBatch();
		stmt.close();
		connection.close();

	}

}
