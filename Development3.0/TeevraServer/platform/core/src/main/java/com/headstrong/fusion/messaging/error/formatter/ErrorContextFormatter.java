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
 * $Id: ErrorContextFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.messaging.error.formatter;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.headstrong.fusion.bo.BoTemplateCreatorUtil;
import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.headstrong.fusion.commons.exception.ErrorContext;

/**
 * A generic formatter class that will convert the error Context into a Map of
 * records.
 */
public class ErrorContextFormatter {
	private static final Logger log = LoggerFactory
			.getLogger(ErrorContextFormatter.class);

	private static String PREAPPEND_STRING = "message.value.";
	private static String NAMESPACE_URI = "http://www.headstrong.com/TEEVRA-FIXML-1-0";
	private static String FIXML_ERROR = "ErrorMessageT";

	/**
	 * Converts the error context into XML format.
	 * 
	 * @param errorContext
	 * @return formatted xml string.
	 * @throws Exception
	 */
	public static String formatToXml(ErrorContext errorContext)
			throws Exception {
		Document document = null;
		document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.newDocument();

		// root element.
		Element error = document.createElement("Error");
		document.appendChild(error);

		if (errorContext.getServiceId() != null) {
			// service id
			Element serviceIdElem = document.createElement("ServiceId");
			serviceIdElem.setTextContent(errorContext.getServiceId());
			error.appendChild(serviceIdElem);
		}

		if (errorContext.getComponentType() != null) {
			// component type
			Element componentTypeElem = document.createElement("ComponentType");
			componentTypeElem.setTextContent(errorContext.getComponentType());
			error.appendChild(componentTypeElem);
		}

		if (errorContext.getType() != null) {
			Element exceptionTypeElem = document.createElement("ExceptionType");
			exceptionTypeElem.setTextContent(errorContext.getType());
			error.appendChild(exceptionTypeElem);
		}

		if (errorContext.getTimestamp() != null) {
			Element timestampElem = document.createElement("Timestamp");
			timestampElem
					.setTextContent(errorContext.getTimestamp().toString());
			error.appendChild(timestampElem);
		}

		if (errorContext.getMoreInfo() != null) {
			Element moreInfoElem = document.createElement("MoreInfo");
			moreInfoElem.setTextContent(errorContext.getMoreInfo().toString());
			error.appendChild(moreInfoElem);
		}

		if (errorContext.getCause() != null) {
			Element stackTraceElem = document.createElement("ErrorDesc");
			Writer writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			errorContext.getCause().printStackTrace(printWriter);
			stackTraceElem.setTextContent(writer.toString());
			error.appendChild(stackTraceElem);
		}

		if (errorContext.getResource() != null) {
			Object resource = errorContext.getResource();
			Element resourceElem = document.createElement("Resource");
			StringBuffer resourceBuffer = new StringBuffer();
			if (resource instanceof List) {
				List<Object> resourceList = (List<Object>) resource;
				for (Object record : resourceList) {
					resourceBuffer.append(formatResource(record));
				}
			} else {
				resourceBuffer.append(formatResource(resource));
			}
			resourceElem.setTextContent(resourceBuffer.toString());
			error.appendChild(resourceElem);
		}

		/**
		 * any additional elements.
		 */
		for (Entry<String, String> entry : errorContext.getProperties()
				.entrySet()) {
			Element stackTraceElem = document.createElement(entry.getKey());
			stackTraceElem.setTextContent(entry.getValue());
			error.appendChild(stackTraceElem);
		}

		OutputFormat format = new OutputFormat(document);
		StringWriter stringOut = new StringWriter();
		XMLSerializer serial = new XMLSerializer(stringOut, format);
		serial.asDOMSerializer();
		serial.serialize(document.getDocumentElement());

		return stringOut.toString();
	}

	public static String formatToFixmlSp2(ErrorContext errorContext)
			throws InvalidAttributeExpressionException {

		JavaBusinessObject errorBo = null;
		String className = null;

		String fixmlVersion = errorContext.getFixmlVersion();
		if (fixmlVersion != null
				&& fixmlVersion.equalsIgnoreCase("FIXML_5_0_SP2")) {
			className = FIXML_ERROR;
		} else if (fixmlVersion != null
				&& fixmlVersion.equalsIgnoreCase("TEEVRA_FIXML_1_0")) {
			className = FIXML_ERROR;
		} else {
			className = FIXML_ERROR;
			errorContext.setFixmlVersion("TEEVRA_FIXML_1_0");
		}

		try {

			errorBo = (JavaBusinessObject) BoTemplateCreatorUtil.valueOf(
					errorContext.getFixmlVersion()).createBoFromClassShortName(
					errorContext.getFixmlVersion(), className, "Error");

		} catch (Exception e2) {
			log.error("Error while creating error Object", e2);

		}

		/*
		 * QName qName = new QName(NAMESPACE_URI, "Error"); FIXML fixml = new
		 * FIXML(); Class bodyClass = ErrorMessageT.class; AbstractMessageT
		 * abstractBody = null; try { abstractBody = (AbstractMessageT)
		 * bodyClass.newInstance(); } catch (InstantiationException e1) {
		 * e1.printStackTrace(); } catch (IllegalAccessException e1) {
		 * e1.printStackTrace(); } JAXBElement element = new JAXBElement(qName,
		 * bodyClass, null, abstractBody); fixml.setMessage(element);
		 * 
		 * JavaBusinessObject errorBo = new JavaBusinessObject(fixml);
		 * errorBo.setBusinessObjectMarshaller(new FixmlMarshaller(
		 * FixmlContextFactory.getFixmlContext(FixmlNamespace.DEFAULT)
		 * .getMarshaller()));
		 */

		try {
			errorBo.setValue(PREAPPEND_STRING + "ErrorCode", "TEEVRA");
			if (errorContext.getType() != null) {
				errorBo.setValue(PREAPPEND_STRING + "ErrorType", errorContext
						.getType());
			}
			if (errorContext.getComponentType() != null) {
				errorBo.setValue(PREAPPEND_STRING + "Source", errorContext
						.getComponentType());
			}
			if (errorContext.getTimestamp() != null) {
				XMLGregorianCalendar timeStamp = getTimeStamp(errorContext);

				errorBo.setValue(PREAPPEND_STRING + "Timestamp", timeStamp);
			}
			if (errorContext.getCause() != null) {
				errorBo.setValue(PREAPPEND_STRING + "ErrorMessage",
						errorContext.getCause().getMessage());
			}
			if (errorContext.getMoreInfo() != null) {
				errorBo.setValue(PREAPPEND_STRING + "ErrorDesc", errorContext
						.getMoreInfo());
			}
			if (errorContext.getResource() != null) {
				Object resource = errorContext.getResource();
				if (resource instanceof List) {
					List<Object> resourceList = (List<Object>) resource;
					for (Object record : resourceList) {

						errorBo.setValue(PREAPPEND_STRING + "ErrorRecord",
								formatResource(record));
					}
				} else {
					errorBo.setValue(PREAPPEND_STRING + "ErrorRecord",
							formatResource(resource));
				}
			}
			for (Entry<String, String> entry : errorContext.getProperties()
					.entrySet()) {
				errorBo.setValue(PREAPPEND_STRING + entry.getKey(), entry
						.getValue());

			}

		} catch (AttributeNotFoundException e) {
			log.error("Attribute Not found", e);
		}

		String errorDesc = errorContext.getMoreInfo();

		if (null != errorDesc
				&& errorDesc.toString().equals("Tech Error from Euronext")) {
			Object resource = errorContext.getResource();
			JavaBusinessObject techErrorBo = (JavaBusinessObject) resource;
			XMLGregorianCalendar timeStamp = getTimeStamp(errorContext);
			try {
				techErrorBo.setValue(PREAPPEND_STRING + "Timestamp", timeStamp);
				techErrorBo.setValue(PREAPPEND_STRING + "ErrorType",
						errorContext.getType());

			} catch (AttributeNotFoundException e) {
				log.error("Attribute Not found", e);
			}
			return techErrorBo.toXml();
		}

		return errorBo.toXml();
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param errorContext
	 * @return
	 */
	private static XMLGregorianCalendar getTimeStamp(ErrorContext errorContext) {
		GregorianCalendar gc = (GregorianCalendar) GregorianCalendar
				.getInstance();
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-ddhh:mm:ss");

		gc.setTime(errorContext.getTimestamp());
		DatatypeFactory dataTypeFactory = null;
		try {
			dataTypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException ex) {
			log.error("Configuration error",ex);

		}
		XMLGregorianCalendar timeStamp = dataTypeFactory
				.newXMLGregorianCalendar(gc);
		timeStamp.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
		return timeStamp;
	}

	/**
	 * Converts the error context into XML format.
	 * 
	 * @param errorContext
	 * @return formatted xml string.
	 * @throws Exception
	 */
	public static String formatToFixml(ErrorContext errorContext)
			throws Exception {
		Document document = null;
		document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.newDocument();

		// root element.
		Element fixml = document.createElement("FIXML");
		document.appendChild(fixml);
		Element error = document.createElement("Error");
		fixml.appendChild(error);

		// append error code attribute.
		Attr errorCodeAttr = document.createAttribute("ErrorCode");
		errorCodeAttr.setTextContent("TEEVRA");
		error.setAttributeNode(errorCodeAttr);

		// set error type attribute.
		if (errorContext.getType() != null) {
			Attr errorTypeAttr = document.createAttribute("ErrorType");
			errorTypeAttr.setTextContent(errorContext.getType());
			error.setAttributeNode(errorTypeAttr);
		}

		// append error code attribute.
		if (errorContext.getComponentType() != null) {
			// component type
			Attr sourceAttr = document.createAttribute("Source");
			sourceAttr.setTextContent(errorContext.getComponentType());
			error.setAttributeNode(sourceAttr);
		}

		// set time stamp.
		if (errorContext.getTimestamp() != null) {
			Attr timestampAttr = document.createAttribute("Timestamp");
			timestampAttr
					.setTextContent(errorContext.getTimestamp().toString());
			error.setAttributeNode(timestampAttr);
		}

		if (errorContext.getCause() != null) {
			// set error message attribute.
			Attr errorMessageAttr = document.createAttribute("ErrorMessage");
			errorMessageAttr.setTextContent(errorContext.getCause()
					.getMessage());
			error.setAttributeNode(errorMessageAttr);
			// set error stack trace

			Element stackTraceElem = document.createElement("ErrorDesc");
			stackTraceElem.setTextContent(errorContext.getMoreInfo());

			// TODO Stack trace removed from error desc (Arunk - 31 Jul 2009).
			// Need to decide what should go inside this element and if needed
			// remove stack trace from all other types of formatting

			// Writer writer = new StringWriter();
			// PrintWriter printWriter = new PrintWriter(writer);
			// errorContext.getCause().printStackTrace(printWriter);
			// stackTraceElem.setTextContent(writer.toString());
			error.appendChild(stackTraceElem);
		}
		if (errorContext.getResource() != null) {
			Object resource = errorContext.getResource();
			Element resourceElem = document.createElement("ErrorRecord");
			StringBuffer resourceBuffer = new StringBuffer();
			if (resource instanceof List) {
				List<Object> resourceList = (List<Object>) resource;
				for (Object record : resourceList) {
					resourceBuffer.append(formatResource(record));
				}
			} else {
				resourceBuffer.append(formatResource(resource));
			}
			resourceElem.setTextContent(resourceBuffer.toString());
			error.appendChild(resourceElem);
		}

		for (Entry<String, String> entry : errorContext.getProperties()
				.entrySet()) {
			Element stackTraceElem = document.createElement(entry.getKey());
			stackTraceElem.setTextContent(entry.getValue());
			error.appendChild(stackTraceElem);
		}

		OutputFormat format = new OutputFormat(document);
		StringWriter stringOut = new StringWriter();
		XMLSerializer serial = new XMLSerializer(stringOut, format);
		serial.asDOMSerializer();
		serial.serialize(document.getDocumentElement());

		return stringOut.toString();
	}

	private static String formatResource(Object resource)
			throws InvalidAttributeExpressionException {
		String resourceString = null;
		if (resource instanceof BusinessObject) {
			resourceString = ((BusinessObject) resource).toXml();
		} else {
			resourceString = resource.toString();
		}
		return resourceString;
	}

	/**
	 * Converts the incoming error context into a List of values. order of
	 * fields is as follows. <li>exception type</li> <li>service id</li> <li>
	 * component type</li> <li>timstamp</li> <li>exception stack trace</li> <li>
	 * resource</li> <li>additional information</li>
	 * 
	 * @param errorContext
	 *            Error Context.
	 * @return List of attributes.
	 * @throws Exception
	 */
	public static List<Object> formatToList(ErrorContext errorContext)
			throws Exception {
		// FIXME :: properties not taken care of please add.
		List<Object> error = new ArrayList<Object>();
		// add service id .. Null not handled as same is required to maintain
		// the order.
		error.add(errorContext.getType());
		error.add(errorContext.getServiceId());
		error.add(errorContext.getComponentType());
		error.add(new Timestamp(errorContext.getTimestamp().getTime()));
		if (errorContext.getCause() != null) {
			Writer writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			errorContext.getCause().printStackTrace(printWriter);
			error.add(writer.toString());
		} else {
			error.add(null);
		}
		if (errorContext.getResource() != null) {
			Object resource = errorContext.getResource();
			StringBuffer resourceBuffer = new StringBuffer();
			if (resource instanceof List) {
				List<Object> resourceList = (List<Object>) resource;
				for (Object record : resourceList) {
					resourceBuffer.append(formatResource(record));
				}
			} else {
				resourceBuffer.append(formatResource(resource));
			}
			error.add(resourceBuffer.toString());
		} else {
			error.add(null);
		}
		error.add(errorContext.getMoreInfo());
		return error;
	}
}
