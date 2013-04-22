package com.headstrong.fusion.commons.component;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * A processor is used to implement the Event Driven Consumer and Message
 * Translator patterns and to process message exchanges.
 */
public interface FusionProcessor {

	/**
	 * Processes the message exchange.
	 * 
	 * @param messageExchange
	 * @throws Exception
	 */
	public void process(MessageExchange messageExchange) throws Exception;
}
