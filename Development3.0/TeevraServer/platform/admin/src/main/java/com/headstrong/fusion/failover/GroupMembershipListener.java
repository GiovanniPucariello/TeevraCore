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
 * $Id: GroupMembershipListener.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 21, 2009 
 */

package com.headstrong.fusion.failover;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jgroups.Address;
import org.jgroups.MembershipListener;
import org.jgroups.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.request.control.SelfActivationRequest;

/**
 * Receives notification on group membership changes.
 */
public class GroupMembershipListener implements MembershipListener {

	private static Logger logger = LoggerFactory
			.getLogger(GroupMembershipListener.class);
	/**
	 * Cluster Manager.
	 */
	private GroupMember groupMember;

	public GroupMembershipListener(GroupMember groupMember) {
		this.groupMember = groupMember;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jgroups.MembershipListener#block()
	 */
	public void block() {
		// TODO Auto-generated method stub
		// TODO Fill in.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jgroups.MembershipListener#suspect(org.jgroups.Address)
	 */
	public void suspect(Address suspected_mbr) {
		// TODO Auto-generated method stub
		// TODO Fill in.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jgroups.MembershipListener#viewAccepted(org.jgroups.View)
	 */
	public void viewAccepted(View latestView) {
		// check if some members have been dropped as part of the view change.
		// or is it just addition of new views
		List<MemberInfo> droppedMembers = this.getDroppedMembers(latestView);
		if (droppedMembers != null && !droppedMembers.isEmpty()) {
			this.getGroupMember().getClusterManager().updateCluster(latestView);
			// check if the master is alive.
			if (this.isActivationRequired(latestView)) {
				// asynchronously handle the activation request.
				// A separate thread is required as in the same thread if
				// the sync request is sent it waits forever.
				ActivationHandler activationHandler = new ActivationHandler(
						this.getGroupMember());
				activationHandler.start();
			}
		} else {
			this.getGroupMember().getClusterManager().updateCluster(latestView);
		}
		logger.info("Current Cluster is \n"
				+ this.getGroupMember().getClusterManager().toString());

	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param latestView
	 * @return
	 */
	public List<MemberInfo> getDroppedMembers(View latestView) {
		List<MemberInfo> droppedMembers = new ArrayList<MemberInfo>();
		Map<Address, MemberInfo> members = this.groupMember.getClusterManager()
				.getMembers();
		for (Address address : members.keySet()) {
			if (!latestView.containsMember(address)) {
				droppedMembers.add(members.get(address));
			}
		}
		return droppedMembers;
	}

	/**
	 * View contains list of all the connected members in the cluster. By
	 * default the strategy is to start the first member in the view but as
	 * there might be other members which are not the core runtime but connected
	 * to this cluster ( e.g. User Interface ).So the first core runtime member
	 * need to be started.
	 * <p>
	 * It first finds out the first core runtime member of the view and then it
	 * checks the local address if that is same as this member address it
	 * returns true or false.
	 * 
	 * @param latestView
	 * @return
	 */
	public boolean isActivationRequired(View latestView) {
		boolean activationRequired = false;
		if (!this.getGroupMember().getClusterManager().isMasterAlive()) {
			Map<Address, MemberInfo> members = this.groupMember
					.getClusterManager().getMembers();
			Address toBeActivated = null;
			for (Address address : latestView.getMembers()) {
				if (members.containsKey(address)) {
					toBeActivated = address;
					break;
				}
			}
			if (toBeActivated != null
					&& toBeActivated.equals(this.getGroupMember()
							.getClusterManager().getLocalAddress())) {
				activationRequired = true;
			}
		}
		return activationRequired;
	}

	/**
	 * @return the groupMember
	 */
	public GroupMember getGroupMember() {
		return groupMember;
	}

	/**
	 * @param groupMember
	 *            the groupMember to set
	 */
	public void setGroupMember(GroupMember groupMember) {
		this.groupMember = groupMember;
	}

	/**
	 * Activation Handler creates a separate thread to send a self activation
	 * request to all other instances. If all positive responses are received it
	 * sets the state of the server as ACTIVE.
	 * 
	 */
	private class ActivationHandler extends Thread {
		private GroupMember groupMember;

		public ActivationHandler(GroupMember groupMember) {
			this.groupMember = groupMember;
		}

		public void run() {
			if (logger.isInfoEnabled()) {
				logger.info("Master not responding, sending self "
						+ "activation request to rest of the members");
			}
			SelfActivationRequest request = new SelfActivationRequest();
			List<Object> responses = null;
			try {
				responses = this.getGroupMember().multicastControl(request,
						true);
			} catch (Exception e) {
				logger
						.error(
								"Error while multicasting the self activation message.",
								e);
				throw new IllegalStateException(e);
			}
			if (!responses.contains(Boolean.FALSE)) {
				try {
					// Set the Member state as Running.
					this.getGroupMember().getMemberContext().getMemberInfo()
							.setNodeType(Properties.MEMBER_MASTER_NODE_TYPE);
					this
							.getGroupMember()
							.getMemberContext()
							.getMemberInfo()
							.setState(
									com.headstrong.fusion.failover.State.ACTIVE);
				} catch (Exception e) {
					logger.error("Error bootstrapping the node.", e);
					throw new IllegalStateException(e);
				}
			} else {
				// need strategy of conflict management.
			}
		}

		/**
		 * @return the groupMember
		 */
		public GroupMember getGroupMember() {
			return groupMember;
		}

		/**
		 * @param groupMember
		 *            the groupMember to set
		 */
		public void setGroupMember(GroupMember groupMember) {
			this.groupMember = groupMember;
		}

	}
}
