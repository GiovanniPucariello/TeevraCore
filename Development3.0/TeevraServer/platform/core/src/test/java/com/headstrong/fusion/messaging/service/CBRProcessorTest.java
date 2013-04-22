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
 * $Id: CBRProcessorTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 3, 2008 
 */

package com.headstrong.fusion.messaging.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.config.CBREndPointConfig;
import com.headstrong.fusion.config.Otherwise;
import com.headstrong.fusion.config.When;

/**
 * 
 */
public class CBRProcessorTest extends TestCase {
	ObjectDescriptorCache cache = ObjectDescriptorCache.getInstance();
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		// setup primitive schema descriptors.
		ObjectDescriptor stringDesc = new ObjectDescriptor();
		stringDesc.setId(new Long(1));
		stringDesc.setName("STRING");
		stringDesc.setDesc("STRING");
		stringDesc.setPrimitive(true);
		cache.addDescriptor("STRING", stringDesc);

		ObjectDescriptor longDesc = new ObjectDescriptor();
		longDesc.setId(new Long(2));
		longDesc.setName("LONG");
		longDesc.setDesc("LONG");
		longDesc.setPrimitive(true);
		cache.addDescriptor("LONG", longDesc);
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void testProcessSimple() throws Exception {

		// ***********************************************************************************//
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();

		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(2));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		AttributeDescriptor attributeDept = new AttributeDescriptor();
		attributeDept.setAttributeId(new Long(3));
		attributeDept.setAttributeName("department");
		attributeDept.setAttrRelation("121");
		attributeDept.setType(cache.getDescriptor("STRING"));
		attributes.put("department", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// ***********************************************************************************//
		
		// **********************************************************************************//
		List<DefaultBusinessObject> input = new ArrayList<DefaultBusinessObject>();
		DefaultBusinessObject bo1 = new DefaultBusinessObject();
		bo1.setObjectDescriptor(objectDesc);
		Map<String, Object> data1 = new HashMap<String, Object>();
		data1.put("id", "1");
		data1.put("name", "dummy1");
		data1.put("department", "science");
		bo1.setAttributeValues(data1);
		
		DefaultBusinessObject bo2 = new DefaultBusinessObject();
		bo2.setObjectDescriptor(objectDesc);
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("id", "2");
		data2.put("name", "dummy2");
		data2.put("department", "science");
		bo2.setAttributeValues(data2);
		
		DefaultBusinessObject bo3 = new DefaultBusinessObject();
		bo3.setObjectDescriptor(objectDesc);
		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("id", "3");
		data3.put("name", "dummy3");
		data3.put("department", "math");
		bo3.setAttributeValues(data3);
		
		input.add(bo1);
		input.add(bo2);
		input.add(bo3);
		
		CamelContext context = null;
		Exchange exchange = new DefaultExchange(context);
		Message in = new DefaultMessage();
		in.setBody(input);
		exchange.setIn(in);
		//**********************************************************************************//
		
		//*********************************************************************************//
		
		CBREndPointConfig config = new CBREndPointConfig();
		config.setId("CBR");
		List<When> whens = new ArrayList<When>();
		
		When when1 = new When();
		when1.setExpression("#body{department}.equals(\"science\")");
/*		FieldPredicate predicate1 = new FieldPredicate();
		predicate1.setName("department");
		predicate1.setValue("science");
		when1.setPredicate(predicate1);
*/		
		When when2 = new When();
		when2.setExpression("#body{department}.equals(\"physics\")");
/*		FieldPredicate predicate2 = new FieldPredicate();
		predicate2.setName("department");
		predicate2.setValue("physics");
		when2.setPredicate(predicate2);
*/		
		Otherwise otherwise = new Otherwise();
		otherwise.setTo(null);
		
		whens.add(when1);
		whens.add(when2);
		
		config.setWhen(whens);
		config.setOtherwise(otherwise);
		
		//******************************************************************************//
		CBRProcessor processor = new CBRProcessor(config);
		
		processor.process(exchange);
		
		//******************************************************************************//
		
		List<List<DefaultBusinessObject>> output = (List<List<DefaultBusinessObject>>) exchange.getIn().getBody();
		//********************************************************************************//
		
		assertEquals(3, output.size());
		
		List<DefaultBusinessObject> scienceList = output.get(0);
		assertEquals(2, scienceList.size());
		assertEquals("dummy2", scienceList.get(1).getValue("name"));
		
		assertSame(Collections.EMPTY_LIST,output.get(1));
		
		assertEquals(1, output.get(2).size());
		
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void testProcessForHeader() throws Exception {


		// ***********************************************************************************//
		
		// **********************************************************************************//
		
		CamelContext context = null;
		Exchange exchange = new DefaultExchange(context);
		Message in = new DefaultMessage();
		in.setBody("Type1");
		in.setHeader("type", "type1");
		exchange.setIn(in);
		//**********************************************************************************//
		
		//*********************************************************************************//
		
		CBREndPointConfig config = new CBREndPointConfig();
		config.setId("CBR");
		List<When> whens = new ArrayList<When>();
		
		When when1 = new When();
		when1.setExpression("#header{type}.equals(\"type1\")");
		
		When when2 = new When();
		when2.setExpression("#header{type}.equals(\"type2\")");

		Otherwise otherwise = new Otherwise();
		otherwise.setTo(null);
		
		whens.add(when1);
		whens.add(when2);
		
		config.setWhen(whens);
		config.setOtherwise(otherwise);
		
		//******************************************************************************//
		CBRProcessor processor = new CBRProcessor(config);
		
		processor.process(exchange);
		
		//******************************************************************************//
		
		List<Object> output = (List<Object>) exchange.getIn().getBody();
		//********************************************************************************//
		
		assertEquals(3, output.size());
		Object Type1 = output.get(0);
		assertEquals("Type1", Type1);
		
	}


}
