package com.headstrong.fusion.commons.component;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * A consumer of message exchanges from an {@link FusionEndpoint} 
 * 
 */
public interface FusionConsumer<E extends MessageExchange> extends
		FusionService {

	/**
	 * sets the service support.
	 * 
	 * @param serviceSupport
	 */
	void setServiceSupport(FusionServiceSupport serviceSupport);
}
