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
 * $Id: ExchangeAdapter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import org.apache.camel.Exchange;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * Marker interface to identify that the Exchange is an
 * Adapter for Fusion Message Exchange.
 */
public interface ExchangeAdapter extends Exchange {

	/**
	 *
	 * @precondition
	 * @postcondition 	
	 * @return
	 */
	public MessageExchange getMessageExchange();
}
