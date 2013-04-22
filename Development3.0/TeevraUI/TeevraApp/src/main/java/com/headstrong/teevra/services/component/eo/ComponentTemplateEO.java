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
 * $Id: ComponentTemplateEO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 26, 2009 
 */

package com.headstrong.teevra.services.component.eo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.component.exception.ComponentServiceException;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;

/**
 * EO corresponds to the 'Component_Template' table. This table holds the
 * configurations of components as templates
 * 
 */
@Entity
@Table(name = "component_template", uniqueConstraints = { @UniqueConstraint(columnNames = {
		"comp_id", "template_name" }) })
public class ComponentTemplateEO implements Serializable {
	/**
	 * Logger for ComponentTemplateEO
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ComponentTemplateEO.class);
	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 8970723658080323861L;

	/**
	 * Unique Identifier for the component template
	 */
	private Long compTemplateId;
	/**
	 * Identifier for the component to which the template belongs to
	 */
	private Long compId;
	/**
	 * Name of the component template(Unique for a compId)
	 */
	private String templateName;
	/**
	 * Serialized configurations of the component as persisted in DB
	 */
	private String serializedConfigurations;

	/**
	 * Deserialized Configuration details of the component
	 */
	private List<ProcessServiceConfigurationEO> configurations;

	/**
	 * User name who created the Template
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the Template
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the Template
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the Template
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * @return the compTemplateId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "comp_template_id", nullable = true)
	public Long getCompTemplateId() {
		return compTemplateId;
	}

	/**
	 * @param compTemplateId
	 *            the compTemplateId to set
	 */
	public void setCompTemplateId(Long compTemplateId) {
		this.compTemplateId = compTemplateId;
	}

	/**
	 * @return the compId
	 */
	@Column(name = "comp_id", nullable = false)
	public Long getCompId() {
		return compId;
	}

	/**
	 * @param compId
	 *            the compId to set
	 */
	public void setCompId(Long compId) {
		this.compId = compId;
	}

	/**
	 * @return the templateName
	 */
	@Column(name = "template_name", length = 100, nullable = false)
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * @param templateName
	 *            the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	/**
	 * @return the serializedConfigurations
	 */
	@Column(name = "comp_service_configs", nullable = true)
	public String getserializedConfigurations() {
		return serializedConfigurations;
	}

	/**
	 * @param serializedConfigurations
	 *            the serializedConfigurations to set
	 */

	@SuppressWarnings("unchecked")
	public void setSerializedConfigurations(String serializedConfigurations)
			throws ComponentServiceException {
		this.serializedConfigurations = serializedConfigurations;

		if (serializedConfigurations != null) {
			// deserialize the configurations to create list of configurations
			byte[] bytes;
			try {
				bytes = serializedConfigurations.getBytes("UTF-8");
				ByteArrayInputStream io = new ByteArrayInputStream(bytes);
				XMLDecoder decoder = new XMLDecoder(io);
				configurations = (List<ProcessServiceConfigurationEO>) decoder
						.readObject();
			} catch (UnsupportedEncodingException e) {
				logger
						.error(
								"Error while generating serialized configurations of the template ",
								e);
				throw new ComponentServiceException(e.getMessage());
			}
		}
	}

	/**
	 * @return the list of configurations of the component in the template
	 */
	@Transient
	public List<ProcessServiceConfigurationEO> getConfigurations() {
		return configurations;
	}

	/**
	 * @param configurations
	 *            the configurations to set. Which would be serialized and
	 *            stored in the serialized configurations
	 */
	public void setConfigurations(
			List<ProcessServiceConfigurationEO> configurations) {
		this.configurations = configurations;
		if (configurations != null) {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			XMLEncoder encoder = new XMLEncoder(os);
			encoder.writeObject(configurations);
			encoder.close();

			this.serializedConfigurations = os.toString();
		}
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
}
