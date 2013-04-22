package com.headstrong.fusion.services.savepointpersist;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.core.recovery.Recoverable;
import com.headstrong.fusion.core.recovery.RecoveryDataStore;
import com.headstrong.fusion.core.recovery.RecoveryManager;

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
 * $Id: DefaultRecoveryManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 29, 2009 
 */

/**
 * Default recovery manager implementation.
 */
public class DefaultRecoveryManager implements RecoveryManager {
	@SuppressWarnings("unchecked")
	private BlockingQueue blockingQueue;

	@SuppressWarnings("unchecked")
	public DefaultRecoveryManager() {
		this.blockingQueue = new LinkedBlockingQueue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.RecoveryManager#getRecoveryQueue()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public BlockingQueue getRecoveryQueue() {
		return this.blockingQueue;
	}

	@Override
	public void markRecoverableForDeletion(Recoverable recoverable)
			throws FusionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runRecovery(ProcessContext processContext)
			throws FusionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveRecoverable(Recoverable recoverable) throws FusionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRecoveryDataStore(RecoveryDataStore recoveryDataStore) {
		// TODO Auto-generated method stub
		
	}
}
