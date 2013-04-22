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
 * $Id: BSFScriptingManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Dec 16, 2008 
 */

package com.headstrong.fusion.services.scripting.engine;

import groovy.util.ScriptException;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class BSFScriptingManager implements ScriptingManager {

	private static final Logger logger = LoggerFactory.getLogger(BSFScriptingManager.class);
	/**
	 * Fusion Scripting Engine works on Apache BSF.
	 */
	private BSFManager bsfManager;
	
	public BSFScriptingManager() {
		this.setBsfManager(new BSFManager());
	}

	/**
	 * @return the bsfManager
	 */
	public BSFManager getBsfManager() {
		return bsfManager;
	}

	/**
	 * @param bsfManager
	 *            the bsfManager to set
	 */
	public void setBsfManager(BSFManager bsfManager) {
		this.bsfManager = bsfManager;
		this.bsfManager.setClassLoader(this.getClass().getClassLoader());
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param lang
	 *            language identifier
	 * @param source
	 *            (context info) the source of this expression (e.g., filename)
	 * @param lineNo
	 *            (context info) the line number in source for expr
	 * @param columnNo
	 *            (context info) the column number in source for expr
	 * @param expr
	 *            the expression to evaluate
	 * @param beans
	 *            Beans
	 * @return
	 * @throws ScriptException
	 */
	public synchronized Object eval(String lang, String source, int lineNo,
			int columnNo, Object expr, Map<String, Object> beans)
			throws ScriptException {

		Object eval;
		if (beans != null) {
			this.declareBeans(beans);
		}
		try {
			eval = this.getBsfManager().eval(lang, source, lineNo, columnNo,
					expr);
		} catch (BSFException e) {
			logger.error("Error evaluating script" ,e);
			throw new ScriptException(e);
		}

		if (beans != null) {
			this.unDeclareBeans(beans);
		}

		return eval;
	}

	/**
	 * Evaluates the script.
	 * 
	 * @param lang
	 *            Scripting language
	 * @param source
	 *            Source Name
	 * @param expr
	 *            Expression.
	 * @param beans
	 *            Map of beans
	 * @return
	 * @throws ScriptException
	 */
	public synchronized Object eval(String lang, String source, Object expr,
			Map<String, Object> beans) throws ScriptException {
		return this.eval(lang, source, 0, 0, expr, beans);
	}

	public Object eval(String lang, String source, Object expr)
			throws ScriptException {
		return this.eval(lang, source, 0, 0, expr, null);
	}

	private void declareBeans(Map<String, Object> beans) throws ScriptException {
		for (Entry<String, Object> entry : beans.entrySet()) {
			try {
				this.getBsfManager().declareBean(entry.getKey(),
						entry.getValue(), entry.getValue().getClass());
			} catch (BSFException e) {
				logger.error("Error declaring beans." ,e);
				throw new ScriptException(e);
			}
		}

	}

	private void unDeclareBeans(Map<String, Object> beans)
			throws ScriptException {
		for (Entry<String, Object> entry : beans.entrySet()) {
			try {
				this.getBsfManager().declareBean(entry.getKey(),
						entry.getValue(), entry.getValue().getClass());
			} catch (BSFException e) {
				logger.error("Error undeclaring the beans.",e);
				throw new ScriptException(e);
			}
		}

	}
}
