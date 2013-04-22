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
 * $Id: MessageSchema.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.services.schema.eo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * EO corresponds to the 'Message_Schema' table. This table holds the list of
 * schemas present in the system. This will also contain pre-defined types like
 * int, string, etc. If the schema is publicly visible, the columns
 * visibility_prcs_id and visibility_prcs_grp_id will be null.
 */
@Entity
@Table(name = "message_schema")
public class MessageSchemaEO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for a schema
	 */
	private Long schemaId;
	/**
	 * Uniquely identifies a schema. For primitive types the schema name should
	 * be same as the one specified in XML schema standards. The format should
	 * be [A-Z]+[0-9 |.|_|A-Z]*
	 */
	private String schemaName = null;
	/**
	 * Describes the schema
	 */
	private String schemaDesc = null;
	/**
	 * Specifies if the schema is a public or not. Public schemas are visible to
	 * all
	 */
	private Boolean schemaIsPublic = false;
	/**
	 * Specifies if the schema is a primitive type or not. Primitive types form
	 * the leaf level nodes in the schema tree.
	 */
	private Boolean schemaIsPrimitive = false;
	/**
	 * Identifies the parent class from whom it has inherited all the
	 * attributes.
	 */
	private Long parentSchemaId;
	/**
	 * User name who created the schema
	 */
	private String createdBy;
	/**
	 * Time when created the schema
	 */
	private Timestamp createdDate;
	/**
	 * User name who modified the schema
	 */
	private String modifiedBy;
	/**
	 * Time when modified the schema
	 */
	private Timestamp modifiedDate;
	/**
	 * Attributes present in the current schema
	 */
	private List<MessageSchemaAttributeEO> attributes = null;
	/**
	 * MessageSchemaRawEO which contains the raw data of the schema
	 */
	private MessageSchemaRawEO schemaRaw = null;

	/**
	 * @return the schemaId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "schema_id", nullable = true)
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
	@Column(name = "schema_name", length = 50, nullable = true)
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
	 * @return the schemaDesc
	 */
	@Column(name = "schema_desc", length = 200, nullable = true)
	public String getSchemaDesc() {
		return schemaDesc;
	}

	/**
	 * @param schemaDesc
	 *            the schemaDesc to set
	 */
	public void setSchemaDesc(String schemaDesc) {
		this.schemaDesc = schemaDesc;
	}

	/**
	 * @return the schemaIsPublic
	 */
	@Column(name = "schema_is_public", nullable = false)
	public boolean isSchemaIsPublic() {
		return schemaIsPublic;
	}

	/**
	 * @param schemaIsPublic
	 *            the schemaIsPublic to set
	 */
	public void setSchemaIsPublic(boolean schemaIsPublic) {
		this.schemaIsPublic = schemaIsPublic;
	}

	/**
	 * @return the schemaIsPrimitive
	 */
	@Column(name = "schema_is_primitive", nullable = false)
	public boolean isSchemaIsPrimitive() {
		return schemaIsPrimitive;
	}

	/**
	 * @param schemaIsPrimitive
	 *            the schemaIsPrimitive to set
	 */
	public void setSchemaIsPrimitive(boolean schemaIsPrimitive) {
		this.schemaIsPrimitive = schemaIsPrimitive;
	}

	/**
	 * @return the parentSchemaId
	 */
	@Column(name = "parent_schema_id", nullable = true)
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
	 * @return the attributes
	 */

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@Fetch(FetchMode.SUBSELECT)
	@JoinColumn(name = "schema_id", insertable = false, updatable = false)
	public List<MessageSchemaAttributeEO> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(List<MessageSchemaAttributeEO> attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the schemaRaw
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schema_id", insertable = false, updatable = false)
	public MessageSchemaRawEO getSchemaRaw() {
		return schemaRaw;
	}

	/**
	 * @param schemaRaw
	 *            the schemaRaw to set
	 */

	public void setSchemaRaw(MessageSchemaRawEO schemaRaw) {
		this.schemaRaw = schemaRaw;
	}

	/**
	 * String representation of the MessageSchemaEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< SchemaId= ");
		str.append(this.getSchemaId());
		str.append(", SchemaName= ");
		str.append(this.getSchemaName());
		str.append(", SchemaDesc= ");
		str.append(this.getSchemaDesc());
		str.append(", SchemaIsPublic= ");
		str.append(this.isSchemaIsPublic());
		str.append(", SchemaIsPrimitive= ");
		str.append(this.isSchemaIsPrimitive());
		str.append(", ParentSchemaId= ");
		str.append(this.getParentSchemaId());
		str.append(", CreatedBy= ");
		str.append(this.getCreatedBy());
		str.append(", CreatedDate= ");
		str.append(this.getCreatedDate());
		str.append(", ModifiedBy= ");
		str.append(this.getModifiedBy());
		str.append(", ModifiedDate= ");
		str.append(this.getModifiedDate());
		/*
		 * str.append(", attributes= ");
		 * str.append(this.getAttributes().toString());
		 */
		str.append(">");
		return str.toString();
	}

}
