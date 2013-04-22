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
 * $Id: ControlRequestHandlerTest.java
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

import org.jgroups.Address;
import org.jgroups.Message;
import org.jgroups.stack.IpAddress;
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
public class ControlRequestHandlerTest extends TestCase {
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

	public void testHandle() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null).anyTimes();
		replay(contextMock);
		MemberContext memberContext1 = new MemberContext(contextMock);
		memberContext1.setMemberInfo(createMemberInfo());

		GroupMember member1 = new GroupMember(memberContext1);
		memberContext1.setGroupMember(member1);

		member1.setClusterManager(new ClusterManager());

		/**
		 * change the handler for testing purpose
		 */
		member1.start();

		MemberInfo memberInfo2 = createMemberInfo();
		memberInfo2.setNodeType(Properties.MEMBER_SLAVE_NODE_TYPE);
		memberInfo2.setMemberName("member2");

		MemberRegistrationRequest request = new MemberRegistrationRequest();
		request.setMemberInfo(memberInfo2);

		Message message = request.getMessage();
		Address address = new IpAddress("10.200.41.12", 77);
		message.setSrc(address);
		MemberInfo memberInfox = createMemberInfo();
		memberInfox.setMemberName("memberx");

		member1.getClusterManager().setMemberInfo(address, memberInfox);
		member1.getDispatcher().handle(message);
		Thread.sleep(2000);
		assertEquals("member2", member1.getClusterManager().getMemberInfo(
				address).getMemberName());

		member1.stop();
	}
}
