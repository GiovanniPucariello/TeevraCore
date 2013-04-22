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
 * $Id: StateModelLoader.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 17, 2009 
 */

package com.headstrong.fusion.services.statemachine.cache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.ServiceNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;

/**
 * 
 */
public class StateModelLoader {

	private static final Logger logger = LoggerFactory
			.getLogger(StateModelLoader.class);
	private static final String stateModelQuery = "SELECT state_machine_id, state_machine_model "
			+ " FROM state_machine";

	/**
	 * Reloads the state model from database.
	 * 
	 * @throws SQLException
	 * @throws ServiceConfigurationParseException
	 * @throws ServiceUnavailableException
	 * @throws ServiceNotFoundException
	 */

	public static synchronized void reloadConfiguration() throws SQLException {
		StateMachineModelCache stateMachineModelCache = StateMachineModelCache
				.getInstance();
		Connection connection = null;
		try {
			connection = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
					.getConnection();
		} catch (SQLException e1) {
			logger.error("Error getting the Fusion database connection", e1);
			throw e1;
		}

		if (connection != null) {

			/**
			 * Schema table statement and result set
			 */
			Statement stateModelStmt = null;
			ResultSet stateModelRs = null;

			try {

				stateModelStmt = connection.createStatement();
				stateModelRs = stateModelStmt.executeQuery(stateModelQuery);

				while (stateModelRs.next()) {
					String stateMachineModelId = stateModelRs
							.getString("state_machine_id");
					String stateMachineModel = stateModelRs
							.getString("state_machine_model");
					stateMachineModelCache.addStateMachineModel(
							stateMachineModelId, stateMachineModel);
				}
			} catch (SQLException e) {
				logger.error("Error reading the service configuration.", e);
				throw e;
			} finally {
				try {
					if (stateModelRs != null) {
						stateModelRs.close();
					}
				} catch (SQLException e) {
					logger.error("Error closing the result set.", e);
					// Ignore the error
				}
				try {
					if (stateModelStmt != null) {
						stateModelStmt.close();
					}
				} catch (SQLException e) {
					logger.error("Error closing the statement.", e);
					// Ignore the error
				}
				try {
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					logger.error("Error closing the connection", e);
					// Ignore the error
				}
			}
		}
	}

}
