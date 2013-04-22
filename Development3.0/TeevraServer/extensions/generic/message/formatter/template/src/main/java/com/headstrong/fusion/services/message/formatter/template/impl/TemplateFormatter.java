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
 * $Id: TemplateFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.message.formatter.template.impl;

import static com.headstrong.fusion.services.message.formatter.template.TemplateFormatterService.MESSAGE;
import static com.headstrong.fusion.services.message.formatter.template.TemplateFormatterService.HEADER;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.tools.generic.MathTool;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.commons.FusionConstants;

/**
 * Template formatter takes velocity tempates and generates 
 * formatted message for the input message.
 * 
 */
public class TemplateFormatter {

	/**
	 * Takes the list of Business Objects and formats it
	 * as per the template ( Apache Velocity Template ) provided.
	 * 
	 * @param message
	 * @param template
	 * @return Formatted Message.
	 * @throws ResourceNotFoundException
	 * @throws ParseErrorException
	 * @throws MethodInvocationException
	 * @throws IOException
	 */
	public String format(Map<String, Object> headers,
			List<BusinessObject> messages, Template template)
			throws ResourceNotFoundException, ParseErrorException,
			MethodInvocationException, IOException {
		String formatString = null;
		StringBuilder formatBuffer = new StringBuilder();
		for (BusinessObject message : messages) {
			formatBuffer.append(this.format(headers, message, template));
			formatBuffer.append(FusionConstants.NEW_LINE);
		}
		formatString = formatBuffer.toString();
		if (formatString != null
				&& formatString.endsWith(FusionConstants.NEW_LINE)) {
			formatString = formatString.substring(0, formatString.length() - 1);
		}
		return formatString;
	}

	/**
	 * Takes the Business Objects and formats it
	 * as per the template ( Apache Velocity Template ) provided.
	 * 
	 * @param headers
	 * @param message
	 * @param template
	 * @return Formatted Message.
	 * @throws ResourceNotFoundException
	 * @throws ParseErrorException
	 * @throws MethodInvocationException
	 * @throws IOException
	 */
	public String format(Map<String, Object> headers, Object message,
			Template template) throws ResourceNotFoundException,
			ParseErrorException, MethodInvocationException, IOException {
		StringWriter writer = new StringWriter();
		VelocityContext context = new VelocityContext();
		context.put(HEADER, headers);
		context.put(MESSAGE, message);
		context.put("Math",new MathTool());
		template.merge(context, writer);
		return writer.toString();
	}

}
