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
 * $Id: ClusteredStateManagerImplTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 10, 2010 
 */

package com.headstrong.fusion.failover.request.data;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Stack;

import junit.framework.TestCase;

import org.jgroups.Address;
import org.jgroups.Message;
import org.jgroups.Receiver;
import org.jgroups.View;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.GroupMember;
import com.headstrong.fusion.failover.MemberContext;
import com.headstrong.fusion.failover.MemberInfo;
import com.headstrong.fusion.failover.State;

/**
 * {@link ClusteredStateManagerImpl} unit test class.
 */
public class ClusteredStateManagerImplTest extends TestCase {
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

	/**
	 * generates a sample message request
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws IOException
	 */
	private byte[] generateBuffer() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream daos = new DataOutputStream(baos);
		String definition = "definition";
		daos.writeInt(1);
		daos.writeUTF("7");
		daos.writeInt(definition.getBytes().length);
		daos.write(definition.getBytes());
		byte[] byteArray = baos.toByteArray();
		daos.close();
		baos.close();

		baos = new ByteArrayOutputStream();
		daos = new DataOutputStream(baos);

		daos.write(byteArray);

		byte[] b = baos.toByteArray();
		daos.close();
		baos.close();
		return b;
	}

	public void testMulticast() throws Exception {/*
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null).anyTimes();
		replay(contextMock);
		GroupMember member1 = createGroupMember(contextMock, "member1");
		GroupMember member2 = createGroupMember(contextMock, "member2");
		// start both the the members
		member1.start();
		member2.start();
		Stack<Object> data = new Stack<Object>();
		member2.getDataChannel().setReceiver(new DataMessageReceiver(data));
		// generate a clustered request
		ClusteredStateRequest request = new ClusteredStateRequest();
		request.setHandlerName("Handle");
		request.setBuffer(generateBuffer());
		member1.getClusteredStateManager().multicast(request);
		Thread.sleep(6000);
		// compare the data/
		assertEquals("definition", new String((byte[]) data.pop()));
		assertEquals("definition".length(), data.pop());
		assertEquals("7", data.pop());
		assertEquals(1, data.pop());

	*/}

	private GroupMember createGroupMember(BundleContext bundleContext,
			String memberName) throws Exception {
		MemberContext memberContext1 = new MemberContext(bundleContext);
		MemberInfo memberInfo = createMemberInfo();
		memberInfo.setMemberName(memberName);
		memberContext1.setMemberInfo(memberInfo);
		GroupMember member = new GroupMember(memberContext1);
		memberContext1.setGroupMember(member);
		return member;
	}

	private static class DataMessageReceiver implements Receiver {
		Stack<Object> data;

		public DataMessageReceiver(Stack<Object> data) {
			this.data = data;
		}

		@Override
		public byte[] getState() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void receive(Message message) {
			ByteArrayInputStream bios = new ByteArrayInputStream(message
					.getBuffer());
			try {
				DataInputStream dis = new DataInputStream(bios);
				data.push(dis.readInt());
				data.push(dis.readUTF());
				int byteArrLength = dis.readInt();
				data.push(byteArrLength);
				byte[] bArr = new byte[byteArrLength];
				dis.read(bArr);
				data.push(bArr);
				dis.close();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}

		@Override
		public void setState(byte[] arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void block() {
			// TODO Auto-generated method stub

		}

		@Override
		public void suspect(Address arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void viewAccepted(View arg0) {
			// TODO Auto-generated method stub

		}

	}
}
