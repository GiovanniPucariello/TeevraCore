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
 * $Id: RecoveryManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 6, 2008 
 */

package com.headstrong.fusion.core.recovery;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.core.ProcessContext;

/**
 * Recovery Manager manages recovery operations. it persists the data in the
 * recovery data store. while process runs the recovery, manager would put the
 * data back in the process.
 */
public interface RecoveryManager {

	@Deprecated
	public Object getRecoveryQueue();

	/**
	 * save a message for recovery. In case of failure recovery manager would
	 * read the messages from its default data store and push the un-delivered
	 * messages back into the process.
	 * 
	 * @param processId
	 *            unique process identifier.
	 * @param recoverable
	 *            recoverable exchange.
	 * @throws FusionException
	 */
	public void saveRecoverable(Recoverable recoverable) throws FusionException;

	/**
	 * the message will be marked for deletion.
	 * 
	 * @param recoverable
	 * @throws FusionException
	 */
	public void markRecoverableForDeletion(Recoverable recoverable)
			throws FusionException;

	/**
	 * runs the process recovery.
	 * 
	 * @precondition process is stopped.
	 * @param processContext
	 * @throws FusionException
	 */
	public void runRecovery(ProcessContext processContext)
			throws FusionException;

	/**
	 * @param recoveryDataStore
	 */
	public void setRecoveryDataStore(RecoveryDataStore recoveryDataStore);

}
