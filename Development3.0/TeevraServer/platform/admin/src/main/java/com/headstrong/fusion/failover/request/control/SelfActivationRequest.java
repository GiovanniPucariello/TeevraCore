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
 * $Id: SelfActivationRequest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 22, 2009 
 */

package com.headstrong.fusion.failover.request.control;

import org.jgroups.Message;

import com.headstrong.fusion.failover.MemberContext;
import com.headstrong.fusion.failover.MemberInfo;
import com.headstrong.fusion.failover.State;

/**
 * Node sends a Activation request to all the other nodes if it decides to
 * self-activate.
 * 
 */
public class SelfActivationRequest extends ControlRequest {

	private MemberInfo memberInfo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.failover.request.ControlRequest#handle()
	 */
	@Override
	Object handle(MemberContext memberContext) throws Exception {
		// If the application is in stand-by mode.
		MemberInfo localMemberInfo = memberContext.getMemberInfo();
		// Either the startup is incomplete.
		if (localMemberInfo != null
				&& localMemberInfo.getState().equals(State.STANDBY)) {
			// set the master information.
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.failover.request.Request#getMessage()
	 */
	public Message getMessage() throws Exception {
		Message message = new Message();
		message.setFlag(this.getType());
		return message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.failover.request.Request#read(org.jgroups.Message)
	 */
	public void read(Message message) throws Exception {
		this.setSourceAddress(message.getSrc());
		// Do nothing..
		this.memberInfo = (MemberInfo) message.getObject();
	}

	@Override
	public byte getType() {
		return SELF_ACTIVATION_REQUEST;
	}

	/**
	 * @return the memberInfo
	 */
	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	/**
	 * @param memberInfo the memberInfo to set
	 */
	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}
}
