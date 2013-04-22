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
 * $Id: SaveTask.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 5, 2009 
 */

package com.headstrong.fusion.core.recovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * On receipt of message this task persists the data into the persistent data
 * store.
 * 
 */
public class MessagePersistenceTask implements Runnable {

	private static Logger logger = LoggerFactory
			.getLogger(MessagePersistenceTask.class);
	/**
	 * recoverable data
	 */
	private Recoverable recoverable;
	/**
	 * recovery context data for the process.
	 */
	private ProcessRecoveryContext processRecoveryContext;

	/**
	 * @param messageId
	 * @param recoverable
	 */
	public MessagePersistenceTask(Recoverable recoverable,
			ProcessRecoveryContext processRecoveryContext) {
		this.recoverable = recoverable;
		this.processRecoveryContext = processRecoveryContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// persist the message in the recovery datastore.
		try {
			this.processRecoveryContext.saveRecoveryMessage(recoverable);
		} catch (Exception e) {
			// FIXME : should the error be reported to error reporter.
			logger.error("Error persisting the message for recovery.", e);
		}
	}
}
