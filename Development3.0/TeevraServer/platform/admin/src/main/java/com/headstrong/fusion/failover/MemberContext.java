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
 * $Id: MemberContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 28, 2009 
 */

package com.headstrong.fusion.failover;

import org.osgi.framework.BundleContext;

/**
 * Container class that represents a fusion instance.
 *  
 */
public class MemberContext {
	
	/**
	 * Member Information.
	 */
	private MemberInfo memberInfo;
	
	/**
	 * All communication to other instances are
	 * handled by Group Member.
	 */
	private GroupMember groupMember;

	/**
	 * OSGi bundle context.
	 */
	private BundleContext bundleContext;
	public MemberContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}
	/**
	 * @return the memberInfo
	 */
	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	/**
	 * @param memberInfo the memberInfo to set
	 */
	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	/**
	 * @return the groupMember
	 */
	public GroupMember getGroupMember() {
		return groupMember;
	}

	/**
	 * @param groupMember the groupMember to set
	 */
	public void setGroupMember(GroupMember groupMember) {
		this.groupMember = groupMember;
	}

	/**
	 * @return the bundleContext
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * @param bundleContext the bundleContext to set
	 */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}
}
