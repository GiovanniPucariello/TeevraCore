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
 * $Id: TemplateServiceConfigParserImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.message.formatter.template.serviceconfig;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;

/**
 * 
 * 
 */
public class TemplateServiceConfigParserImpl implements
		TemplateServiceConfigParser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.config.parse.ServiceConfigurationParser#parseConfiguration(java.lang.Object)
	 */
	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException {
		// the configuration would be a template with field name
		// referred to as #header{field1} or #body{parent.child1} which
		// has to replaced with
		// $header.getValue("field1") and $message.getValue("parent.child1") and
		// creates a Velocity Template

		String serviceConfig = ((String) configuration);

/*		for (Entry<String, String> field : getTokens(serviceConfig, "#header")
				.entrySet()) {
			serviceConfig = serviceConfig.replaceAll(Pattern.quote(field
					.getKey()), "\\$" + HEADER + ".get(\""
					+ field.getValue() + "\")");
		}

		for (Entry<String, String> field : getTokens(serviceConfig, "#body")
				.entrySet()) {
			serviceConfig = serviceConfig.replaceAll(Pattern.quote(field
					.getKey()), "\\$" + BODY + ".getValue(\""
					+ field.getValue() + "\")");
		}
*/		return serviceConfig;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param str
	 * @param identifier
	 * @return
	 */
	private Map<String, String> getTokens(String str, String identifier) {
		int identifierIndex = 0;
		int fieldIndex = 0;
		Map<String, String> tokens = new HashMap<String, String>();
		while (true) {
			identifierIndex = str.indexOf(identifier, fieldIndex);
			if (identifierIndex != -1) {
				fieldIndex = identifierIndex + identifier.length() + 1;
				String token = str.substring(identifierIndex, str.indexOf("}",
						fieldIndex) + 1);
				String field = str.substring(fieldIndex, str.indexOf("}",
						fieldIndex));
				tokens.put(token, field);
			} else {
				break;
			}
		}
		return tokens;
	}
}
