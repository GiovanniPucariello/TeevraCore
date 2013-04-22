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
 * $Id: MessageSchemaAttribute.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.schema.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

import org.hibernate.annotations.Check;

/**
 * EO corresponds to the 'Message_Schema_Attribute' table. This table details
 * the attributes present in a schema. The type of each attribute can in turn be
 * related to a schema in the Message_Schema table there by resulting in a
 * object tree.
 */
@Entity
@Table(name = "message_schema_attribute")
public class MessageSchemaAttributeEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for an attribute
	 */
	private Long schemaAttrId;
	/**
	 * Associates the attribute to the schema
	 */
	private Long schemaId;
	/**
	 * Schema name which the attribute associates to
	 */
	private String schemaName = null;
	/**
	 * Unique name within the schema. The format should be [A-Z]+[0-9 |.|_|A-Z]*
	 */
	private String schemaAttrName = null;
	/**
	 * Type of the attribute(id)
	 */
	private Long schemaAttrType;
	/**
	 * Type of the attribute(name)
	 */
	private String schemaAttrTypeName = null;
	/**
	 * Specifies if the attribute is part of the key attributes
	 */
	private Boolean schemaAttrIsKey = false;
	/**
	 * Specifies the relation this attribute shares with the parent schema ? 121 /
	 * 12M / M2M
	 */
	private String schemaAttrRelation = "121";
	/**
	 * Identifies the intermediate schema that wil be used in a many to many
	 * relationship to map two different entities.
	 */
	private Long schemaM2MType;
	/**
	 * User name who created the attribute
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the attribute
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the attribute
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the attribute
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());;

	/**
	 * In case of many to many relation, this attribute associates the given
	 * attribute with the attribute in the mapping schema
	 */
	private MessageSchemaAttributeEO linkAttribute = null;

	/**
	 * @return the schemaAttrId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "schema_attr_id", nullable = true)
	public Long getSchemaAttrId() {
		return schemaAttrId;
	}

	/**
	 * @param schemaAttrId
	 *            the schemaAttrId to set
	 */
	public void setSchemaAttrId(Long schemaAttrId) {
		this.schemaAttrId = schemaAttrId;
	}

	/**
	 * @return the schemaId
	 */
	@Column(name = "schema_id", nullable = false)
	public Long getSchemaId() {
		return schemaId;
	}

	/**
	 * @param schemaId
	 *            the schemaId to set
	 */
	public void setSchemaId(Long schemaId) {
		this.schemaId = schemaId;
	}

	/**
	 * @return the schemaName
	 */
	@Transient
	public String getSchemaName() {
		return schemaName;
	}

	/**
	 * @param schemaName
	 *            the schemaName to set
	 */
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	/**
	 * @return the schemaAttrName
	 */
	@Column(name = "schema_attr_name", length = 100, nullable = true)
	public String getSchemaAttrName() {
		return schemaAttrName;
	}

	/**
	 * @param schemaAttrName
	 *            the schemaAttrName to set
	 */
	public void setSchemaAttrName(String schemaAttrName) {
		this.schemaAttrName = schemaAttrName;
	}

	/**
	 * @return the schemaAttrType
	 */
	@Column(name = "schema_attr_type", nullable = true)
	public Long getSchemaAttrType() {
		return schemaAttrType;
	}

	/**
	 * @param schemaAttrType
	 *            the schemaAttrType to set
	 */
	public void setSchemaAttrType(Long schemaAttrType) {
		this.schemaAttrType = schemaAttrType;
	}

	/**
	 * @return the schemaAttrTypeName
	 */
	@Transient
	public String getSchemaAttrTypeName() {
		return schemaAttrTypeName;
	}

	/**
	 * @param schemaAttrTypeName
	 *            the schemaAttrTypeName to set
	 */
	public void setSchemaAttrTypeName(String schemaAttrTypeName) {
		this.schemaAttrTypeName = schemaAttrTypeName;
	}

	/**
	 * @return the schemaAttrIsKey
	 */
	@Column(name = "schema_attr_is_key", nullable = false)
	public Boolean isSchemaAttrIsKey() {
		return schemaAttrIsKey;
	}

	/**
	 * @param schemaAttrIsKey
	 *            the schemaAttrIsKey to set
	 */
	public void setSchemaAttrIsKey(Boolean schemaAttrIsKey) {
		this.schemaAttrIsKey = schemaAttrIsKey;
	}

	/**
	 * @return the schemaAttrRelation
	 */
	@Column(name = "schema_attr_relation", length = 3, nullable = true)
	@Check(constraints = "(121) OR (12M) OR (M2M)")
	public String getSchemaAttrRelation() {
		return schemaAttrRelation;
	}

	/**
	 * @param schemaAttrRelation
	 *            the schemaAttrRelation to set
	 */
	public void setSchemaAttrRelation(String schemaAttrRelation) {
		this.schemaAttrRelation = schemaAttrRelation;
	}

	/**
	 * @return the schemaM2MType
	 */
	@Column(name = "schema_m2m_type", nullable = true)
	public Long getSchemaM2MType() {
		return schemaM2MType;
	}

	/**
	 * @param schemaM2MType
	 *            the schemaM2MType to set
	 */
	public void setSchemaM2MType(Long schemaM2MType) {
		this.schemaM2MType = schemaM2MType;
	}

	/**
	 * @return the createdBy
	 */
	@Column(name = "created_by", length = 50, nullable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	@Column(name = "created_date", nullable = false)
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedBy
	 */
	@Column(name = "modified_by", length = 50, nullable = true)
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy
	 *            the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the modifiedDate
	 */
	@Column(name = "modified_date", nullable = true)
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set
	 */
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the linkAttribute
	 */
	@Transient
	public MessageSchemaAttributeEO getLinkAttribute() {
		return linkAttribute;
	}

	/**
	 * @param linkAttribute
	 *            the linkAttribute to set
	 */
	public void setLinkAttribute(MessageSchemaAttributeEO linkAttribute) {
		this.linkAttribute = linkAttribute;
	}

	/**
	 * String representation of the MessageSchemaAttributeEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< SchemaAttrId= ");
		str.append(this.getSchemaAttrId());
		str.append(", SchemaId= ");
		str.append(this.getSchemaId());
		str.append(", SchemaName= ");
		str.append(this.getSchemaName());
		str.append(", SchemaAttrName= ");
		str.append(this.getSchemaAttrName());
		str.append(", SchemaAttrType= ");
		str.append(this.getSchemaAttrType());
		str.append(", SchemaAttrTypeName= ");
		str.append(this.getSchemaAttrTypeName());
		str.append(", SchemaAttrISKey= ");
		str.append(this.isSchemaAttrIsKey());
		str.append(", SchemaAttrRelation= ");
		str.append(this.getSchemaAttrRelation());
		str.append(", SchemaM2MType= ");
		str.append(this.getSchemaM2MType());
		str.append(", CreatedBy= ");
		str.append(this.getCreatedBy());
		str.append(", CreatedDate= ");
		str.append(this.getCreatedDate());
		str.append(", ModifiedBy= ");
		str.append(this.getModifiedBy());
		str.append(", ModifiedDate= ");
		str.append(this.getModifiedDate());
		str.append(">");
		return str.toString();
	}

}
