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
 * $Id: CBREndPoint.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

/**
 * Splitter configuration.
 * 
 */
public class SplitterConfig implements RouterConfig {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5440997032126146911L;

	/**
	 * component unique identifier.
	 */
	private String id;

	/**
	 * Split strategy to be used for splitting.
	 */
	private SplitterStrategy splitterStrategy;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the splitterStrategy
	 */
	public SplitterStrategy getSplitterStrategy() {
		return splitterStrategy;
	}

	/**
	 * @param splitterStrategy
	 *            the splitterStrategy to set
	 */
	public void setSplitterStrategy(SplitterStrategy splitterStrategy) {
		this.splitterStrategy = splitterStrategy;
	}
}
