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
 * $Id: SplitterFactory.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 27, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.config.BatchSplitStrategy;
import com.headstrong.fusion.config.PartitionKeyStrategy;

/**
 * Splitter factory returns the appropriate Splitter based on the 
 * SplitterStrategy.
 * 
 */
public class SplitterFactory {

	/**
	 * Map of splitter strategy v/s splitter.
	 */
	private static Map<String, Splitter> splitterFactory = new HashMap<String, Splitter>();

	/**
	 * Splitter registration block.
	 */
	static {
		splitterFactory.put(PartitionKeyStrategy.class.getName(),
				new PartitionKeySplitter());
		splitterFactory.put(BatchSplitStrategy.class.getName(), new BatchSplitter());
	}

	/**
	 * Returns the splitter based on the name . 
	 * @param splitterName Splitter Strategy Name
	 * @return Splitter.
	 */
	public static Splitter getSplitter(String splitterName) {
		Splitter splitter = splitterFactory.get(splitterName);
		return splitter;
	}
}
