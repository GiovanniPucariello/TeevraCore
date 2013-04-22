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
 * $Id: ProcessAdminEventLogger.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.fusion.eventlogger.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;
import com.headstrong.fusion.eventlogger.logmanager.EventLogManager;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * <code>ProcessAdminEventLogger</code> is an implementation of the
 * <code>EventLogger</code>. It updates the status of the process in the
 * database. It also appends the event log generated for process administration
 * in the database.
 */
public class ProcessAdminEventLogger implements EventLogger {

	private static final Logger logger = LoggerFactory
			.getLogger(ProcessAdminEventLogger.class);

	/**
	 * To update the process runtime when the process is started.
	 */
	private static String updateRuntimeStatusStarted = "update process_runtime set prcs_run_status=?,"
			+ "prcs_run_start_time=? where prcs_run_id=?";

	/**
	 * To update the process runtime when the process is stopped.
	 */
	private static String updateRuntimeStatusStopped = "update process_runtime set prcs_run_status=?,"
			+ "prcs_run_stop_time=? where prcs_run_id=?";

	/**
	 * To update the process runtime other than started and stopped.
	 */
	private static String updateRuntimeStatus = "update process_runtime set prcs_run_status=?"
			+ " where prcs_run_id=?";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.EventLogger#log(int,
	 *      java.util.Map)
	 */
	public void log(EventLogBean eventLogBean) throws FusionException {
		logger.debug("Entered log method of ProcessAdminEventLogger");
		if (!(eventLogBean instanceof ProcessEventLogBean)) {
			logger.error("Eventlogbean not an instance of processEventLogBean");
			throw new FusionException(
					"Eventlogbean not an instance of processEventLogBean");
		}

		logger.debug("eventLogBean is an instance of ProcessEventLogBean");
		ProcessEventLogBean processEventLogBean = (ProcessEventLogBean) eventLogBean;
		// check mandatory fields
		if (!checkMandatoryFields(processEventLogBean)) {
			logger
					.error("Mandatory fields are not present or not in correct format ");
			throw new FusionException(
					"Mandatory fields are not present or not in correct format ");
		}

		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (dbPool == null) {
			logger.error("Error obtaining database manager");
			throw new FusionException("Error obtaining database manager");
		}
		//
		// Connection conn = null;
		//
		// try {
		// conn = dbPool.getConnection();
		// // get session id - run id
		//
		// int sessionId = Integer
		// .parseInt(processEventLogBean.getSessionId());
		//
		// updateStatus(conn, processEventLogBean.getProcessStatus(),
		// sessionId);
		//
		// } catch (SQLException e) {
		// logger.error(
		// "Error while updating the runtime status in the database",
		// e);
		// throw new FusionException(
		// "Error while updating the runtime status in the database",
		// e);
		// } finally {
		// try {
		// conn.close();
		// } catch (Exception e) {
		// logger.error("Error while clsoing connections", e);
		// }
		//
		// }

		logger
				.debug("About to invoke EventLogManager.writeToQueue  from log method of ProcessAdminEventLogger");
		// write the log beans to in memory queues
		EventLogManager.writeToQueue(eventLogBean);
	}

	/**
	 * <code>updateStatus</code> method updates the status of the process in
	 * the database.
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 *            {@link Connection}
	 * @param processStatus
	 *            The status of the process to be updated.
	 * @param sessionId
	 *            The process runtime id.
	 * @throws FusionException
	 *             If the update fails.
	 */
	private void updateStatus(Connection conn, String processStatus,
			int sessionId) throws FusionException {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		PreparedStatement pStmt = null;

		try {

			if (FusionConstants.PROCESS_STARTED.equals(processStatus)) {
				pStmt = conn.prepareStatement(updateRuntimeStatusStarted);
				pStmt.setString(1, processStatus);
				pStmt.setTimestamp(2, timestamp);
				pStmt.setInt(3, sessionId);

			} else if (FusionConstants.PROCESS_STOPPED.equals(processStatus)) {
				pStmt = conn.prepareStatement(updateRuntimeStatusStopped);
				pStmt.setString(1, processStatus);
				pStmt.setTimestamp(2, timestamp);
				pStmt.setInt(3, sessionId);

			} else {
				pStmt = conn.prepareStatement(updateRuntimeStatus);
				pStmt.setString(1, processStatus);
				pStmt.setInt(2, sessionId);

			}

			int totalRowsUpdated = pStmt.executeUpdate();

			if (totalRowsUpdated == 0) {
				logger.error("No records updated in update status ");
				throw new FusionException("No records updated in update status");
			}

			if (logger.isDebugEnabled()) {
				logger.debug("Update successful " + processStatus
						+ " for run-id " + sessionId);
			}
		} catch (SQLException e) {
			logger.error("Error while updating the status in database", e);
			throw new FusionException(
					"Error while updating the status in database", e);
		} finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				logger.error("Error while closing the statement", e);
			}
		}
	}

	/**
	 * checkMandatoryFields checks the mandatory fields that needs to be present
	 * in the {@link Map} that is passed.
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogBean
	 * @return true if all conditions are satisfied. false if any of the
	 *         condition fails.
	 */
	public boolean checkMandatoryFields(ProcessEventLogBean eventLogBean) {
		logger
				.debug("Started checking the mandatory fields in ProcessEventLogBean");
		if (eventLogBean.getProcessStatus() == null) {
			logger
					.error("Process status not present in the event log bean, exiting");
			return false;
		}

		if (eventLogBean.getSessionId() != null) {
			try {
				Long lSessionId = Long.parseLong(eventLogBean.getSessionId());
				lSessionId.intValue();
			} catch (Exception e) {
				logger.error("sessionid should be long value and not  "
						+ eventLogBean.getSessionId());
				return false;
			}
		} else {
			logger.error("sessionid not present in the event log bean");
			return false;
		}

		logger.debug("Mandatory fields check for ProcessEventLogBean is done");
		return true;
	}

}
