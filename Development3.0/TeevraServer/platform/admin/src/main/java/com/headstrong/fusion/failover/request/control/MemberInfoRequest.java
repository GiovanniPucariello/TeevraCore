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

import java.util.HashMap;
import java.util.Map;

import org.jgroups.Address;
import org.jgroups.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.MemberContext;
import com.headstrong.fusion.failover.MemberInfo;

/**
 * Any new member after joining the group would register the member with the
 * cluster sending relevant information to the group.
 * 
 */
public class MemberInfoRequest extends ControlRequest {

	private static Logger logger = LoggerFactory
			.getLogger(MemberInfoRequest.class);

	@Override
	public byte getType() {
		return MEMBER_INFO_REQUEST;
	}

	@Override
	Object handle(MemberContext memberContext) throws Exception {
		if (logger.isInfoEnabled()) {
			logger.info("MemberInfoRequest received .");
		}
		// Return local Member information.
		// create map of address v/s member info
		Map<Address, MemberInfo> addressToMemberInfo = new HashMap<Address, MemberInfo>();

		addressToMemberInfo.put(memberContext.getGroupMember()
				.getClusterManager().getLocalAddress(), memberContext
				.getMemberInfo());
		return addressToMemberInfo;
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
	}

}
