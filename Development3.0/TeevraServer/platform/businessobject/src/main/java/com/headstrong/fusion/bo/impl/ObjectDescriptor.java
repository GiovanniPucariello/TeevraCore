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
 * $Id: ObjectDescriptor.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.fusion.bo.impl;

import java.io.Serializable;
import java.util.Map;

/**
 * Descriptor that describes a schema.
 */
public class ObjectDescriptor implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -6390001148051686992L;

	/**
	 * Unique identifier for a schema
	 */
	private Long id;

	/**
	 * Uniquely identifies a schema. For primitive types the schema name should
	 * be same as the one specified in XML schema standards. The format should
	 * be [A-Z]+[0-9 |.|_|A-Z]*
	 */
	private String name;

	/**
	 * Describes the schema
	 */
	private String desc;

	/**
	 * Specifies if the schema is a primitive type or not. Primitive types form
	 * the leaf level nodes in the schema tree.
	 */
	private Boolean primitive;

	/**
	 * Identifies the parent class from whom it has inherited all the
	 * attributes.
	 */
	private Long parentSchemaId;

	/**
	 * If the schema is restricted only to the associated process then this
	 * attribute specifies the process to which the schema is associated.
	 */
	private Long processId;

	/**
	 * Attributes present in the current schema mapped with their name as the
	 * key
	 */
	private Map<String, AttributeDescriptor> attributes;

	/**
	 * Fetches <code>AttributeDescriptor</code> corresponding to the given
	 * attribute name.
	 * 
	 * @param attributeName Name of the attribute
	 * @return descriptor corresponding to the given attribute
	 */
	public AttributeDescriptor getAttribute(String attributeName) {
		return attributes.get(attributeName);
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the primitive
	 */
	public Boolean getPrimitive() {
		return primitive;
	}

	/**
	 * @param primitive
	 *            the primitive to set
	 */
	public void setPrimitive(Boolean primitive) {
		this.primitive = primitive;
	}

	/**
	 * @return the parentSchemaId
	 */
	public Long getParentSchemaId() {
		return parentSchemaId;
	}

	/**
	 * @param parentSchemaId
	 *            the parentSchemaId to set
	 */
	public void setParentSchemaId(Long parentSchemaId) {
		this.parentSchemaId = parentSchemaId;
	}

	/**
	 * @return the processId
	 */
	public Long getProcessId() {
		return processId;
	}

	/**
	 * @param processId
	 *            the processId to set
	 */
	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	/**
	 * @return the attributes
	 */
	public Map<String, AttributeDescriptor> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(Map<String, AttributeDescriptor> attributes) {
		this.attributes = attributes;
	}

}
