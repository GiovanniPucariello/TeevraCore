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
 * $Id: GroupMemberTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 10, 2010 
 */

package com.headstrong.fusion.failover;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.jgroups.Message;
import org.jgroups.blocks.RequestHandler;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.request.control.MemberRegistrationRequest;

/**
 * {@link GroupMember} unit test class.
 */
public class GroupMemberTest extends TestCase {

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

	public void testStart() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null);
		replay(contextMock);
		MemberContext memberContext = new MemberContext(contextMock);
		memberContext.setMemberInfo(createMemberInfo());

		GroupMember member = new GroupMember(memberContext);
		member.start();
		assertNotNull(member.getControlChannel());
		assertNotNull(member.getDataChannel());
		assertNotNull(member.getDispatcher());
		assertNotNull(member.getMemberContext());
		assertNotNull(member.getClusteredStateManager());
		assertNotNull(member.getClusterManager());
		member.stop();
	}

	public void testMultiCastControl() throws Exception {
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
		List<Message> messages = new ArrayList<Message>();
		RequestHandler requestHandler = new RequestHandlerImpl(messages);
		member1.getDispatcher().setRequestHandler(requestHandler);

		MemberInfo memberInfo2 = createMemberInfo();
		memberInfo2.setNodeType(Properties.MEMBER_SLAVE_NODE_TYPE);
		memberInfo2.setMemberName("member2");

		MemberContext memberContext2 = new MemberContext(contextMock);
		memberContext2.setMemberInfo(memberInfo2);

		GroupMember member2 = new GroupMember(memberContext2);
		memberContext2.setGroupMember(member2);

		member2.setClusterManager(new ClusterManager());
		member2.start();

		MemberRegistrationRequest request = new MemberRegistrationRequest();
		request.setMemberInfo(memberInfo2);

		member2.multicastControl(request, true);

		Thread.sleep(2000);
		Message message = messages.get(0);
		assertNotNull(message);
		MemberRegistrationRequest req = (MemberRegistrationRequest) MemberRegistrationRequest
				.getReqest(message);
		assertEquals("member2", req.getMemberInfo().getMemberName());

		member1.stop();
		member2.stop();

	}

	public void testUniCastControl() throws Exception {
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
		List<Message> messages = new ArrayList<Message>();
		RequestHandler requestHandler = new RequestHandlerImpl(messages);
		member1.getDispatcher().setRequestHandler(requestHandler);

		MemberInfo memberInfo2 = createMemberInfo();
		memberInfo2.setNodeType(Properties.MEMBER_SLAVE_NODE_TYPE);
		memberInfo2.setMemberName("member2");

		MemberContext memberContext2 = new MemberContext(contextMock);
		memberContext2.setMemberInfo(memberInfo2);

		GroupMember member2 = new GroupMember(memberContext2);
		memberContext2.setGroupMember(member2);

		member2.setClusterManager(new ClusterManager());
		member2.start();

		MemberRegistrationRequest request = new MemberRegistrationRequest();
		request.setMemberInfo(memberInfo2);

		member2.unicastControl(member1.getControlChannel().getLocalAddress(),
				request, true);

		Thread.sleep(2000);
		Message message = messages.get(0);
		assertNotNull(message);
		MemberRegistrationRequest req = (MemberRegistrationRequest) MemberRegistrationRequest
				.getReqest(message);
		assertEquals("member2", req.getMemberInfo().getMemberName());

		member1.stop();
		member2.stop();

	}

	private static class RequestHandlerImpl implements RequestHandler {
		private List<Message> messages;

		public RequestHandlerImpl(List<Message> messages) {
			this.messages = messages;
		}

		@Override
		public Object handle(Message arg0) {
			messages.add(arg0);
			return null;
		}
	}
}
