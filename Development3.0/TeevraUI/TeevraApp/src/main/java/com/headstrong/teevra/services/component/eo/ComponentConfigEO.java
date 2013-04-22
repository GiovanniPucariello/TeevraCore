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
 * $Id: ComponentConfigurationEO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.teevra.services.component.eo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * EO corresponds to the table 'Component_Configuration'. This table holds the
 * details about the configurations of the components
 */
@Entity
@Table(name = "component_configuration")
public class ComponentConfigEO implements Serializable {
	/**
	 * generated serialversionUID
	 */
	private static final long serialVersionUID = -8107636074946582790L;
	/**
	 * Uniquely identifies a component?s configuration
	 */
	private Long compConfigId;
	/**
	 * Associates the configuration to the component
	 */
	private Long compId;
	/**
	 * Sequence number of the configuration of the component
	 */
	private Long configSequenceNumber;
	/**
	 * Key that uniquely identifies this configuration within the component
	 */
	private String configKey = null;
	/**
	 * Type of configuration. This also identifies the type of value that can be
	 * set to this configuration.
	 */
	private String configType = null;
	/**
	 * This can be used by the system while building the UI. For example, if a
	 * particular configuration can take values from a list, the same can be
	 * specified here.
	 */
	private String configReferences = null;
	/**
	 * Configuration path
	 */
	private String cofigLabel = null;
	/**
	 * User name who created the Configuration
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the Configuration
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the Configuration
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the Configuration
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the componentConfigId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "comp_config_id", nullable = true)
	public Long getCompConfigId() {
		return compConfigId;
	}

	/**
	 * @param componentConfigId
	 *            the componentConfigId to set
	 */
	public void setCompConfigId(Long compConfigId) {
		this.compConfigId = compConfigId;
	}

	/**
	 * @return the componentId
	 */
	@Column(name = "comp_id", nullable = true)
	public Long getCompId() {
		return compId;
	}

	/**
	 * @param componentId
	 *            the componentId to set
	 */
	public void setCompId(Long compId) {
		this.compId = compId;
	}

	/**
	 * @return the configSequenceNumber
	 */
	@Column(name = "config_sequence_number", nullable = true)
	public Long getConfigSequenceNumber() {
		return configSequenceNumber;
	}

	/**
	 * @param configSequenceNumber
	 *            the configSequenceNumber to set
	 */
	public void setConfigSequenceNumber(long configSequenceNumber) {
		this.configSequenceNumber = configSequenceNumber;
	}

	/**
	 * @return the configKey
	 */
	@Column(name = "config_key", length = 50, nullable = true)
	public String getConfigKey() {
		return configKey;
	}

	/**
	 * @param configKey
	 *            the configKey to set
	 */
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	/**
	 * @return the configType
	 */
	@Column(name = "config_type", length = 50, nullable = true)
	public String getConfigType() {
		return configType;
	}

	/**
	 * @param configType
	 *            the configType to set
	 */
	public void setConfigType(String configType) {
		this.configType = configType;
	}

	/**
	 * @return the configReferences
	 */
	@Column(name = "config_references", length = 50, nullable = true)
	public String getConfigReferences() {
		return configReferences;
	}

	/**
	 * @param configReferences
	 *            the configReferences to set
	 */
	public void setConfigReferences(String configReferences) {
		this.configReferences = configReferences;
	}

	/**
	 * @return the cofig_label
	 */
	@Column(name = "config_label", length = 50, nullable = false)
	public String getCofigLabel() {
		return cofigLabel;
	}

	/**
	 * @param cofig_label
	 *            the cofig_label to set
	 */
	public void setCofigLabel(String cofigLabel) {
		this.cofigLabel = cofigLabel;
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
	 * String representation of the ComponentConfigEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< CompConfigId= ");
		str.append(this.getCompConfigId());
		str.append(", CompId = ");
		str.append(this.getCompId());
		str.append(", ConfigKey= ");
		str.append(this.getConfigKey());
		str.append(", ConfigType= ");
		str.append(this.getConfigType());
		str.append(", ConfigReferences= ");
		str.append(this.getConfigReferences());
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
