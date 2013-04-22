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
 * $Id: XmlFormatterServiceImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 13, 2008 
 */

package com.headstrong.fusion.services.message.formatter.xml.impl;

import java.util.List;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.message.formatter.xml.XmlFormatterService;

/**
 * 
 */
public class XmlFormatterServiceImpl extends GenericMediationService implements
		XmlFormatterService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.commons.MediationService#process(com.headstrong
	 * .fusion.commons.MessageExchange,
	 * com.headstrong.fusion.commons.ServiceConfig)
	 */
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException, InvalidAttributeExpressionException {
		Object inputMessage = exchange.getIn().getBody();
		
		if (inputMessage instanceof BusinessObject) {
            BusinessObject bo= (BusinessObject) inputMessage;
            StringBuilder builder = new StringBuilder();
            builder.append(bo.toXml());
        	exchange.getIn().setBody(builder.toString());
            
		} else {
			List<BusinessObject> input = (List<BusinessObject>) exchange
					.getIn().getBody();

			StringBuilder builder = new StringBuilder();
			if (input != null) {
				for (BusinessObject bo : input) {
					builder.append(bo.toXml());
				}
			}
			exchange.getIn().setBody(builder.toString());
		}
	}

}
