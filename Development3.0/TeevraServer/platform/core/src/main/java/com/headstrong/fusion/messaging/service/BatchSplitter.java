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
 * $Id: BatchSplitter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 29, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.config.BatchSplitStrategy;
import com.headstrong.fusion.config.SplitterStrategy;

/**
 * This class splits the input messages based on the batch size provided if the
 * batch size is not given it takes batch size as 1.
 * 
 */
public class BatchSplitter implements Splitter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.service.Splitter#split(java.lang.Object,
	 *      com.headstrong.fusion.config.SplitterStrategy)
	 */
	/**
	 * @precondition message != null && splitterStrategy instanceof
	 *               BatchSplitStrategy &&
	 *               ((BatchSplitStrategy)splitterStrategy).getBatchSize() > 0
	 */
	@Override
	public Object split(Object message, SplitterStrategy splitterStrategy)
			throws Exception {
		List<Object> outputMessageList = null;
		if (message instanceof List) {
			List<Object> inputMessageList = (List<Object>) message;
			outputMessageList = new ArrayList<Object>();
			int batchSize = ((BatchSplitStrategy) splitterStrategy)
					.getBatchSize();
			int inputListSize = inputMessageList.size();
			int startIndex = 0;
			int endIndex = batchSize;
			while (endIndex <= inputListSize) {
				outputMessageList.add(inputMessageList.subList(startIndex,
						endIndex));
				startIndex = endIndex;
				endIndex = endIndex + batchSize;
			}
			// remaining items should directly be put in the list
			if (startIndex < inputListSize) {
				outputMessageList.add(inputMessageList.subList(startIndex,
						inputListSize));
			}
		} else {
			throw new Exception(
					"Batch splitter expects a list of message. "
							+ "Invalid message supplied of type "
							+ message.getClass());
		}
		return outputMessageList;
	}
}
