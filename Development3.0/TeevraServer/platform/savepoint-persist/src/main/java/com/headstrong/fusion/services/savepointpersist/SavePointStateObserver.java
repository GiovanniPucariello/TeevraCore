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
 * $Id: SavePointStateObserver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 4, 2009 
 */

package com.headstrong.fusion.services.savepointpersist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.failover.StateChangeObserverService;

/**
 * 
 */
public class SavePointStateObserver implements StateChangeObserverService {
	private Logger logger = LoggerFactory
			.getLogger(SavePointStateObserver.class);

	private SavePointBootstrapManager manager;

	public SavePointStateObserver(SavePointBootstrapManager manager) {
		this.manager = manager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.StateChangeObserverService#update(com.headstrong.fusion.failover.State)
	 */
	public void update(State state) {
		if (State.ACTIVE.equals(state)) {
			try {
				manager.bootstrap();
			} catch (Exception e) {
				logger.error("Error starting savepoint manager.", e);
				throw new IllegalStateException(e);
			}
		} else if (state.equals(State.STANDBY)) {
			try {
				manager.pause();
			} catch (Exception e) {
				logger.error("Error stopping savepoint manager.", e);
				throw new IllegalStateException(e);
			}
		}
	}

}
