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
 * $Id: Validator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.validator.impl;

import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.services.validator.exception.ValidationException;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfig;

/**
 * Validator interface. The classes implementing {@link Validator} needs to
 * implement validate method.
 */
public interface Validator {

	/**
	 * Validate method validates Input Business Object
	 * {@link DefaultBusinessObject} using the configuration specified by
	 * {@link ValidatorServiceConfig}
	 * 
	 * @param inputBO
	 *            Input Business Object {@link DefaultBusinessObject}
	 * @param config
	 *            Configuration for validation {@link ValidatorServiceConfig}
	 * @throws ValidationException
	 *             Whenever there is exception during validation
	 * @throws InvalidAttributeExpressionException 
	 */
	void validate(Map<String, Object> headers, BusinessObject inputBO,
			ValidatorServiceConfig config) throws ValidationException, InvalidAttributeExpressionException;

}
