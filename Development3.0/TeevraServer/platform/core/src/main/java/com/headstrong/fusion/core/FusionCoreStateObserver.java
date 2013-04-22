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
 * $Id: FusionCoreStateObserver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.failover.StateChangeObserverService;

/**
 * State change observer.
 * 
 */
public class FusionCoreStateObserver implements StateChangeObserverService {
	private BootstrapManager bootstrapManager;
	private static final Logger logger = LoggerFactory
			.getLogger(FusionCoreStateObserver.class);
	private ServiceResolver<AdminService> adminServiceResolver;

	public FusionCoreStateObserver(BootstrapManager bootstrapManager,
			ServiceResolver<AdminService> adminServiceResolver) {
		this.bootstrapManager = bootstrapManager;
		this.adminServiceResolver = adminServiceResolver;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.StateChangeObserver#update(com.headstrong.fusion.failover.State)
	 */
	/**
	 * @precondition adminService != null
	 */
	public void update(State state) {
		AdminService adminService = adminServiceResolver.getService(
				AdminService.class.getName(), 100);
		if (state.equals(State.ACTIVE)) {
			try {
				this.bootstrapManager.bootstrap();
				// change the state to RUNNING
				adminService.getMemberInfo().setState(State.RUNNING);
			} catch (Exception e) {
				logger.error("Error Bootstrapping the instance.", e);
				adminService.getMemberInfo().setState(State.STANDBY);
				// TODO :: send a signal to admin service for de-activation
				// request.
				// Does it need to throw any exception.
				// FIXME
			}
		} else if (state.equals(State.STANDBY)) {
			try {
				this.bootstrapManager.pause();
			} catch (Exception e) {
				logger.error("Error stopping the instance.", e);
				// TODO :: send a signal to admin service for this.
				// FIXME
				// Does it need to throw any exception.
			}
		}
	}
}
