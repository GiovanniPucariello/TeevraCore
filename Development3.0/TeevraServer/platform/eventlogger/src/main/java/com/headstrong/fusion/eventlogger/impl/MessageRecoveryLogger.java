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
 * $Id: MessageEventLogger.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 8, 2008 
 */

package com.headstrong.fusion.eventlogger.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageRecoveryLogBean;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * <code>MessageEventLogger</code> is a <code>EventLogger</code> which logs
 * the events with respect to messages processed by fusion framework.
 */
public class MessageRecoveryLogger implements EventLogger {

	private static final Logger logger = LoggerFactory
			.getLogger(MessageRecoveryLogger.class);

	/**
	 * Query to insert into message recovery log - for 1st time
	 */
	private static String instMsgRecovery = "insert into message_recoverylog "
			+ "( savepoint_name, message_data,prcs_run_id,  message_id) "
			+ "values (?,?,?,?)";

	/**
	 * Update to message recovery log.
	 */
	private static String updMsgRecovery = "update  message_recoverylog "
			+ " set savepoint_name=?, message_data =? "
			+ "where  prcs_run_id =? and  message_id=? ";

	/**
	 * Query to check whether message recovery log has any message for this
	 * message and process run id.
	 */
	private static String selMsgRecovery = "select count(1) from message_recoverylog "
			+ "where  prcs_run_id =? and  message_id=? ";

	/**
	 * Get all the message which need to be recovered.
	 */
	private static String getRecoverableMsg = "select prcs_run_id, message_id, savepoint_name, "
			+ "message_data from message_recoverylog where"
			+ " prcs_run_id in (select prcs_run_id from process_runtime  where prcs_id =?)"
			+ "and savepoint_name not in('RECEIVED','ERROR','FINISHED')";

	/**
	 * Delete message from recovery log table.
	 */
	private static String delMsgRecovery = "delete from message_recoverylog "
			+ "where  prcs_run_id =? and  message_id=? ";

	/**
	 * Deletes the message from recovery table for the given process run id and
	 * message id.
	 * 
	 * @param conn
	 *            {@link Connection} to the database.
	 * @param processRunId
	 *            Process Run Id (Session ID)
	 * @param messageId
	 *            Message Id of the message
	 * @return True - if message is deleted. False - if the message is not
	 *         deleted.
	 * @throws Exception
	 *             If there is any error during the SQL delete operation.
	 */
	private boolean deleteMsgRecovery(Connection conn, String processRunId,
			String messageId) throws Exception {
		boolean deleted = false;
		PreparedStatement pStmt = null;
		pStmt = conn.prepareStatement(delMsgRecovery);
		pStmt.setInt(1, Integer.parseInt(processRunId));
		pStmt.setInt(2, Integer.parseInt(messageId));
		deleted = pStmt.execute();
		DatabaseManager.releaseResources(null, pStmt, null);
		return deleted;
	}

	/**
	 * Checks if there is any message in recovery table for the given process
	 * run id and message id.
	 * 
	 * @param conn
	 *            {@link Connection} to the database.
	 * @param processRunId
	 *            Process Run Id (Session ID)
	 * @param messageId
	 *            Message Id of the message
	 * @return True - If message exist. False - if message doesnot exist.
	 * @throws Exception
	 *             Any Execption during this operation.
	 */
	private boolean isExist(Connection conn, String processRunId,
			String messageId) throws Exception {
		boolean isExist = false;
		PreparedStatement pStmt = null;
		pStmt = conn.prepareStatement(selMsgRecovery);
		pStmt.setInt(1, Integer.parseInt(processRunId));
		pStmt.setInt(2, Integer.parseInt(messageId));

		ResultSet rs = null;
		rs = pStmt.executeQuery();
		if ((rs != null) && rs.next()) {
			if (rs.getInt(1) > 0) {
				isExist = true;
			}
		}
		DatabaseManager.releaseResources(null, pStmt, rs);
		return isExist;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.EventLogger#log(com.headstrong.fusion.eventlogger.beans.EventLogBean)
	 */
	public void log(EventLogBean eventLogBean) throws FusionException {
		if (!(eventLogBean instanceof MessageRecoveryLogBean)) {
			logger
					.error("Eventlogbean not an instance of MessageRecoveryLogBean");
			throw new FusionException(
					"Eventlogbean not an instance of MessageRecoveryLogBean");
		}

		MessageRecoveryLogBean msgEventBean = (MessageRecoveryLogBean) eventLogBean;
		// check mandatory fields
		if (!checkMandatoryFields(msgEventBean)) {
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

		Connection conn = null;
		PreparedStatement pStmt = null;

		try {

			conn = dbPool.getConnection();

			if (FusionConstants.DEFAULT_END_SP_NAME.equals(msgEventBean
					.getSavepointName())) {
				deleteMsgRecovery(conn, msgEventBean.getSessionId(),
						msgEventBean.getMessageId());
			} else {

				if (isExist(conn, msgEventBean.getSessionId(), msgEventBean
						.getMessageId())) {
					pStmt = conn.prepareStatement(updMsgRecovery);
				} else {
					pStmt = conn.prepareStatement(instMsgRecovery);

				}
				pStmt.setString(1, msgEventBean.getSavepointName());
				pStmt.setBytes(2, msgEventBean.getMessageData());
				pStmt.setInt(3, Integer.parseInt(msgEventBean.getSessionId()));
				pStmt.setInt(4, Integer.parseInt(msgEventBean.getMessageId()));

				int totalRowsUpdated = pStmt.executeUpdate();

				if (totalRowsUpdated == 0) {
					logger.error("No records updated in recover log ");
					throw new FusionException(
							"No records updated in recover log");

				}

				if (logger.isDebugEnabled()) {
					logger.debug("Event logging successful for "
							+ msgEventBean.toString());
				}
			}

		} catch (Exception e) {
			logger.error("Error while logging the message in the database", e);
			throw new FusionException(
					"Error while logging the message in the database", e);
		} finally {
			DatabaseManager.releaseResources(conn, pStmt, null);
		}

	}

	/**
	 * checkMandatoryFields checks the mandatory fields before logging the event
	 * in the database.
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogBean
	 * 
	 * @return True- if check is successful False - if any of the checks fails.
	 */
	public boolean checkMandatoryFields(MessageRecoveryLogBean eventLogBean) {
		/*
		 * checking mandatory fields
		 */
		if (eventLogBean.getMessageId() == null) {
			logger.error("No message id found in  bean " + eventLogBean);
			return false;
		}
		if (eventLogBean.getSessionId() == null) {
			logger.error("No session id found in  bean " + eventLogBean);
			return false;
		}
		if (eventLogBean.getSavepointName() == null) {
			logger.error("No savepoint name found in  bean " + eventLogBean);
			return false;
		}

		/**
		 * Checking the format of the data passed
		 */
		try {
			Integer.parseInt(eventLogBean.getSessionId());
		} catch (Exception e) {
			logger.error("session id not a integer ");
			return false;
		}
		try {
			Integer.parseInt(eventLogBean.getMessageId());
		} catch (Exception e) {
			logger.error("message id not a integer ");
			return false;
		}
		return true;

	}

	/**
	 * Gets the list of messages which needs to be recovered.
	 * 
	 * @param processId
	 *            Process Id for which messages have to be recovered.
	 * @return {@link List} of {@link MessageRecoveryLogBean}
	 * @throws FusionException
	 */
	public List<MessageRecoveryLogBean> getRecoveryMessages(String processId)
			throws FusionException {
		List<MessageRecoveryLogBean> recoverMessages = new ArrayList<MessageRecoveryLogBean>();
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (dbPool == null) {
			logger.error("Error obtaining database manager");
			throw new FusionException("Error obtaining database manager");
		}

		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			conn = dbPool.getConnection();
			pStmt = conn.prepareStatement(getRecoverableMsg);
			pStmt.setInt(1, Integer.parseInt(processId));
			rs = pStmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					// prcs_run_id, message_id, savepoint_name,
					// header_data,message_data
					MessageRecoveryLogBean bean = new MessageRecoveryLogBean();
					bean.setSessionId(rs.getString(1));
					bean.setMessageId(rs.getString(2));
					bean.setSavepointName(rs.getString(3));
					bean.setMessageData(rs.getBytes(4));
					recoverMessages.add(bean);
				}
			}

		} catch (Exception e) {
			logger.error("Error while getting recoverable messages", e);
			throw new FusionException(
					"Error while getting recoverable messages", e);
		} finally {
			DatabaseManager.releaseResources(conn, pStmt, rs);
		}
		return recoverMessages;
	}

}
