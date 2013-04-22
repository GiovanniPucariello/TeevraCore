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
 * $Id: RecoveryDataStore.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 6, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.util.List;

import com.headstrong.fusion.core.recovery.bean.MessageProcessed;
import com.headstrong.fusion.core.recovery.bean.RecoveryMessage;
import com.headstrong.fusion.core.recovery.bean.multicast.MulticastMessageProcessed;

/**
 * persistent store for message recovery.
 * 
 */
public interface RecoveryDataStore {

	/**
	 * saves the message data into the persistent data store.
	 * 
	 * @param recoveryMessage
	 *            Recovery message.
	 * @throws Exception
	 */
	public void saveRecoveryMessage(RecoveryMessage recoveryMessage)
			throws Exception;

	/**
	 * @param recoveryMessage
	 * @throws Exception
	 */
	public void deleteRecoveryMessage(RecoveryMessage recoveryMessage)
			throws Exception;

	/**
	 * returns the list of messages for the message id provided.
	 * 
	 * @param processId
	 *            process identifier.
	 * @throws Exception
	 * @return List of un-delivered recovery messages.
	 */
	public List<RecoveryMessage> getAllRecoveryMessages(String processId)
			throws Exception;

	/**
	 * marks the message for deletion.
	 * 
	 * @param messageProcessed
	 *            processed message.
	 * @throws Exception
	 */
	public void markMessageProcessed(MessageProcessed messageProcessed)
			throws Exception;

	/**
	 * @param messageProcessed
	 * @throws Exception
	 */
	public void deleteMessageProcessed(MessageProcessed messageProcessed)
			throws Exception;

	/**
	 * @param processId
	 * @throws Exception
	 */
	public List<MessageProcessed> getAllMessageProcessed(String processId)
			throws Exception;

	/**
	 * @param processId
	 * @throws Exception
	 */
	public List<RecoveryMessage> getUnProcessedRecoverMessages(String processId)
			throws Exception;
	
	/**
	 * Mark MulticastMessage as Processed
	 * @param messageProcessed
	 * @throws Exception
	 */
	public void markMulticastMessageProcessed(MulticastMessageProcessed messageProcessed)
	throws Exception;

	/**
	 * Get unprocessed multicast messages.
	 * @param processId Process Id
	 * @param multicastId Multicast Id
	 * @return List of messages to recover.
	 */
	public List<RecoveryMessage> getUnProcessedMulticastRecoveryMessages(
			String processId, String multicastId) throws Exception;
}
