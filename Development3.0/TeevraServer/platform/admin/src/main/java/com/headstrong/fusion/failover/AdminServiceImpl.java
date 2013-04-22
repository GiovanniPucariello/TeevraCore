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
 * $Id: AdminServiceImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.failover;

import com.headstrong.fusion.failover.request.data.ClusteredStateManager;

/**
 * Admin service implementation.
 * 
 */
public class AdminServiceImpl implements AdminService {

	/**
	 * Member Context.
	 */
	private MemberContext memberContext;
	/**
	 * Manages clustered state.
	 */
	private ClusteredStateManager clusteredStateManager;

	/**
	 * @param memberContext
	 * @param clusteredStateManager
	 */
	public AdminServiceImpl(MemberContext memberContext,
			ClusteredStateManager clusteredStateManager) {
		this.memberContext = memberContext;
		this.clusteredStateManager = clusteredStateManager;
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.AdminService#getMemberState()
	 */
	public State getMemberState() {
		return this.memberContext.getMemberInfo().getState();
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.AdminService#getMemberInfo()
	 */
	public MemberInfo getMemberInfo() {
		return this.memberContext.getMemberInfo();
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.failover.AdminService#getClusteredStateManager()
	 */
	public ClusteredStateManager getClusteredStateManager() {
		return this.clusteredStateManager;
	}
}
