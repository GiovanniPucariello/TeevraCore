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
 * $Id: ServerBroadcastStateObserver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 11, 2009 
 */

package com.headstrong.fusion.broadcast;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.failover.StateChangeObserverService;

/**
 * Any server state change is notified to this observer.
 * This observer broadcasts server jmx url to db on 
 * state change to RUNNING.
 * 
 */
public class ServerBroadcastStateObserver implements StateChangeObserverService {
	private ServerInfoBroadcastService serverInfoBroadcastService;
	private ServiceResolver<AdminService> adminServiceResolver;
	private static final Logger logger = LoggerFactory
			.getLogger(ServerBroadcastStateObserver.class);

	public ServerBroadcastStateObserver(
			ServerInfoBroadcastService serverInfoBroadcastService,
			ServiceResolver<AdminService> adminServiceResolver) {
		// TODO Auto-generated constructor stub
		this.serverInfoBroadcastService = serverInfoBroadcastService;
		this.adminServiceResolver = adminServiceResolver;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.StateChangeObserverService#update(com.headstrong.fusion.failover.State)
	 */
	public void update(State state) {
		logger.info("Server state change event recorded with new state as "
				+ state);
		if (state.equals(State.RUNNING)) {
			AdminService adminService = adminServiceResolver.getService(
					AdminService.class.getName(), 0);
			if (adminService != null && adminService.getMemberInfo() != null
					&& adminService.getMemberInfo().isClustered()) {
				// broadcasting is required.
				try {
					serverInfoBroadcastService.broadcast(adminService);
				} catch (FusionException e) {
					// TODO Auto-generated catch block
					logger.error("Error while updating the state.", e);
					IllegalStateException e2 = new IllegalStateException(e
							.getMessage());
					e2.setStackTrace(e.getStackTrace());
					throw e2; // FIXME
				}
			}
			// broadcast this detail currently publish this to the database.
		}
	}

}
