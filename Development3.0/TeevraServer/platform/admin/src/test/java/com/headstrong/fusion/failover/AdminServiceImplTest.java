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
 * $Id: AdminServiceImplTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 30, 2010 
 */

package com.headstrong.fusion.failover;

import com.headstrong.fusion.failover.request.data.ClusteredStateManager;
import com.headstrong.fusion.failover.request.data.ClusteredStateManagerImpl;

import junit.framework.TestCase;

/**
 * {@link AdminServiceImpl} test class.
 */
public class AdminServiceImplTest extends TestCase {
	private AdminService adminService;

	public AdminServiceImplTest() {
		MemberContext memberContext = new MemberContext(null);
		MemberInfo info = new MemberInfo();
		info.setState(State.NEW);
		memberContext.setMemberInfo(info);
		ClusteredStateManager manager = new ClusteredStateManagerImpl(memberContext);
		adminService = new AdminServiceImpl(memberContext, manager);
	}

	public void testGetMemberStateNotNull() throws Exception {
		assertNotNull(adminService.getMemberState());
	}

	public void testGetMemberInfoNotNull() throws Exception {
		assertNotNull(adminService.getMemberInfo());
	}

	public void testGetClusteredStateManagerNotNull() throws Exception {
		assertNotNull(adminService.getClusteredStateManager());
	}
}
