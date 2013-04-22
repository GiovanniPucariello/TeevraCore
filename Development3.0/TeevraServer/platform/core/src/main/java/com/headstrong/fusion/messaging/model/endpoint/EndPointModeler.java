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
 * $Id: EndPointModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.config.EndPointConfig;

/**
 * Represents and Endpoint in the fusion server.
 * And endpoint is any process / connector or router
 * that works on {@link MessageExchange}
 * 
 */
public interface EndPointModeler {

	/**
	 * Returns the configuration of the endpoint.
	 * 
	 * @return Endpoint configuration.
	 */
	public EndPointConfig getConfig();
}
