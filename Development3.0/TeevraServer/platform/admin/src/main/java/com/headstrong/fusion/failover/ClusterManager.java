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
 * $Id: ViewInformation.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 20, 2009 
 */

package com.headstrong.fusion.failover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jgroups.Address;
import org.jgroups.View;

/**
 * Manages the cluster.
 * Any change in the cluster ( member addition/deletion )
 * is reported to the cluster manager.
 * 
 * 
 */
public class ClusterManager {

	/**
	 * Address( JGroups )  of current node 
	 */
	private Address localAddress;

	/**
	 * Cluster Member information Map. 
	 */
	private Map<Address, MemberInfo> members;

	/**
	 * 
	 */
	public ClusterManager() {
		this.members = new HashMap<Address, MemberInfo>();
	}

	/**
	 * Updates the cluster information.
	 * 
	 * @param view
	 */
	public synchronized void updateCluster(View view) {
		List<Address> deadViews = new ArrayList<Address>();
		for (Entry<Address, MemberInfo> entry : this.members.entrySet()) {
			if (!view.getMembers().contains(entry.getKey())) {
				// already has the information do nothing.
				deadViews.add(entry.getKey());
			}
		}
		// Remove the dead views from the member map.
		for (Address address : deadViews) {
			this.members.remove(address);
		}
	}

	/**
	 * Given instance is set as the master instance. Cluster manager is also
	 * update with this information.
	 * 
	 * @param address
	 */
	public synchronized void setMasterView(Address address) {
		if (this.members.containsKey(address)) {
			MemberInfo info = this.members.get(address);
			if (info != null) {
				info.setState(State.ACTIVE);
			}
		}
	}

	/**
	 * Returns if the master is alive in the cluster.
	 * 
	 * @return
	 */
	public synchronized boolean isMasterAlive() {
		for (Map.Entry<Address, MemberInfo> member : members.entrySet()) {
			if (member.getValue() != null
					&& member.getValue().getState() != null
					&& member.getValue().getState().equals(State.ACTIVE)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Map.Entry<Address, MemberInfo> member : members.entrySet()) {
			stringBuilder.append(member.getKey() + "{" + member.getValue()
					+ "}");
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}

	/**
	 * @return the localAddress
	 */
	public synchronized Address getLocalAddress() {
		return localAddress;
	}

	/**
	 * @param localAddress
	 *            the localAddress to set
	 */
	public synchronized void setLocalAddress(Address localAddress) {
		this.localAddress = localAddress;
	}

	/**
	 * Returns the member information of the node passed.
	 * 
	 * @param address Node address.
	 * @return Member Information 
	 */
	public synchronized MemberInfo getMemberInfo(Address address) {
		return this.members.get(address);
	}

	/**
	 * Returns the Member information of self.
	 * @return Member information.
	 */
	public synchronized MemberInfo getLocalMemberInfo() {
		return this.members.get(this.getLocalAddress());
	}

	/**
	 * Update the member information of the node passed.
	 * @param address Node address.
	 * @param memberInfo Member information.
	 */
	public synchronized void setMemberInfo(Address address,
			MemberInfo memberInfo) {
		this.members.put(address, memberInfo);

	}

	/**
	 * Sets the member information for the local instance.
	 * 
	 * @precondition
	 * @postcondition
	 * @param memberInfo
	 */
	public synchronized void setLocalMemberInfo(MemberInfo memberInfo) {
		this.members.put(this.getLocalAddress(), memberInfo);
	}

	/**
	 * @return the members
	 */
	public Map<Address, MemberInfo> getMembers() {
		return members;
	}

	/**
	 * @param members
	 *            the members to set
	 */
	public void setMembers(Map<Address, MemberInfo> members) {
		this.members = members;
	}
}
