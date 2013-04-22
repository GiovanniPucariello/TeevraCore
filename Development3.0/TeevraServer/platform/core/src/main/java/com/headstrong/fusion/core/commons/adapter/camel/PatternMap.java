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
 * $Id: PatternMap.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 3, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import com.headstrong.fusion.commons.MessageExchangePattern;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.ExchangePattern;

/**
 * 
 */
public class PatternMap {
	private static final Map<MessageExchangePattern, ExchangePattern> messageExchangeToExchangePatternMap = new HashMap<MessageExchangePattern, ExchangePattern>();
	private static final Map<ExchangePattern, MessageExchangePattern> exchangeToMessageExchangePatternMap = new HashMap<ExchangePattern, MessageExchangePattern>();

	static {

		// MessageExchangePattern to ExchangePattern map
		messageExchangeToExchangePatternMap.put(MessageExchangePattern.InOnly,
				ExchangePattern.InOnly);
		messageExchangeToExchangePatternMap.put(
				MessageExchangePattern.InOptionalOut,
				ExchangePattern.InOptionalOut);
		messageExchangeToExchangePatternMap.put(MessageExchangePattern.InOut,
				ExchangePattern.InOut);
		messageExchangeToExchangePatternMap.put(MessageExchangePattern.OutIn,
				ExchangePattern.OutIn);
		messageExchangeToExchangePatternMap.put(MessageExchangePattern.OutOnly,
				ExchangePattern.OutOnly);
		messageExchangeToExchangePatternMap.put(
				MessageExchangePattern.OutOptionalIn,
				ExchangePattern.OutOptionalIn);
		messageExchangeToExchangePatternMap.put(
				MessageExchangePattern.RobustInOnly,
				ExchangePattern.RobustInOnly);
		messageExchangeToExchangePatternMap.put(
				MessageExchangePattern.RobustOutOnly,
				ExchangePattern.RobustOutOnly);

		// Exchange to Message Exchange Pattern map.
		exchangeToMessageExchangePatternMap.put(ExchangePattern.InOnly,
				MessageExchangePattern.InOnly);
		exchangeToMessageExchangePatternMap.put(ExchangePattern.InOptionalOut,
				MessageExchangePattern.InOptionalOut);
		exchangeToMessageExchangePatternMap.put(ExchangePattern.InOut,
				MessageExchangePattern.InOut);
		exchangeToMessageExchangePatternMap.put(ExchangePattern.OutIn,
				MessageExchangePattern.OutIn);
		exchangeToMessageExchangePatternMap.put(ExchangePattern.OutOnly,
				MessageExchangePattern.OutOnly);
		exchangeToMessageExchangePatternMap.put(ExchangePattern.OutOptionalIn,
				MessageExchangePattern.OutOptionalIn);
		exchangeToMessageExchangePatternMap.put(ExchangePattern.RobustInOnly,
				MessageExchangePattern.RobustInOnly);
		exchangeToMessageExchangePatternMap.put(ExchangePattern.RobustOutOnly,
				MessageExchangePattern.RobustOutOnly);

	}

	/**
	 * Returns Exchange pattern mapped to Message Exchange Pattern.
	 * 
	 * @precondition
	 * @postcondition
	 * @param messageExchangePattern
	 * @return
	 */
	public static ExchangePattern getExchangePattern(
			MessageExchangePattern messageExchangePattern) {
		return messageExchangeToExchangePatternMap.get(messageExchangePattern);
	}

	/**
	 * Returns Exchange pattern mapped to Message Exchange Pattern.
	 * 
	 * @precondition
	 * @postcondition
	 * @param messageExchangePattern
	 * @return
	 */
	public static MessageExchangePattern getMessageExchangePattern(
			ExchangePattern exchangePattern) {
		return exchangeToMessageExchangePatternMap.get(exchangePattern);
	}
}
