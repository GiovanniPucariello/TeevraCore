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
 * $Id: AttributeDescriptor.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.teevra.services.schema.vo;

import java.io.Serializable;

/**
 * Descriptor that describes an attribute in the schema.
 */
public class AttributeDescriptor implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1440206308546532449L;

	/**
	 * Unique identifier for an attribute
	 */
	private Long attributeId;

	/**
	 * Unique name within the schema. The format should be [A-Z]+[0-9 |.|_|A-Z]*
	 */
	private String attributeName;

	/**
	 * Type of the attribute
	 */
	private ObjectDescriptor type;

	/**
	 * Specifies if the attribute is part of the key attributes
	 */
	private Boolean key;

	/**
	 * Specifies the relation this attribute shares with the parent schema ? 121 /
	 * 12M / M2M
	 */
	private String attrRelation;

	/**
	 * In case of many to many relation, this attribute associates the given
	 * attribute with the attribute in the mapping schema.
	 */
	private AttributeDescriptor linkAttribute;

	/**
	 * @return the attributeId
	 */
	public Long getAttributeId() {
		return attributeId;
	}

	/**
	 * @param attributeId the attributeId to set
	 */
	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}

	/**
	 * @return the attributeName
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * @param attributeName the attributeName to set
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * @return the type
	 */
	public ObjectDescriptor getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ObjectDescriptor type) {
		this.type = type;
	}

	/**
	 * @return the key
	 */
	public Boolean isKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(Boolean key) {
		this.key = key;
	}

	/**
	 * @return the attrRelation
	 */
	public String getAttrRelation() {
		return attrRelation;
	}

	/**
	 * @param attrRelation the attrRelation to set
	 */
	public void setAttrRelation(String attrRelation) {
		this.attrRelation = attrRelation;
	}

	/**
	 * @return the linkAttribute
	 */
	public AttributeDescriptor getLinkAttribute() {
		return linkAttribute;
	}

	/**
	 * @param linkAttribute the linkAttribute to set
	 */
	public void setLinkAttribute(AttributeDescriptor linkAttribute) {
		this.linkAttribute = linkAttribute;
	}

}
