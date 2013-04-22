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
 * $Id: MulticastConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

import java.util.List;

public class MulticastConfig implements EndPointConfig {

	/**
	 * 
	 */
	private static final long serialVersionUID = 837394388110250203L;
	// List of target EndPoints.
	private List<EndPointConfig> targets;

	public List<EndPointConfig> getTargets() {
		return targets;
	}

	public void setTargets(List<EndPointConfig> targets) {
		this.targets = targets;
	}

	public String getId() {
		return "multicast";
	}
	
}
