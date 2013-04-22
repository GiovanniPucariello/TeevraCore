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
 * $Id: FusionSchemaServiceTest.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Oct 19, 2008
 */

package com.headstrong.fusion.services.message.schema;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * @author som krishan
 * 
 */
public class FusionSchemaServiceTest extends TestCase {

	private DbPool setUpDbPool() throws Exception {
		Map<String, String> dbProps = new HashMap<String, String>();
		dbProps
				.put(FusionConstants.DATABASE_CLASSNAME,
						"org.hsqldb.jdbcDriver");
		dbProps.put(FusionConstants.DATABASE_USERNAME, "sa");
		dbProps.put(FusionConstants.DATABASE_PASSWORD, "");
		dbProps.put(FusionConstants.DATABASE_URL, "jdbc:hsqldb:mem:fusion");
		dbProps.put("database.initialSize", "2");
		dbProps.put("database.maxActive", "5");
		dbProps.put("database.maxOpenActivePrep", "-1");
		dbProps.put("database.minEvictableIdleTimemillis", "60000");
		dbProps.put("database.timeBetweenEvictionRunsMillis", "300000");
		
		DbPool dbPool = null;

		dbPool = DatabaseManager.setupDBPool(dbProps);
		return dbPool;
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		// create schema and schema attribute tables.

		Connection connection = setUpDbPool().getConnection();
		Statement tables = connection.createStatement();
		// MESSAGE_SCHEMA table.
		String message_schema = "CREATE TABLE message_schema (   "
				+ "schema_id bigint NOT NULL,   "
				+ "schema_name character varying(50),   "
				+ "schema_desc character varying(200),   "
				+ "schema_is_primitive character(1) ,   "
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
		DbPool dbPool = this.setUpDbPool();
		Connection connection = dbPool.getConnection();
		Statement inserts = connection.createStatement();
		// MESSAGE SCHEMA
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (1, 'string', 'string', 'Y', 'system_user', now(), 'system_user', now())");
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
/*		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (7, 'referenceInformation', 'referenceInformation', 'N', 'system_user', now(), 'system_user', now())");
		inserts
				.addBatch("INSERT INTO message_schema(schema_id, schema_name, schema_desc, schema_is_primitive, created_by, created_date, modified_by, modified_date)   "
						+ "VALUES (8, 'referenceEntity', 'referenceEntity', 'N', 'system_user', now(), 'system_user', now())");
*/
		// MESSAGE_SCHEMA_ATTRIBUTE
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (1,2,'header',3,'121','system_user',now(),'system_user',now())");

		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (2,2,'creditDefaultSwap',4,'121','system_user',now(),'system_user',now())");
		inserts
				.addBatch("INSERT INTO message_schema_attribute(schema_attr_id, schema_id, schema_attr_name, schema_attr_type, schema_attr_relation, created_by, created_date, modified_by, modified_date) "
						+ "VALUES (3,3,'messageId',1,'121','system_user',now(),'system_user',now())");
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
/*		inserts
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
*/
		inserts.executeBatch();
		inserts.close();
		connection.close();
	}

	public void testLoadSchema() {

		// Setup schema
		try {
			this.setUpSchema();
		} catch (Exception e2) {
			fail("Error while setting up the schema." + e2.getMessage());
		}
		try {
			DatabaseManager.registerDBPool(FusionConstants.FUSIONDB,
					setUpDbPool());
		} catch (Exception e1) {
			fail(e1.getMessage());
		}
		FusionSchemaService schemaService = new FusionSchemaService();
		try {
			schemaService.reloadCache();
		} catch (SQLException e) {
			fail(e.getMessage());
		}

		ObjectDescriptorCache cache = ObjectDescriptorCache.getInstance();
		ObjectDescriptor desc = cache.getDescriptor("requestQuote");
		// check attributes
		Map<String, AttributeDescriptor> attributes = desc.getAttributes();
		assertNotNull("Attributes can't be null", attributes);

		// Verify individual Attributes

		// HEADER DEEP COMPARISON
		AttributeDescriptor header = attributes.get("header");
		assertNotNull("Header missing", header);
		assertEquals(1, header.getAttributeId().longValue());
		assertEquals("header", header.getAttributeName());
		ObjectDescriptor headerDesc = header.getType();
		assertEquals(3, headerDesc.getId().longValue());

		Map<String, AttributeDescriptor> headerAttrs = headerDesc
				.getAttributes();
		AttributeDescriptor messageId = headerAttrs.get("messageId");
		assertEquals(3, messageId.getAttributeId().longValue());
		assertEquals("messageId", messageId.getAttributeName());
		assertEquals("string", messageId.getType().getDesc());

		AttributeDescriptor sentBy = headerAttrs.get("sentBy");
		assertEquals(4, sentBy.getAttributeId().longValue());
		assertEquals("sentBy", sentBy.getAttributeName());
		assertEquals("string", sentBy.getType().getDesc());

		// creditDefaultSwap DEEP COMPARISON

		AttributeDescriptor creditDefaultSwap = attributes
				.get("creditDefaultSwap");
		assertNotNull("creditDefaultSwap missing", creditDefaultSwap);
		assertEquals(2, creditDefaultSwap.getAttributeId().longValue());
		assertEquals("creditDefaultSwap", creditDefaultSwap.getAttributeName());

		ObjectDescriptor creditDefaultSwapDesc = creditDefaultSwap.getType();
		assertEquals(4, creditDefaultSwapDesc.getId().longValue());

		// CDS Attributes
		Map<String, AttributeDescriptor> creditDefaultSwapAttrs = creditDefaultSwapDesc
				.getAttributes();

		AttributeDescriptor generalTermsAttr = creditDefaultSwapAttrs
				.get("generalTerms");
		assertEquals(5, generalTermsAttr.getAttributeId().longValue());
		assertEquals("generalTerms", generalTermsAttr.getAttributeName());

		ObjectDescriptor generalTermDesc = generalTermsAttr.getType();
		assertEquals(5, generalTermDesc.getId().longValue());

		AttributeDescriptor scheduledTerminationDateAttr = generalTermDesc
				.getAttribute("scheduledTerminationDate");

		assertEquals(6, scheduledTerminationDateAttr.getAttributeId()
				.longValue());
		assertEquals("scheduledTerminationDate", scheduledTerminationDateAttr
				.getAttributeName());

		ObjectDescriptor scheduledTerminationDateDesc = scheduledTerminationDateAttr
				.getType();
		assertEquals(6, scheduledTerminationDateDesc.getId().longValue());

		AttributeDescriptor unadjustedDateAttr = scheduledTerminationDateDesc
				.getAttribute("unadjustedDate");

		assertEquals(7, unadjustedDateAttr.getAttributeId().longValue());
		assertEquals("unadjustedDate", unadjustedDateAttr.getAttributeName());
		assertEquals("string", unadjustedDateAttr.getType().getDesc());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		DbPool dbPool = setUpDbPool();
		Connection connection = dbPool.getConnection();
		// Remove tables.
		Statement stmt = connection.createStatement();
		stmt.addBatch("drop table message_schema");
		stmt.addBatch("drop table message_schema_attribute");
		stmt.executeBatch();
		stmt.close();
		connection.close();

	}

}
