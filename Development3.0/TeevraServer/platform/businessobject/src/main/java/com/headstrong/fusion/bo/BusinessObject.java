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
 * $Id: BusinessObject.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 14, 2009
 */

package com.headstrong.fusion.bo;

import java.io.Serializable;
import java.util.Map;

import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * Normalized message format interface.
 * 
 */
public interface BusinessObject extends Serializable {

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
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object getValue(String attributeName)
			throws AttributeNotFoundException,InvalidAttributeExpressionException;

	/**
	 * Set the value of the attribute.
	 * 
	 * @precondition attributeValues != null
	 * @param attributeName
	 * @param attributeValue
	 * @throws AttributeNotFoundException
	 * @throws InvalidAttributeNameException
	 */
	public void setValue(String attributeName, Object attributeValue)
			throws AttributeNotFoundException,InvalidAttributeExpressionException;

	/**
	 * @return the attributeValues
	 */
	public Map<String, Object> getAttributeValues();

	/**
	 * @param attributeValues
	 *            the attributeValues to set
	 */
	public void setAttributeValues(Map<String, Object> attributeValues);

	public void setObjectDescriptor(ObjectDescriptor objectDescriptor);

	public ObjectDescriptor getObjectDescriptor();

	/**
	 * Returns the type of the object. ObjectDescriptor name for
	 * DefaultBusinessObject, java class name for JavaBusinessObject, null for
	 * DynamicBusinessObject
	 * 
	 * @return
	 */
	public String getSchemaName();

	/**
	 * Xml representation of BusinessObject.
	 * 
	 * @return
	 */
	public String toXml() throws InvalidAttributeExpressionException;

	/**
	 * @return the businessObjectMarshaller
	 */
	public BusinessObjectMarshaller getBusinessObjectMarshaller();

	/**
	 * @param businessObjectMarshaller the businessObjectMarshaller to set
	 */
	public void setBusinessObjectMarshaller(
			BusinessObjectMarshaller businessObjectMarshaller);
}
