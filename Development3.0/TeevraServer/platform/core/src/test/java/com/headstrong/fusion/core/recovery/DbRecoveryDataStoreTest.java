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
 * $Id: DbRecoveryDataStoreTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 14, 2010 
 */

package com.headstrong.fusion.core.recovery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.core.recovery.bean.RecoveryMessage;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;

/**
 * 
 */
public class DbRecoveryDataStoreTest extends TestCase {
	DbRecoveryDataStore dataStore = new DbRecoveryDataStore();

	@Override
	protected void setUp() throws Exception {
		// create collaborator
		Map<String, String> props1 = new HashMap<String, String>();
		props1.put("database.driver.classname", "org.hsqldb.jdbcDriver");
		props1.put("database.username", "sa");
		props1.put("database.password", "");
		props1.put("database.url", "jdbc:hsqldb:mem:fusion_dbpool");
		props1.put("database.initialSize", "2");
		props1.put("database.maxActive", "5");
		props1.put("database.maxOpenActivePrep", "-1");
		props1.put("database.minEvictableIdleTimemillis", "60000");
		props1.put("database.timeBetweenEvictionRunsMillis", "300000");
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB,
				DatabaseManager.setupDBPool(props1));
		createTables();
	}

	private void createTables() throws Exception {
		String message_recovery_log = "CREATE TABLE message_recoverylog (  prcs_run_id integer, message_id integer, savepoint_name varchar(100),  message_data binary,  prcs_id varchar(100),  time_stamp timestamp,  created_by varchar(50), created_date timestamp,  modified_by varchar(50),modified_date timestamp)";
		String message_recovery_processed = "CREATE TABLE message_recovery_processed(  prcs_id varchar(50), prcs_run_id integer,  message_id integer,  created_by varchar(100), created_date timestamp ,  modified_by varchar(50),modified_date timestamp )";
		Connection conn = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
				.getConnection();
		Statement statement = conn.createStatement();
		statement.addBatch(message_recovery_log);
		statement.execute(message_recovery_processed);
		statement.executeBatch();
		conn.close();
	}

	private void dropTables() throws Exception {
		String message_recovery_log = "drop TABLE message_recoverylog";
		String message_recovery_processed = "drop TABLE message_recovery_processed";
		Connection conn = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
				.getConnection();
		Statement statement = conn.createStatement();
		statement.addBatch(message_recovery_log);
		statement.execute(message_recovery_processed);
		statement.executeBatch();
		conn.close();
	}

	public void testSaveRecoveryMessage() throws Exception {
		RecoveryMessage recoveryMessage = saveRecoveryMessage("1", "1", "1",
				"start", "test data".getBytes());
		dataStore.saveRecoveryMessage(recoveryMessage);
		// verify the data in the message_recoverylog table.
		String sql = "select message_data from message_recoverylog where prcs_id = ? and prcs_run_id = ? and message_id = ?";
		Connection conn = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
				.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, recoveryMessage.getProcessId());
		statement.setInt(2, 1);
		statement.setInt(3, 1);
		ResultSet rs = statement.executeQuery();
		rs.next();
		String data = new String(rs.getBytes(1));
		assertEquals("test data", data);
		// delete the data
		statement.close();
		conn.close();
		clearData();
	}

	public void testGetRecoveryMessages() throws Exception {
		RecoveryMessage recoveryMessage = saveRecoveryMessage("1", "1", "1",
				"start", "test data".getBytes());
		dataStore.saveRecoveryMessage(recoveryMessage);
		recoveryMessage = saveRecoveryMessage("1", "1", "2",
				"start", "test data1".getBytes());
		dataStore.saveRecoveryMessage(recoveryMessage);
		String sql = "select message_data from message_recoverylog where prcs_id = ? and prcs_run_id = ?";
		Connection conn = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
				.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "1");
		statement.setInt(2, 1);
		ResultSet rs = statement.executeQuery();
		rs.next();
		List<String> dataList = new ArrayList<String>();
		dataList.add(new String(rs.getBytes(1)));
		rs.next();
		dataList.add(new String(rs.getBytes(1)));
		List<String> expected = Arrays.asList("test data","test data1");
		assertTrue(expected.containsAll(dataList));
		statement.close();
		conn.close();
		clearData();
	}
	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	private RecoveryMessage saveRecoveryMessage(String processId,
			String sessionId, String messageId, String savePoint, byte[] data) {
		RecoveryMessage recoveryMessage = new RecoveryMessage();
		recoveryMessage.setMessageId(messageId);
		recoveryMessage.setProcessId(processId);
		recoveryMessage.setSavePoint(savePoint);
		recoveryMessage.setSessionId(sessionId);
		recoveryMessage.setTimeStamp(new Date());
		recoveryMessage.setData(data);
		return recoveryMessage;
	}

	private void clearData() throws Exception {
		String message_recoverylog = "delete from message_recoverylog";
		String message_recovery_processed = "delete from message_recovery_processed";
		Connection conn = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
				.getConnection();
		Statement statement = conn.createStatement();
		statement.addBatch(message_recovery_processed);
		statement.addBatch(message_recoverylog);
		statement.executeBatch();
		statement.close();
		conn.close();
	}

	public void testGetAllRecoveryMessages() throws Exception {
	}

	@Override
	protected void tearDown() throws Exception {
		dropTables();
	}
}
