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
 * $Id: XmlFormatterServiceTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 26, 2009 
 */

package com.headstrong.fusion.services.message.formatter.xml.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.services.message.formatter.xml.XmlFormatterService;

/**
 * 
 */
public class XmlFormatterServiceTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testXmlFormatter() throws Exception {
		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();
		String set1Attribute1 = "set1Attribute1";
		String set1parentNode1 = "set1parentNode1";

		List<DefaultBusinessObject> input = new ArrayList<DefaultBusinessObject>();
		input.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", set1parentNode1, new Long(1)));
		input.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", set1parentNode1, new Long(2)));
		input.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", set1parentNode1, new Long(3)));

		NormalizedMessage normalizedMessage = new FusionNormalizedMessage();
		normalizedMessage.setBody(input);
		MessageExchange messageExchange = new FusionMessageExchange();
		messageExchange.setIn(normalizedMessage);

		XmlFormatterService formatterService = new XmlFormatterServiceImpl();
		formatterService.process(messageExchange, null);

		String output = messageExchange.getIn().getBody().toString();
		String expected = "<sample><parent><node1>set1parentNode1</node1><node2>1</node2></parent><attribute1>set1Attribute1</attribute1><attribute2>attribute2</attribute2></sample><sample><parent><node1>set1parentNode1</node1><node2>2</node2></parent><attribute1>set1Attribute1</attribute1><attribute2>attribute2</attribute2></sample><sample><parent><node1>set1parentNode1</node1><node2>3</node2></parent><attribute1>set1Attribute1</attribute1><attribute2>attribute2</attribute2></sample>";

		Assert.assertEquals(expected, output);

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

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
