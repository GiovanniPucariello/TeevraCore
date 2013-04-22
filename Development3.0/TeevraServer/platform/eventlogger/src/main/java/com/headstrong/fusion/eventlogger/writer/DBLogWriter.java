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
 * $Id: DBLogWriter.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 15, 2010 
 */

package com.headstrong.fusion.eventlogger.writer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.logformatters.DBLogMessageFormatter;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * An implementation of EventLogWriter. It logs the events logged by EventLogger
 * to a Databasse
 */
public class DBLogWriter implements EventLogWriter {

	private static final Logger logger = LoggerFactory
			.getLogger(DBLogWriter.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.writer.EventLogWriter#log(com.headstrong.fusion.eventlogger.beans.MessageEventLogBean)
	 */
	@Override
	public void write(EventLogBean eventLogBean, BundleContext context)
			throws FusionException {
		// TODO Auto-generated method stub
		logger.debug("DBLogWriter write started");
		// create the connection from the db pool
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (dbPool == null) {
			logger.error("Error obtaining database manager");
			throw new FusionException("Error obtaining database manager");
		}

		Connection conn = null;

		try {
			conn = dbPool.getConnection();
		} catch (SQLException e) {
			logger.error("Error while getting the connection from db pool", e);
			throw new FusionException(
					"Error while getting the connection from db pool", e);
		}
		logger.debug("Database conenction obtained from DBPool");

		logger
				.debug("DBLogWriter about to call prepareLogStatement of DBLogMessageFormatter to obtain prepare statement");
		// get the prepared statement
		PreparedStatement psmt = DBLogMessageFormatter.prepareLogStatement(
				eventLogBean, conn);
		logger.debug("Preared statement obtained successfully");
		// log the messages using the prepared statement
		int totalRowsUpdated = 0;
		try {
			totalRowsUpdated = psmt.executeUpdate();
			if (totalRowsUpdated == 0) {
				logger.error("No records updated in event log ");
				throw new FusionException("No records updated in event log");
			}
		} catch (SQLException e) {
			logger.error("Error while updating the event log table", e);
			throw new FusionException(
					"Error while updating the event log table", e);
		} finally {
			logger
					.debug("DBLogWriter about to close prepares statement and connection");
			try {
				psmt.close();
			} catch (Exception e) {
				logger.error("Error while closing statement", e);
			}
			try {
				conn.close();
			} catch (Exception e) {
				logger.error("Error while closing connections", e);
			}
			logger.debug("DBLogWriter closed psmt and conn successfully");
		}
		logger.debug("DBLogWriter write operation successful");
	}
}
