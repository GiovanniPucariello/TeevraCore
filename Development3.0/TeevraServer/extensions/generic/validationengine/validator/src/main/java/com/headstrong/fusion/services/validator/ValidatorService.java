package com.headstrong.fusion.services.validator;

import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.services.validator.impl.Validator;

// marker interface
/**
 * ValidatorService extends MediationService.
 */
public interface ValidatorService extends MediationService {
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
