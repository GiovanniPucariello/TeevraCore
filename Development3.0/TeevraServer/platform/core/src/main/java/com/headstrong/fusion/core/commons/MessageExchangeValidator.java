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
 * $Id: MessageExchangeValidator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 16, 2009 
 */

package com.headstrong.fusion.core.commons;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * Validate the exchange before sending the same to the services.
 */
public interface MessageExchangeValidator {

	public boolean isValid(MessageExchange messageExchange);
}
