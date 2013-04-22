package com.headstrong.fusion.connector.http.receiver;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ProcessStateController;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.core.commons.adapter.camel.FusionCamelEndPoint;

/**
 * @author mali
 *
 */
public class HTTPFusionEndpoint extends FusionCamelEndPoint {

	/**
	 * @param endPoint
	 * @param stateController
	 */
	public HTTPFusionEndpoint(FusionEndpoint<MessageExchange> endPoint,
			ProcessStateController stateController) {
		super(endPoint, stateController);
		// TODO Auto-generated constructor stub
	}

}
