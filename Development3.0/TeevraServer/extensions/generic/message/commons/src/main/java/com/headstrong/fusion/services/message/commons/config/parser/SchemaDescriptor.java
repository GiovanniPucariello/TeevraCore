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
 * $Id: FieldMapping.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 20, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a generic message schema as expected by all the services. 
 * schema consists of field name and the list of child schema descriptors
 * if not primitive.
 * <p>
 * Every schema also contains information about the mapping interface which
 * would be used to marshal/un-marshal to message.
 * 
 */

public class SchemaDescriptor<B extends Binding> {

	/**
	 * Field Name. 
	 * Field Names are persisted using dotted notation to flatten the
	 * actual message hierarchy. but when generating the schema descriptor
	 * same would again be converted to message tree as required.
	 * e.g.
	 * <A>
	 * 	 <B/>
	 * </A>
	 * would be stored as A , A.B while same would be converted into the 
	 * proper tree while the schema is parsed.
	 *   
	 */
	private String fieldName;

	/**
	 * represent the field binding for the message schema.
	 * e.g. for XML message payload Binding would be xpath
	 * binding.
	 */
	private B binding;
	
	/**
	 * if the schema descriptor binds to the message payload or
	 * just works as a wrapper for other schema descriptor. 
	 * esp required in case of flat data such as tag delimited 
	 * or fixed length message payload.
	 * Default is set to false.
	 */
	private boolean bind = false;

	/**
	 * List of direct descendent.
	 * 
	 */
	private List<SchemaDescriptor<B>> children = new ArrayList<SchemaDescriptor<B>>();

	/**
	 * @return the children
	 */
	public List<SchemaDescriptor<B>> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(List<SchemaDescriptor<B>> children) {
		this.children = children;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName
	 *            the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the binding
	 */
	public B getBinding() {
		return binding;
	}

	/**
	 * @param binding the binding to set
	 */
	public void setBinding(B binding) {
		this.binding = binding;
		// also set the bind property to true
		this.bind = true;
	}

	/**
	 * @return the bind
	 */
	public boolean isBind() {
		return bind;
	}

	/**
	 * @param bind the bind to set
	 */
	public void setBind(boolean bind) {
		this.bind = bind;
	}
}
