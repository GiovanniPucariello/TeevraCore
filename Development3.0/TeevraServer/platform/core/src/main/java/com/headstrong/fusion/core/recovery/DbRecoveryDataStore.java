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
 * $Id: DbRecoveryDataStore.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 6, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.core.recovery.bean.MessageProcessed;
import com.headstrong.fusion.core.recovery.bean.RecoveryMessage;
import com.headstrong.fusion.core.recovery.bean.multicast.MulticastMessageProcessed;
import com.headstrong.fusion.core.recovery.bean.multicast.MulticastRecoveryMessage;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * database recovery data store.
 * 
 */
public class DbRecoveryDataStore implements RecoveryDataStore {
	private static final Logger logger = LoggerFactory
			.getLogger(DbRecoveryDataStore.class);
	/**
	 * message_recoverylog table related queries.
	 */
	private static String INS_INTO_REC = "insert into message_recoverylog "
			+ "(prcs_id, prcs_run_id, message_id, savepoint_name, time_stamp, message_data) "
			+ "values (?,?,?,?,?,?)";

	private static String SEL_FROM_REC = "select prcs_id, prcs_run_id, message_id, savepoint_name, message_data "
			+ "from message_recoverylog where prcs_id = ? order by prcs_id, prcs_run_id, message_id, time_stamp";

	private static String SEL_UNPROCESSED_REC_MSGS = "select reclog.prcs_id, reclog.prcs_run_id, reclog.message_id, "
			+ "reclog.savepoint_name, reclog.message_data from message_recoverylog reclog "
			+ "where reclog.prcs_id = ? and reclog.prcs_run_id =  ( select max(prcs_run_id) from message_recoverylog where prcs_id = ?) "
			+ "and reclog.message_id not in ( select recprocessed.message_id from message_recovery_processed recprocessed "
			+ "where recprocessed.prcs_id = ? and recprocessed.prcs_run_id = ( select max(prcs_run_id) from message_recoverylog where prcs_id = ?) ) "
			+ "order by prcs_id, prcs_run_id, message_id, time_stamp";

	private static String DEL_REC_MESSAGE = "delete from message_recoverylog "
			+ "where prcs_id = ? and prcs_run_id = ? and message_id = ?";

	/**
	 * message_recovery_processed table related queries.
	 */
	private static String MARK_FOR_DELITION = "insert into message_recovery_processed "
			+ "(prcs_id, prcs_run_id, message_id) " + "values (?,?,?)";

	private static String DEL_MSG_PROCESSED = "delete from message_recovery_processed "
			+ "where prcs_id = ? and prcs_run_id = ? and message_id = ?";

	private static String GET_ALL_MES_PROCESSED = "select prcs_id , prcs_run_id,message_id "
			+ "from message_recovery_processed where prcs_id = ? ";
	
	/**
	 * Insert data into Multicast_message_recovery_processed to mark processed messages per endpoints.
	 */
	private static String MULTICAST_MARK_FOR_DELITION = "insert into multicast_recProcessed "
			+ "(prcs_id, prcs_run_id, multicast_id, message_id, endpoint_id) " + "values (?,?,?,?,?)";
	
	/**
	 * Fetch difference of the reclog and processed table in Multicast context.
	 */
	private static String SEL_MULT_MSGS = "select reclog.message_id, reclog.savepoint_name, "
		+ " reclog.message_data from message_recoverylog reclog "
		+ " where reclog.prcs_id = ? and reclog.prcs_run_id =  ( select max(prcs_run_id) from message_recoverylog where prcs_id = ?) "
		+ " and reclog.message_id not in ( select recprocessed.message_id from multicast_recProcessed recprocessed "
		+ " where recprocessed.prcs_id = ? and recprocessed.prcs_run_id = ( select max(prcs_run_id) from message_recoverylog where prcs_id = ?)) "
		+ " ORDER BY message_id";
	
	/**
	 * Fetch messages from multicast processed table.
	 */
	/*private static String SEL_PROCESSED_MSGS = "SELECT message_id, endpoint_id, message_data, received_savepoint from multicast_recProcessed where " +
			" prcs_id = ? and multicast_id = ? and prcs_run_id = (select max(prcs_run_id) from multicast_recProcessed "
			+ " where prcs_id = ?) ORDER BY message_id ";*/
	
	private static String SEL_PROCESSED_MSGS = "SELECT proc.message_id, proc.endpoint_id, rec.message_data, rec.savepoint_name "
			+ " from multicast_recProcessed proc, message_recoverylog rec where "			
			+ "	proc.message_id = rec.message_id and proc.prcs_run_id = rec.prcs_run_id and proc.prcs_id = rec.prcs_id  and "
			+ "	proc.prcs_id = ? and proc.multicast_id = ? and "
			+ " proc.prcs_run_id = ( select max(prcs_run_id) from message_recoverylog where prcs_id = ?) "
			+ "	order by message_id ";
			

	@Override
	public void saveRecoveryMessage(RecoveryMessage recoveryMessage)
			throws Exception {
		logger.debug("persisting recovery message for process id :"
				+ recoveryMessage.getProcessId() + " , sessionId = "
				+ recoveryMessage.getSessionId() + ", messageId = "
				+ recoveryMessage.getMessageId());
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		PreparedStatement prepStatement = null;
		try {
			prepStatement = connection.prepareStatement(INS_INTO_REC);
			prepStatement.setString(1, recoveryMessage.getProcessId());
			prepStatement.setInt(2, recoveryMessage.getSessionId() == null ? 0
					: Integer.parseInt(recoveryMessage.getSessionId()));
			prepStatement.setInt(3, recoveryMessage.getMessageId() == null ? 0
					: Integer.parseInt(recoveryMessage.getMessageId()));
			prepStatement.setString(4, recoveryMessage.getSavePoint());
			prepStatement.setTimestamp(5, new Timestamp(recoveryMessage
					.getTimeStamp().getTime()));
			prepStatement.setBytes(6, recoveryMessage.getData());
			prepStatement.execute();
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement, null);
		}
		logger.debug("recovery message persited for process id :"
				+ recoveryMessage.getProcessId() + " , sessionId = "
				+ recoveryMessage.getSessionId() + ", messageId = "
				+ recoveryMessage.getMessageId());
	}

	@Override
	public List<RecoveryMessage> getAllRecoveryMessages(String processId)
			throws Exception {
		logger.debug("getting all recovery messages for process id :"
				+ processId);
		List<RecoveryMessage> recoveryMessages = new ArrayList<RecoveryMessage>();
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		ResultSet resultSet = null;
		PreparedStatement prepStatement = null;
		try {
			prepStatement = connection.prepareStatement(SEL_FROM_REC);
			prepStatement.setString(1, processId);
			resultSet = prepStatement.executeQuery();
			while (resultSet.next()) {
				RecoveryMessage recoveryMessage = new RecoveryMessage();
				recoveryMessage.setProcessId(resultSet.getString("prcs_id"));
				recoveryMessage.setMessageId(Integer.toString(resultSet
						.getInt("message_id")));
				recoveryMessage.setSessionId(Integer.toString(resultSet
						.getInt("prcs_run_id")));
				recoveryMessage.setSavePoint(resultSet
						.getString("savepoint_name"));
				recoveryMessage.setData(resultSet.getBytes("message_data"));
				recoveryMessages.add(recoveryMessage);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement,
					resultSet);
		}
		return recoveryMessages;
	}

	@Override
	public void markMessageProcessed(MessageProcessed messageProcessed)
			throws Exception {
		logger.debug("marking message for deletion for process id :"
				+ messageProcessed.getProcessId() + " , sessionId = "
				+ messageProcessed.getSessionId() + ", messageId = "
				+ messageProcessed.getMessageId());
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		PreparedStatement prepStatement = null;
		try {
			prepStatement = connection.prepareStatement(MARK_FOR_DELITION);
			prepStatement.setString(1, messageProcessed.getProcessId());
			prepStatement.setInt(2, messageProcessed.getSessionId() == null ? 0
					: Integer.parseInt(messageProcessed.getSessionId()));
			prepStatement.setInt(3, messageProcessed.getMessageId() == null ? 0
					: Integer.parseInt(messageProcessed.getMessageId()));
			prepStatement.execute();
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement, null);
		}
		logger.debug("marking message for deletion for process id :"
				+ messageProcessed.getProcessId() + " , sessionId = "
				+ messageProcessed.getSessionId() + ", messageId = "
				+ messageProcessed.getMessageId());
	}

	@Override
	public void deleteMessageProcessed(MessageProcessed messageProcessed)
			throws Exception {
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		PreparedStatement prepStatement = null;
		try {
			prepStatement = connection.prepareStatement(DEL_MSG_PROCESSED);
			prepStatement.setString(1, messageProcessed.getProcessId());
			prepStatement.setInt(2, messageProcessed.getSessionId() == null ? 0
					: Integer.parseInt(messageProcessed.getSessionId()));
			prepStatement.setInt(3, messageProcessed.getMessageId() == null ? 0
					: Integer.parseInt(messageProcessed.getMessageId()));
			prepStatement.execute();
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement, null);
		}
	}

	@Override
	public void deleteRecoveryMessage(RecoveryMessage recoveryMessage)
			throws Exception {
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		PreparedStatement prepStatement = null;
		try {
			prepStatement = connection.prepareStatement(DEL_REC_MESSAGE);
			prepStatement.setString(1, recoveryMessage.getProcessId());
			prepStatement.setInt(2, recoveryMessage.getSessionId() == null ? 0
					: Integer.parseInt(recoveryMessage.getSessionId()));
			prepStatement.setInt(3, recoveryMessage.getMessageId() == null ? 0
					: Integer.parseInt(recoveryMessage.getMessageId()));
			prepStatement.execute();
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement, null);
		}
	}

	@Override
	public List<MessageProcessed> getAllMessageProcessed(String processId)
			throws Exception {
		logger.debug("getting all processed messages for process id :"
				+ processId);
		List<MessageProcessed> recoveryMessages = new ArrayList<MessageProcessed>();
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		ResultSet resultSet = null;
		PreparedStatement prepStatement = null;
		try {
			prepStatement = connection.prepareStatement(GET_ALL_MES_PROCESSED);
			prepStatement.setString(1, processId);
			resultSet = prepStatement.executeQuery();
			while (resultSet.next()) {
				MessageProcessed messageProcessed = new MessageProcessed();
				messageProcessed.setProcessId(resultSet.getString("prcs_id"));
				messageProcessed.setMessageId(Integer.toString(resultSet
						.getInt("message_id")));
				messageProcessed.setSessionId(Integer.toString(resultSet
						.getInt("prcs_run_id")));
				recoveryMessages.add(messageProcessed);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement,
					resultSet);
		}

		return recoveryMessages;
	}

	@Override
	public List<RecoveryMessage> getUnProcessedRecoverMessages(String processId)
			throws Exception {
		List<RecoveryMessage> recoveryMessages = new ArrayList<RecoveryMessage>();
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		ResultSet resultSet = null;
		PreparedStatement prepStatement = null;
		try {
			prepStatement = connection
					.prepareStatement(SEL_UNPROCESSED_REC_MSGS);
			prepStatement.setString(1, processId);
			prepStatement.setString(2, processId);
			prepStatement.setString(3, processId);
			prepStatement.setString(4, processId);
			resultSet = prepStatement.executeQuery();
			while (resultSet.next()) {
				RecoveryMessage recoveryMessage = new RecoveryMessage();
				recoveryMessage.setProcessId(resultSet.getString("prcs_id"));
				recoveryMessage.setMessageId(Integer.toString(resultSet
						.getInt("message_id")));
				recoveryMessage.setSessionId(Integer.toString(resultSet
						.getInt("prcs_run_id")));
				recoveryMessage.setSavePoint(resultSet
						.getString("savepoint_name"));
				recoveryMessage.setData(resultSet.getBytes("message_data"));
				recoveryMessages.add(recoveryMessage);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement,
					resultSet);
		}
		return recoveryMessages;
	}
	
	@Override
	public void markMulticastMessageProcessed(MulticastMessageProcessed messageProcessed)
	throws Exception {
		logger.debug("marking multicast message for deletion for process id :"
				+ messageProcessed.getProcessId() + " , sessionId = "
				+ messageProcessed.getSessionId() + ", messageId = "
				+ messageProcessed.getMessageId() + ", endpoint id = "
				+ messageProcessed.getEndPointId());
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		PreparedStatement prepStatement = null;
		try {
				prepStatement = connection.prepareStatement(MULTICAST_MARK_FOR_DELITION);
				prepStatement.setString(1, messageProcessed.getProcessId());
				prepStatement.setInt(2,
						messageProcessed.getSessionId() == null ? 0 : Integer
								.parseInt(messageProcessed.getSessionId()));
				prepStatement.setString(3, messageProcessed.getMulticastId());
				prepStatement.setInt(4,
						messageProcessed.getMessageId() == null ? 0 : Integer
								.parseInt(messageProcessed.getMessageId()));
				prepStatement.setString(5,	messageProcessed.getEndPointId());
				prepStatement.execute();				
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement, null);
		}
		logger.debug("marked multicast message for deletion for process id :"
				+ messageProcessed.getProcessId() + " , sessionId = "
				+ messageProcessed.getSessionId() + ", messageId = "
				+ messageProcessed.getMessageId() + ", endpoint id = "
				+ messageProcessed.getEndPointId());
	}

	@Override
	public List<RecoveryMessage> getUnProcessedMulticastRecoveryMessages(
			String processId, String multicastId) throws Exception {
		
		List<RecoveryMessage> recoveryMessages = new ArrayList<RecoveryMessage>();
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		Connection connection = dbPool.getConnection();
		ResultSet resultSet = null;
		PreparedStatement prepStatement = null;
		
		try {
			if (multicastId == null) {
				// Get the messages which has reached the reclog but not the processed table at all.
				prepStatement = connection.prepareStatement(SEL_MULT_MSGS);
				prepStatement.setString(1, processId);
				prepStatement.setString(2, processId);
				prepStatement.setString(3, processId);			
				prepStatement.setString(4, processId);
			} else {
				// Get the messages with processed destinations.
				prepStatement = connection.prepareStatement(SEL_PROCESSED_MSGS);
				prepStatement.setString(1, processId);
				prepStatement.setString(2, multicastId);
				prepStatement.setString(3, processId);
			}
			resultSet = prepStatement.executeQuery();
			
			Map<String, MulticastRecoveryMessage> msgIdRecMsgMap = new HashMap<String, MulticastRecoveryMessage>();
			while (resultSet.next()) {
				
				String msgId = resultSet.getString("message_id");
				
				if (msgIdRecMsgMap.get(msgId) == null) {
					MulticastRecoveryMessage recoveryMessage =  new MulticastRecoveryMessage();
					recoveryMessage.setProcessId(processId);
					recoveryMessage.setMessageId(msgId);
					recoveryMessage.setData(resultSet.getBytes("message_data"));
					recoveryMessage.setSavePoint(resultSet.getString("savepoint_name") );
					
					msgIdRecMsgMap.put(msgId, recoveryMessage);
					recoveryMessages.add(recoveryMessage);
				} 
				
				if (msgIdRecMsgMap.get(msgId).getEndPointSet() == null) {
					msgIdRecMsgMap.get(msgId).setEndPointSet(new HashSet<String>());
				} 
				
				if (multicastId != null) {
					msgIdRecMsgMap.get(msgId).getEndPointSet().add(resultSet.getString("endpoint_id"));
				}				
			}
		} catch (Exception e) {
			throw e;
		} finally {
			DatabaseManager.releaseResources(connection, prepStatement,
					resultSet);
		}
		return recoveryMessages;
		
	}
}
