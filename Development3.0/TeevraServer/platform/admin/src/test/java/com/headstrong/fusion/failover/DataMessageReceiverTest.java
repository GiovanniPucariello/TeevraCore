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
 * $Id: DataMessageReceiverTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 30, 2010 
 */

package com.headstrong.fusion.failover;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Stack;

import junit.framework.TestCase;

import org.jgroups.Address;
import org.jgroups.Message;
import org.jgroups.View;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.request.data.ClusteredStateHandler;
import com.headstrong.fusion.failover.request.data.ClusteredStateManager;
import com.headstrong.fusion.failover.request.data.ClusteredStateRequest;

/**
 * {@link DataMessageReceiver} test class.
 */
public class DataMessageReceiverTest extends TestCase {

	public void testGetState() throws Exception {
		DataMessageReceiver receiver = new DataMessageReceiver(null);
		assertNull(receiver.getState());
	}

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

		daos.writeUTF("Handler");
		daos.writeInt(byteArray.length);
		daos.write(byteArray);

		byte[] b = baos.toByteArray();
		daos.close();
		baos.close();
		return b;
	}

	/**
	 * Tests a receive message.
	 * 
	 * @throws Exception
	 */
	public void testReceive() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null);
		replay(contextMock);
		MemberContext memberContext = new MemberContext(contextMock);

		GroupMember member = new GroupMember(memberContext);
		Stack<Object> data = new Stack<Object>();
		member
				.setClusteredStateManager(new ClusteredStateManagerTestImpl(
						data));

		DataMessageReceiver receiver = new DataMessageReceiver(member);

		Message message = new Message();
		message.setBuffer(generateBuffer());

		receiver.receive(message);

		assertEquals("definition", new String((byte[]) data.pop()));
		assertEquals("definition".getBytes().length, data.pop());
		assertEquals("7", data.pop());
		assertEquals(1, data.pop());
		assertEquals("Handler", data.pop());
	}

	/**
	 * Test the try block throwing {@link IOException}
	 * 
	 * @throws Exception
	 */
	public void testRecieveIOException() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null);
		replay(contextMock);
		MemberContext memberContext = new MemberContext(contextMock);

		GroupMember member = new GroupMember(memberContext);
		Stack<Object> data = new Stack<Object>();
		member
				.setClusteredStateManager(new ClusteredStateManagerExceptionSimulator(
						data, new IOException("test io exception")));

		DataMessageReceiver receiver = new DataMessageReceiver(member);

		Message message = new Message();

		message.setBuffer(generateBuffer());
		try {
			receiver.receive(message);
		} catch (IllegalStateException ex) {
			assertEquals("test io exception", ex.getCause().getMessage());
			return;
		}

		fail();
	}

	/**
	 * Test try block throwing Exception
	 * 
	 * @throws Exception
	 */
	public void testReceiveException() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null);
		replay(contextMock);
		MemberContext memberContext = new MemberContext(contextMock);

		GroupMember member = new GroupMember(memberContext);
		Stack<Object> data = new Stack<Object>();
		member
				.setClusteredStateManager(new ClusteredStateManagerExceptionSimulator(
						data, new Exception("test exception")));

		DataMessageReceiver receiver = new DataMessageReceiver(member);

		Message message = new Message();

		message.setBuffer(generateBuffer());
		try {
			receiver.receive(message);
		} catch (IllegalStateException ex) {
			assertEquals("test exception", ex.getCause().getMessage());
			return;
		}

		fail();
	}

	/**
	 * Tests viewAccepted
	 * 
	 * @throws Exception
	 */
	public void testViewAccepted() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		expect(contextMock.getProperty(Properties.CLUSTER_COMM_PROTOCOL_FILE))
				.andReturn(null);
		replay(contextMock);
		MemberContext memberContext = new MemberContext(contextMock);
		memberContext.setMemberInfo(createMemberInfo());
		GroupMember member = new GroupMember(memberContext);
		DataMessageReceiver receiver = new DataMessageReceiver(member);
		receiver.viewAccepted(new View());
	}

	private static class ClusteredStateManagerTestImpl implements
			ClusteredStateManager {

		private Stack<Object> data;

		public ClusteredStateManagerTestImpl(Stack<Object> data) {
			this.data = data;
		}

		@Override
		public void execute(String handlerName,
				ClusteredStateRequest clusteredStateRequest) throws Exception {
			data.push(handlerName);
			ByteArrayInputStream bais = new ByteArrayInputStream(
					clusteredStateRequest.getBuffer());
			DataInputStream dais = new DataInputStream(bais);

			data.push(dais.readInt());
			data.push(dais.readUTF());
			int bufferLength = dais.readInt();
			data.push(bufferLength);
			byte[] definition = new byte[bufferLength];
			dais.read(definition);
			data.push(definition);
		}

		@Override
		public void executePendingDataRequests(String handlerName)
				throws Exception {
			// TODO Auto-generated method stub

		}

		@Override
		public ClusteredStateHandler getDataHandler(String handlerName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void multicast(ClusteredStateRequest clusteredStateRequest)
				throws Exception {
			// TODO Auto-generated method stub

		}

		@Override
		public void registerDataHandler(String handlerName,
				ClusteredStateHandler dataHandler) throws Exception {
			// TODO Auto-generated method stub

		}

		@Override
		public void synchronize(List<Address> destination) throws Exception {
			// TODO Auto-generated method stub

		}

		@Override
		public void unicast(Address destination,
				ClusteredStateRequest clusteredStateRequest) throws Exception {
			// TODO Auto-generated method stub

		}

	}

	public static class ClusteredStateManagerExceptionSimulator extends
			ClusteredStateManagerTestImpl {
		private Exception ex;

		public ClusteredStateManagerExceptionSimulator(Stack<Object> data,
				Exception ex) {
			super(data);
			this.ex = ex;
		}

		@Override
		public void execute(String handlerName,
				ClusteredStateRequest clusteredStateRequest) throws Exception {
			throw ex;
		}

	}
}
