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
 * $Id: SelfActivationRequestTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 10, 2010 
 */

package com.headstrong.fusion.failover.request.control;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.Date;

import junit.framework.TestCase;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.ClusterManager;
import com.headstrong.fusion.failover.GroupMember;
import com.headstrong.fusion.failover.MemberContext;
import com.headstrong.fusion.failover.MemberInfo;
import com.headstrong.fusion.failover.State;

/**
 * 
 */
public class SelfActivationRequestTest extends TestCase {
	private MemberInfo createMemberInfo() throws Exception {
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setClustered(true);
		memberInfo.setClusterId(1);
		memberInfo.setClusterName("cluster");
		memberInfo.setConnectorUrl("url");
		memberInfo.setMemberName("member");
		memberInfo.setNodeType(Properties.MEMBER_MASTER_NODE_TYPE);
		memberInfo.setStartTime(new Date());
		memberInfo.setState(State.ACTIVE);
		return memberInfo;

	}

	public void testGetType() throws Exception {
		SelfActivationRequest request = new SelfActivationRequest();
		assertEquals(Request.SELF_ACTIVATION_REQUEST, request.getType());
	}

	public void testGetMessage() throws Exception {
		SelfActivationRequest request = new SelfActivationRequest();
		assertEquals(Request.SELF_ACTIVATION_REQUEST, request.getMessage()
				.getFlags());
	}

	public void testHandle() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null);
		replay(contextMock);
		MemberContext memberContext = new MemberContext(contextMock);
		memberContext.setMemberInfo(createMemberInfo());

		GroupMember member = new GroupMember(memberContext);
		ClusterManager clusterManager = new ClusterManager();
		memberContext.setGroupMember(member);
		member.setClusterManager(clusterManager);
		SelfActivationRequest request = new SelfActivationRequest();
		request.setMemberInfo(memberContext.getMemberInfo());
		assertFalse((Boolean) request.handle(memberContext));

	}
}
