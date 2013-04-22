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
 * $Id: ControlRequest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 22, 2009 
 */

package com.headstrong.fusion.failover.request.control;

import java.util.HashMap;
import java.util.Map;

import org.jgroups.Address;
import org.jgroups.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.MemberContext;

/**
 * Control request represents request messages sent over the control channel.
 * mostly for node activation/de-activation etc.
 */
public abstract class ControlRequest implements Request {
	private static final Map<Byte, Class<? extends ControlRequest>> requestMap = new HashMap<Byte, Class<? extends ControlRequest>>();
	private static final Logger logger = LoggerFactory
			.getLogger(ControlRequest.class);
	private Address sourceAddress;

	static {
		requestMap.put(SELF_ACTIVATION_REQUEST, SelfActivationRequest.class);
		requestMap.put(MEMBER_REGISTRATION_REQUEST,
				MemberRegistrationRequest.class);
		requestMap.put(MEMBER_INFO_REQUEST, MemberInfoRequest.class);
	}

	public static ControlRequest getReqest(Message message) {
		ControlRequest request = null;
		try {
			request = requestMap.get(message.getFlags()).newInstance();
			try {
				request.read(message);
			} catch (Exception e) {
				logger.error("Error creating the request.", e);
				IllegalStateException e2 = new IllegalStateException(e
						.getMessage());
				e2.setStackTrace(e.getStackTrace());
				throw e2;
			}
		} catch (InstantiationException e) {
			logger.error("Error creating the request.", e);
			IllegalStateException e2 = new IllegalStateException(e.getMessage());
			e2.setStackTrace(e.getStackTrace());
			throw e2;
		} catch (IllegalAccessException e) {
			logger.error("Error creating the request.", e);
			IllegalStateException e2 = new IllegalStateException(e.getMessage());
			e2.setStackTrace(e.getStackTrace());
			throw e2;
		}
		return request;
	}

	/**
	 * Handles a control request received by other application instances.
	 * 
	 * @param applicationContext
	 * @return Response that'll be sent back to the sender instance if the call
	 *         is synchronous.
	 * @throws Exception
	 *             Exception has to handled locally.
	 */
	abstract Object handle(MemberContext memberContext) throws Exception;

	/**
	 * Control request type . Required while handling the request received by
	 * the {@link ControlRequestHandler}.
	 * {@link Message#getFlags()) is checked to  determine the request type.
	 * 
	 * @return request type.
	 */
	public abstract byte getType();

	/**
	 * @return the sourceAddress
	 */
	Address getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * @param sourceAddress
	 *            the sourceAddress to set
	 */
	void setSourceAddress(Address sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
}
