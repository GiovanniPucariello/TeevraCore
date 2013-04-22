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
 * $Id: FixmlValidatorService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 22, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml;

import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.services.validator.impl.Validator;

/**
 * Validates incoming FIXML message based on the validation rules configured.
 */
public interface FixmlValidatorService extends MediationService {
	/**
	 * @return the validator
	 */
	public Validator getValidator();

	/**
	 * @param validator
	 *            the validator to set
	 */
	public void setValidator(Validator validator);
}
