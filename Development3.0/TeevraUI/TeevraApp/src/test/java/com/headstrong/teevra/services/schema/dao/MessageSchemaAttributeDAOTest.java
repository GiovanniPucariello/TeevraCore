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
 * $Id: MessageSchemaAttributeDAOTestcase.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 24, 2008 
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
import com.headstrong.teevra.services.schema.dao.MessageSchemaAttributeDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaAttributeEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * 
 */
public class MessageSchemaAttributeDAOTest extends AbstractDAOTestCase {

	private MessageSchemaAttributeDAO messageSchemaAttributeDAO;

	public void onSetUp() {
		messageSchemaAttributeDAO = (MessageSchemaAttributeDAO) getBean("messageSchemaAttributeDAO");
		HibernateUtil.setUp();
		HibernateUtil
				.createTable(CreateQueries.create_message_schema_attribute_Table);
	}

	public void testSaveSchemaAttribute() {
		System.out.println("TESTING saveSchemaAttribute ");

		MessageSchemaAttributeEO attribute = new MessageSchemaAttributeEO();
		attribute.setSchemaId(new Long(1));
		attribute.setSchemaAttrName("attribute1");
		attribute.setSchemaAttrType(new Long(3));
		attribute.setSchemaAttrIsKey(false);
		attribute.setSchemaAttrRelation("121");
		attribute.setCreatedBy(System.getProperty("user.name"));
		attribute.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			messageSchemaAttributeDAO.saveSchemaAttribute(attribute);
		} catch (SchemaServiceException e) {
			fail("Failed while saving schema attribute");
			e.printStackTrace();
		}

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_attributes));

	}

	public void testDeleteSchemaAttribute() {
		System.out.println("TESTING deleteSchemaAttribute ");

		List<Object> schemaAttributeParams1 = InsertParamsGenerator
				.setMessageSchemaAttributeParams(new Long(1), new Long(1),
						"TradeId", new Long(1), false, "121", null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> schemaAttributeParams2 = InsertParamsGenerator
				.setMessageSchemaAttributeParams(new Long(2), new Long(1),
						"TradeIdSupplement", new Long(1), false, "121", null,
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_message_schema_attribute,
				schemaAttributeParams1);
		HibernateUtil.insertData(InsertQueries.insert_message_schema_attribute,
				schemaAttributeParams2);

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_attributes));

		MessageSchemaAttributeEO attributeToDelete = new MessageSchemaAttributeEO();
		attributeToDelete.setSchemaAttrId(new Long(1));
		attributeToDelete.setSchemaId(new Long(1));

		try {
			messageSchemaAttributeDAO.deleteSchemaAttribute(attributeToDelete);
		} catch (SchemaServiceException e) {
			fail("Failed while deleting schema attribute");
			e.printStackTrace();
		}

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_message_schema_attributes));
	}

	public void onTearDown() {
		HibernateUtil
				.executeQuery(DropQueries.drop_message_schema_attribute_Table);
		HibernateUtil.shutDown();
	}

}
