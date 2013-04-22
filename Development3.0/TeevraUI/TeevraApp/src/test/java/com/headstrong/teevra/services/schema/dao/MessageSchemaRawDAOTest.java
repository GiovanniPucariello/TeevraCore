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
 * $Id: MessageSchemaRawDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 22, 2008 
 */

package com.headstrong.teevra.services.schema.dao;

import java.sql.Timestamp;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.schema.dao.MessageSchemaRawDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaRawEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * 
 */
public class MessageSchemaRawDAOTest extends AbstractDAOTestCase {

	private MessageSchemaRawDAO messageSchemaRawDAO;

	public void onSetUp() {
		messageSchemaRawDAO = (MessageSchemaRawDAO) getBean("messageSchemaRawDAO");

		HibernateUtil.setUp();
		HibernateUtil
				.createTable(CreateQueries.create_message_schema_raw_table);
	}

	public void testSaveSchemaRaw() {
		System.out.println("TESTING saveSchemaRaw");

		MessageSchemaRawEO schemaRaw = new MessageSchemaRawEO();
		schemaRaw.setSchemaId(new Long(1));
		schemaRaw.setSchemaFormattedText("schemaFormattedText");
		schemaRaw.setCreatedBy(System.getProperty("user.name"));
		schemaRaw.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			messageSchemaRawDAO.saveSchemaRaw(schemaRaw);
		} catch (SchemaServiceException e) {
			fail("Failed while saving schema raw data");
			e.printStackTrace();
		}

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_raw));
	}

	public void testDeleteSchemaRaw() {
		System.out.println("TESTING deleteSchemaRaw");

		List<Object> messageSchemaRawParams1 = InsertParamsGenerator
				.setMessageSchemaRawParams(new Long(1), "schemaFormattedText1",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);
		List<Object> messageSchemaRawParams2 = InsertParamsGenerator
				.setMessageSchemaRawParams(new Long(2), "schemaFormattedText2",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_message_schema_raw,
				messageSchemaRawParams1);
		HibernateUtil.insertData(InsertQueries.insert_message_schema_raw,
				messageSchemaRawParams2);

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_raw));

		MessageSchemaRawEO schemaRaw = new MessageSchemaRawEO();
		schemaRaw.setSchemaId(new Long(1));
		try {
			messageSchemaRawDAO.deleteSchemaRaw(schemaRaw);
		} catch (SchemaServiceException e) {
			fail("Failed while deleting message schema raw");
			e.printStackTrace();
		}

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_raw));

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_message_schema_raw_table);
		HibernateUtil.shutDown();
	}
}
