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
 * $Id: DynamicBusinessObjectTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 14, 2009
 */

package com.headstrong.fusion.bo.dyn;

import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

import junit.framework.TestCase;

/**
 * {@link DynamicBusinessObject} unit test class.
 */
public class DynamicBusinessObjectTest extends TestCase {

	public void testGetValueFlat() throws Exception {
		BusinessObject dynBusinessObject = new DynamicBusinessObject();
		dynBusinessObject.setValue("attribute1", "attribute1");
		dynBusinessObject.setValue("attribute2", "attribute2");
		assertEquals("attribute1", dynBusinessObject.getValue("attribute1"));
		assertEquals("attribute2", dynBusinessObject.getValue("attribute2"));
	}
	
	public void testGetValueTree() throws Exception {
		BusinessObject dynBusinessObjectChild = new DynamicBusinessObject();
		dynBusinessObjectChild.setValue("childAttr1", "childAttr1");
		dynBusinessObjectChild.setValue("childAttr2", "childAttr2");

		BusinessObject dynBusinessObjectParent = new DynamicBusinessObject();
		dynBusinessObjectParent.setValue("attribute1", "attribute1");
		dynBusinessObjectParent.setValue("attribute2", "attribute2");
		dynBusinessObjectParent.setValue("attribute3", dynBusinessObjectChild);
		
		
		assertEquals("attribute1", dynBusinessObjectParent.getValue("attribute1"));
		assertEquals("attribute2", dynBusinessObjectParent.getValue("attribute2"));
		assertEquals("childAttr1", dynBusinessObjectParent.getValue("attribute3.childAttr1"));
		assertEquals("childAttr2", dynBusinessObjectParent.getValue("attribute3.childAttr2"));

	}
	
	public void testGetValueNullValue() throws Exception {
		BusinessObject dynBusinessObjectChild = new DynamicBusinessObject();
		dynBusinessObjectChild.setValue("childAttr1", "childAttr1");

		BusinessObject dynBusinessObjectParent = new DynamicBusinessObject();
		dynBusinessObjectParent.setValue("attribute1", "attribute1");
		dynBusinessObjectParent.setValue("attribute2", "attribute2");
		dynBusinessObjectParent.setValue("attribute3", dynBusinessObjectChild);
		
		
		assertEquals("attribute1", dynBusinessObjectParent.getValue("attribute1"));
		assertEquals("attribute2", dynBusinessObjectParent.getValue("attribute2"));
		assertEquals("childAttr1", dynBusinessObjectParent.getValue("attribute3.childAttr1"));
		assertNull(dynBusinessObjectParent.getValue("attribute3.childAttr2"));

	}
	
	
	public void testCollectionValue() throws Exception {
		BusinessObject dynBusinessObjectChild = new DynamicBusinessObject();
		BusinessObject dynBusinessObjectChild2 = new DynamicBusinessObject();
		dynBusinessObjectChild.setValue("childAttr1", "childAttr1");
		dynBusinessObjectChild2.setValue("childAttr1", "childAttr2");
		List<BusinessObject> childList = new ArrayList();
		childList.add(dynBusinessObjectChild);
		childList.add(dynBusinessObjectChild2);
		BusinessObject dynBusinessObjectParent = new DynamicBusinessObject();
		dynBusinessObjectParent.setValue("attribute1", "attribute1");
		dynBusinessObjectParent.setValue("attribute2", "attribute2");
		dynBusinessObjectParent.setValue("children", childList);
		assertEquals("childAttr1", dynBusinessObjectParent.getValue("children[0].childAttr1"));
		assertEquals("childAttr2", dynBusinessObjectParent.getValue("children[1].childAttr1"));
		assertEquals("childAttr1", dynBusinessObjectParent.getValue("children.childAttr1"));
		assertEquals(childList,dynBusinessObjectParent.getValue("children"));
	}
	
	
	public void testCaseSensitivity() throws Exception {
		BusinessObject dynBusinessObjectChild = new DynamicBusinessObject();
		dynBusinessObjectChild.setValue("childAttr1", "childAttr1");
		dynBusinessObjectChild.setValue("childAttr2", "childAttr2");

		BusinessObject dynBusinessObjectParent = new DynamicBusinessObject();
		dynBusinessObjectParent.setValue("attribute1", "attribute1");
		dynBusinessObjectParent.setValue("attribute2", "attribute2");
		dynBusinessObjectParent.setValue("attribute3", dynBusinessObjectChild);
		
		
		assertEquals("attribute1", dynBusinessObjectParent.getValue("Attribute1"));
		assertEquals("attribute2", dynBusinessObjectParent.getValue("attribute2"));
		assertEquals("childAttr1", dynBusinessObjectParent.getValue("attribute3.ChildAttr1"));
		assertEquals("childAttr2", dynBusinessObjectParent.getValue("attribute3.ChildAttr2"));

	}
	
	
	public void testSetterForDottedNotation() throws Exception{
		BusinessObject dynBusinessObjectChild = new DynamicBusinessObject();
		dynBusinessObjectChild.setValue("a.b.c", "childAttr1");
		dynBusinessObjectChild.setValue("a.b.x", "childAttr2");
		assertEquals("childAttr1", dynBusinessObjectChild.getValue("a.b.c"));
		assertEquals("childAttr2", dynBusinessObjectChild.getValue("a.b.x"));
	}
	
	
	public void testListSetterForAddedNode() throws AttributeNotFoundException, InvalidAttributeExpressionException{
		BusinessObject dynBusinessObjectChild = new DynamicBusinessObject();
		BusinessObject dynBusinessObjectChild2 = new DynamicBusinessObject();
		dynBusinessObjectChild.setValue("childAttr1", "childAttr1");
		dynBusinessObjectChild2.setValue("childAttr2", "childAttr2");
		List<BusinessObject> childList = new ArrayList();
		childList.add(dynBusinessObjectChild);
		childList.add(dynBusinessObjectChild2);
		BusinessObject dynBusinessObjectParent = new DynamicBusinessObject();
		dynBusinessObjectParent.setValue("children", childList);
		
		BusinessObject dynBusinessObjectChild3 = new DynamicBusinessObject();
		dynBusinessObjectChild3.setValue("childAttr3", "childAttr3");
		dynBusinessObjectParent.setValue("children", dynBusinessObjectChild3);
		assertTrue(dynBusinessObjectParent.getValue("children") instanceof List);
		assertEquals(3, ((List)dynBusinessObjectParent.getValue("children")).size());
		assertEquals(dynBusinessObjectChild3, dynBusinessObjectParent.getValue("children[2]"));
	}
}
