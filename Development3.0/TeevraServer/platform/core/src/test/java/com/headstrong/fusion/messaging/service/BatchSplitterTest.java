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
 * $Id: BatchSplitterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 29, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.config.BatchSplitStrategy;

import junit.framework.TestCase;

/**
 * unit test cases for BatchSplitter.
 */
public class BatchSplitterTest extends TestCase {
	public void testSplitWithInvalidData() throws Exception {
		BatchSplitter splitter = new BatchSplitter();
		String message = "Dummy";
		BatchSplitStrategy splitterStrategy = new BatchSplitStrategy();
		try {
			splitter.split(message, splitterStrategy);
		} catch (Exception ex) {
			return;
		}
		fail();
	}

	public void testSplitLastSetComplete() throws Exception {
		BatchSplitter splitter = new BatchSplitter();
		List<Integer> messages = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			messages.add(i);
		}
		BatchSplitStrategy splitterStrategy = new BatchSplitStrategy();
		splitterStrategy.setBatchSize(10);
		List<Object> result = (List<Object>) splitter.split(messages,
				splitterStrategy);
		assertEquals(10, result.size());
		int x = 0;
		for (int j = 0; j < 10; j++) {
			List<Integer> subList = (List<Integer>) result.get(j);
			for (int k = 0; k < 10; k++) {
				assertEquals(x++, ((Integer) subList.get(k)).intValue());
			}
		}
	}

	public void testSplitLastSetIncomplete() throws Exception {
		BatchSplitter splitter = new BatchSplitter();
		List<Integer> messages = new ArrayList<Integer>();
		for (int i = 0; i < 99; i++) {
			messages.add(i);
		}
		BatchSplitStrategy splitterStrategy = new BatchSplitStrategy();
		splitterStrategy.setBatchSize(10);
		List<Object> result = (List<Object>) splitter.split(messages,
				splitterStrategy);
		assertEquals(10, result.size());
		int x = 0;
		for (int j = 0; j < 9; j++) {
			List<Integer> subList = (List<Integer>) result.get(j);
			for (int k = 0; k < 10; k++) {
				assertEquals(x++, ((Integer) subList.get(k)).intValue());
			}
		}
		assertEquals(9, ((List) result.get(9)).size());
	}

}
