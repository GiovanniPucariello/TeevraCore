/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright '\u00a9' 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: MultiCastRouterConfig.java
 * $Revision: 
 * $Author: vgarde
 * $DateTime: Mar 12, 2010 
 */

package com.headstrong.fusion.config;

import java.util.List;

import com.headstrong.fusion.config.RouterConfig;

/**
 * @author vgarde
 *
 */
public class MultiCastRouterConfig implements RouterConfig {
	
	private String id;
	// List of target EndPoints.
	private List<EndPointSequence> targets;

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.config.RouterConfig#getId()
	 */
	@Override
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public List<EndPointSequence> getTargets() {
		return targets;
	}

	public void setTargets(List<EndPointSequence> targets) {
		this.targets = targets;
	}

}
