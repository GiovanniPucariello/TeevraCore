package com.headstrong.fusion.commons.component;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * Provides a channel on which clients can create and invoke message exchanges
 * on an {@link FusionEndpoint}
 */
public interface FusionProducer<E extends MessageExchange> extends
		FusionService {
	/**
	 * Processes the message exchange
	 * 
	 * @throws Exception if an internal processing error has occurred.
	 */
	void process(MessageExchange exchange) throws Exception;
	
	void setServiceSupport(FusionServiceSupport serviceSupport);
}
