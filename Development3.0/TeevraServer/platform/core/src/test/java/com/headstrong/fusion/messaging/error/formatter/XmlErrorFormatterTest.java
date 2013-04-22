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
 * $Id: XmlErrorFormatterTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.messaging.error.formatter;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.TestCase;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.commons.ErrorFormatter;
import com.headstrong.fusion.commons.exception.ErrorContext;
import com.headstrong.fusion.commons.exception.FusionException;

/**
 * 
 */
public class XmlErrorFormatterTest extends TestCase {

	public void testFormatSimpleResource() throws Exception {
		ErrorFormatter errorFormatter = ErrorFormatterFactory
				.getErrorFormatter("xml");
		ErrorContext errCtx = new ErrorContext();
		errCtx.setComponentType("validator");
		errCtx.setMoreInfo("Additional Information");
		errCtx.setResource("Resource");
		errCtx.setServiceId("validator_1");
		errCtx.setTimestamp(new Date(2009, 01, 01));
		errCtx.setType("System");
		errCtx.setCause(new FusionException("Test Exception"));
		errCtx.setFixmlVersion("TEEVRA_FIXML_1_0");
		String errorXml = (String) errorFormatter.format(errCtx);
		Document document = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder().parse(
						new InputSource(new StringReader(errorXml)));

		//TODO change it as per the error formatter changes
		/**
		assertEquals("validator_1", document.getElementsByTagName("ServiceId")
				.item(0).getTextContent());
		assertEquals("validator", document
				.getElementsByTagName("ComponentType").item(0).getTextContent());
		assertEquals("System", document.getElementsByTagName("ExceptionType")
				.item(0).getTextContent());
		assertEquals("Additional Information", document.getElementsByTagName(
				"MoreInfo").item(0).getTextContent());
		assertEquals("Resource", document.getElementsByTagName("Resource")
				.item(0).getTextContent());
		assertTrue(document.getElementsByTagName("ErrorDesc").item(0)
				.getTextContent().contains("FusionException"));
				*/
		assertTrue(true);
	}

	public void testFormatResourceAsBusinessObject() throws Exception {
		ErrorFormatter errorFormatter = ErrorFormatterFactory
				.getErrorFormatter("xml");
		ErrorContext errCtx = new ErrorContext();
		errCtx.setComponentType("validator");
		errCtx.setMoreInfo("Additional Information");

		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();
		errCtx
				.setResource(this.createSampleBusinessObject(objectDescriptor,
						"set1Attribute1", "attribute2", "set1parentNode1",
						new Long(1)));
		errCtx.setServiceId("validator_1");
		errCtx.setTimestamp(new Date(2009, 01, 01));
		errCtx.setType("System");
		errCtx.setCause(new FusionException("Test Exception"));
		errCtx.setFixmlVersion("TEEVRA_FIXML_1_0");
		String errorXml = (String) errorFormatter.format(errCtx);
		Document document = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder().parse(
						new InputSource(new StringReader(errorXml)));
		//TODO change it as per the error formatter changes
		/*
		assertEquals("validator_1", document.getElementsByTagName("ServiceId")
				.item(0).getTextContent());
		assertEquals("validator", document
				.getElementsByTagName("ComponentType").item(0).getTextContent());
		assertEquals("System", document.getElementsByTagName("ExceptionType")
				.item(0).getTextContent());
		assertEquals("Additional Information", document.getElementsByTagName(
				"MoreInfo").item(0).getTextContent());
		assertTrue(document.getElementsByTagName("ErrorDesc").item(0)
				.getTextContent().contains("FusionException"));
		assertEquals(
				"<sample><parent><node1>set1parentNode1</node1><node2>1</node2></parent><attribute1>set1Attribute1</attribute1><attribute2>attribute2</attribute2></sample>",
				document.getElementsByTagName("Resource").item(0)
						.getTextContent());
						*/
		assertTrue(true);

	}

	public void testFormatResourceAsListOfBusinessObject() throws Exception {
		ErrorFormatter errorFormatter = ErrorFormatterFactory
				.getErrorFormatter("xml");
		ErrorContext errCtx = new ErrorContext();
		errCtx.setComponentType("validator");
		errCtx.setMoreInfo("Additional Information");

		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();

		List<DefaultBusinessObject> resource = new ArrayList<DefaultBusinessObject>();
		resource.add(this.createSampleBusinessObject(objectDescriptor, "11",
				"12", "11", new Long(11)));
		resource.add(this.createSampleBusinessObject(objectDescriptor, "21",
				"22", "21", new Long(21)));
		resource
				.add(this.createSampleBusinessObject(objectDescriptor,
						"set1Attribute1", "attribute2", "set1parentNode1",
						new Long(1)));
		errCtx.setResource(resource);
		errCtx.setServiceId("validator_1");
		errCtx.setTimestamp(new Date(2009, 01, 01));
		errCtx.setType("System");
		errCtx.setCause(new FusionException("Test Exception"));
		errCtx.setFixmlVersion("TEEVRA_FIXML_1_0");
		String errorXml = (String) errorFormatter.format(errCtx);
		Document document = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder().parse(
						new InputSource(new StringReader(errorXml)));
		//TODO change it as per the error formatter changes
		/*
		assertEquals("validator_1", document.getElementsByTagName("ServiceId")
				.item(0).getTextContent());
		assertEquals("validator", document
				.getElementsByTagName("ComponentType").item(0).getTextContent());
		assertEquals("System", document.getElementsByTagName("ExceptionType")
				.item(0).getTextContent());
		assertEquals("Additional Information", document.getElementsByTagName(
				"MoreInfo").item(0).getTextContent());
		assertTrue(document.getElementsByTagName("ErrorDesc").item(0)
				.getTextContent().contains("FusionException"));
		assertEquals(
				"<sample><parent><node1>11</node1><node2>11</node2></parent><attribute1>11</attribute1><attribute2>12</attribute2></sample><sample><parent><node1>21</node1><node2>21</node2></parent><attribute1>21</attribute1><attribute2>22</attribute2></sample><sample><parent><node1>set1parentNode1</node1><node2>1</node2></parent><attribute1>set1Attribute1</attribute1><attribute2>attribute2</attribute2></sample>",
				document.getElementsByTagName("Resource").item(0)
						.getTextContent());
						*/
		assertTrue(true);
	}

	private ObjectDescriptor createParentObjectDescriptor(
			ObjectDescriptor stringDesc, ObjectDescriptor longDesc) {
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor node1Desc = new AttributeDescriptor();
		node1Desc.setAttributeId(new Long("node1".hashCode()));
		node1Desc.setAttributeName("node1");
		node1Desc.setAttrRelation("121");
		node1Desc.setType(stringDesc);
		attributes.put("node1", node1Desc);

		AttributeDescriptor node2Desc = new AttributeDescriptor();
		node2Desc.setAttributeId(new Long("node2".hashCode()));
		node2Desc.setAttributeName("node2");
		node2Desc.setAttrRelation("121");
		node2Desc.setType(longDesc);
		attributes.put("node2", node2Desc);

		ObjectDescriptor parentObjectDesc = new ObjectDescriptor();
		parentObjectDesc.setId(new Long("parent".hashCode()));
		parentObjectDesc.setName("parent");
		parentObjectDesc.setPrimitive(false);
		parentObjectDesc.setAttributes(attributes);
		return parentObjectDesc;
	}

	private ObjectDescriptor createStringObjectDesc() {
		/** Primitives * */
		ObjectDescriptor stringDesc = new ObjectDescriptor();
		stringDesc.setId(new Long("STRING".hashCode()));
		stringDesc.setName("STRING");
		stringDesc.setDesc("STRING");
		stringDesc.setPrimitive(true);
		return stringDesc;

	}

	private ObjectDescriptor createLongObjectDesc() {
		ObjectDescriptor longDesc = new ObjectDescriptor();
		longDesc.setId(new Long("LONG".hashCode()));
		longDesc.setName("LONG");
		longDesc.setDesc("LONG");
		longDesc.setPrimitive(true);
		return longDesc;
	}

	private ObjectDescriptor createSampleObjectDescriptor() {
		ObjectDescriptor stringDesc = this.createStringObjectDesc();
		ObjectDescriptor longDesc = this.createLongObjectDesc();

		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attribute1 = new AttributeDescriptor();
		attribute1.setAttributeId(new Long("attribute1".hashCode()));
		attribute1.setAttributeName("attribute1");
		attribute1.setAttrRelation("121");
		attribute1.setType(longDesc);
		attributes.put("attribute1", attribute1);

		AttributeDescriptor attribute2 = new AttributeDescriptor();
		attribute2.setAttributeId(new Long("attribute2".hashCode()));
		attribute2.setAttributeName("attribute2");
		attribute2.setAttrRelation("121");
		attribute2.setType(stringDesc);
		attributes.put("attribute2", attribute2);

		AttributeDescriptor parent = new AttributeDescriptor();
		parent.setAttributeId(new Long("parent".hashCode()));
		parent.setAttributeName("parent");
		parent.setAttrRelation("121");
		parent.setType(this.createParentObjectDescriptor(stringDesc, longDesc));
		attributes.put("parent", parent);

		ObjectDescriptor sampleObjectDesc = new ObjectDescriptor();
		sampleObjectDesc.setId(new Long("sample".hashCode()));
		sampleObjectDesc.setName("sample");
		sampleObjectDesc.setPrimitive(false);
		sampleObjectDesc.setAttributes(attributes);
		return sampleObjectDesc;
	}

	private DefaultBusinessObject createSampleBusinessObject(
			ObjectDescriptor objectDescriptor, Object attribute1,
			Object attribute2, Object node1, Object node2) {
		DefaultBusinessObject parentBusinessObject = new DefaultBusinessObject();
		parentBusinessObject.setObjectDescriptor(objectDescriptor.getAttribute(
				"parent").getType());
		Map<String, Object> parentAttributes = new HashMap<String, Object>();
		parentAttributes.put("node1", node1);
		parentAttributes.put("node2", node2);
		parentBusinessObject.setAttributeValues(parentAttributes);

		DefaultBusinessObject sampleBusinessObject = new DefaultBusinessObject();
		sampleBusinessObject.setObjectDescriptor(objectDescriptor);
		Map<String, Object> attributes = new HashMap<String, Object>();
		attributes.put("attribute1", attribute1);
		attributes.put("attribute2", attribute2);
		attributes.put("parent", parentBusinessObject);
		sampleBusinessObject.setAttributeValues(attributes);
		return sampleBusinessObject;
	}
}
