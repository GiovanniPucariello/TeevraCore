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
 * $Id: TPropertyDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 3, 2009 
 */

package com.headstrong.teevra.services.appproperties.dao;

import java.sql.Timestamp;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.services.appproperties.dao.TPropertyDAO;
import com.headstrong.teevra.services.appproperties.exception.AppPropertiesServiceException;

/**
 * 
 */
public class TPropertyDAOTest extends AbstractDAOTestCase {

	public TPropertyDAO propertyDAO;

	public void onSetUp() {
		propertyDAO = (TPropertyDAO) getBean("propertyDAO");
		HibernateUtil.setUp();

		// create t_property table
		HibernateUtil.createTable(CreateQueries.create_t_property_Table);
	}

	public void testGetPropertyValue() {
		System.out.println("TESTING getPropertyValue");

		// insert 2 records
		String propertyValue = "";
		List<Object> propertyParams = InsertParamsGenerator.setPropertyParams(
				new Long(1), "AUTH_TYPE", "DB", "Authentication Provider",
				"ACTIVE", "Type should be either DB or LDAP.", System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_property, propertyParams);

		try {
			propertyValue = propertyDAO.getPropertyValue("AUTH_TYPE");
		} catch (AppPropertiesServiceException e) {
			e.printStackTrace();
		}
		Assert.assertSame("DB", propertyValue);

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_t_property_Table);
		HibernateUtil.shutDown();
	}
}
