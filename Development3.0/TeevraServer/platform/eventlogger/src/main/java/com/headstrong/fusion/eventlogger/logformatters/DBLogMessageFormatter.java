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
 * $Id: DBLogMessageFormatter.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 21, 2010 
 */

package com.headstrong.fusion.eventlogger.logformatters;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;

/**
 * Converts the bean into the format used to log into DB
 */
public class DBLogMessageFormatter {

	private static final Logger logger = LoggerFactory
			.getLogger(DBLogMessageFormatter.class);

	/**
	 * Max length of log_message to be send from server
	 */
	private static int log_message_maxlength = 1000;

	/**
	 * Query to insert message into message event log
	 */
	private static String insertMsgEvntLogStatus = "insert into message_eventlog "
			+ "(prcs_run_id,  message_id, sequence_id, total_sequence, "
			+ "savepoint_name, savepoint_time,log_message,message_data) "
			+ "values (?,?,?,?,?,?,?,?)";
	/**
	 * Query to insert message into process event log
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

	/**
	 * Converts the log details in the bean to the format useful for DB
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlogBean
	 * @param conn
	 * @return
	 * @throws FusionException
	 */
	public static PreparedStatement prepareLogStatement(
			EventLogBean eventlogBean, Connection conn) throws FusionException {
		logger.debug("Started creating prepareLogStatement ");
		PreparedStatement pStmt = null;
		if (eventlogBean instanceof MessageEventLogBean) {
			logger.debug("eventlogBean is an instance of MessageEventLogBean ");
			MessageEventLogBean msgEventBean = (MessageEventLogBean) eventlogBean;
			pStmt = createPreparedStatement(conn, pStmt, msgEventBean);
		} else if (eventlogBean instanceof ProcessEventLogBean) {
			logger.debug("eventlogBean is an instance of ProcessEventLogBean ");
			ProcessEventLogBean processEventLogBean = (ProcessEventLogBean) eventlogBean;
			pStmt = createPreparedStatement(conn, pStmt, processEventLogBean);
		} else if (eventlogBean instanceof ComponentEventLogBean) {
			logger
					.debug("eventlogBean is an instance of ComponentEventLogBean");
			ComponentEventLogBean compEventLogBean = (ComponentEventLogBean) eventlogBean;
			pStmt = createPreparedStatement(conn, pStmt, compEventLogBean);
		} else {
			// get the prepared statement for default log bean
		}
		logger.debug("creating prepareLogStatement is completed");
		return pStmt;
	}

	/**
	 * Prepare a statement for process event log bean
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 * @param stmt
	 * @param processEventLogBean
	 */
	private static PreparedStatement createPreparedStatement(Connection conn,
			PreparedStatement stmt, ProcessEventLogBean processEventLogBean)
			throws FusionException {
		try {
			logger
					.debug("started creating  prepared statement for ProcessEventLogBean");
			stmt = conn.prepareStatement(insertPrcsEventLog);

			stmt
					.setInt(1, Integer.parseInt(processEventLogBean
							.getSessionId()));
			stmt.setString(2, processEventLogBean.getEventType());
			stmt.setString(3, processEventLogBean.getEventSource());
			stmt.setString(4, processEventLogBean.getEventCategory());
			stmt.setString(5, processEventLogBean.getEventDesc());

		} catch (NumberFormatException e) {
			logger.error("Error while formatting string to integer", e);
			throw new FusionException(
					"Error while formatting string to integer", e);
		} catch (SQLException e) {
			logger.error("Error while creating prepared statement", e);
			throw new FusionException(
					"Error while creating prepared statement", e);
		}
		logger.debug("prepared statement for ProcessEventLogBean is created");
		return stmt;
	}

	/**
	 * Prepare a statement for message event log bean
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 * @param stmt
	 * @param msgEventBean
	 * @return TODO
	 * @throws FusionException
	 */
	private static PreparedStatement createPreparedStatement(Connection conn,
			PreparedStatement stmt, MessageEventLogBean msgEventBean)
			throws FusionException {
		try {
			logger
					.debug("started creating  prepared statement for MessageEventLogBean");
			stmt = conn.prepareStatement(insertMsgEvntLogStatus);

			stmt.setInt(1, Integer.parseInt(msgEventBean.getSessionId()));
			stmt.setInt(2, Integer.parseInt(msgEventBean.getMessageId()));
			stmt.setInt(3, Integer.parseInt(msgEventBean.getSequenceId()));
			stmt.setInt(4, Integer.parseInt(msgEventBean.getTotalSequences()));

			stmt.setString(5, msgEventBean.getSavepointName());
			stmt.setTimestamp(6, new Timestamp(Long.parseLong(msgEventBean
					.getSavepointTime())));

			if (msgEventBean.getLogMessage().length() > log_message_maxlength) {
				stmt.setString(7, msgEventBean.getLogMessage().substring(0,
						log_message_maxlength)
						+ "...");
			} else {
				stmt.setString(7, msgEventBean.getLogMessage());
			}

			stmt.setString(8, msgEventBean.getMessageData());

		} catch (NumberFormatException e) {
			logger.error("Error while formatting string to integer", e);
			throw new FusionException(
					"Error while formatting string to integer", e);
		} catch (SQLException e) {
			logger.error("Error while creating prepared statement", e);
			throw new FusionException(
					"Error while creating prepared statement", e);
		}
		logger.debug("prepared statement for MessageEventLogBean is created");
		return stmt;

	}

	/**
	 * Prepare a statement for component event log bean
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 * @param stmt
	 * @param processEventLogBean
	 */
	private static PreparedStatement createPreparedStatement(Connection conn,
			PreparedStatement stmt, ComponentEventLogBean compEventLogBean)
			throws FusionException {
		try {
			logger
					.debug("started creating  prepared statement for ComponentEventLogBean");
			stmt = conn.prepareStatement(insertCompEventLog);

			stmt.setInt(1, Integer.parseInt(compEventLogBean.getSessionId()));
			stmt.setString(2, compEventLogBean.getCompId());
			stmt.setInt(3, Integer.parseInt(compEventLogBean.getMessageId()));
			stmt.setString(4, compEventLogBean.getSavepointName());
			stmt.setTimestamp(5, new Timestamp(Long.parseLong(compEventLogBean
					.getSavepointTime())));
			if (compEventLogBean.getLogMessage().length() > log_message_maxlength) {
				stmt.setString(6, compEventLogBean.getLogMessage().substring(0,
						log_message_maxlength)
						+ "...");
			} else {
				stmt.setString(6, compEventLogBean.getLogMessage());
			}

		} catch (NumberFormatException e) {
			logger.error("Error while formatting string to integer", e);
			throw new FusionException(
					"Error while formatting string to integer", e);
		} catch (SQLException e) {
			logger.error("Error while creating prepared statement", e);
			throw new FusionException(
					"Error while creating prepared statement", e);
		}
		logger.debug("prepared statement for ComponentEventLogBean is created");
		return stmt;

	}

}
