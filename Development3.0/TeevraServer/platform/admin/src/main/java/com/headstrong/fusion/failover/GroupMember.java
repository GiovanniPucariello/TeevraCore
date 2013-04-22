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
 * $Id: DefaultFusionController.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 19, 2009 
 */

package com.headstrong.fusion.failover;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;

import org.jgroups.Address;
import org.jgroups.Channel;
import org.jgroups.ChannelClosedException;
import org.jgroups.ChannelException;
import org.jgroups.ChannelNotConnectedException;
import org.jgroups.JChannel;
import org.jgroups.MembershipListener;
import org.jgroups.Message;
import org.jgroups.MessageListener;
import org.jgroups.blocks.GroupRequest;
import org.jgroups.blocks.MessageDispatcher;
import org.jgroups.blocks.RequestHandler;
import org.jgroups.util.Rsp;
import org.jgroups.util.RspList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.exception.ClusterCommunicationException;
import com.headstrong.fusion.failover.request.control.ControlRequest;
import com.headstrong.fusion.failover.request.control.ControlRequestHandler;
import com.headstrong.fusion.failover.request.control.MemberInfoRequest;
import com.headstrong.fusion.failover.request.data.ClusteredStateManager;
import com.headstrong.fusion.failover.request.data.ClusteredStateManagerImpl;

/**
 * Controls the Fusion instance Fail-over.
 * 
 * GroupMember is the entry point for any communication with other Fusion
 * instances using JGroups. This is initialized only in case of clustered mode.
 * 
 */
public class GroupMember {

	private static final Logger logger = LoggerFactory
			.getLogger(GroupMember.class);

	/**
	 * Default cluster name to be used in case no name is specified.
	 */
	public static final String DEFAULT_CLUSTER_NAME = "default";

	/**
	 * Data Channel suffix.
	 */
	public static final String DATA_SUFFIX = "-DATA";

	/**
	 * Control Channel suffix.
	 */
	public static final String CONTROL_SUFFIX = "-CTRL";

	/**
	 * Java-Groups channel. Control messages are sent on this channel.
	 * 
	 */
	private JChannel controlChannel;

	/**
	 * data channel is used to send data to other members async.
	 */
	private JChannel dataChannel;

	/**
	 * Message dispatcher used to dispatch synchronous messages. Control
	 * Messages.
	 */
	private MessageDispatcher dispatcher;

	/**
	 * Cluster Manager manages information about all the nodes in the cluster.
	 */
	private ClusterManager clusterManager;

	/**
	 * Member Context.
	 */
	private MemberContext memberContext;
	/**
	 * Protocol stack property file.
	 */
	private URL propertyUrl;

	/**
	 * Clustered State Manager.
	 */
	private ClusteredStateManager clusteredStateManager;

	/**
	 * @param applicationContext
	 * @param cluster
	 */
	public GroupMember(MemberContext memberContext) {
		this.memberContext = memberContext;
		String propertyFile = memberContext.getBundleContext().getProperty(
				Properties.CLUSTER_COMM_PROTOCOL_FILE);
		if (propertyFile != null) {
			this.propertyUrl = memberContext.getBundleContext().getBundle()
					.getEntry(propertyFile);
		}
		this.setClusteredStateManager(new ClusteredStateManagerImpl(memberContext));
	}

	/**
	 * @return the channel
	 */
	public JChannel getControlChannel() {
		return controlChannel;
	}

	/**
	 * @param controlChannel
	 *            the channel to set
	 */
	public void setControlChannel(JChannel controlChannel) {
		this.controlChannel = controlChannel;
	}

	/**
	 * @return the dispatcher
	 */
	public MessageDispatcher getDispatcher() {
		return dispatcher;
	}

	/**
	 * @param dispatcher
	 *            the dispatcher to set
	 */
	public void setDispatcher(MessageDispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}

	/**
	 * Starts the J-Groups communication channel.
	 * 
	 * @throws Exception
	 */
	public void start() throws ClusterCommunicationException {
		if (logger.isInfoEnabled()) {
			logger.info("Starting Group Member.");
		}
		JChannel controlChannel = null;
		try {
			controlChannel = this.createControlChannel();
		} catch (ChannelException e) {
			throw new ClusterCommunicationException(
					"Error creating Control Channel", e);
		}
		// Create message dispatcher.
		MessageDispatcher dispatcher = this
				.createMessageDispatcher(controlChannel);

		try {
			controlChannel.connect(this.memberContext.getMemberInfo()
					.getClusterName()
					+ CONTROL_SUFFIX);
		} catch (ChannelException e) {
			throw new ClusterCommunicationException(
					"Error connecting to control channel.", e);
		}
		this.setDispatcher(dispatcher);
		this.setControlChannel(controlChannel);

		// once channel is connect set the local address.
		this.getClusterManager().setLocalAddress(
				this.getControlChannel().getLocalAddress());

		// update the local member info with cluster manager.
		this.getClusterManager().setLocalMemberInfo(
				this.getMemberContext().getMemberInfo());

		JChannel dataChannel = null;
		try {
			dataChannel = this.createDataChannel();
		} catch (ChannelException e) {
			throw new ClusterCommunicationException(
					"Error creating data channel.", e);
		}
		this.setDataChannel(dataChannel);
		try {
			this.getDataChannel().connect(
					this.memberContext.getMemberInfo().getClusterName()
							+ DATA_SUFFIX);
		} catch (ChannelException e) {
			throw new ClusterCommunicationException(
					"Error connecting to data channel.", e);
		}
	}

	/**
	 * Private utility method that creates a JGroups Channel.
	 * 
	 * @return {@link JChannel}
	 * @throws ChannelException
	 */
	private JChannel createControlChannel() throws ChannelException {
		JChannel channel = null;
		if (this.propertyUrl != null) {
			channel = new JChannel(this.propertyUrl);
		} else {
			channel = new JChannel();
		}
		channel.setOpt(Channel.LOCAL, Boolean.FALSE);
		logger.info("Control Channel created.");
		return channel;
	}

	/**
	 * Private utility method that creates a JGroups Channel.
	 * 
	 * @return {@link JChannel}
	 * @throws ChannelException
	 */
	private JChannel createDataChannel() throws ChannelException {
		JChannel channel = null;
		if (this.propertyUrl != null) {
			channel = new JChannel(this.propertyUrl);
		} else {
			channel = new JChannel();
		}
		channel.setOpt(Channel.LOCAL, Boolean.FALSE);
		channel.setReceiver(new DataMessageReceiver(this));
		logger.info("Data Channel created.");
		return channel;
	}

	/**
	 * Creates a Message Dispatcher.
	 * 
	 * @precondition ( channel != null )
	 * @param channel
	 *            JGroups channel ( {@link JChannel} ).
	 * @return {@link MessageDispatcher} utility class used to dispatch
	 *         synchronous messages to other nodes in the cluster.
	 */
	private MessageDispatcher createMessageDispatcher(Channel channel) {
		// Message Listener.
		MessageListener messageListener = new ControlMessageListener();
		// Request Handler.
		RequestHandler requestHandler = new ControlRequestHandler(this
				.getMemberContext());

		// Create cluster Manager.
		ClusterManager clusterManager = new ClusterManager();
		this.clusterManager = clusterManager;

		// Membership Listener.
		MembershipListener memberShipListener = new GroupMembershipListener(
				this);

		// Message Dispatcher.
		MessageDispatcher dispatcher = new MessageDispatcher(channel,
				messageListener, memberShipListener, requestHandler, true);
		return dispatcher;
	}

	/**
	 * Multicasts the message to all the fusion nodes in the cluster. So the
	 * runtime node has to send membership request to the cluster before it can
	 * get any control multicast. esp. required in case of UI connecting to
	 * control channel.
	 * 
	 * 
	 * @param request
	 *            Control request.
	 * @param sync
	 *            is the request type is synchronous.
	 * @return Return values if sync is true. Will be null if sync is false.
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<Object> multicastControl(ControlRequest request, boolean sync)
			throws Exception {
		if (logger.isTraceEnabled()) {
			logger.trace(this + " multicasting " + request
					+ " to control channel, sync=" + sync);
		}
		Message message = request.getMessage();
		RspList rspList = null;
		rspList = this.getDispatcher().castMessage(null, message,
				sync ? GroupRequest.GET_ALL : GroupRequest.GET_NONE, 100);
		List<Object> values = null;
		if (sync) {
			Iterator<Rsp> iter = rspList.values().iterator();
			values = new ArrayList<Object>();
			while (iter.hasNext()) {
				Rsp rsp = iter.next();
				values.add(rsp.getValue());
				if (!rsp.wasReceived()) {
					throw new IllegalStateException(this
							+ " response not received from " + rsp.getSender()
							+ " - there may be others");
				}
			}
		}
		return values;
	}

	public Object unicastControl(Address address, ControlRequest request,
			boolean sync) throws Exception {
		if (logger.isTraceEnabled()) {
			logger.trace(this + " multicasting " + request
					+ " to control channel, sync=" + sync);
		}
		Message message = request.getMessage();
		RspList rspList = null;
		Vector<Address> destination = new Vector<Address>();
		destination.add(address);
		try {
			rspList = this.getDispatcher().castMessage(destination, message,
					sync ? GroupRequest.GET_ALL : GroupRequest.GET_NONE, 100);
		} catch (Exception e) {
			logger.error("Error while casting message.", e);
			throw e;
		}
		Object value = null;
		if (sync) {
			// TODO single response expected.
			Iterator<Rsp> iter = rspList.values().iterator();
			while (iter.hasNext()) {
				Rsp rsp = iter.next();
				value = rsp.getValue();
				if (!rsp.wasReceived()) {
					throw new IllegalStateException(this
							+ " response not received from " + rsp.getSender()
							+ " - there may be others");
				}
			}
		}
		return value;
	}

	/**
	 * Publishes data to all the view members.
	 * 
	 * @param message
	 * @throws ChannelClosedException
	 * @throws ChannelNotConnectedException
	 */
	public void multicastData(Message message)
			throws ChannelNotConnectedException, ChannelClosedException {
		this.getDataChannel().send(message);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		if (controlChannel != null && controlChannel.isOpen()) {
			controlChannel.close();
		}
		super.finalize();
	}

	/*
	 * This class is used to manage state on the control channel TODO :: Pending
	 * implementation.
	 * 
	 */
	private class ControlMessageListener implements MessageListener {

		public byte[] getState() {
			// TODO Auto-generated method stub
			return null;
		}

		public void receive(Message msg) {
			// TODO
		}

		public void setState(byte[] state) {
			// TODO Auto-generated method stub
		}
	}

	/**
	 * @return the memberContext
	 */
	public MemberContext getMemberContext() {
		return memberContext;
	}

	/**
	 * @param memberInfo
	 *            the memberContext to set
	 */
	public void setMemberContext(MemberContext memberContext) {
		this.memberContext = memberContext;
	}

	/**
	 * @return the clusterManager
	 */
	public ClusterManager getClusterManager() {
		return clusterManager;
	}

	/**
	 * @param clusterManager
	 *            the clusterManager to set
	 */
	public void setClusterManager(ClusterManager clusterManager) {
		this.clusterManager = clusterManager;
	}

	@SuppressWarnings("unchecked")
	public void updateCluster() throws Exception {
		// Return local Member information.
		MemberInfoRequest memberInfoRequest = new MemberInfoRequest();
		List<Map<Address, MemberInfo>> addressToMemberInfoList = (List) this
				.multicastControl(memberInfoRequest, true);
		for (Map<Address, MemberInfo> addressToMemberInfo : addressToMemberInfoList) {
			for (Entry<Address, MemberInfo> entry : addressToMemberInfo
					.entrySet()) {
				this.getClusterManager().setMemberInfo(entry.getKey(),
						entry.getValue());
			}
		}

	}

	/**
	 * @return the dataChannel
	 */
	public JChannel getDataChannel() {
		return dataChannel;
	}

	/**
	 * @param dataChannel
	 *            the dataChannel to set
	 */
	public void setDataChannel(JChannel dataChannel) {
		this.dataChannel = dataChannel;
	}

	/**
	 * @return the clusteredStateManager
	 */
	public ClusteredStateManager getClusteredStateManager() {
		return clusteredStateManager;
	}

	/**
	 * @param clusteredStateManager
	 *            the clusteredStateManager to set
	 */
	public void setClusteredStateManager(
			ClusteredStateManager clusteredStateManager) {
		this.clusteredStateManager = clusteredStateManager;
	}

	public void stop() {
		this.getControlChannel().disconnect();
		this.getDataChannel().disconnect();
		this.getDispatcher().stop();
		
	}
}
