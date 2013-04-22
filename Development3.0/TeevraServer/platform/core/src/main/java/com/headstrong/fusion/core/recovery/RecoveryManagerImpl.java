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
 * $Id: RecoveryManagerImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 5, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.apache.camel.Exchange;
import org.apache.camel.component.seda.SedaEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.ProcessContext;

/**
 * Recovery manager default implementation.
 * 
 */
public class RecoveryManagerImpl implements RecoveryManager {
	/**
	 * logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(RecoveryManagerImpl.class);

	/**
	 * No of worker threads for processing incoming messages.
	 */
	private static final int REC_THREADS = 5;
	/**
	 * recovery task ( save / mark for deletion ) executor.
	 */
	private static final Executor recoveryExecutor = Executors
			.newFixedThreadPool(REC_THREADS);
	/**
	 * process recovery context map.
	 */
	private Map<String, ProcessRecoveryContext> processContextRecoveryMap = new HashMap<String, ProcessRecoveryContext>();

	/**
	 * Recovery data store.
	 */
	private RecoveryDataStore recoveryDataStore;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.recovery.RecoveryManager#getRecoveryQueue()
	 */
	@Override
	public Object getRecoveryQueue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * return process recovery context for the process. Creates one if one not
	 * already created.
	 * 
	 * @param processId
	 * @return
	 */
	private ProcessRecoveryContext getProcessRecoveryContext(String processId) {
		ProcessRecoveryContext processRecoveryContext = null;
		synchronized (this) {
			if (!this.processContextRecoveryMap.containsKey(processId)) {
				// create a new process context if one not already registered.
				// will not be accessed by multiple threads for same process.
				processRecoveryContext = new ProcessRecoveryContext(this
						.getRecoveryDataStore());
				this.processContextRecoveryMap.put(processId,
						processRecoveryContext);
			} else {
				processRecoveryContext = this.processContextRecoveryMap
						.get(processId);
			}
		}
		return processRecoveryContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.recovery.RecoveryManager#runRecovery(java.
	 *      lang.String)
	 */
	@Override
	public void runRecovery(ProcessContext processContext)
			throws FusionException {
		// get the un-delivered messages.
		ProcessRecoveryContext processRecoveryContext = this
				.getProcessRecoveryContext(processContext.getProcessId());
		if (processRecoveryContext != null) {

			try {
				List<Recoverable> undeliveredMessages = processRecoveryContext
						.getUnProcessedMessages(processContext);
				for (Recoverable recoverable : undeliveredMessages) {
					SedaEndpoint endPoint = (SedaEndpoint) ((CamelProcessContext) processContext)
							.getProcessMetaData().getSourceSedaEndpoint(
									processContext.getProcessId(),
									recoverable.getSavepoint());
					BlockingQueue<Exchange> queue = endPoint.getQueue();

					try {
						if (logger.isDebugEnabled()) {
							logger.debug("Recovering message for processId : "
									+ recoverable.getProcessId()
									+ " , messageId : "
									+ recoverable.getMessageId());
						}
						queue.put(recoverable.getExchange());
					} catch (InterruptedException e) {
						logger
								.error("Error while recovering the message : ",
										e);
						throw new FusionException(
								"Error while recovering the message : ", e);
					}
				}
			} catch (Exception e) {
				throw new FusionException(
						"Error while recovering the message : ", e);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.recovery.RecoveryManager#save(java.lang.String ,
	 *      com.headstrong.fusion.core.recovery.Recoverable)
	 */
	/**
	 * @precondition this.processContextRecoveryMap.get(recoverable
	 *               .getProcessId()) != null
	 */
	@Override
	public void saveRecoverable(Recoverable recoverable) throws FusionException {
		if (this.isProcessRegistered(recoverable.getProcessId())) {
			ProcessRecoveryContext processRecoveryContext = null;
			processRecoveryContext = this.getProcessRecoveryContext(recoverable
					.getProcessId());
			MessagePersistenceTask onReceiptTask = new MessagePersistenceTask(
					recoverable, processRecoveryContext);
			RecoveryManagerImpl.recoveryExecutor.execute(onReceiptTask);
		} else {
			logger
					.error("process is not registered with the recovery manager.");
		}
	}

	@Override
	public void markRecoverableForDeletion(Recoverable recoverable)
			throws FusionException {
		if (this.isProcessRegistered(recoverable.getProcessId())) {
			ProcessRecoveryContext processRecoveryContext = null;
			processRecoveryContext = this.getProcessRecoveryContext(recoverable
					.getProcessId());
			MarkForDeletionTask markForDeletionTask = new MarkForDeletionTask(
					recoverable, processRecoveryContext);
			RecoveryManagerImpl.recoveryExecutor.execute(markForDeletionTask);
		} else {
			logger
					.error("process is not registered with the recovery manager.");
		}
	}

	/**
	 * @return recoveryData store.
	 */
	public RecoveryDataStore getRecoveryDataStore() {
		return recoveryDataStore;
	}

	/**
	 * @param recoveryDataStore
	 *            recovery data store.
	 */
	public void setRecoveryDataStore(RecoveryDataStore recoveryDataStore) {
		this.recoveryDataStore = recoveryDataStore;
	}

	/**
	 * checks if the process recovery context is registered with the recovery
	 * manager.
	 * 
	 * @param processId
	 * @return
	 */
	private boolean isProcessRegistered(String processId) {
		return null != this.processContextRecoveryMap.get(processId);
	}

}
