package com.headstrong.fusion.failover;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jgroups.Address;
import org.jgroups.Message;
import org.jgroups.Receiver;
import org.jgroups.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.request.data.ClusteredStateManager;
import com.headstrong.fusion.failover.request.data.ClusteredStateRequest;

/**
 * Fusion Admin component creates the data channel with this class as the
 * receiver. Any message sent to the nodes in the cluster over the data channel
 * will be received by {@link DataMessageReceiver}.
 * 
 */
public class DataMessageReceiver implements Receiver {

	private static final Logger logger = LoggerFactory
			.getLogger(DataMessageReceiver.class);
	private GroupMember groupMember;

	/**
	 * Current active Jgroups view of the cluster. This is updated whenever a
	 * view change request is received by the data receiver.
	 */
	private View currentView;

	/**
	 * Default constructor.
	 * 
	 * @param groupMember
	 */
	public DataMessageReceiver(GroupMember groupMember) {
		this.groupMember = groupMember;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jgroups.MessageListener#getState()
	 */
	/**
	 * Not is use.
	 */
	public byte[] getState() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jgroups.MessageListener#receive(org.jgroups.Message)
	 */
	/**
	 * When the instance receives a data message it checks for the handler name
	 * and sends the execute request to {@link ClusteredStateManager}.
	 * 
	 */
	public void receive(Message dataMessage) {
		if ( logger.isDebugEnabled() ) {
			logger.debug("Data messgae received." + dataMessage);
		}
		
		// generate ManagedState Request.
		ByteArrayInputStream bais = new ByteArrayInputStream(dataMessage
				.getBuffer());
		DataInputStream dais = new DataInputStream(bais);
		String handlerName = null;
		ClusteredStateRequest request = null;
		try {
			request = new ClusteredStateRequest();
			handlerName = dais.readUTF();
			// Though its not required.
			request.setHandlerName(handlerName);
			// buffer size is the second field.
			byte[] buffer = new byte[dais.readInt()];
			// Reads the remaining byte array into the byte buffer
			dais.read(buffer);
			request.setBuffer(buffer);
			// Close the Data input stream
			dais.close();
			this.groupMember.getClusteredStateManager().execute(handlerName,
					request);
		} catch (IOException e) {
			logger.error("Error reading the data message.", e);
			// FIXME
			throw new IllegalStateException(e);
		} catch (Exception e) {
			logger.error("Error reading the data message.", e);
			// FIXME
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Dont need implementation now.
	 */
	public void setState(byte[] state) {
		// TODO Auto-generated method stub
	}

	public void block() {
		// TODO Auto-generated method stub
	}

	public void suspect(Address suspected_mbr) {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jgroups.MembershipListener#viewAccepted(org.jgroups.View)
	 */
	/**
	 * Whenever the view changes every node receives a view change notification.
	 * This method is invoked on the view change. This method sends sends a
	 * synchronize request to all the nodes in the cluster if current node is
	 * Master.
	 */
	public void viewAccepted(View new_view) {
		if (logger.isDebugEnabled()) {
			logger.debug("Cluster view changed. new view is " + new_view);
		}
		MemberInfo memberInfo = this.groupMember.getMemberContext()
				.getMemberInfo();
		System.out.println("Member Information is :" + memberInfo.toString());
		if (memberInfo.getNodeType().equalsIgnoreCase(
				Properties.MEMBER_MASTER_NODE_TYPE)
				&& (memberInfo.getState().equals(State.ACTIVE) || memberInfo
						.getState().equals(State.RUNNING))) {
			try {
				List<Address> addedMembers = this.getAddedMembers(new_view);
				this.groupMember.getClusteredStateManager().synchronize(
						addedMembers);
			} catch (Exception e) {
				logger.error("Error sending sync data request.", e);
				// FIXME
			}
		}

		this.currentView = new_view;
	}

	/**
	 * Private utility method that takes latest view received by the message
	 * receiver and returns the address of the newly added members by comparing
	 * it with the last view.
	 * 
	 * @param new_view
	 *            Latest view received.
	 * @return List of added members.
	 */
	private List<Address> getAddedMembers(View new_view) {
		List<Address> addedMembers = new ArrayList<Address>();
		if (currentView != null) {
			for (Address address : new_view.getMembers()) {
				if (!currentView.getMembers().contains(address)) {
					addedMembers.add(address);
				}
			}
		}
		return addedMembers;
	}

	/**
	 * **************
	 * 
	 */
}
