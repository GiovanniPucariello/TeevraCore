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
 * $Id: DefaultBusinessObject.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.fusion.bo.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectMarshaller;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;

/**
 * Represents an instance of an <code>ObjectDescriptor</code>
 */
public class DefaultBusinessObject implements BusinessObject {
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 5384674600473559103L;

	/**
	 * Parent <code>ObjectDescriptor</code> that identifies the schema of this
	 * <code>DefaultBusinessObject</code>
	 */
	protected ObjectDescriptor objectDescriptor;

	/**
	 * Map for holding attribute values. In case the attribute is of complex
	 * type, the value will again be a business object. Dotted notations can be
	 * used to fetch attributes deep in the hierarchy. Values of attributes
	 * whose types are primitive are stored directly in corresponding
	 */
	protected Map<String, Object> attributeValues;

	/**
	 * Specifies if the business object is fully populated i.e. the whole tree
	 * is populated. In case of lazy loading, the business object will be
	 * populated with the values of only top level attributes.
	 */
	// TODO This attribute is currently not in use. When used, to be changed to
	// non-transient. The getValue method to be changed accordingly.
	protected transient Boolean fullyPopulated;

	/**
	 * Gets the attribute value for the given attribute name. Dotted notation
	 * can be used in it to specify an attribute that is nested inside the
	 * hierarchy.
	 * 
	 * @precondition attributeName != null
	 * @param attributeName
	 *            name of the attribute
	 * @return value of the given attribute. Value is an instance of
	 *         <code>DefaultBusinessObject</code> if they are not of primitive
	 *         types. If they are primitive types, the value is an instance of
	 * @throws AttributeNotFoundException
	 *             If the specified attribute is not present in the schema
	 */
	public Object getValue(String attributeName)
			throws AttributeNotFoundException {

		assert (attributeName != null);

		if (attributeName.indexOf(".") > -1)
			return getForDottedReference(attributeName);

		/**
		 * If the attribute is defined in the descriptor then throw
		 * AttributeNotFoundException.
		 * 
		 */
		if (this.objectDescriptor.getAttributes() == null
				|| !this.objectDescriptor.getAttributes().containsKey(
						attributeName)) {
			throw new AttributeNotFoundException(attributeName, this);
		} else {
			Object obj = attributeValues.get(attributeName);
			return obj;
		}
	}

	/**
	 * Set the value of the attribute.
	 * 
	 * @precondition attributeValues != null
	 * @param attributeName
	 * @param attributeValue
	 */
	public void setValue(String attributeName, Object attributeValue) {
		assert (attributeName != null);
		if (attributeName.indexOf(".") > -1) {
			setForDottedReference(attributeName, attributeValue);
		} else {
			// FIXME :: verify .
			synchronized (this) {
				if (this.attributeValues == null) {
					this.attributeValues = new HashMap<String, Object>();
				}
			}
			attributeValues.put(attributeName, attributeValue);
		}
	}

	/**
	 * Traverses the object tree based on the dotted notation specified in the
	 * given attributeName.
	 * 
	 * @precondition attributeName != null
	 * @param attributeName
	 *            name of the attribute with dots in it
	 * @return value of the given attribute. Value is an instance of
	 *         <code>DefaultBusinessObject</code> if they are not of primitive
	 *         types. If they are primitive types, the value is an instance of
	 * @throws AttributeNotFoundException
	 *             If the specified attribute is not present in the schema
	 */
	protected Object getForDottedReference(String attributeName)
			throws AttributeNotFoundException {

		int i = attributeName.indexOf(".");
		String firstLevelAttr = attributeName.substring(0, i);

		Object obj = getValue(firstLevelAttr);
		if (obj == null)
			return null;
		if (!(obj instanceof DefaultBusinessObject)) {
			return obj;
		} else {
			return ((DefaultBusinessObject) obj).getValue(attributeName
					.substring(i + 1));
		}
	}

	protected void setForDottedReference(String attributeName,
			Object attributeValue) {
		int i = attributeName.indexOf(".");
		String firstLevelAttr = attributeName.substring(0, i);

		Object obj = null;
		try {
			obj = getValue(firstLevelAttr);
		} catch (AttributeNotFoundException e) {
			// add the attribute
			this.attributeValues.put(firstLevelAttr, obj);
		}

		// if the object is found continue with this or else create a
		// new BO.
		if (obj == null) {
			DefaultBusinessObject firstLevelBO = new DefaultBusinessObject();
			AttributeDescriptor attributeDesc = objectDescriptor
					.getAttribute(firstLevelAttr);
			firstLevelBO.setObjectDescriptor(attributeDesc.getType());
			firstLevelBO.setAttributeValues(new HashMap<String, Object>());
			this.setValue(firstLevelAttr, firstLevelBO);
			obj = firstLevelBO;
		}

		// If the object is Business Object ( which should always be the case )
		// FIXME : verify and fix.
		if (obj instanceof DefaultBusinessObject) {
			((DefaultBusinessObject) obj).setValue(attributeName
					.substring(i + 1), attributeValue);
		} else {
			// Ignore for the time being.
		}
	}

	/**
	 * @return the schemaName of this DefaultBusinessObject
	 */
	public String getSchemaName() {
		return (objectDescriptor != null) ? objectDescriptor.getName() : null;
	}

	/**
	 * @return the objectDescriptor
	 */
	public ObjectDescriptor getObjectDescriptor() {
		return objectDescriptor;
	}

	/**
	 * @param objectDescriptor
	 *            the objectDescriptor to set
	 */
	public void setObjectDescriptor(ObjectDescriptor objectDescriptor) {
		this.objectDescriptor = objectDescriptor;
	}

	/**
	 * @return the attributeValues
	 */
	public Map<String, Object> getAttributeValues() {
		return attributeValues;
	}

	/**
	 * @param attributeValues
	 *            the attributeValues to set
	 */
	public void setAttributeValues(Map<String, Object> attributeValues) {
		this.attributeValues = attributeValues;
	}

	/**
	 * @return the fullyPopulated
	 */
	public Boolean getFullyPopulated() {
		return fullyPopulated;
	}

	/**
	 * @param fullyPopulated
	 *            the fullyPopulated to set
	 */
	public void setFullyPopulated(Boolean fullyPopulated) {
		this.fullyPopulated = fullyPopulated;
	}

	/**
	 * Serializes this object to XML. Only the not-null attributes will be
	 * serialized.
	 * 
	 * @precondition objectDescriptor != null
	 * @postcondition
	 * @return XML string representing the business object
	 */
	public String toXml() {
		assert (objectDescriptor != null);
		StringBuffer sb = new StringBuffer();
		beginTag(this.getSchemaName(), sb);
		serializeBO(this, sb);
		endTag(this.getSchemaName(), sb);
		return sb.toString();
	}

	/**
	 * Constructs a element start tag fragment
	 * 
	 * @param tagName
	 *            XML tag name
	 * @param sb
	 *            StringBuffer instance that will be appended with the XML
	 *            fragment
	 */
	protected void beginTag(String tagName, StringBuffer sb) {
		sb.append("<").append(tagName).append(">");
	}

	/**
	 * Serializes the given DefaultBusinessObject into XML.
	 * 
	 * @precondition bo != null
	 * @param bo
	 *            instance of DefaultBusinessObject that needs to be serialized
	 * @param sb
	 *            StringBuffer that will be appended with the XML string of the
	 *            given BO
	 */
	protected void serializeBO(DefaultBusinessObject bo, StringBuffer sb) {
		assert (bo != null);
		Map<String, AttributeDescriptor> attributesMap = bo
				.getObjectDescriptor().getAttributes();
		Set<String> attrNames = attributesMap.keySet();
		Iterator<String> attrNamesItr = attrNames.iterator();

		while (attrNamesItr.hasNext()) {
			String attrName = attrNamesItr.next();
			Object attrValue = null;
			try {
				attrValue = bo.getValue(attrName);
				if (attrValue == null) {
					continue;
				}
			} catch (AttributeNotFoundException e) {
				// this case wont arise as we are fetching attr key from the
				// schema
			}

			if (attrValue instanceof DefaultBusinessObject) {
				beginTag(attrName, sb);
				serializeBO((DefaultBusinessObject) attrValue, sb);
				endTag(attrName, sb);

			} else if (attrValue instanceof List) {
				Iterator itr = ((List) attrValue).iterator();
				while (itr.hasNext()) {
					Object listItem = itr.next();

					if (listItem instanceof DefaultBusinessObject) {
						beginTag(attrName, sb);
						serializeBO((DefaultBusinessObject) listItem, sb);
						endTag(attrName, sb);
					} else {
						// primitive type
						beginTag(attrName, sb);
						if (listItem != null)
							sb.append(listItem.toString());
						endTag(attrName, sb);
					}
				}
			} else {
				// attribute is a primitive type
				beginTag(attrName, sb);
				if (attrValue != null)
					sb.append(attrValue.toString());
				endTag(attrName, sb);
			}

		}
	}

	/**
	 * Constructs a element end tag fragment
	 * 
	 * @param tagName
	 *            XML tag name
	 * @param sb
	 *            StringBuffer instance that will be appended with the XML
	 *            fragment
	 */
	protected void endTag(String tagName, StringBuffer sb) {
		sb.append("</").append(tagName).append(">");
	}

	@Override
	public BusinessObjectMarshaller getBusinessObjectMarshaller() {
		return null;
	}

	@Override
	public void setBusinessObjectMarshaller(
			BusinessObjectMarshaller businessObjectMarshaller) {
		// TODO Auto-generated method stub
	}
}
