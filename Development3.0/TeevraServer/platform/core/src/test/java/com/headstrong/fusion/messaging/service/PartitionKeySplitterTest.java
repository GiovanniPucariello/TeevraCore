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
 * $Id: PartitionKeySplitterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 29, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.config.PartitionKeyStrategy;

/**
 * 
 */
public class PartitionKeySplitterTest extends TestCase {

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

	/**
	 * Tests the split method with proper normal data.
	 * 
	 * @throws Exception
	 */
	public void testSplitStringKeys() throws Exception {
		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();
		PartitionKeySplitter splitter = new PartitionKeySplitter();

		PartitionKeyStrategy strategy = new PartitionKeyStrategy();
		List<String> partitionKeys = new ArrayList<String>();
		partitionKeys.add("attribute1");
		partitionKeys.add("parent.node1");
		strategy.setPartitionKeys(partitionKeys);

		List<Object> messages = new ArrayList<Object>();
		/**
		 * 
		 */
		String set1Attribute1 = "set1Attribute1";
		String set1parentNode1 = "set1parentNode1";

		String set2Attribute1 = "set2Attribute1";
		String set2parentNode1 = "set2parentNode1";

		String set3Attribute1 = "set3Attribute1";
		String set3parentNode1 = "set3parentNode1";

		/**
		 * Set 1
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", set1parentNode1, new Long(1)));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", set1parentNode1, new Long(2)));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", set1parentNode1, new Long(3)));

		/**
		 * Set 2
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", set2parentNode1, new Long(1)));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", set2parentNode1, new Long(2)));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", set2parentNode1, new Long(3)));

		/**
		 * set 3
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set3Attribute1, "attribute2", set3parentNode1, new Long(1)));
		Collection<Object> result = (Collection<Object>) splitter.split(
				messages, strategy);
		// three sets are created
		assertEquals(3, result.size());
		List<Integer> sizes = new ArrayList<Integer>();
		sizes.add(3);
		sizes.add(3);
		sizes.add(1);
		for (Object subList : result) {
			assertEquals(ArrayList.class, subList.getClass());
			List<Object> paritionedData = (List<Object>) subList;
			assertTrue(sizes.contains(paritionedData.size()));
			sizes.remove(new Integer(paritionedData.size()));
		}
	}

	/**
	 * Tests the split method with proper normal data.
	 * 
	 * @throws Exception
	 */
	public void testSplitLongKeys() throws Exception {
		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();
		PartitionKeySplitter splitter = new PartitionKeySplitter();

		PartitionKeyStrategy strategy = new PartitionKeyStrategy();
		List<String> partitionKeys = new ArrayList<String>();
		partitionKeys.add("attribute1");
		partitionKeys.add("parent.node2");
		strategy.setPartitionKeys(partitionKeys);

		List<Object> messages = new ArrayList<Object>();
		/**
		 * 
		 */
		String set1Attribute1 = "set1Attribute1";
		Long set1parentNode2 = new Long(1);

		String set2Attribute1 = "set2Attribute1";
		Long set2parentNode2 = new Long(2);

		String set3Attribute1 = "set3Attribute1";
		Long set3parentNode2 = new Long(3);

		/**
		 * Set 1
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", "set1parentNode1",
				set1parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", "set1parentNode1",
				set1parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", "set1parentNode1",
				set1parentNode2));

		/**
		 * Set 2
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));

		/**
		 * set 3
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set3Attribute1, "attribute2", "set3parentNode1",
				set3parentNode2));
		Collection<Object> result = (Collection<Object>) splitter.split(
				messages, strategy);
		// three sets are created
		assertEquals(3, result.size());
		List<Integer> sizes = new ArrayList<Integer>();
		sizes.add(3);
		sizes.add(3);
		sizes.add(1);
		for (Object subList : result) {
			assertEquals(ArrayList.class, subList.getClass());
			List<Object> paritionedData = (List<Object>) subList;
			assertTrue(sizes.contains(paritionedData.size()));
			sizes.remove(new Integer(paritionedData.size()));
		}
	}

	/**
	 * Tests the split method with proper normal data.
	 * 
	 * @throws Exception
	 */
	public void testSplitWithSingleNullKey() throws Exception {
		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();
		PartitionKeySplitter splitter = new PartitionKeySplitter();

		PartitionKeyStrategy strategy = new PartitionKeyStrategy();
		List<String> partitionKeys = new ArrayList<String>();
		partitionKeys.add("attribute1");
		partitionKeys.add("parent.node2");
		strategy.setPartitionKeys(partitionKeys);

		List<Object> messages = new ArrayList<Object>();
		/**
		 * 
		 */
		String set1Attribute1 = "set1Attribute1";

		String set2Attribute1 = "set2Attribute1";
		Long set2parentNode2 = new Long(2);

		String set3Attribute1 = "set3Attribute1";
		Long set3parentNode2 = new Long(3);

		/**
		 * Set 1
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", "set1parentNode1", null));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", "set1parentNode1", null));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set1Attribute1, "attribute2", "set1parentNode1", null));

		/**
		 * Set 2
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));

		/**
		 * set 3
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set3Attribute1, "attribute2", "set3parentNode1",
				set3parentNode2));
		Collection<Object> result = (Collection<Object>) splitter.split(
				messages, strategy);
		// three sets are created
		assertEquals(3, result.size());
		List<Integer> sizes = new ArrayList<Integer>();
		sizes.add(3);
		sizes.add(3);
		sizes.add(1);
		for (Object subList : result) {
			assertEquals(ArrayList.class, subList.getClass());
			List<Object> paritionedData = (List<Object>) subList;
			assertTrue(sizes.contains(paritionedData.size()));
			sizes.remove(new Integer(paritionedData.size()));
		}
	}

	/**
	 * Tests the split method with proper normal data.
	 * 
	 * @throws Exception
	 */
	public void testSplitWithNullKeys() throws Exception {
		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();
		PartitionKeySplitter splitter = new PartitionKeySplitter();

		PartitionKeyStrategy strategy = new PartitionKeyStrategy();
		List<String> partitionKeys = new ArrayList<String>();
		partitionKeys.add("attribute1");
		partitionKeys.add("parent.node2");
		strategy.setPartitionKeys(partitionKeys);

		List<Object> messages = new ArrayList<Object>();
		/**
		 * 
		 */
		String set2Attribute1 = "set2Attribute1";
		Long set2parentNode2 = new Long(2);

		String set3Attribute1 = "set3Attribute1";
		Long set3parentNode2 = new Long(3);

		/**
		 * Set 1
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor, null,
				"attribute2", "set1parentNode1", null));
		messages.add(this.createSampleBusinessObject(objectDescriptor, null,
				"attribute2", "set1parentNode1", null));
		messages.add(this.createSampleBusinessObject(objectDescriptor, null,
				"attribute2", "set1parentNode1", null));

		/**
		 * Set 2
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));

		/**
		 * set 3
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set3Attribute1, "attribute2", "set3parentNode1",
				set3parentNode2));
		Collection<Object> result = (Collection<Object>) splitter.split(
				messages, strategy);
		// three sets are created
		assertEquals(3, result.size());
		List<Integer> sizes = new ArrayList<Integer>();
		sizes.add(3);
		sizes.add(3);
		sizes.add(1);
		for (Object subList : result) {
			assertEquals(ArrayList.class, subList.getClass());
			List<Object> paritionedData = (List<Object>) subList;
			assertTrue(sizes.contains(paritionedData.size()));
			sizes.remove(new Integer(paritionedData.size()));
		}
	}

	/**
	 * Tests the split method with proper normal data.
	 * 
	 * @throws Exception
	 */
	public void testSplitWithMissingKey() throws Exception {
		ObjectDescriptor objectDescriptor = this.createSampleObjectDescriptor();
		PartitionKeySplitter splitter = new PartitionKeySplitter();

		PartitionKeyStrategy strategy = new PartitionKeyStrategy();
		List<String> partitionKeys = new ArrayList<String>();
		partitionKeys.add("attribute1");
		partitionKeys.add("parent.node2");
		strategy.setPartitionKeys(partitionKeys);

		List<Object> messages = new ArrayList<Object>();
		/**
		 * 
		 */
		String set2Attribute1 = "set2Attribute1";
		Long set2parentNode2 = new Long(2);

		String set3Attribute1 = "set3Attribute1";
		Long set3parentNode2 = new Long(3);

		/**
		 * Set 2
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set2Attribute1, "attribute2", "set2parentNode1",
				set2parentNode2));

		/**
		 * set 3
		 */
		messages.add(this.createSampleBusinessObject(objectDescriptor,
				set3Attribute1, "attribute2", "set3parentNode1",
				set3parentNode2));
		Collection<Object> result = (Collection<Object>) splitter.split(
				messages, strategy);
		// three sets are created
		assertEquals(2, result.size());
		List<Integer> sizes = new ArrayList<Integer>();
		sizes.add(3);
		sizes.add(1);
		for (Object subList : result) {
			assertEquals(ArrayList.class, subList.getClass());
			List<Object> paritionedData = (List<Object>) subList;
			assertTrue(sizes.contains(paritionedData.size()));
			sizes.remove(new Integer(paritionedData.size()));
		}
	}

	/**
	 * Tests the split method with proper normal data.
	 * 
	 * @throws Exception
	 */
	public void testSplitInvalidMessageType() throws Exception {
		PartitionKeySplitter splitter = new PartitionKeySplitter();

		PartitionKeyStrategy strategy = new PartitionKeyStrategy();
		List<String> partitionKeys = new ArrayList<String>();
		partitionKeys.add("attribute1");
		partitionKeys.add("parent.node2");
		strategy.setPartitionKeys(partitionKeys);

		String message = "dummy";
		try {
			splitter.split(message, strategy);
		} catch (Exception e) {
			// ignore .. expected output
			return;
		}
		fail();
	}
}
