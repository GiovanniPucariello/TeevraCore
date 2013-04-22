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
 * $Id: ClusteredConfigurationManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.failover.request.data;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgroups.Address;
import org.jgroups.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.MemberContext;
import com.headstrong.fusion.failover.State;

/**
 * Any configuration that needs to be clustered and copied to all the instances
 * need to use this.
 * 
 */
public class ClusteredStateManagerImpl implements ClusteredStateManager {
	private static final Logger logger = LoggerFactory
			.getLogger(ClusteredStateManagerImpl.class);
	/**
	 * 
	 */
	private MemberContext memberContext;
	/**
	 * Map of Handler name v/s ClusteredStateHandler.
	 */
	private Map<String, ClusteredStateHandler> dataHandlers;
	/**
	 * Map of Handler Name v/s pending request.
	 */
	private Map<String, List<ClusteredStateRequest>> pendingRequests;

	/**
	 * @param memberContext
	 */
	public ClusteredStateManagerImpl(MemberContext memberContext) {
		this.memberContext = memberContext;
		this.dataHandlers = new HashMap<String, ClusteredStateHandler>();
		this.pendingRequests = new HashMap<String, List<ClusteredStateRequest>>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManagerService#multicast(com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManager#multicast(com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	public void multicast(ClusteredStateRequest clusteredStateRequest)
			throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Data multicast request received."
					+ clusteredStateRequest.getHandlerName());
		}
		if (this.memberContext.getMemberInfo().isClustered()
				&& (State.ACTIVE.equals(this.memberContext.getMemberInfo()
						.getState()) || State.RUNNING.equals(this.memberContext
						.getMemberInfo().getState()))
				&& this.memberContext.getGroupMember() != null) {
			// configuration multicast currently should only happen through the
			// master node which is in ACTIVE mode.

			// TODO byte arrays need not be kept in memory
			// mechanism required to persist the required on file
			// system and re-publish as needed.

			// Needed in case a new node joins.
			ByteArrayOutputStream baos = new ByteArrayOutputStream(
					clusteredStateRequest.getBuffer().length);
			DataOutputStream daos = new DataOutputStream(baos);
			// Add handler Name
			daos.writeUTF(clusteredStateRequest.getHandlerName());
			// buffer size
			daos.writeInt(clusteredStateRequest.getBuffer().length);
			daos.write(clusteredStateRequest.getBuffer());
			daos.flush();
			Message dataMessage = new Message(null, null, baos.toByteArray());
			this.memberContext.getGroupMember().multicastData(dataMessage);
			baos.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManagerService#multicast(com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManager#unicast(org.jgroups.Address, com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	public void unicast(Address destination,
			ClusteredStateRequest clusteredStateRequest) throws Exception {
		if (this.memberContext.getMemberInfo().isClustered()
				&& State.ACTIVE.equals(this.memberContext.getMemberInfo()
						.getState())
				&& this.memberContext.getGroupMember() != null) {
			// configuration multicast currently should only happen through the
			// master node which is in ACTIVE mode.

			// TODO byte arrays need not be kept in memory
			// mechanism required to persist the required on file
			// system and re-publish as needed.

			// Needed in case a new node joins.
			ByteArrayOutputStream baos = new ByteArrayOutputStream(
					clusteredStateRequest.getBuffer().length);
			DataOutputStream daos = new DataOutputStream(baos);
			// Add handler Name
			daos.writeUTF(clusteredStateRequest.getHandlerName());
			// buffer size
			daos.writeInt(clusteredStateRequest.getBuffer().length);
			daos.write(clusteredStateRequest.getBuffer());
			daos.flush();
			baos.close();
			Message dataMessage = new Message(destination, null, baos
					.toByteArray());
			this.memberContext.getGroupMember().multicastData(dataMessage);
		}
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManager#registerDataHandler(java.lang.String, com.headstrong.fusion.failover.request.data.ClusteredStateHandler)
	 */
	public void registerDataHandler(String handlerName,
			ClusteredStateHandler dataHandler) throws Exception {
		this.dataHandlers.put(handlerName, dataHandler);
		this.executePendingDataRequests(handlerName);
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManager#executePendingDataRequests(java.lang.String)
	 */
	public void executePendingDataRequests(String handlerName) throws Exception {
		if (this.pendingRequests.containsKey(handlerName)) {
			for (ClusteredStateRequest request : this.pendingRequests
					.get(handlerName)) {
				this.execute(handlerName, request);
				// FIXME :: should it be removed even if the execution failed.
				// Currently still in the queue.
				this.pendingRequests.get(handlerName).remove(request);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManager#getDataHandler(java.lang.String)
	 */
	public ClusteredStateHandler getDataHandler(String handlerName) {
		return this.dataHandlers.get(handlerName);
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManager#execute(java.lang.String, com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	public void execute(String handlerName,
			ClusteredStateRequest clusteredStateRequest) throws Exception {
		ClusteredStateHandler handler = this.dataHandlers.get(handlerName);
		if (handler != null) {
			handler.execute(clusteredStateRequest);
		} else {
			List<ClusteredStateRequest> pendingRequests = this.pendingRequests
					.get(handlerName);
			if (pendingRequests == null) {
				pendingRequests = new ArrayList<ClusteredStateRequest>();
				this.pendingRequests.put(handlerName, pendingRequests);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManager#synchronize(java.util.List)
	 */
	public void synchronize(List<Address> destination) throws Exception {
		// send a synchronize request to all the state handlers.
		for (ClusteredStateHandler stateHandler : this.dataHandlers.values()) {
			List<ClusteredStateRequest> requests = stateHandler.synchronize();
			if (requests != null) {
				for (ClusteredStateRequest request : requests) {
					this.multicast(request);
				}
			}
		}
	}
}
