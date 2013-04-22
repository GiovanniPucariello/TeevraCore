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
 * $Id: ScriptingManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Dec 16, 2008 
 */

package com.headstrong.fusion.services.scripting.engine;

import groovy.util.ScriptException;

import java.util.Map;

/**
 * This interface provides scripting support.
 */
public interface ScriptingManager {
	public static final String GROOVY_ENGINE = "groovy";

	public Object eval(String lang, String source, int lineNo, int columnNo,
			Object expr, Map<String, Object> beans) throws ScriptException;

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
	public Object eval(String lang, String source, Object expr,
			Map<String, Object> beans) throws ScriptException;

	public Object eval(String lang, String source, Object expr)
			throws ScriptException;
}
