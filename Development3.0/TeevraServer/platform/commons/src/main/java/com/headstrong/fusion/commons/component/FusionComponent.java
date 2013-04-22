package com.headstrong.fusion.commons.component;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;

/**
 * A {@link FusionComponent} is a factory of {@link FusionEndpoint}.
 * 
 */
public interface FusionComponent {

	/**
	 * Returns Fusion EndPoint.
	 * 
	 * @param parameters
	 *            configuration properties for fusion.
	 * @return Fusion EndPoint.
	 */
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception;
}
