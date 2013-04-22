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
 * $Id: RecoveryContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 5, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultExchange;
import org.apache.commons.lang.StringUtils;

import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.MultiCastRouterConfig;
import com.headstrong.fusion.config.Process;
import com.headstrong.fusion.config.Route;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.core.recovery.bean.MessageProcessed;
import com.headstrong.fusion.core.recovery.bean.RecoveryMessage;
import com.headstrong.fusion.core.recovery.bean.multicast.MulticastMessageProcessed;
import com.headstrong.fusion.core.recovery.bean.multicast.MulticastRecoveryMessage;
import com.headstrong.fusion.core.recovery.multicast.MulticastRecoverable;

/**
 * stores all recovery related data for a process.
 */
public class ProcessRecoveryContext {

	/**
	 * message recovery data store.
	 */
	private RecoveryDataStore recoveryDataStore;

	/**
	 * 
	 * @param recoveryDataStore
	 *            recovery data store.
	 */
	public ProcessRecoveryContext(RecoveryDataStore recoveryDataStore) {
		this.recoveryDataStore = recoveryDataStore;
	}

	public RecoveryDataStore getRecoveryDataStore() {
		return recoveryDataStore;
	}

	public void setRecoveryDataStore(RecoveryDataStore recoveryDataStore) {
		this.recoveryDataStore = recoveryDataStore;
	}

	/**
	 * saves the recoverable message into persistent data store.
	 * 
	 * @param recoverable
	 *            recoverable data.
	 * @throws Exception
	 */
	public void saveRecoveryMessage(Recoverable recoverable) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ExchangeConverter.write(recoverable.getExchange(), bos);
		RecoveryMessage recoveryMessage = new RecoveryMessage();
		recoveryMessage.setProcessId(recoverable.getProcessId());
		recoveryMessage.setSessionId(recoverable.getSessionId());
		recoveryMessage.setMessageId(recoverable.getMessageId());
		recoveryMessage.setSavePoint(recoverable.getSavepoint());
		recoveryMessage.setTimeStamp(recoverable.getTimeStamp());
		recoveryMessage.setData(bos.toByteArray());
		this.recoveryDataStore.saveRecoveryMessage(recoveryMessage);
	}

	/**
	 * saves the recoverable message into persistent data store.
	 * 
	 * @param recoverable
	 *            recoverable data.
	 * @throws Exception
	 */
	public void markMessageProcessed(Recoverable recoverable) throws Exception {
		MessageProcessed messageProcessed = recoverable instanceof MulticastRecoverable ? new MulticastMessageProcessed()
				: new MessageProcessed();
		messageProcessed.setProcessId(recoverable.getProcessId());
		messageProcessed.setSessionId(recoverable.getSessionId());
		messageProcessed.setMessageId(recoverable.getMessageId());

		// For mutlicast process, capture the endpoints the message is reaching to.
		if (recoverable instanceof MulticastRecoverable) {
			((MulticastMessageProcessed) messageProcessed)
					.setMulticastId(((MulticastRecoverable) recoverable)
							.getMulticastId());
			((MulticastMessageProcessed) messageProcessed)
					.setEndPointId(((MulticastRecoverable) recoverable)
							.getEndPointId());
			this.recoveryDataStore
					.markMulticastMessageProcessed((MulticastMessageProcessed)messageProcessed);
		} else {
			this.recoveryDataStore.markMessageProcessed(messageProcessed);
		}
	}

	/**
	 * Returns the unprocessed messages for the process.
	 * 
	 * @param processId process identifier.
	 * @return List of unprocessed messages.
	 * @throws Exception 
	 */
	public List<Recoverable> getUnProcessedMessages(
			ProcessContext processContext) throws Exception {

		RecoveryDataStore recStore = this.getRecoveryDataStore();

		List<RecoveryMessage> recoveryMessages = null;

		// Need to handle multicast process differently as messages to recover
		// is no longer only a difference of reclog and processed table.
		if (((CamelProcessContext) processContext).isMulticastProcess()) {

			List<RouterConfig> routerList = processContext
					.getProcessConfigurationModel().getRouters();

			recoveryMessages = new ArrayList<RecoveryMessage>();
			// Get the messages which has reached the reclog but not the
			// processed table at all.
			recoveryMessages.addAll(recStore
					.getUnProcessedMulticastRecoveryMessages(processContext
							.getProcessId(), null));

			for (RouterConfig routerConfig : routerList) {
				if (routerConfig instanceof MultiCastRouterConfig) {
					recoveryMessages
							.addAll(recStore
									.getUnProcessedMulticastRecoveryMessages(
											processContext.getProcessId(),
											routerConfig.getId()));
				}
			}

		} else {
			// list of messages yet persisted in the recovery store.
			recoveryMessages = recStore
					.getUnProcessedRecoverMessages(processContext
							.getProcessId());
		}

		// for each processed message
		// assumption is the table will contain a single record for each message
		// id .
		List<Recoverable> messagesUndelivered = new ArrayList<Recoverable>();
		if (recoveryMessages != null) {

			for (RecoveryMessage recoveryMessage : recoveryMessages) {

				if (((CamelProcessContext) processContext).isMulticastProcess()) {
					List<RouterConfig> routerList = processContext
							.getProcessConfigurationModel().getRouters();
					
					Set<String> processedEndpointSet = ((MulticastRecoveryMessage) recoveryMessage).getEndPointSet();
					Set<String> actualSet = null;
					
					// Finding the partially processed ones among the messages returned by query 2.
					for (RouterConfig routerConfig : routerList) {
						if (routerConfig instanceof MultiCastRouterConfig) {
							if (processedEndpointSet.size() > 0) {
								actualSet = new HashSet<String>();
								for (EndPointSequence target : ((MultiCastRouterConfig) routerConfig).getTargets()) {
									actualSet.add(target.isDeadEnd() ? target.getEndPointId() : 
										getDestinationEndpoint(processContext, target.getEndPointId()));
								}
							}
						}
					}
					if (processedEndpointSet.size() > 0 && processedEndpointSet.equals(actualSet)) {
						continue;
					}
					
				}

				// the message is already processed ..
				Recoverable recoverable = new Recoverable();
				recoverable.setProcessId(recoveryMessage.getProcessId());
				recoverable.setMessageId(recoveryMessage.getMessageId());
				recoverable.setSavepoint(recoveryMessage.getSavePoint());
				recoverable.setSessionId(processContext.getProcessRunId());
				ByteArrayInputStream bis = new ByteArrayInputStream(
						recoveryMessage.getData());
				// FIXME :: this defeats the purpose of having
				// ProcessContext interface

				Exchange exchange = new DefaultExchange(
						((CamelProcessContext) processContext)
								.getCamelContext());

				ExchangeConverter.read(exchange, bis);
				recoverable.setExchange(exchange);
				if (recoveryMessage instanceof MulticastRecoveryMessage) {
					Set<String> processedEndPoints = ((MulticastRecoveryMessage) recoveryMessage)
							.getEndPointSet();
					if (processedEndPoints != null
							&& !processedEndPoints.isEmpty()) {
						String separatedProcessedEndpoints = StringUtils.join(
								processedEndPoints.toArray(), ",");
						exchange.getIn().setHeader("processedEndpoints",
								separatedProcessedEndpoints);
					}
				}
				messagesUndelivered.add(recoverable);

				// #Redmine Bug 664: To ensure that during recovery the
				// undelivered messages,
				// retain the right session id for a complete run. Prior to
				// this fix old session id was maintained in message_reclog table.
				recoveryMessage.setSessionId(processContext.getProcessRunId());
				recoveryMessage.setTimeStamp(new Date());
				recStore.saveRecoveryMessage(recoveryMessage);
			}
		}
		return messagesUndelivered;
	}
	
	/**
	 * Fetch the destination endpoint for the passed component.
	 * 
	 * @param componentId
	 * @return
	 */
	private String getDestinationEndpoint(ProcessContext processContext, String componentId) {

		Process process = processContext.getProcessConfigurationModel()
				.getProcess();

		for (Route route : process.getRoutes()) {

			Iterator<SequenceType> routeSeqItr = route.getSequence().iterator();
			SequenceType srcSeqType = routeSeqItr.next();
			SequenceType endSeqType = routeSeqItr.next();

			// If this is the end route, return the end sequence.
			if (srcSeqType.getEndPointId().equals(componentId)) {
				if (route.isEnd()) {
					return endSeqType.getEndPointId();
				} else {
					return getDestinationEndpoint(processContext, endSeqType.getEndPointId());
				}
			}
		}

		return "";
	}
}