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
 * $Id: DefaultValidator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.validator.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.validator.exception.ValidationException;
import com.headstrong.fusion.services.validator.rulemanager.RuleManager;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleNotFoundException;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;
import com.headstrong.fusion.services.validator.serviceconfig.FieldSet;
import com.headstrong.fusion.services.validator.serviceconfig.RuleSet;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfig;

/**
 * Default Implementation of the {@link Validator} interface. It gets the
 * {@link ValidatorServiceConfig}. {@link RuleManager} instance is also
 * provided by the calling class which contains logic on how the rule has to be
 * executed.
 */
public class DefaultValidator implements Validator {

	private static final Logger logger = LoggerFactory
			.getLogger(DefaultValidator.class);

	private RuleManager ruleManager;

	/**
	 * Only Constructor for {@link DefaultValidator}.
	 * 
	 * @param ruleManager
	 *            Instance of the rule manager which contains logic as in how
	 *            the rule has to be operated.
	 */
	public DefaultValidator(RuleManager ruleManager) {
		this.ruleManager = ruleManager;
	}

	/**
	 * @return the ruleManager
	 */
	public RuleManager getRuleManager() {
		return ruleManager;
	}

	/**
	 * @param ruleManager
	 *            the ruleManager to set
	 */
	public void setRuleManager(RuleManager ruleManager) {
		this.ruleManager = ruleManager;
	}

	@SuppressWarnings("unchecked")
	public void validate(Map<String, Object> headers, BusinessObject inputBO,
			ValidatorServiceConfig config) throws ValidationException, InvalidAttributeExpressionException {
		try {
			// set the current BO.
			StringBuffer sb = new StringBuffer();
			Map<String, Object> attributeObjComphrehensiveMap = new HashMap();
			/* Getting all the rules one by one. */
			for (int i = 0; i < config.getRules().size(); i++) {
				RuleSet rule = config.getRules().get(i);
				boolean toValidate = true;
				try {
					Expression condition = rule.getCondition();
					if (condition != null) {
						EvaluationContext evaluationContext = new DefaultEvaluationContext();
						evaluationContext
								.set(EvaluationContext.HEADER, headers);
						evaluationContext.set(
								EvaluationContext.BUSINESS_OBJECT, inputBO);
						toValidate = (Boolean) condition
								.evaluate(evaluationContext);
					}
				} catch (EvaluationException e1) {
					throw new ValidationException(e1);
				}
				if (toValidate) { /* Setting of the input fields */
					Map<String, Object> inputMap = setInputFields(rule
							.getInputFields(), inputBO,
							attributeObjComphrehensiveMap);

					if (logger.isDebugEnabled()) {
						logger.debug("Executing rule :" + rule.getRuleName()
								+ " with params :" + inputMap);
					}
					/* Now comes time to execute */
					Object outputFromRule;
					try {
						outputFromRule = ruleManager.executeRule(rule
								.getRuleName(), inputMap, sb);
					} catch (RuleOperationFailedException e) {
						String errorMsg = "Rule failed :" + rule.getErrorMsg()
								+ ",on:" + inputMap;
						logger.error(errorMsg, e);
						throw new ValidationException(errorMsg, e);
					}

					if (logger.isDebugEnabled()) {
						logger.debug("Executed rule :" + rule.getRuleName()
								+ " output is  :" + outputFromRule);
					}

					/*
					 * To identify which is the next rule to be executed
					 */
					int nextSequenceId = 0;

					/* Working on the output of the rule executed */
					if (outputFromRule instanceof Boolean) {
						if (!(Boolean) outputFromRule) {
							String errorMsg = "Rule failed :"
									+ rule.getErrorMsg() + ",on:" + inputMap;
							logger.error(errorMsg);
							throw new ValidationException(errorMsg);
						}

					} else if (outputFromRule instanceof Integer) {
						nextSequenceId = (Integer) outputFromRule;
					} else {
						String errorMsg = "No output from the validation rule";
						logger.error(errorMsg);
						throw new ValidationException(errorMsg);
					}

					/*
					 * If nextSequenceId is -1, then stop processing the other
					 * rules
					 * 
					 * If nextSequenceId > 0, then find the rule corresponding
					 * to that rule If no such rule present, then throw error If
					 * rule found,then reset the index i to the rule obtained.
					 */
					if (nextSequenceId == -1) {
						i = config.getRules().size();
					} else if (nextSequenceId > 0) {
						RuleSet nextRule = config.getRule(nextSequenceId);
						if (nextRule == null) {
							String errorMsg = "No rule with " + nextSequenceId
									+ " sequenceid present";
							logger.error(errorMsg);
							throw new ValidationException(errorMsg);
						}
						i = config.getRules().indexOf(nextRule) - 1;
						logger.debug("Next rule to be executed is :" + i);
						logger.debug("Next rule to be executed is :"
								+ config.getRules().get(i));

					}
				}
			}
		} catch (AttributeNotFoundException e) {
			String errorMsg = "Error while getting the attribute info ";
			logger.error(errorMsg, e);
			throw new ValidationException(errorMsg, e);
		} catch (RuleNotFoundException e) {
			String errorMsg = "Error in getting the rule ";
			logger.error(errorMsg, e);
			throw new ValidationException(errorMsg, e);
		}
	}

	/**
	 * This method will create a map of fields specified by the inputfieldSet
	 * {@link FieldSet}, input business object {@link DefaultBusinessObject}
	 * and temporary variable map {@link Map}
	 * 
	 * @param inputFieldSet
	 *            Input list of field set each of type {@link FieldSet}.
	 * @param inputBO
	 *            Input business object {@link DefaultBusinessObject}
	 * @param comphrehensiveMap 
	 * @param tempFields
	 *            Map of temporary variables {@link Map}
	 * @return {@link Map} containing the fields set
	 * @throws AttributeNotFoundException
	 *             If field could not be set because the business object doesn;t
	 *             contain the attribute
	 * @throws InvalidAttributeExpressionException 
	 */
	private Map<String, Object> setInputFields(List<FieldSet> inputFieldSet,
			BusinessObject inputBO, Map<String, Object> comprehensiveMap)
			throws AttributeNotFoundException, InvalidAttributeExpressionException {

		Map<String, Object> inputMap = new HashMap<String, Object>();

		/* Parse thru complete list of input field set */
		for (FieldSet inputField : inputFieldSet) {
			String paramName = inputField.getParamName();
			/*
			 * Taking the data from input or output or temporary variable map or
			 * directly as constant depending on the type specified in the input
			 * type
			 */
			if ("input".equals(inputField.getParamType())) {
				
				if(comprehensiveMap.containsKey(inputField.getParamValue()))
				{
					FusionUtil.populateMap(inputMap, paramName, comprehensiveMap.get(inputField.getParamValue()));
				}
				else
				{
					Object temp = inputBO
					.getValue(inputField.getParamValue());
				FusionUtil.populateMap(inputMap, paramName, temp);
				
				//put the BO's attribute and value in a map as
				//getting the value from BO each time could be costly
				comprehensiveMap.put(inputField.getParamValue(), temp);
				}
			} else if ("constant".equals(inputField.getParamType())) {
				FusionUtil.populateMap(inputMap, paramName, inputField
						.getParamValue());
			}
			
		}
		return inputMap;
	}
}
