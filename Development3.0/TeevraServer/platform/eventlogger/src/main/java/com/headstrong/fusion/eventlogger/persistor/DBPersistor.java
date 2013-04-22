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
 * $Id: DBPersistor.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 24, 2010 
 */

package com.headstrong.fusion.eventlogger.persistor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * Persist the event log beans to database
 */
public class DBPersistor {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(DBPersistor.class);

	/**
	 * Max length of log_message to be send from server
	 */
	private static int log_message_maxlength = 1000;

	/**
	 * Query to insert to message_eventlog table
	 */
	private static String insertMsgEventLog = "insert into message_eventlog "
			+ "(prcs_run_id,  message_id, sequence_id, total_sequence, "
			+ "savepoint_name, savepoint_time,log_message,message_data) "
			+ "values (?,?,?,?,?,?,?,?)";
	/**
	 * Query to insert to process_runtime_eventlog table
	 */
	private static String insertPrcsEventLog = "insert into process_runtime_eventlog "
			+ "(prcs_run_id,	prcs_event_type,	prcs_event_source,"
			+ "prcs_event_category,	prcs_event_desc) " + "values (?,?,?,?,?)";

	/**
	 * Query to insert message into component event log
	 */
	private static String insertCompEventLog = "insert into component_eventlog "
			+ "(prcs_run_id,	comp_service_name,	message_id,"
			+ "savepoint_name,savepoint_time,	log_message) "
			+ "values (?,?,?,?,?,?)";

	Connection conn = null;

	public DBPersistor() throws FusionException {
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (dbPool == null) {
			logger.error("Error obtaining database manager");
			throw new FusionException("Error obtaining database manager");
		}

		try {
			conn = dbPool.getConnection();
		} catch (SQLException e) {
			logger.error("Error while getting the connection from db pool", e);
			throw new FusionException(
					"Error while getting the connection from db pool", e);
		}
	}

	public synchronized void persistEventLogBean(Object bean)
			throws FusionException {

		if (bean instanceof ProcessEventLogBean) {
			persistPrcsEventLogBean((ProcessEventLogBean) bean);
		} else if (bean instanceof MessageEventLogBean) {
			persistMsgEventLogBean((MessageEventLogBean) bean);
		} else if (bean instanceof ComponentEventLogBean) {
			persistCompEventLogBean((ComponentEventLogBean) bean);
		} else {
			logger.error("Object is not an instance of any event log bean");
			throw new FusionException(
					"Object is not an instance of any event log bean");
		}
	}

	/**
	 * Persists the given message event log bean to database
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlog
	 * @throws FusionException
	 */
	private void persistMsgEventLogBean(MessageEventLogBean eventlog)
			throws FusionException {
		PreparedStatement pStmt = null;
		try {
			// insert into event log table
			pStmt = conn.prepareStatement(insertMsgEventLog);
			pStmt.setInt(1, Integer.parseInt(eventlog.getSessionId()));
			pStmt.setInt(2, Integer.parseInt(eventlog.getMessageId()));
			pStmt.setInt(3, Integer.parseInt(eventlog.getSequenceId()));
			pStmt.setInt(4, Integer.parseInt(eventlog.getTotalSequences()));

			pStmt.setString(5, eventlog.getSavepointName());
			pStmt.setTimestamp(6, new Timestamp(Long.parseLong(eventlog
					.getSavepointTime())));

			if (eventlog.getLogMessage().length() > log_message_maxlength) {
				pStmt.setString(7, eventlog.getLogMessage().substring(0,
						log_message_maxlength)
						+ "...");
			} else {
				pStmt.setString(7, eventlog.getLogMessage());
			}

			pStmt.setString(8, eventlog.getMessageData());

			int totalRowsUpdated = pStmt.executeUpdate();

			if (totalRowsUpdated == 0) {
				logger.error("No records updated in event log ");
				throw new FusionException("No records updated in event log");

			}

			if (logger.isDebugEnabled()) {
				logger.debug("Event logging successful for "
						+ eventlog.toString());
			}

		} catch (Exception e) {
			logger.error("Error while logging the message in the database", e);
			throw new FusionException(
					"Error while logging the message in the database", e);
		} finally {
			try {
				pStmt.close();
			} catch (Exception e) {
				logger.error("Error while closing statement", e);
			}
			try {
				conn.close();
			} catch (Exception e) {
				logger.error("Error while clsoing connections", e);
			}

		}
	}

	/**
	 * Persists the given process event log bean to database
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlog
	 * @throws FusionException
	 */
	private void persistPrcsEventLogBean(ProcessEventLogBean eventlog)
			throws FusionException {

		PreparedStatement pStmt = null;

		try {
			// get session id - run id

			int sessionId = Integer.parseInt(eventlog.getSessionId());
			// insert into event log table
			pStmt = conn.prepareStatement(insertPrcsEventLog);
			pStmt.setInt(1, sessionId);
			pStmt.setString(2, eventlog.getEventType());
			pStmt.setString(3, eventlog.getEventSource());
			pStmt.setString(4, eventlog.getEventCategory());
			pStmt.setString(5, eventlog.getEventDesc());

			int totalRowsUpdated = pStmt.executeUpdate();

			if (totalRowsUpdated == 0) {
				logger.error("No records updated in event log ");
				throw new FusionException("No records updated in event log");

			}

			if (logger.isDebugEnabled()) {
				logger.debug("Event logging successful for "
						+ eventlog.toString());
			}

		} catch (SQLException e) {
			logger.error("Error while logging the message in the database", e);
			throw new FusionException(
					"Error while logging the message in the database", e);
		} finally {
			try {
				pStmt.close();
			} catch (Exception e) {
				logger.error("Error while closing statement", e);
			}
			try {
				conn.close();
			} catch (Exception e) {
				logger.error("Error while clsoing connections", e);
			}

		}
	}

	/**
	 * Persists the given component event log bean to database
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlog
	 * @throws FusionException
	 */
	private void persistCompEventLogBean(ComponentEventLogBean eventlog)
			throws FusionException {

		PreparedStatement pStmt = null;
		try {

			pStmt = conn.prepareStatement(insertCompEventLog);

			pStmt.setInt(1, Integer.parseInt(eventlog.getSessionId()));
			pStmt.setString(2, eventlog.getCompId());
			pStmt.setInt(3, Integer.parseInt(eventlog.getMessageId()));
			pStmt.setString(4, eventlog.getSavepointName());
			pStmt.setTimestamp(5, new Timestamp(Long.parseLong(eventlog
					.getSavepointTime())));
			//This check is not needed as the data type of this has 
			//been changed from Varchar(1024) to Clob. 
			//if (eventlog.getLogMessage().length() > log_message_maxlength) {
			//	pStmt.setString(6, eventlog.getLogMessage().substring(0,
			//			log_message_maxlength)
			//			+ "...");
			//} else {
				pStmt.setString(6, eventlog.getLogMessage());
			//}
			int totalRowsUpdated = pStmt.executeUpdate();

			if (totalRowsUpdated == 0) {
				logger.error("No records updated in event log ");
				throw new FusionException("No records updated in event log");

			}

			if (logger.isDebugEnabled()) {
				logger.debug("Event logging successful for "
						+ eventlog.toString());
			}

		} catch (Exception e) {
			logger.error("Error while logging the message in the database", e);
			throw new FusionException(
					"Error while logging the message in the database", e);
		} finally {
			try {
				pStmt.close();
			} catch (Exception e) {
				logger.error("Error while closing statement", e);
			}
			try {
				conn.close();
			} catch (Exception e) {
				logger.error("Error while clsoing connections", e);
			}

		}

	}
}
