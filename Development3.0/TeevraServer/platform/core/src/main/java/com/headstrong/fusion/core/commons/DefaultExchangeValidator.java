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
 * $Id: DefaultExchangeValidator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 16, 2009 
 */

package com.headstrong.fusion.core.commons;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * 
 */
public class DefaultExchangeValidator implements MessageExchangeValidator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.commons.MessageExchangeValidator#isValid(com.headstrong.fusion.commons.MessageExchange)
	 */
	@Override
	public boolean isValid(MessageExchange messageExchange) {
		// verify if the message exchange contains at least on the messages..
		// else return false.
		if (messageExchange.getIn() == null && messageExchange.getOut() == null
				&& messageExchange.getException() == null) {
			return false;
		}
		return true;
	}

}
