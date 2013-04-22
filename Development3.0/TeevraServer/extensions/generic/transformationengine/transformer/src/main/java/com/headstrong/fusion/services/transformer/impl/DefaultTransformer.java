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
 * $Id: DefaultTransformer.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.transformer.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.transformer.exception.TransformationException;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleManager;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleNotFoundException;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;
import com.headstrong.fusion.services.transformer.serviceconfig.FieldSet;
import com.headstrong.fusion.services.transformer.serviceconfig.RuleSet;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfig;

/**
 * Default Implementation of the {@link Transformer} interface. It gets the
 * {@link TransformerServiceConfig}. {@link RuleManager} instance is also
 * provided by the calling class which contains logic on how the rule has to be
 * executed.
 */
/**
 * @author ViswanathP
 * 
 */
public class DefaultTransformer implements Transformer {

	private static final Logger logger = LoggerFactory
			.getLogger(DefaultTransformer.class);

	private RuleManager ruleManager;

	/**
	 * Only Constructor for {@link DefaultTransformer}.
	 * 
	 * @param ruleManager
	 *            Instance of the rule manager which contains logic as in how
	 *            the rule has to be operated.
	 */
	public DefaultTransformer(RuleManager ruleManager) {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.impl.Transformer#transform(com.headstrong.fusion.commons.expression.evaluator.EvaluationContext,
	 *      java.util.Map, com.headstrong.fusion.bo.impl.DefaultBusinessObject,
	 *      com.headstrong.fusion.bo.impl.DefaultBusinessObject,
	 *      com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfig)
	 */
	@SuppressWarnings("unchecked")
	public void transform(Map<String, Object> headers, BusinessObject inputBO,
			BusinessObject outputBO, TransformerServiceConfig config)
			throws TransformationException, InvalidAttributeExpressionException {
		try {

			Map<String, Object> tempFields = new HashMap<String, Object>();

			/* Getting all the rules one by one. */
			for (int i = 0; i < config.getRules().size(); i++) {

				RuleSet rule = config.getRules().get(i);
				boolean toTransform = true;
				try {
					Expression condition = rule.getCondition();
					if (condition != null) {
						EvaluationContext evaluationContext = new DefaultEvaluationContext();
						evaluationContext
								.set(EvaluationContext.HEADER, headers);
						evaluationContext.set(
								EvaluationContext.BUSINESS_OBJECT, inputBO);
						evaluationContext
								.setProperty(
										com.headstrong.fusion.commons.expression.evaluator.function.MathFunction.ALLOW_NULL_COMPARISON,
										true);
						toTransform = (Boolean) condition
								.evaluate(evaluationContext);
					}
				} catch (EvaluationException e1) {
					throw new TransformationException(e1);
				}

				if (toTransform) {
					/* Setting of the input fields */
					Map<String, Object> inputMap = setInputFields(rule
							.getInputFields(), headers, inputBO, outputBO,
							tempFields);

					if (logger.isDebugEnabled()) {
						logger.debug("Executing rule :" + rule.getRuleName()
								+ " with params :" + inputMap);
					}
					/* Now comes time to execute */
					Object outputFromRule = ruleManager.executeRule(rule
							.getRuleName(), inputMap);

					if (logger.isDebugEnabled()) {
						logger.debug("Executed rule :" + rule.getRuleName()
								+ " output is  :" + outputFromRule);
					}

					/*
					 * To identify which is the next rule to be executed
					 */
					int nextSequenceId = 0;

					/* Working on the output of the rule executed */
					if (outputFromRule instanceof Map) {

						/*
						 * This means multiple output from rule. have to do
						 * mapping
						 */
						Map<String, Object> outputData = (Map<String, Object>) outputFromRule;
						nextSequenceId = setOutputFields(
								rule.getOutputFields(), inputBO, outputBO,
								tempFields, outputData);
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
									+ " such sequenceid present";
							logger.error(errorMsg);
							throw new TransformationException(errorMsg);
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
			throw new TransformationException(errorMsg, e);
		} catch (RuleNotFoundException e) {
			String errorMsg = "Error in getting the rule ";
			logger.error(errorMsg, e);
			throw new TransformationException(errorMsg, e);
		} catch (RuleOperationFailedException e) {
			String errorMsg = "Error  operating the rule ";
			logger.error(errorMsg, e);
			throw new TransformationException(errorMsg, e);

		}
	}

	/**
	 * This method will create a map of fields specified by the inputfieldSet
	 * {@link FieldSet}, input business object {@link DefaultBusinessObject},
	 * output business object {@link DefaultBusinessObject} and temporary
	 * variable map {@link Map}
	 * 
	 * @param inputFieldSet
	 *            Input list of field set each of type {@link FieldSet}.
	 * @param inputBO
	 *            Input business object {@link DefaultBusinessObject}
	 * @param outputBO
	 *            Output business object {@link DefaultBusinessObject}
	 * @param tempFields
	 *            Map of temporary variables {@link Map}
	 * @return {@link Map} containing the fields set
	 * @throws AttributeNotFoundException
	 *             If field could not be set because the business object doesn't
	 *             contain the attribute
	 * @throws InvalidAttributeExpressionException 
	 */
	private Map<String, Object> setInputFields(List<FieldSet> inputFieldSet,
			Map<String, Object> headers, BusinessObject inputBO,
			BusinessObject outputBO, Map<String, Object> tempFields)
			throws AttributeNotFoundException, InvalidAttributeExpressionException {

		Map<String, Object> inputMap = new HashMap<String, Object>();
		/* Parse thru complete list of input field set */
		for (FieldSet inputField : inputFieldSet) {

			/*
			 * Taking the data from input or output or temporary variable map or
			 * directly as constant depending on the type specified in the input
			 * type
			 */
			if (inputField.getParamType().equals("input")) {
				FusionUtil.populateMap(inputMap, inputField.getParamName(),
						inputBO.getValue((String) inputField.getParamValue()));

			}

			else if (inputField.getParamType().equals("output")) {
				FusionUtil.populateMap(inputMap, inputField.getParamName(),
						outputBO.getValue((String) inputField.getParamValue()));
			}

			else if (inputField.getParamType().equals("temp")) {
				FusionUtil.populateMap(inputMap, inputField.getParamName(),
						tempFields.get(inputField.getParamValue()));
			}

			else if (inputField.getParamType().equals("constant")) {
				FusionUtil.populateMap(inputMap, inputField.getParamName(),
						inputField.getParamValue());
			}
			inputMap.put(FusionConstants.INPUT_BO, inputBO);
			inputMap.put(FusionConstants.TEMP_FIELDS, tempFields);
			inputMap.put(FusionConstants.HEADERS, headers);
		}
		return inputMap;
	}

	/**
	 * This method will set the values in the input business object
	 * {@link DefaultBusinessObject}, output business object
	 * {@link DefaultBusinessObject} and temporary variable map {@link Map}
	 * depending on the field set list provided.
	 * 
	 * @param outputFieldSet
	 *            Output list of field set each of type {@link FieldSet}.
	 * @param inputBO
	 *            Input business object {@link DefaultBusinessObject}
	 * @param outputBO
	 *            Output business object {@link DefaultBusinessObject}
	 * @param tempFields
	 *            Map of temporary variables {@link Map}
	 * @param outputData
	 *            Map containing the data which needs to be set
	 * @throws AttributeNotFoundException
	 *             When the attribute could not be set in the business object.
	 * @throws TransformationException
	 * @throws InvalidAttributeExpressionException 
	 */
	private int setOutputFields(List<FieldSet> outputFieldSet,
			BusinessObject inputBO, BusinessObject outputBO,
			Map<String, Object> tempFields, Map<String, Object> outputData)
			throws AttributeNotFoundException, TransformationException, InvalidAttributeExpressionException {

		if (outputFieldSet.size() != outputData.size()) {
			// if number of fields in the outputFieldSet is different from
			// number of
			// keys in outputData, then directly use the keys to set the value
			// in
			// output BO
			for (Entry<String, Object> outputDataEntry : outputData.entrySet()) {
				outputBO.setValue(outputDataEntry.getKey(), outputDataEntry
						.getValue());
			}
		} else {
			/*
			 * Parse thru each output field set
			 */
			for (FieldSet outputField : outputFieldSet) {

				/*
				 * Depending on the type of field set, the value is set in
				 * inputbo or outputbo or temporary variable map
				 */
				if (outputField.getParamType().equals("input")) {
					if (logger.isDebugEnabled()) {
						logger.debug("Setting value in inputbo:"
								+ outputField.getParamValue() + ":with :"
								+ outputData.get(outputField.getParamName()));
					}
					inputBO.setValue((String) outputField.getParamValue(),
							outputData.get(outputField.getParamName()));
				} else if (outputField.getParamType().equals("output")) {
					if (logger.isDebugEnabled()) {
						logger.debug("Setting value in outputbo:"
								+ outputField.getParamValue() + ":with :"
								+ outputData.get(outputField.getParamName()));
					}
					String attrName = outputField.getParamValue().toString();
					Object returnVal = outputData.get(outputField
							.getParamName());

					// Format for BigDecimal
					// TODO Enhance this to support format type generically
					if ((outputBO.getValue(attrName) instanceof BigDecimal)
							&& (returnVal != null) && (!returnVal.equals(""))) {
						outputBO.setValue(attrName, new BigDecimal(returnVal
								.toString()));
					} else {
						outputBO.setValue(attrName, returnVal);
					}

				} else if (outputField.getParamType().equals("temp")) {
					if (logger.isDebugEnabled()) {
						logger.debug("Setting value in temporarymap:"
								+ outputField.getParamValue() + ":with :"
								+ outputData.get(outputField.getParamName()));
					}
					tempFields.put(outputField.getParamValue().toString(),
							outputData.get(outputField.getParamName()));
				}
			}
		}
		/*
		 * If next sequenceid is set by the rule, then change the sequencing. 0
		 * if want to continue - by default >0 if want to go to rule specified
		 * by id -1 if want to stop transformation
		 */
		if (outputData.get(Rule.NEXT_SEQUENCE_ID) != null) {
			try {
				int i = (Integer) outputData.get(Rule.NEXT_SEQUENCE_ID);
				return i;
			} catch (Exception e) {
				String errorMsg = "Next sequence id send is not an integer "
						+ outputData.get(Rule.NEXT_SEQUENCE_ID).toString();
				logger.error(errorMsg, e);
				throw new TransformationException(errorMsg, e);
			}
		} else {
			return 0;
		}
	}
}
