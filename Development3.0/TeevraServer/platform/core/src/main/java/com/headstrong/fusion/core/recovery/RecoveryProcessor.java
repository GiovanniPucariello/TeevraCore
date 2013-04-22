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
 * $Id: RecoveryProcessor.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 7, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.core.recovery.multicast.MulticastRecoverable;

/**
 * persists the message with recovery manager.
 * 
 */
public class RecoveryProcessor implements Processor {
	private static final Logger logger = LoggerFactory
			.getLogger(RecoveryProcessor.class);

	/**
	 * process context
	 */
	private ProcessContext processContext;

	/**
	 * identifies if the message is marked for deletion or else it'll be saved
	 * in the recovery datastore.
	 */
	private boolean markForDeletion;
	
	/**
	 * Endpoint id.
	 */
	private String endPointId;
	
	/**
	 * Multicast id.
	 */
	private String multicastId;

	/**
	 * savepoint name
	 */
	private String savePoint;
	
	public RecoveryProcessor(ProcessContext processContext) {
		this.processContext = processContext;
		this.savePoint = FusionConstants.DEFAULT_RECEIVED_SP_NAME;
	}

	public RecoveryProcessor(ProcessContext processContext, String savePoint) {
		this.processContext = processContext;
		this.savePoint = savePoint;
	}

	public RecoveryProcessor(ProcessContext processContext, String savePoint,
			boolean markForDeletion) {
		this.processContext = processContext;
		this.savePoint = savePoint;
		this.markForDeletion = markForDeletion;
	}

	/**
	 * Constructed added to support recovery in multicast.
	 * Append destination information with the Recoverable.
	 * @param processContext
	 * @param savePoint
	 * @param markForDeletion
	 * @param endPointId
	 * @param multicastId
	 */
	public RecoveryProcessor(ProcessContext processContext, String savePoint, boolean markForDeletion,
			String multicastId, String endPointId) {
		this(processContext, savePoint, markForDeletion);
		this.multicastId = multicastId;
		this.endPointId = endPointId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		Recoverable recoverable = ((CamelProcessContext) this.processContext)
				.isMulticastProcess() ? new MulticastRecoverable()
				: new Recoverable();
		recoverable.setExchange(exchange);
		recoverable.setProcessId(processContext.getProcessId());
		String messageId = (String) exchange.getIn().getHeader(
				FusionConstants.MESSAGE_ID);
		recoverable.setMessageId(messageId);
		recoverable.setSavepoint(this.savePoint);
		recoverable.setSessionId(this.processContext.getProcessRunId());
		recoverable.setTimeStamp(new Date());
		
		// For mutlicast process, capture the endpoints the message is reaching to.
		if (((CamelProcessContext) this.processContext).isMulticastProcess()) {
			((MulticastRecoverable) recoverable).setEndPointId(this.endPointId);
			((MulticastRecoverable) recoverable)
					.setMulticastId(this.multicastId);
		}
		
		// Recovery Manager
		RecoveryManager recoveryManager = this.processContext
				.getApplicationContext().getRecoveryManager();
		if (recoveryManager != null) {
			if (this.markForDeletion) {
				recoveryManager.markRecoverableForDeletion(recoverable);
			} else {
				recoveryManager.saveRecoverable(recoverable);
			}
		} else {
			logger
					.error("could not recover message as the recovery manager is not enabled. message details { process id : "
							+ recoverable.getProcessId()
							+ " , session id : "
							+ recoverable.getSessionId()
							+ " , message id : "
							+ recoverable.getMessageId());
		}
	}
}
