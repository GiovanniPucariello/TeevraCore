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
 * $Id: DbPool.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 14, 2008 
 */

package com.headstrong.fusion.services.dbpool.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * DbPool maintains pool for every datasource created through
 * {@link DatabaseManager}
 */
public class DbPool {
	private static Logger logger = LoggerFactory.getLogger(DbPool.class);

	private static Map<String, String> dbProps;
	/**
	 * {@link BasicDataSource}
	 */
	private DataSource dataSource;

	private int JDBCINITIALSIZE = 5;
	private int JDBCMAXACTIVE = 100;
	private int JDBCMAXOPENACTIVEPREP = -1;
	private int MINEVICTABLEIDLETIMEMILLIS = 60000;
	private long TIMEBETWEENEVICTIONRUNSMILLIS = 30000L;

	/**
	 * package level constructor to create new dbpool instance.
	 * 
	 * @param props
	 *            properties that needs to be set for creating the pool.
	 * @throws FusionException
	 *             Error initializing dbpool
	 */
	/* package */DbPool(Map<String, String> props, String dbcp) throws FusionException {
		BasicDataSource basicDataSource = new BasicDataSource();
		if (dbProps == null) {
			dbProps = new HashMap<String, String>(props);

		}
		if (checkMandatoryProperties(props)) {

			basicDataSource.setDriverClassName(props
					.get(FusionConstants.DATABASE_CLASSNAME));
			basicDataSource.setUsername(props
					.get(FusionConstants.DATABASE_USERNAME));
			basicDataSource.setPassword(props
					.get(FusionConstants.DATABASE_PASSWORD));
			basicDataSource.setUrl(props.get(FusionConstants.DATABASE_URL));
		
			basicDataSource.setMinEvictableIdleTimeMillis(this.MINEVICTABLEIDLETIMEMILLIS);
			basicDataSource.setTimeBetweenEvictionRunsMillis(this.TIMEBETWEENEVICTIONRUNSMILLIS);

			String JDBCINITIALSIZE = props.get(FusionConstants.JDBCINITIALSIZE) != null ? props
					.get(FusionConstants.JDBCINITIALSIZE)
					: dbProps.get(FusionConstants.JDBCINITIALSIZE);
			basicDataSource.setInitialSize(Integer.parseInt(JDBCINITIALSIZE));

			String JDBCMAXACTIVE = props.get(FusionConstants.JDBCMAXACTIVE) != null ? props
					.get(FusionConstants.JDBCMAXACTIVE)
					: dbProps.get(FusionConstants.JDBCMAXACTIVE);
			basicDataSource.setMaxActive(Integer.parseInt(JDBCMAXACTIVE));

			String JDBCMAXOPENACTIVEPREP = props
					.get(FusionConstants.JDBCMAXOPENACTIVEPREP) != null ? props
					.get(FusionConstants.JDBCMAXOPENACTIVEPREP) : dbProps
					.get(FusionConstants.JDBCMAXOPENACTIVEPREP);
			basicDataSource.setMaxOpenPreparedStatements(Integer
					.parseInt(JDBCMAXOPENACTIVEPREP));

			String MINEVICTABLEIDLETIMEMILLIS = props
					.get(FusionConstants.MINEVICTABLEIDLETIMEMILLIS) != null ? props
					.get(FusionConstants.MINEVICTABLEIDLETIMEMILLIS)
					: dbProps.get(FusionConstants.MINEVICTABLEIDLETIMEMILLIS);
			basicDataSource.setMinEvictableIdleTimeMillis(Integer
					.parseInt(MINEVICTABLEIDLETIMEMILLIS));

			String TIMEBETWEENEVICTIONRUNSMILLIS = props
					.get(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS) != null ? props
					.get(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS)
					: dbProps
							.get(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS);
			basicDataSource.setTimeBetweenEvictionRunsMillis(Long
					.parseLong(TIMEBETWEENEVICTIONRUNSMILLIS));

			/*
			 * if (props.get(FusionConstants.JDBCINITIALSIZE) == null) {
			 * basicDataSource.setInitialSize(Integer.parseInt(dbProps
			 * .get(FusionConstants.JDBCINITIALSIZE))); } else {
			 * basicDataSource.setInitialSize(Integer.parseInt(props
			 * .get(FusionConstants.JDBCINITIALSIZE))); } if
			 * (props.get(FusionConstants.JDBCMAXACTIVE) == null) {
			 * basicDataSource.setInitialSize(Integer.parseInt(dbProps
			 * .get(FusionConstants.JDBCMAXACTIVE))); } else {
			 * basicDataSource.setInitialSize(Integer.parseInt(props
			 * .get(FusionConstants.JDBCMAXACTIVE))); } if
			 * (props.get(FusionConstants.JDBCMAXOPENACTIVEPREP) == null) {
			 * basicDataSource.setInitialSize(Integer.parseInt(dbProps
			 * .get(FusionConstants.JDBCMAXOPENACTIVEPREP))); } else {
			 * basicDataSource.setInitialSize(Integer.parseInt(props
			 * .get(FusionConstants.JDBCMAXOPENACTIVEPREP))); }
			 * 
			 * if (props.get(FusionConstants.MINEVICTABLEIDLETIMEMILLIS) ==
			 * null) { basicDataSource.setInitialSize(Integer.parseInt(dbProps
			 * .get(FusionConstants.MINEVICTABLEIDLETIMEMILLIS))); } else {
			 * basicDataSource.setInitialSize(Integer.parseInt(props
			 * .get(FusionConstants.MINEVICTABLEIDLETIMEMILLIS))); } if
			 * (props.get(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS) ==
			 * null) { basicDataSource.setInitialSize(Integer.parseInt(dbProps
			 * .get(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS))); } else {
			 * basicDataSource.setInitialSize(Integer.parseInt(props
			 * .get(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS))); }
			 */

			dataSource = basicDataSource;

		} else {
			throw new FusionException("Error initializing dbpool");
		}
	}

	
	/* package */DbPool(Map<String, String> props) throws FusionException  {
		ComboPooledDataSource  comboPooledDataSource = new ComboPooledDataSource ();

		if (checkMandatoryProperties(props)) {

			try {
				comboPooledDataSource.setDriverClass(props.get(FusionConstants.DATABASE_CLASSNAME));
	    	} catch (Exception e) {
	    		logger.error("Unable to load oracle.jdbc.OracleDriver ",e);
	    		throw new FusionException("Error initializing dbpool");
	    	}
	    	comboPooledDataSource.setUser(props.get(FusionConstants.DATABASE_USERNAME));
	    	comboPooledDataSource.setPassword(props.get(FusionConstants.DATABASE_PASSWORD));
	    	comboPooledDataSource.setJdbcUrl(props.get(FusionConstants.DATABASE_URL));

	    	comboPooledDataSource.setAcquireIncrement(5);
	    	comboPooledDataSource.setMaxPoolSize(JDBCMAXACTIVE);
	    	comboPooledDataSource.setMaxStatements(this.JDBCMAXOPENACTIVEPREP);
	    	comboPooledDataSource.setMaxIdleTime(MINEVICTABLEIDLETIMEMILLIS);			
	    	comboPooledDataSource.setInitialPoolSize(this.JDBCINITIALSIZE);
			
			
		
			dataSource = comboPooledDataSource;

		} else {
			throw new FusionException("Error initializing dbpool");
		}
	}
	/**
	 * It checks for the mandatory fields required to configure DB pool.
	 * 
	 * @precondition
	 * @postcondition
	 * @param props
	 *            The properties of for configuring database pool.
	 * @return
	 */
	private boolean checkMandatoryProperties(Map<String, String> props) {
		if (props.get(FusionConstants.DATABASE_CLASSNAME) == null) {
			logger.error("Database classname not found");
			return false;
		}

		if (props.get(FusionConstants.DATABASE_USERNAME) == null) {
			logger.error("Database username not found");
			return false;
		}
		if (props.get(FusionConstants.DATABASE_PASSWORD) == null) {
			logger.error("Database password not found");
			return false;
		}
		if (props.get(FusionConstants.DATABASE_URL) == null) {
			logger.error("Database url not found");
			return false;
		}

		return true;
	}

	/**
	 * To shutdown the datasource. 
	 * @precondition
	 * @postcondition 	
	 * @throws SQLException
	 */
	/* package */void shutdown() throws SQLException {
		ComboPooledDataSource cds = (ComboPooledDataSource) dataSource;
		cds.close();
	}

	/**
	 * Gets the connection from the connection pool.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

}
