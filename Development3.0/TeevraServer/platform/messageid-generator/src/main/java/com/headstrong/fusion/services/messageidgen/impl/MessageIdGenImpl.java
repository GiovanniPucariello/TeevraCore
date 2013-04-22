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
 * $Id: MessageIdGenImpl.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Sep 30, 2008 
 */

package com.headstrong.fusion.services.messageidgen.impl;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.MessageIDGenerator;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * Default Implementation of the messageIdGenerator. It will generate new
 * session key and message id for the fusion framework. Whenever session id is
 * generated, the message id for that session is nullified.
 */
public class MessageIdGenImpl implements MessageIDGenerator {

	private static Logger logger = LoggerFactory
			.getLogger(MessageIdGenImpl.class);

	Map<String, String> sessionIdMap = new HashMap<String, String>();
	Map<String, Long> messageIdMap = new HashMap<String, Long>();
	private final BundleContext bundleContext;

	/**
	 * Query to get the last session id,
	 */
	private static String GetLastSessionId = "select max(prcs_run_id) from process_runtime";

	/**
	 * Query to get the last process run sequence for the given process id.
	 */
	private static String getLastProcessSequence = "select max(prcs_run_sequence) from "
			+ "process_runtime where prcs_id=?";

	/**
	 * Query to insert the new process runtime.
	 */
	private static String InsertNewProcessRuntime = "insert into process_runtime "
			+ "(prcs_run_id, prcs_id, prcs_ver_id, prcs_run_sequence, prcs_run_status,	"
			+ "prcs_run_start_time, prcs_run_stop_time, prcs_msgs_recd, prcs_msgs_error, "
			+ "prcs_msgs_processed, created_by, created_date, modified_by, modified_date) "
			+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public MessageIdGenImpl(BundleContext context) {

		this.bundleContext = context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageIDGenerator#getMessageID(java.lang.String)
	 */
	public synchronized String getMessageID(String sessionId) {
		// if session id present in messageid map then get the incremented new
		// messageid
		if ((sessionId != null) && (messageIdMap.containsKey(sessionId))) {
			long oldMessageId = messageIdMap.get(sessionId);
			long newMessageId = oldMessageId + 1;
			if (newMessageId > Long.MAX_VALUE) {
				newMessageId = 1;
			}
			messageIdMap.put(sessionId, newMessageId);
			return Long.toString(newMessageId);

		}
		// return 0 if no sessionid present
		return Long.toString(0);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MessageIDGenerator#getSessionId(java.lang.String)
	 */
	public synchronized String getSessionId(String processId)
			throws FusionException {
		int iProcessId;
		try {
			iProcessId = Integer.parseInt(processId);
		} catch (Exception e) {
			logger.error("Process id has to be integer ", e);
			throw new FusionException("Process id has to be integer ", e);
		}

		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (dbPool == null) {
			logger.error("Error obtaining database manager");
			throw new FusionException("Error obtaining database manager");
		}

		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		int lastSessionId = 0;
		int lastProcessSequence = 0;
		// go to database and do an insert // get
		// the new file name and
		// that need to be passed forward

		try {
			conn = dbPool.getConnection();
			DatabaseMetaData dbmd;
			dbmd = conn.getMetaData();

			if (logger.isDebugEnabled()) {
				logger.debug("Connection to " + dbmd.getDatabaseProductName()
						+ " " + dbmd.getDatabaseProductVersion()
						+ " successful.\n");
			}

			/*
			 * Getting the last session id from database.
			 */
			pStmt = conn.prepareStatement(GetLastSessionId);

			rs = pStmt.executeQuery();

			if ((rs != null) && (rs.next())) {
				lastSessionId = rs.getInt(1);
				if (logger.isDebugEnabled()) {
					logger.debug("Last Session id was :" + lastSessionId);
				}

			}

			lastSessionId++;

			/*
			 * Getting the last sequence run of the process
			 */
			pStmt = conn.prepareStatement(getLastProcessSequence);
			pStmt.setInt(1, iProcessId);

			rs = pStmt.executeQuery();

			if ((rs != null) && (rs.next())) {
				lastProcessSequence = rs.getInt(1);
				if (logger.isDebugEnabled()) {
					logger.debug("Last Process Sequence was :"
							+ lastProcessSequence);
				}
			}

			lastProcessSequence++;

			/*
			 * inserting the new runtime in database
			 */
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			pStmt = conn.prepareStatement(InsertNewProcessRuntime);
			pStmt.setInt(1, lastSessionId);
			pStmt.setInt(2, iProcessId);
			pStmt.setInt(3, 1);
			pStmt.setInt(4, lastProcessSequence);
			pStmt.setString(5, "STARTING");
			pStmt.setTimestamp(6, null);
			pStmt.setTimestamp(7, null);
			pStmt.setInt(8, 0);
			pStmt.setInt(9, 0);
			pStmt.setInt(10, 0);
			pStmt.setString(11, "FUSION");
			pStmt.setTimestamp(12, timestamp);
			pStmt.setString(13, "FUSION");
			pStmt.setTimestamp(14, timestamp);

			int totalRowsUpdated = pStmt.executeUpdate();

			if (totalRowsUpdated == 0) {
				logger
						.error("Error while updating runtime information in database");
				throw new FusionException(
						"Error while updating runtime information in database");
			}

		} catch (Exception e) {
			logger.error("Error while getting the new sessionid from database",
					e);
			throw new FusionException("Error while updating message status", e);
		} finally {
			DatabaseManager.releaseResources(conn, pStmt, rs);
		}

		if (sessionIdMap.containsKey(processId)) {
			// removing the message id from messageId map of the old session
			messageIdMap.remove(sessionIdMap.get(processId));

		}

		// Getting the new session key
		String sessionId = Integer.toString(lastSessionId);
		sessionIdMap.put(processId, sessionId);
		messageIdMap.put(sessionId, (long) 0);

		return sessionId;
	}

	/**
	 * @return the bundleContext
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}
}
