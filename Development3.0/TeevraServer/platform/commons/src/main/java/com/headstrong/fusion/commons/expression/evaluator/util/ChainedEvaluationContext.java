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
 * $Id: ChainedEvaluationContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.util;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;

/**
 * <p>
 * Provides a wrapper around another EvaluationContext.
 * </p>
 * 
 * <p>
 * This is useful when you want to have a shared, global set of functions and
 * values, but also want to have some functions and values local to one
 * EvaluationContext.
 * </p>
 * 
 * <p>
 * This class provides read-only access to the parent EvaluationContext, and
 * searches the local environment before searching the parent.
 * </p>
 */
public class ChainedEvaluationContext extends DefaultEvaluationContext {
	/**
	 * The parent EvaluationContext of this ChainedEvaluationContext.
	 */
	private EvaluationContext parent;

	/**
	 * Creates a new ChainedEvaluationContext.
	 * 
	 * @param parent
	 *            The parent EvaluationContext.
	 */
	public ChainedEvaluationContext(EvaluationContext parent) {
		if (null == parent)
			throw new IllegalArgumentException("Parent must not be null");
		this.parent = parent;
	}

	/**
	 * Gets the value of the specified identifier.
	 * 
	 * @param identifier
	 *            The identifier for the value.
	 * 
	 * @return The value of the specified value.
	 */
	public Object get(String identifier) {
		Object value = super.get(identifier);
		if (null == value) {
			value = parent.get(identifier);
		}
		return value;
	}

	@SuppressWarnings("unchecked")
	public Map getAll() {
		HashMap map = new HashMap();
		map.putAll(parent.getAll());
		map.putAll(super.getAll());
		return map;
	}
}
