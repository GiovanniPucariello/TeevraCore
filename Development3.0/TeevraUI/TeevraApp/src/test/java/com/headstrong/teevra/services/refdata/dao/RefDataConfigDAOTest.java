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
 * $Id: RefDataConfigDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 30, 2008 
 */

package com.headstrong.teevra.services.refdata.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
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
import com.headstrong.teevra.services.refdata.dao.RefDataConfigDAO;
import com.headstrong.teevra.services.refdata.eo.RefDataConfigEO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;

/**
 * 
 */
public class RefDataConfigDAOTest extends AbstractDAOTestCase {

	public RefDataConfigDAO refDataConfigDAO;

	public void onSetUp() {
		refDataConfigDAO = (RefDataConfigDAO) getBean("refDataConfigDAO");
		HibernateUtil.setUp();
		// create table datasource_config as it has ManytoOne relationship with
		// refdata_config
		HibernateUtil.createTable(CreateQueries.create_datasource_config_Table);
		// insert one record
		List<Object> dataSourceParamList = InsertParamsGenerator
				.setDataSourceParams(new Long(1), "datasource",
						"jdbc:postgresql://10.200.41.13/teevradev", "teevra",
						"teevra", "org.hibernate.dialect.PostgreSQLDialect",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_datasource_config,
				dataSourceParamList);

		// create refdata_config table
		HibernateUtil.createTable(CreateQueries.create_refdata_config_Table);
	}

	/**
	 * Tests getRefDataConfigs() method of RefDataConfigDAO.
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testGetRefDataConfigs() {
		// Insert 2 records check the size of the list the method returns, which
		// should be 2
		System.out.println("TESTING GET RefDataConfigs----");
		// insert 2 records
		List<Object> refDataParamList1 = InsertParamsGenerator
				.setRefDataParams(new Long(1), "testdata1",
						"select * from testdata1", new Long(1), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> refDataParamList2 = InsertParamsGenerator
				.setRefDataParams(new Long(2), "testdata2",
						"select * from testdata2", new Long(1), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_refdata_config,
				refDataParamList1);
		HibernateUtil.insertData(InsertQueries.insert_refdata_config,
				refDataParamList2);

		List<RefDataConfigEO> refDataConfigList = new ArrayList<RefDataConfigEO>();

		// call the method to test
		try {
			refDataConfigList = refDataConfigDAO.getRefDataConfigs();
		} catch (RefDataServiceException e) {
			fail("failed while retrieving reference data configurations ");
			e.printStackTrace();
		}
		Assert.assertSame(2, refDataConfigList.size());
	}

	/**
	 * Tests saveRefDataConfig method of RefDataConfigDAO.
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testSaveRefDataConfig() {
		// Save one record first and then update the same.save one more record
		// and check the size of the list the method returns, which should be 2
		System.out.println("TESTING SAVE OR UPDATE RefDataConfigs");
		// saving first record
		RefDataConfigEO refDataConfig = new RefDataConfigEO();
		refDataConfig.setRefDataName("testdata1");
		refDataConfig.setRefDataQuery("select * from testdata1");
		refDataConfig.setDataSourceId(new Long(1));
		refDataConfig.setCreatedBy(System.getProperty("user.name"));
		refDataConfig.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		try {
			refDataConfigDAO.saveRefDataConfig(refDataConfig);
		} catch (RefDataServiceException e) {
			fail("failed while saving reference data configuration");
			e.printStackTrace();
		}

		// edit first record
		refDataConfig = new RefDataConfigEO();
		refDataConfig.setRefDataId(new Long(1));
		refDataConfig.setRefDataName("testdata1_edit");
		refDataConfig.setRefDataQuery("select * from testdata1_edit");
		refDataConfig.setDataSourceId(new Long(1));
		refDataConfig.setCreatedBy(System.getProperty("user.name"));
		refDataConfig.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		refDataConfig.setModifiedBy(System.getProperty("user.name"));
		refDataConfig
				.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		try {
			refDataConfigDAO.saveRefDataConfig(refDataConfig);
		} catch (RefDataServiceException e) {
			fail("failed while updating reference data configuration");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil.executeQuery(SelectQueries.check_refdata);

		List<Object> data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// check refdata id, name and query
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("testdata1_edit", data.get(1));
		Assert.assertEquals("select * from testdata1_edit", data.get(2));

		// saving the second record
		refDataConfig = new RefDataConfigEO();
		refDataConfig.setRefDataName("testdata1");
		refDataConfig.setRefDataQuery("select * from testdata2");
		refDataConfig.setDataSourceId(new Long(1));
		refDataConfig.setCreatedBy(System.getProperty("user.name"));
		refDataConfig.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		try {
			refDataConfigDAO.saveRefDataConfig(refDataConfig);
		} catch (RefDataServiceException e) {
			fail("failed while saving reference data configuration");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_refdata);

		data = new ArrayList<Object>();
		int recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// check size
		Assert.assertEquals(2, recordCount);
		// check refdata_id
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals(new Long(2), data.get(1));

	}

	/**
	 * Tests deleteRefDataConfig method of RefDataConfigDAO.
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testDeleteRefDataConfig() {
		// Insert one record.check the size,which should be 1. Run the DAO
		// method. check the size again,which should be 0
		System.out.println("TESTING Delete RefDataConfig");
		String refdataName = "testdata";
		// insert one records
		List<Object> refDataParamList = InsertParamsGenerator.setRefDataParams(
				new Long(1), refdataName, "select * from testdata",
				new Long(1), System.getProperty("user.name"), new Timestamp(
						System.currentTimeMillis()), null, null);
		HibernateUtil.insertData(InsertQueries.insert_refdata_config,
				refDataParamList);

		// check size.Should be 1
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_refdata));

		try {
			refDataConfigDAO.deleteRefDataConfig(refdataName);
		} catch (RefDataServiceException e) {
			fail("failed while deleting reference data configuration");
			e.printStackTrace();
		}

		// check size.Should be 0
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_refdata));
	}


	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_refdata_config_Table);
		HibernateUtil.executeQuery(DropQueries.drop_datasource_config_Table);
		HibernateUtil.shutDown();
	}
}
