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
 * $Id: DynamicBusinessObject.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 14, 2009
 */

package com.headstrong.fusion.bo.dyn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.headstrong.fusion.bo.AttributeExpression;
import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectMarshaller;
import com.headstrong.fusion.bo.AttributeExpression.FilterExpression;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * A dynamic business object doesn't conform to any object schema.
 * 
 */
public class DynamicBusinessObject implements BusinessObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7699764762500712411L;
	/**
	 * Map for holding attribute values. In case the attribute is of complex
	 * type, the value will again be a business object. Dotted notations can be
	 * used to fetch attributes deep in the hierarchy. Values of attributes
	 * whose types are primitive are stored directly in corresponding
	 */
	private Map<String, Object> attributeValues;

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
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object getValue(String attributeName) throws AttributeNotFoundException, InvalidAttributeExpressionException {
		assert (attributeName != null);
		AttributeExpression attributeExpression = AttributeExpression.parseAttributeExpression(attributeName);
		return getForAttributeExpression(this,attributeExpression);
	}

	/**
	 * Traverses the object tree based on the dotted notation specified in the
	 * given attributeName.
	 * 
	 * @precondition attributeName != null
	 * @return value of the given attribute. Value is an instance of
	 *         <code>DefaultBusinessObject</code> if they are not of primitive
	 *         types. If they are primitive types, the value is an instance of
	 * @throws AttributeNotFoundException 
	 * @throws InvalidAttributeExpressionException 

	 */
	private Object getForAttributeExpression(Object dynamicBusinessObject, AttributeExpression attributeExpression) throws AttributeNotFoundException, InvalidAttributeExpressionException {
		//
		Object match = dynamicBusinessObject;
		//
		//The incoming can be either a business object or a List.
		if((match instanceof DynamicBusinessObject)){
			match = getObjectRootValue((DynamicBusinessObject) match, attributeExpression);
		}
		if(attributeExpression.hasChild()){
			match = getForAttributeExpression(match, attributeExpression.nextAttribute());
		}
		return match;
	}

	
	private Object getObjectRootValue(DynamicBusinessObject match, AttributeExpression attributeExpression) throws AttributeNotFoundException, InvalidAttributeExpressionException{
		FilterExpression filterEx = attributeExpression.getFilterExpression();
		boolean isFilter = (filterEx!=null);
		Object value= match.getAttributeValues().get(attributeExpression.getAttribute().toLowerCase());
		if(isFilter){
			value= filterEx.getObjectFromList((List) value);
		}else if((value instanceof List) && !attributeExpression.isPrimitive()){
			value= ((List)value).get(0);
		}
		return value;	
	}
	
	
	/**
	 * Set the value of the attribute. Ignores indexes, because there is no wrapped object exposing the collection api.
	 * 
	 * @precondition attributeValues != null
	 * @param attributeName
	 * @param attributeValue
	 * @throws AttributeNotFoundException 
	 * @throws InvalidAttributeExpressionException 
	 */
	public void setValue(String attributeName, Object attributeValue) throws AttributeNotFoundException,InvalidAttributeExpressionException {
		assert (attributeName != null);
		AttributeExpression attributeExpression = AttributeExpression.parseAttributeExpression(attributeName) ;
		setForAttributeExpression(this, attributeExpression, attributeValue);
	}

	/**
	 * @param attributeExpression
	 * @param attributeValue
	 * @throws AttributeNotFoundException 
	 * @throws InvalidAttributeExpressionException 
	 */
	private void setForAttributeExpression(DynamicBusinessObject bo, AttributeExpression attributeExpression, Object attributeValue) throws AttributeNotFoundException, InvalidAttributeExpressionException {
		AttributeExpression currentEx =attributeExpression;
		Object currentObj = bo;
		Object previousObj = bo;
		while(currentEx.hasChild()){
			currentObj= getObjectRootValue((DynamicBusinessObject) currentObj, currentEx);
			if((currentObj instanceof List) && !currentEx.hasChild()){
				((List)currentObj).add(attributeValue);
				return;
			}
			if(currentObj==null){
				currentObj = new  DynamicBusinessObject();
				((DynamicBusinessObject)previousObj).setValue(currentEx.getAttribute(), currentObj);
			}
			currentEx = currentEx.nextAttribute();
			previousObj = currentObj;
		} 
		if(((BusinessObject)currentObj).getAttributeValues().get(currentEx.getAttribute().toLowerCase()) instanceof List){
			((List)((BusinessObject)currentObj).getAttributeValues().get(currentEx.getAttribute().toLowerCase())).add(attributeValue);
		}else{
		((BusinessObject)currentObj).getAttributeValues().put(currentEx.getAttribute().toLowerCase(), attributeValue);
		}
	}

	
	protected Object getForDottedReference(String attributeName) throws AttributeNotFoundException, InvalidAttributeExpressionException {

		int i = attributeName.indexOf(".");
		String firstLevelAttr = attributeName.substring(0, i);

		Object obj = getValue(firstLevelAttr);
		if (obj == null)
			return null;
		if (!(obj instanceof DynamicBusinessObject)) {
			return obj;
		} else {
			return ((DynamicBusinessObject) obj).getValue(attributeName
					.substring(i + 1));
		}
	}

	private void setForDottedReference(String attributeName,
			Object attributeValue) throws AttributeNotFoundException, InvalidAttributeExpressionException {
		int i = attributeName.indexOf(".");
		String firstLevelAttr = attributeName.substring(0, i);

		Object obj = null;
		obj = getValue(firstLevelAttr);

		// if the object is found continue with this or else create a
		// new BO.
		if (obj == null) {
			DynamicBusinessObject firstLevelBO = new DynamicBusinessObject();
			firstLevelBO.setAttributeValues(new HashMap<String, Object>());
			this.setValue(firstLevelAttr, firstLevelBO);
			obj = firstLevelBO;
		}

		// If the object is Business Object ( which should always be the case )
		// FIXME : verify and fix.
		if (obj instanceof DynamicBusinessObject) {
			((DynamicBusinessObject) obj).setValue(attributeName
					.substring(i + 1), attributeValue);
		} else {
			// Ignore for the time being.
		}
	}

	/**
	 * @return the attributeValues
	 */
	public Map<String, Object> getAttributeValues() {
		if(null==attributeValues){
			attributeValues = new HashMap<String, Object>();
		}
		return attributeValues;
	}

	/**
	 * @param attributeValues
	 *            the attributeValues to set
	 */
	public void setAttributeValues(Map<String, Object> attributeValues) {
		Map<String, Object> lowerCaseMap = new HashMap<String, Object>();
		for(Entry<String, Object> entry: attributeValues.entrySet()){
			lowerCaseMap.put(entry.getKey().toLowerCase(), entry.getValue());
		}
		this.attributeValues = lowerCaseMap;
	}

	public ObjectDescriptor getObjectDescriptor() {
		return null;
	}

	public void setObjectDescriptor(ObjectDescriptor objectDescriptor) {
		// Not required.
		// TODO:: make interface proper so that these irregularities are taken
		// care of
	}

	public String getSchemaName() {
		return null;
	}

	/**
	 * Serializes this object to XML. Only the not-null attributes will be
	 * serialized.
	 * 
	 * @precondition objectDescriptor != null
	 * @postcondition
	 * @return XML string representing the business object
	 * @throws InvalidAttributeExpressionException 
	 */
	@Override
	public String toXml() throws InvalidAttributeExpressionException {
		StringBuffer sb = new StringBuffer();
		serializeBO(this, sb);
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
	 * Serializes the given BusinessObject into XML.
	 * 
	 * @precondition bo != null
	 * @param bo
	 *            instance of BusinessObject that needs to be serialized
	 * @param sb
	 *            StringBuffer that will be appended with the XML string of the
	 *            given BO
	 * @throws InvalidAttributeExpressionException 
	 */
	protected void serializeBO(BusinessObject bo, StringBuffer sb) throws  InvalidAttributeExpressionException {
		assert (bo != null);
		Map<String, Object> attributesMap = bo.getAttributeValues();
		Iterator<String> attrNamesItr = attributesMap.keySet().iterator();

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

			if (attrValue instanceof BusinessObject) {
				beginTag(attrName, sb);
				serializeBO((BusinessObject) attrValue, sb);
				endTag(attrName, sb);

			} else if (attrValue instanceof List) {
				Iterator itr = ((List) attrValue).iterator();
				while (itr.hasNext()) {
					Object listItem = itr.next();

					if (listItem instanceof BusinessObject) {
						beginTag(attrName, sb);
						serializeBO((BusinessObject) listItem, sb);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBusinessObjectMarshaller(
			BusinessObjectMarshaller businessObjectMarshaller) {
		// TODO Auto-generated method stub
	}
}
