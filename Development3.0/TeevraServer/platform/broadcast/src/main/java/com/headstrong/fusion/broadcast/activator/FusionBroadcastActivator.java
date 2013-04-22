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
 * $Id: FusionBroadcastActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 11, 2008 
 */

package com.headstrong.fusion.broadcast.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.broadcast.ServerBroadcastStateObserver;
import com.headstrong.fusion.broadcast.ServerInfoBroadcastService;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.failover.StateChangeObserverService;

/**
 * Initializes the Fusion broadcast service.
 * 
 */
public class FusionBroadcastActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(FusionBroadcastActivator.class);
	ServiceResolver<AdminService> adminServiceResolver;
	ServerInfoBroadcastService broadCastService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		logger.info("Broadcasting service starting");
		// service info broadcast service.
		this.broadCastService = new ServerInfoBroadcastService();
		// check the server state if already RUNNING broadcast the details.
		this.adminServiceResolver = new ServiceResolverImpl<AdminService>(
				context);
		AdminService adminService = adminServiceResolver.getService(
				AdminService.class.getName(), 100);
		if (adminService != null) {
			if (State.RUNNING.equals(adminService.getMemberState())) {
				broadCastService.broadcast(adminService);
			}
		}
		// register state observer service.
		this.registerStateObserver(context);
	}

	private void registerStateObserver(BundleContext context) {

		ServerBroadcastStateObserver stateObserver = new ServerBroadcastStateObserver(
				this.broadCastService, this.adminServiceResolver);
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, StateChangeObserverService.class
				.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion core state observer Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		context.registerService(StateChangeObserverService.class.getName(),
				stateObserver, props);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.info("Stopping broadcasting service.");
	}

}
