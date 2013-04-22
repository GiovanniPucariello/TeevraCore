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
 * $Id: ClusterManagerTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 30, 2010 
 */

package com.headstrong.fusion.failover;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.jgroups.Address;
import org.jgroups.View;
import org.jgroups.stack.IpAddress;

/**
 * {@link ClusterManager} test class.
 */
public class ClusterManagerTest extends TestCase {

	public void testUpdateCluster() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		View view = new View();
		clusterManager.updateCluster(view);
	}

	public void testSetMasterView() throws Exception {

	}

	public void testSetMembers() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		Map<Address, MemberInfo> members = new HashMap<Address, MemberInfo>();
		Address add1 = new IpAddress("10.200.12.12", 80);
		MemberInfo info1 = new MemberInfo();
		Address add2 = new IpAddress("10.200.13.13", 80);
		MemberInfo info2 = new MemberInfo();
		members.put(add1, info1);
		members.put(add2, info2);
		clusterManager.setMembers(members);
		assertEquals(info1, clusterManager.getMemberInfo(add1));
		assertEquals(info2, clusterManager.getMemberInfo(add2));
	}

	public void testSetLocalAddress() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		Address localAddress = new IpAddress("10.200.12.12", 80);
		clusterManager.setLocalAddress(localAddress);
		assertEquals(localAddress, clusterManager.getLocalAddress());
	}

	public void testGetMemberInfo() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		Map<Address, MemberInfo> members = new HashMap<Address, MemberInfo>();
		Address add1 = new IpAddress("10.200.12.12", 80);
		MemberInfo info1 = new MemberInfo();
		members.put(add1, info1);
		clusterManager.setMembers(members);
		Address add2 = new IpAddress("10.200.13.13", 80);
		MemberInfo info2 = new MemberInfo();
		clusterManager.setMemberInfo(add2, info2);
		assertEquals(info1, clusterManager.getMemberInfo(add1));
		assertEquals(info2, clusterManager.getMemberInfo(add2));
	}

	public void testSetLocalMemberInfo() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		Address localAddress = new IpAddress("10.200.12.12", 80);
		clusterManager.setLocalAddress(localAddress);
		MemberInfo info = new MemberInfo();
		clusterManager.setLocalMemberInfo(info);
		assertEquals(info, clusterManager.getLocalMemberInfo());
	}

	public void testGetMembers() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		Map<Address, MemberInfo> members = new HashMap<Address, MemberInfo>();
		Address add1 = new IpAddress("10.200.12.12", 80);
		MemberInfo info1 = new MemberInfo();
		Address add2 = new IpAddress("10.200.13.13", 80);
		MemberInfo info2 = new MemberInfo();
		members.put(add1, info1);
		members.put(add2, info2);
		clusterManager.setMembers(members);
		assertEquals(members, clusterManager.getMembers());
	}

	public void testIsMasterAlive() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		Map<Address, MemberInfo> members = new HashMap<Address, MemberInfo>();
		Address add1 = new IpAddress("10.200.12.12", 80);
		MemberInfo info1 = new MemberInfo();
		Address add2 = new IpAddress("10.200.13.13", 80);
		MemberInfo info2 = new MemberInfo();
		members.put(add1, info1);
		members.put(add2, info2);
		clusterManager.setMembers(members);
		clusterManager.setMasterView(add1);
		clusterManager.getMemberInfo(add1).setState(State.ACTIVE);
		assertTrue(clusterManager.isMasterAlive());

	}

	public void testToString() throws Exception {
		ClusterManager clusterManager = new ClusterManager();
		Map<Address, MemberInfo> members = new HashMap<Address, MemberInfo>();
		Address add1 = new IpAddress("10.200.12.12", 80);
		MemberInfo info1 = new MemberInfo();
		Address add2 = new IpAddress("10.200.13.13", 80);
		MemberInfo info2 = new MemberInfo();
		members.put(add1, info1);
		members.put(add2, info2);
		clusterManager.setMembers(members);
		clusterManager.setMasterView(add1);
		clusterManager.getMemberInfo(add1).setState(State.ACTIVE);
		assertNotNull(clusterManager.toString());
	}
}
