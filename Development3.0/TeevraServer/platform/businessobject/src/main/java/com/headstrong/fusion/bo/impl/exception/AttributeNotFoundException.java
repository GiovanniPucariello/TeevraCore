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
 * $Id: AttributeNotFoundException.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.fusion.bo.impl.exception;

import com.headstrong.fusion.bo.BusinessObject;

/**
 * Exception raised while performing any operation on business object with
 * attribute name that is not part of that business object.
 */
public class AttributeNotFoundException extends SchemaServiceException {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 3423718346691450139L;

	/**
	 * Creates a description out of given params and passes it on to the super
	 * class constructor.
	 * 
	 * @param attributeName
	 *            Name of the attribute that was not found
	 * @param bo
	 *            <code>DefaultBusinessObject</code> instance on which this attribute
	 *            was queried
	 */
	public AttributeNotFoundException(String attributeName, BusinessObject bo) {
		super("Attribute :" + attributeName + " not found in object of type "
				+ bo.getSchemaName());
	}

}
