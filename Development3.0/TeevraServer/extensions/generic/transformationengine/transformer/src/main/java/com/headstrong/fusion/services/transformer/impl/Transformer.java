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
 * $Id: Transformer.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.transformer.impl;

import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.services.transformer.exception.TransformationException;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfig;

/**
 * Transfomer interface. The classes implementing {@link Transformer} needs to
 * implement tranform method.
 */
public interface Transformer {

	/**
	 * Transform method transforms Input Business Object
	 * {@link DefaultBusinessObject} to the Output Business Object
	 * {@link DefaultBusinessObject} using the configuration specified by
	 * {@link TransformerServiceConfig}
	 * 
	 * @param inputBO
	 *            Input Business Object {@link DefaultBusinessObject}
	 * @param outputBO
	 *            Output Business Object {@link DefaultBusinessObject}
	 * @param headers
	 *            object headers associated
	 * @param config
	 *            Configuration for transformation
	 *            {@link TransformerServiceConfig}
	 * @throws TransformationException
	 *             Whenever there is exception during transformation
	 * @throws InvalidAttributeExpressionException 
	 */
	void transform(Map<String, Object> headers, BusinessObject inputBO,
			BusinessObject outputBO, TransformerServiceConfig config)
			throws TransformationException, InvalidAttributeExpressionException;

}
