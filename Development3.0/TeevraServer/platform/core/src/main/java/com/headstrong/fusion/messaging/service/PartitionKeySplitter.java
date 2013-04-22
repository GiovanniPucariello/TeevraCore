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
 * $Id: PartitionKeySplitter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 27, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.config.SplitterStrategy;
import com.headstrong.fusion.config.PartitionKeyStrategy;

/**
 * <b>Partition Key splitter</b> expects a list of business objects. It creates
 * a sub list of business object for each distinct partition key.
 * <p>
 * e.g. sample business message has 3 fields.
 * <code>field1, field2, field3</code> with <code>field1 and field2</code>
 * as partition keys.
 * <p>
 * <b>input<code>{field1,field2,field3}</code></b> <br>
 * <li>{{F1,F2,X},{F1,F2,Y},{F11,F22,C},{F11,F22,D},{F11,null,X},{F11,null,Y},{null,null,X},
 * {null,null,X}} <br>
 * <b>output<code>{field1,field2,field3}</code></b><br>
 * <li>{{F1,F2,X},{F1,F2,Y}} <br>
 * <li>{{F11,F22,C},{F11,F22,D}}<br>
 * <li>{{F11,null,X},{F11,null,Y}} <br>
 * <li>{{null,null,X},{null,null,X}}
 * 
 */
public class PartitionKeySplitter implements Splitter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.service.Splitter#aggregate(java.lang.Object,
	 *      com.headstrong.fusion.config.SplitterStrategy)
	 */
	/**
	 * @precondition messages != null && splitterStrategy != null &&
	 *               splitterStrategy instanceof PartitionKeyStrategy
	 */
	@Override
	public Object split(Object messages, SplitterStrategy splitterStrategy)
			throws Exception {
		Map<PartitionKey, List<Object>> groupByValues = new HashMap<PartitionKey, List<Object>>();
		if (messages instanceof List) {
			for (Object message : (List<Object>) messages) {
				PartitionKey partitionKey = this.createPartitionKey(
						(DefaultBusinessObject) message,
						(PartitionKeyStrategy) splitterStrategy);
				if (groupByValues.containsKey(partitionKey)) {
					groupByValues.get(partitionKey).add(message);
				} else {
					// create a new entry
					List<Object> list = new ArrayList<Object>();
					list.add(message);
					
					groupByValues.put(partitionKey, list);
				}
			}
		} else {
			throw new Exception(
					"Partition key splitter expects a list of normalized message. "
							+ "Invalid message supplied of type "
							+ messages.getClass());
		}
		return groupByValues.values();
	}

	/**
	 * creates a partition key object using the partition key fields.
	 * 
	 * @param defaultBusinessObject
	 *            Input message
	 * @param partitionKeyStrategy
	 *            partition key strategy.
	 * @return Partition Key.
	 * @throws AttributeNotFoundException
	 */
	private PartitionKey createPartitionKey(DefaultBusinessObject defaultBusinessObject,
			PartitionKeyStrategy partitionKeyStrategy)
			throws AttributeNotFoundException {
		Map<String, Object> keys = new HashMap<String, Object>();
		for (String attribute : partitionKeyStrategy.getPartitionKeys()) {
			keys.put(attribute, defaultBusinessObject.getValue(attribute));
		}
		PartitionKey partitionKey = new PartitionKey(keys);
		return partitionKey;
	}

	/**
	 * Represent partition key. used in the hashMap as the key to store the list
	 * of records belonging to that unique partition key.
	 */
	private class PartitionKey {

		/**
		 * Partition keys.
		 */
		private Map<String, Object> keys;

		/**
		 * @param keys
		 *            partition keys.
		 */
		public PartitionKey(Map<String, Object> keys) {
			this.keys = keys;
		}

		/**
		 * @return the keys
		 */
		public Map<String, Object> getKeys() {
			return keys;
		}

		/**
		 * @param keys
		 *            the keys to set
		 */
		public void setKeys(Map<String, Object> keys) {
			this.keys = keys;
		}

		@Override
		public int hashCode() {
			int hashCode = 0;
			for (Object key : keys.values()) {
				hashCode = hashCode ^ (key == null ? 17 : key.hashCode());
			}
			return hashCode;
		}

		@Override
		public boolean equals(Object obj) {
			// Objects are same
			if (this == obj) {
				return true;
			}
			// Check class type
			if (obj == null || (getClass() != obj.getClass())) {
				return false;
			}

			Map<String, Object> keysToCompare = ((PartitionKey) obj).getKeys();
			boolean same = true;
			for (Entry<String, Object> key : keys.entrySet()) {
				same = (same && compareAccountingNull(key.getValue(),
						keysToCompare.get(key.getKey())));
				if (!same) {
					break;
				}
			}
			// check individual fields
			return same;
		}

		/**
		 * Compares two objects taking null into account. Following scenarios
		 * are considers while comparing the objects.
		 * <li>if obj1 == null && obj2 == null returns true.
		 * <li>obj1 != null && obj2 != null) && (obj1.equals(obj2) returns
		 * true.
		 * <li>else all returns false.
		 * 
		 * @param obj1
		 * @param obj2
		 * @return true is same else false.
		 */
		private boolean compareAccountingNull(Object obj1, Object obj2) {
			if (obj1 == null && obj2 == null) {
				return true;
			}
			if ((obj1 != null && obj2 != null) && (obj1.equals(obj2))) {
				return true;
			}
			return false;
		}

	}

}
