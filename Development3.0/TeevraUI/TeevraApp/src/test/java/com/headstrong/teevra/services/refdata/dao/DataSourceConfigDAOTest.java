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
 * $Id: DataSourceConfigDAOTest.java
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
import com.headstrong.teevra.services.refdata.dao.DataSourceConfigDAO;
import com.headstrong.teevra.services.refdata.eo.DataSourceConfigEO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;

/**
 * 
 */
public class DataSourceConfigDAOTest extends AbstractDAOTestCase {

	public DataSourceConfigDAO dataSourceConfigDAO;

	public void onSetUp() {
		dataSourceConfigDAO = (DataSourceConfigDAO) getBean("dataSourceConfigDAO");

		HibernateUtil.setUp();

		// create datasource_config table
		HibernateUtil.createTable(CreateQueries.create_datasource_config_Table);
	}

	/**
	 * Tests getDataSourceConfigs method of DataSourceConfigDAO.
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testGetDataSourceConfigs() {
		// Insert 2 records check the size of the list the method returns, which
		// should be 2
		System.out.println("TESTING GET DataSourceConfigs----");
		// insert 2 records
		List<Object> dataSourceParamList1 = InsertParamsGenerator
				.setDataSourceParams(new Long(1), "datasource1",
						"jdbc:postgresql://10.200.41.13/teevradev", "teevra",
						"teevra", "org.hibernate.dialect.PostgreSQLDialect",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> dataSourceParamList2 = InsertParamsGenerator
				.setDataSourceParams(new Long(2), "datasource2",
						"jdbc:postgresql://10.200.15.76/teevradev",
						"postgres", "stride",
						"org.hibernate.dialect.PostgreSQLDialect", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_datasource_config,
				dataSourceParamList1);
		HibernateUtil.insertData(InsertQueries.insert_datasource_config,
				dataSourceParamList2);

		List<DataSourceConfigEO> dataSourceConfigList = new ArrayList<DataSourceConfigEO>();

		// call the method to test
		try {
			dataSourceConfigList = dataSourceConfigDAO.getDataSourceConfigs();
		} catch (RefDataServiceException e) {
			fail("failed while retrieving data source configurations ");
			e.printStackTrace();
		}
		System.out.println("LIST SIZE -----> " + dataSourceConfigList.size());
		System.out.println("String Representation"
				+ dataSourceConfigList.toString());
		Assert.assertSame(2, dataSourceConfigList.size());
	}

	/**
	 * Tests saveDataSourceConfig of DataSourceConfigDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testSaveDataSouceConfig() {
		// Save one record first and then update the same.save one more record
		// and check the size of the list the method returns, which should be 2
		System.out.println("TESTING SAVE DataSouceConfig");

		// saving first record
		DataSourceConfigEO dataSourceConfig = new DataSourceConfigEO();
		dataSourceConfig.setDataSourceName("datasource1");
		dataSourceConfig.setDbUrl("jdbc:postgresql://10.200.41.13/teevradev");
		dataSourceConfig.setDbUsername("teevra");
		dataSourceConfig.setDbPassword("teevra");
		dataSourceConfig.setDbType("org.postgresql.Driver");
		dataSourceConfig.setCreatedBy(System.getProperty("user.name"));
		dataSourceConfig.setCreatedDate(new Timestamp(System
				.currentTimeMillis()));
		try {
			dataSourceConfigDAO.saveDataSourceConfig(dataSourceConfig);
		} catch (RefDataServiceException e) {
			fail("failed while saving data source configuration ");
			e.printStackTrace();
		}

		// edit first record
		dataSourceConfig = new DataSourceConfigEO();
		dataSourceConfig.setDataSourceId(new Long(1));
		dataSourceConfig.setDataSourceName("datasource1_edit");
		dataSourceConfig.setDbUrl("jdbc:postgresql://10.200.41.13/teevradev");
		dataSourceConfig.setDbUsername("teevra");
		dataSourceConfig.setDbPassword("teevra");
		dataSourceConfig.setDbType("org.postgresql.Driver");
		dataSourceConfig.setCreatedBy(System.getProperty("user.name"));
		dataSourceConfig.setCreatedDate(new Timestamp(System
				.currentTimeMillis()));
		dataSourceConfig.setModifiedBy(System.getProperty("user.name"));
		dataSourceConfig.setModifiedDate(new Timestamp(System
				.currentTimeMillis()));
		try {
			dataSourceConfigDAO.saveDataSourceConfig(dataSourceConfig);
		} catch (RefDataServiceException e) {
			fail("failed while updating data source configuration ");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_datasource_config);

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
		// check datasource id, name and db url
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("datasource1_edit", data.get(1));
		Assert.assertEquals("jdbc:postgresql://10.200.41.13/teevradev", data
				.get(2));

		// saving the second record
		dataSourceConfig = new DataSourceConfigEO();
		dataSourceConfig.setDataSourceName("datasource2");
		dataSourceConfig.setDbUrl("jdbc:postgresql://10.200.15.76/teevradev");
		dataSourceConfig.setDbUsername("teevra");
		dataSourceConfig.setDbPassword("teevra");
		dataSourceConfig.setDbType("org.postgresql.Driver");
		dataSourceConfig.setCreatedBy(System.getProperty("user.name"));
		dataSourceConfig.setCreatedDate(new Timestamp(System
				.currentTimeMillis()));
		try {
			dataSourceConfigDAO.saveDataSourceConfig(dataSourceConfig);
		} catch (RefDataServiceException e) {
			fail("failed while saving data source configurations ");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_datasource_config);

		data = new ArrayList<Object>();
		int recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					recordCount++;
					// check dataSourceName
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
	 * Tests deleteDataSourceConfig of DataSourceConfigDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testDeleteDataSouceConfig() {

		// Insert one record.check the size,which should be 1. Run the DAO
		// method. check the size again,which should be 0
		System.out.println("TESTING Delete DataSouceConfig");
		String dataSourceName = "datasource";
		// insert one record
		List<Object> dataSourceParamList = InsertParamsGenerator
				.setDataSourceParams(new Long(1), "datasource",
						"jdbc:postgresql://10.200.41.13/teevradev", "teevra",
						"teevra", "org.hibernate.dialect.PostgreSQLDialect",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);
		HibernateUtil.insertData(InsertQueries.insert_datasource_config,
				dataSourceParamList);

		// check size.Should be 1
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_datasource_config));

		try {
			dataSourceConfigDAO.deleteDataSourceConfig(dataSourceName);
		} catch (RefDataServiceException e) {
			fail("failed while deleting data source configuration ");
			e.printStackTrace();
		}
		// check size.Should be 0
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_datasource_config));
	}

	public void onTearDown() {

		HibernateUtil.executeQuery(DropQueries.drop_refdata_config_Table);
		HibernateUtil.executeQuery(DropQueries.drop_datasource_config_Table);
		HibernateUtil.shutDown();
	}
}
