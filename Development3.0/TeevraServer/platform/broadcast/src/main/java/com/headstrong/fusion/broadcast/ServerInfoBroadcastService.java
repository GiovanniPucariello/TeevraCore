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
 * $Id: ServerInfoBroadcastService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 11, 2009 
 */

package com.headstrong.fusion.broadcast;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.MemberInfo;
import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * This service updates the server connection URL ( JMX URL ) into the 
 * database.
 * It is invoked whenever the server state is changed to RUNNING.
 * 
 */
public class ServerInfoBroadcastService {
	private static final Logger logger = LoggerFactory
			.getLogger(ServerInfoBroadcastService.class);
	private static final String updateServerInfo = "update server_configuration "
			+ "set server_name = ? , server_url = ? where server_id = ?";

	/**
	 * Updates the server JMX URL into the database.
	 * 
	 * @precondition server state is {@link State#RUNNING}
	 * @postcondition 	
	 * @param adminService
	 * @throws FusionException
	 */
	public synchronized void broadcast(AdminService adminService)
			throws FusionException {

		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (dbPool == null) {
			logger.error("Error obtaining database manager");
			throw new FusionException("Error obtaining database manager");
		}

		Connection conn = null;
		PreparedStatement pStmt = null;
		MemberInfo memberInfo = adminService.getMemberInfo();
		if (memberInfo != null) {
			try {
				conn = dbPool.getConnection();
				// insert into event log table
				pStmt = conn.prepareStatement(updateServerInfo);
				pStmt.setString(1, memberInfo.getClusterName());
				pStmt.setString(2, memberInfo.getConnectorUrl());
				pStmt.setInt(3, memberInfo.getClusterId());
				
				pStmt.executeUpdate();

				if (logger.isDebugEnabled()) {
					logger
							.debug("Server information successfully broadcasted.");
				}
			} catch (Exception e) {
				logger.error("Error while broadcasting Server information.", e);
			} finally {
				DatabaseManager.releaseResources(conn,pStmt,null);
			}
		}
	}
}
