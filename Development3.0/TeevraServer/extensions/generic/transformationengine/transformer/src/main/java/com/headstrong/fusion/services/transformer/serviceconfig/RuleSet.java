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
 * $Id: RuleSet.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.transformer.serviceconfig;

import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.commons.expression.evaluator.Expression;

/**
 * {@link RuleSet} contains information about each rule which needs to be
 * applied by the Transfomer on the message. it contains the rulename,
 * inputfieldset, outputfieldset and the sequenceid. It also implements
 * Comparable interface so that {@link RuleSet} can be ordered by sequenceId.
 */
public class RuleSet implements Comparable<RuleSet> {

	/**
	 * Rule alias name
	 */
	private String ruleName;
	/**
	 * List of input fields needed by the rule
	 */
	private List<FieldSet> inputFields;

	/**
	 * List of output field needed by the rule
	 */
	private List<FieldSet> outputFields;
	/**
	 * Sequence number of the rule
	 */
	private int sequenceId;

	/**
	 * Rule will be applied only if the Expression is evaluated to true
	 */
	private Expression condition;

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Rulename:").append(ruleName);
		sb.append("\nInputFieldset:").append(inputFields);
		sb.append("\nOutputFieldSet:").append(outputFields);
		return sb.toString();

	}

	/**
	 * @return the ruleName
	 */
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * @param ruleName
	 *            the ruleName to set
	 */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	/**
	 * @return the inputFields
	 */
	public List<FieldSet> getInputFields() {
		return inputFields;
	}

	/**
	 * @param inputFields
	 *            the inputFields to set
	 */
	public void setInputFields(List<FieldSet> inputFields) {
		this.inputFields = inputFields;
	}

	/**
	 * @return the outputFields
	 */
	public List<FieldSet> getOutputFields() {
		return outputFields;
	}

	/**
	 * @param outputFields
	 *            the outputFields to set
	 */
	public void setOutputFields(List<FieldSet> outputFields) {
		this.outputFields = outputFields;
	}

	/**
	 * @return the sequenceId
	 */
	public int getSequenceId() {
		return sequenceId;
	}

	/**
	 * @param sequenceId
	 *            the sequenceId to set
	 */
	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	/**
	 * 
	 * @param inputField
	 *            the inputField to be added to the list
	 */
	public void addInputField(FieldSet inputField) {
		if (inputFields == null) {
			inputFields = new ArrayList<FieldSet>();
		}
		this.inputFields.add(inputField);
	}

	/**
	 * 
	 * @param outputField
	 *            the outputField to the added to the list
	 */
	public void addOutputField(FieldSet outputField) {
		if (outputFields == null) {
			outputFields = new ArrayList<FieldSet>();
		}
		this.outputFields.add(outputField);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(RuleSet o) {
		return Integer.valueOf(this.sequenceId).compareTo(o.getSequenceId());
	}

	/**
	 * @return the condition
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * @param condition
	 *            the condition to set
	 */
	public void setCondition(Expression condition) {
		this.condition = condition;
	}

}
