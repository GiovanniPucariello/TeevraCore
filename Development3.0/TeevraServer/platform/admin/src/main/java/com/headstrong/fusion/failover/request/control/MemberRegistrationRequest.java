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
 * $Id: MemberRegistrationRequest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 23, 2009 
 */

package com.headstrong.fusion.failover.request.control;

import org.jgroups.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.ClusterManager;
import com.headstrong.fusion.failover.MemberContext;
import com.headstrong.fusion.failover.MemberInfo;

/**
 * Any new member after joining the group would register the member with the
 * cluster sending relevant information to the group.
 * 
 */
public class MemberRegistrationRequest extends ControlRequest {

	private static Logger logger = LoggerFactory
			.getLogger(MemberRegistrationRequest.class);
	/**
	 * Member Information.
	 */
	private MemberInfo memberInfo;

	@Override
	public byte getType() {
		return MEMBER_REGISTRATION_REQUEST;
	}

	@SuppressWarnings("unchecked")
	@Override
	Object handle(MemberContext memberContext) throws Exception {
		if (logger.isInfoEnabled()) {
			logger.info("MemberRegistrationRequest received ." + memberInfo);
		}
		ClusterManager clusterManager = memberContext.getGroupMember()
				.getClusterManager();
		// Update the member info.
		clusterManager.setMemberInfo(this.getSourceAddress(), memberInfo);
		return memberContext.getMemberInfo();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.failover.request.Request#getMessage()
	 */
	public Message getMessage() throws Exception {
		Message message = new Message();
		message.setFlag(this.getType());
		message.setObject(memberInfo);
		return message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.failover.request.Request#read(org.jgroups.Message)
	 */
	public void read(Message message) throws Exception {
		this.setSourceAddress(message.getSrc());
		this.setMemberInfo((MemberInfo) message.getObject());
	}

	/**
	 * @return the memberInfo
	 */
	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	/**
	 * @param memberInfo
	 *            the memberInfo to set
	 */
	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}
}
