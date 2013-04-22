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
 * $Id: LoadBalancerConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

import java.util.List;

public class LoadBalancerConfig implements RouterConfig {

	/**
	 * 
	 */
	private static final long serialVersionUID = -562893288613040926L;
	private String strategy;
	private List<EndPointConfig> targets;
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	public List<EndPointConfig> getTargets() {
		return targets;
	}
	public void setTargets(List<EndPointConfig> targets) {
		this.targets = targets;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
