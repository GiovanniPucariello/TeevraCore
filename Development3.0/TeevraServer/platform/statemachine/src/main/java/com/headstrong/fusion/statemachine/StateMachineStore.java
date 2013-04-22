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
 * $Id: StateMachineStore.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 15, 2009 
 */

package com.headstrong.fusion.statemachine;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.statemachine.exception.StateMachineNotFoundException;
import com.headstrong.fusion.statemachine.exception.StateMachineSerializationException;
import com.headstrong.fusion.statemachine.exception.UniqueStateMachineException;

/**
 * This class works as an store for state machine.
 * 
 */
public class StateMachineStore {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(StateMachineStore.class);

	/**
	 * Local hashmap of state machines. need to look at clearing of the copies.
	 * TODO :: put garbage collection strategy.
	 */
	// private Map<String, StateMachine> stateMachines;
	private static final String INS_STATE_MACHINE_EXEC = "insert into state_machine_exec "
			+ "(state_machine_exec_id, state_machine_exec, payload) values (?,?,?)";

	private static final String UPDATE_STATE_MACHINE_EXEC = "update state_machine_exec set "
			+ " state_machine_exec = ? ,"
			+ " payload = ? "
			+ " where state_machine_exec_id = ?";

	private static final String GET_STATE_MACHINE_EXEC = "select state_machine_exec from state_machine_exec "
			+ " where state_machine_exec_id = ?";

	/**
	 * Get the state machine for the id provided.
	 * 
	 * @param id
	 *            State Machine unique identifier.
	 * @return State Machine.
	 * @throws StateMachineNotFoundException
	 */
	public synchronized StateMachine getStateMachine(String id)
			throws StateMachineNotFoundException,
			StateMachineSerializationException {
		if (logger.isDebugEnabled()) {
			logger.debug("Get Machine Request received for State Machine Id : "
					+ id);
		}
		StateMachine stateMachine = null;
		/*
		 * if (this.stateMachines.containsKey(id)) { stateMachine =
		 * this.stateMachines.get(id); }
		 *//*
			 * else {
			 */// try retrieving the state machine from database.
		Connection connection = null;
		PreparedStatement preparedStmt = null;
		ResultSet resultSet = null;
		try {
			connection = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
					.getConnection();
			preparedStmt = connection.prepareStatement(GET_STATE_MACHINE_EXEC);
			preparedStmt.setString(1, id);
			resultSet = preparedStmt.executeQuery();
			// Assumption only one record is retrieved.
			byte[] stateMachineBytes = null;
			while (resultSet.next()) {
				stateMachineBytes = resultSet.getBytes("state_machine_exec");
			}
			ByteArrayInputStream bis = new ByteArrayInputStream(
					stateMachineBytes);
			stateMachine = SCXMLStateMachineSerializer.read(bis);
		} catch (SQLException e1) {
			logger.error("Error getting the Fusion database connection", e1);
			throw new StateMachineSerializationException(
					"Error serializing the state machine.", e1);
		} catch (StateMachineSerializationException e) {
			logger.error("Error reading state machine from DB.", e);
			throw new StateMachineNotFoundException("State machine not found.",
					e);
		} finally {
			try {
				DatabaseManager
						.releaseResources(connection, preparedStmt, null);
			} catch (Throwable e) {
				// ignore
			}
		}
		/* } */
		return stateMachine;
	}

	/**
	 * Register a new state machine.
	 * 
	 * @param id
	 *            state machine unique identifier.
	 * @param stateMachine
	 * @throws UniqueStateMachineException
	 * @throws StateMachineSerializationException
	 */
	public synchronized void addStateMachine(String id,
			StateMachine stateMachine, Object payload)
			throws UniqueStateMachineException,
			StateMachineSerializationException {
		/*
		 * if (this.stateMachines.containsKey(id)) { throw new
		 * UniqueStateMachineException("State Machine with id " + id + " already
		 * registered with the system"); }
		 */

		Connection connection = null;
		PreparedStatement preparedStmt = null;
		try {
			connection = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
					.getConnection();
			preparedStmt = connection.prepareStatement(INS_STATE_MACHINE_EXEC);
			preparedStmt.setString(1, id);
			ByteArrayOutputStream byteOS = new ByteArrayOutputStream();
			SCXMLStateMachineSerializer.write(byteOS, stateMachine);
			byteOS.flush();
			preparedStmt.setBytes(2, byteOS.toByteArray());
			preparedStmt.setString(3, payload.toString());
			preparedStmt.execute();
		} catch (SQLException e1) {
			logger.error("Error getting the Fusion database connection", e1);
			throw new StateMachineSerializationException(
					"Error serializing the state machine for state machine id "
							+ id + ".");
		} catch (IOException e) {
			logger.error("Error persing the state machine.", e);
			throw new StateMachineSerializationException(
					"Error serializing the state machine for state machine id "
							+ id + ".", e);
		} finally {
			try {
				DatabaseManager
						.releaseResources(connection, preparedStmt, null);
			} catch (Throwable e) {
				// ignore
			}
			// FIXME : commenting for testing purpose only.
			// Locally no state machine is stored.
			// Once caching is designed it might be uncommented.
			// this.stateMachines.put(id, stateMachine);
		}
	}

	/**
	 * Update the state machine.
	 * 
	 * @precondition
	 * @postcondition
	 * @param id
	 * @param stateMachine
	 * @throws StateMachineSerializationException
	 */
	public synchronized void updateStateMachine(String id,
			StateMachine stateMachine, Object payload)
			throws StateMachineSerializationException {
		Connection connection = null;
		PreparedStatement preparedStmt = null;
		try {
			connection = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
					.getConnection();
			preparedStmt = connection
					.prepareStatement(UPDATE_STATE_MACHINE_EXEC);
			ByteArrayOutputStream byteOS = new ByteArrayOutputStream(1024);
			SCXMLStateMachineSerializer.write(byteOS, stateMachine);
			preparedStmt.setBytes(1, byteOS.toByteArray());
			preparedStmt.setString(2, payload.toString());
			preparedStmt.setString(3, id);
			preparedStmt.executeUpdate();
		} catch (SQLException e1) {
			logger.error("Error getting the Fusion database connection", e1);
			throw new StateMachineSerializationException(
					"Error serializing the state machine for state machine id "
							+ id + ".", e1);
		} finally {
			DatabaseManager.releaseResources(connection, preparedStmt, null);
			// this.stateMachines.put(id, stateMachine);
		}
	}
}
