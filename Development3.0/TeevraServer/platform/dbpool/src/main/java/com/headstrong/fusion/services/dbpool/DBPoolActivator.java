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
 * $Id: DBPoolActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 1, 2008 
 */

package com.headstrong.fusion.services.dbpool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * The <code>DBPoolActivator</code> class is the <code>BundleActivator</code>
 * for the Fusion-DBPool management bundle. This activator create a db pool for
 * the fusion base database. When the bundle is stopped, the database manager is
 * shutdown.
 */
public class DBPoolActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(DBPoolActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {

		Map<String, String> dbProps = new HashMap<String, String>();
		dbProps.put(FusionConstants.DATABASE_CLASSNAME, context
				.getProperty(FusionConstants.DATABASE_CLASSNAME));
		dbProps.put(FusionConstants.DATABASE_USERNAME, context
				.getProperty(FusionConstants.DATABASE_USERNAME));
		dbProps.put(FusionConstants.DATABASE_PASSWORD_LOCATION, context
				.getProperty(FusionConstants.DATABASE_PASSWORD_LOCATION));
		// dbProps.put(FusionConstants.DATABASE_PASSWORD,
		// context.getProperty(FusionConstants.DATABASE_PASSWORD));
		dbProps.put(FusionConstants.DATABASE_URL, context
				.getProperty(FusionConstants.DATABASE_URL));
		if (context.getProperty(FusionConstants.DATABASE_PASSWORD) != null) {
			dbProps.put(FusionConstants.DATABASE_PASSWORD, context
					.getProperty(FusionConstants.DATABASE_PASSWORD));
		} else {
			// get password from the file located at the given password location
			dbProps.put(FusionConstants.DATABASE_PASSWORD, getPassword(context
					.getProperty(FusionConstants.DATABASE_PASSWORD_LOCATION)));
		}
		dbProps.put(FusionConstants.JDBCINITIALSIZE, context
				.getProperty(FusionConstants.JDBCINITIALSIZE));
		dbProps.put(FusionConstants.JDBCMAXACTIVE, context
				.getProperty(FusionConstants.JDBCMAXACTIVE));
		dbProps.put(FusionConstants.JDBCMAXOPENACTIVEPREP, context
				.getProperty(FusionConstants.JDBCMAXOPENACTIVEPREP));
		dbProps.put(FusionConstants.MINEVICTABLEIDLETIMEMILLIS, context
				.getProperty(FusionConstants.MINEVICTABLEIDLETIMEMILLIS));
		dbProps.put(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS, context
				.getProperty(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS));
		DbPool dbPool = DatabaseManager.setupDBPool(dbProps);
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, dbPool);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {

		logger.debug("shutting down database manager");

		DatabaseManager.shutdownDBPools();

	}

	/**
	 * Returns the password stored in the file(Assuming other than password
	 * nothing is stored in the given file)
	 * 
	 * @param filePath
	 * @return
	 */
	private String getPassword(String filePath) {

		String strLine = null;
		try {
			String line = null;

			FileReader input = new FileReader(filePath);
			BufferedReader bufRead = new BufferedReader(input);

			while ((line = bufRead.readLine()) != null) {
				if (line.trim().length() != 0) {
					strLine = line.trim();
				}
			}
			bufRead.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return strLine;
	}
}
