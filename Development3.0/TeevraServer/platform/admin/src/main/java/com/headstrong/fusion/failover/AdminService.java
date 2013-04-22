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
 * $Id: AdminService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.failover;

import com.headstrong.fusion.failover.request.data.ClusteredStateManager;

/**
 * All Admin related api would be
 * exposed by this service.
 */
public interface AdminService {
	
	/**
	 * Returns the current {@link State} of the 
	 * member.
	 * 
	 * @return Current {@link State} of the member.
	 */
	public State getMemberState();
	
	/**
	 * Returns the current member information ( {@link MemberInfo} )
	 * @precondition
	 * @postcondition 	
	 * @return Current Member Information ( {@link MemberInfo} )
	 */
	public MemberInfo getMemberInfo();
	
	/**
	 * Returns clustered state manager.
	 * 
	 * @return Clustered State Manager. 
	 */
	public ClusteredStateManager getClusteredStateManager();
}
