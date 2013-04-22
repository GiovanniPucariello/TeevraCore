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
 * $Id: Component.java
 * $Revision:
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008
 */

package com.headstrong.teevra.services.component.eo;

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
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Check;

/**
 * EO corresponds to the 'Component' table. This table stores the list of
 * components available for processes
 */
@Entity
@Table(name = "component", uniqueConstraints = { @UniqueConstraint(columnNames = {
		"comp_name", "comp_ver_id" }) })
public class ComponentEO implements Serializable {
	public static final String ENDPOINT = "ENDPOINT";
	public static final String PARSER = "PARSER";
	public static final String FORMATTER = "FORMATTER";
	public static final String SERVICE = "SERVICE";
	public static final String ROUTER = "ROUTER";
	public static final String ERROR_REPORTER = "ERRORREPORTER";

	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Unique identifier for a component in the system. This id is independent
	 * of its instances that are placed in a process model
	 */
	private Long compId;
	/**
	 * Name of the component
	 */
	private String compName = null;

	/**
	 * Name as used by the component while registering with the server
	 */
	private String compServiceName = null;

	/**
	 * Version of the component
	 */
	private String compVerId = "1.0";
	/**
	 * Status of the component: ACTIVE / INACTIVE. Enums can be used
	 */
	private String compStatus = "ACTIVE";
	/**
	 * Type of component ? FUNCTIONAL / CONNECTOR
	 */
	private String compType = "FUNCTIONAL";
	/**
	 * : Desrcibes the component
	 */
	private String compDesc = null;
	/**
	 * time when the component is deployed
	 */
	private Timestamp compDeployDate = null;
	/**
	 * time when the component is undeployed
	 */
	private Timestamp compUndeployDate = null;
	/**
	 * Reference to the component?s image.
	 */
	private String compImageRef = null;
	/**
	 * Name of the swf on the UI side
	 */
	private String compConfigUI = null;
	/**
	 * User name who created the Component
	 */
	private String createdBy = System.getProperty("user.name");
	/**
	 * Time when created the Component
	 */
	private Timestamp createdDate = new Timestamp(System.currentTimeMillis());
	/**
	 * User name who modified the Component
	 */
	private String modifiedBy = System.getProperty("user.name");
	/**
	 * Time when modified the Component
	 */
	private Timestamp modifiedDate = new Timestamp(System.currentTimeMillis());

	/**
	 * List of ComponentConfigEOs which are related with ComponentEO in
	 * oneToMany fashion
	 */
	private List<ComponentConfigEO> compConfigList = null;

	private byte[] byteData;

	private String fileName;

	/**
	 * @return the compId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "id_gen")
	@TableGenerator(name = "id_gen", table = "teevra_sequence", pkColumnName = "table_name", valueColumnName = "seq_value", allocationSize = 1)
	@Column(name = "comp_id", nullable = true)
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
	 * @return the compName
	 */
	@Column(name = "comp_name", length = 100, nullable = false)
	public String getCompName() {
		return compName;
	}

	/**
	 * @param compName
	 *            the compName to set
	 */
	public void setCompName(String compName) {
		this.compName = compName;
	}

	/**
	 * @return the compServiceName
	 */
	@Column(name = "comp_service_name", length = 100, nullable = false)
	public String getCompServiceName() {
		return compServiceName;
	}

	/**
	 * @param compServiceName
	 *            the compServiceName to set
	 */
	public void setCompServiceName(String compServiceName) {
		this.compServiceName = compServiceName;
	}

	/**
	 * @return the compVerId
	 */
	@Column(name = "comp_ver_id", length = 20, nullable = true)
	public String getCompVerId() {
		return compVerId;
	}

	/**
	 * @param compVerId
	 *            the compVerId to set
	 */
	public void setCompVerId(String compVerId) {
		this.compVerId = compVerId;
	}

	/**
	 * @return the compStatus
	 */
	@Column(name = "comp_status", length = 10, nullable = true)
	@Check(constraints = "(ACTIVE) OR (INACTIVE)")
	public String getCompStatus() {
		return compStatus;
	}

	/**
	 * @param compStatus
	 *            the compStatus to set
	 */
	public void setCompStatus(String compStatus) {
		this.compStatus = compStatus;
	}

	/**
	 * @return the compType
	 */
	@Column(name = "comp_type", length = 20, nullable = true)
	@Check(constraints = "(FUNCTIONAL) OR (CONNECTOR)")
	public String getCompType() {
		return compType;
	}

	/**
	 * @param compType
	 *            the compType to set
	 */
	public void setCompType(String compType) {
		this.compType = compType;
	}

	/**
	 * @return the compDesc
	 */
	@Column(name = "comp_desc", length = 100, nullable = true)
	public String getCompDesc() {
		return compDesc;
	}

	/**
	 * @param compDesc
	 *            the compDesc to set
	 */
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	/**
	 * @return the compDeployDate
	 */
	@Column(name = "comp_deploy_date", nullable = true)
	public Timestamp getCompDeployDate() {
		return compDeployDate;
	}

	/**
	 * @param compDeployDate
	 *            the compDeployDate to set
	 */
	public void setCompDeployDate(Timestamp compDeployDate) {
		this.compDeployDate = compDeployDate;
	}

	/**
	 * @return the compUndeployDate
	 */
	@Column(name = "comp_undeploy_date", nullable = true)
	public Timestamp getCompUndeployDate() {
		return compUndeployDate;
	}

	/**
	 * @param compUndeployDate
	 *            the compUndeployDate to set
	 */
	public void setCompUndeployDate(Timestamp compUndeployDate) {
		this.compUndeployDate = compUndeployDate;
	}

	/**
	 * @return the compImageRef
	 */
	@Column(name = "comp_image_ref", length = 50, nullable = true)
	public String getCompImageRef() {
		return compImageRef;
	}

	/**
	 * @param compImageRef
	 *            the compImageRef to set
	 */
	public void setCompImageRef(String compImageRef) {
		this.compImageRef = compImageRef;
	}

	/**
	 * @return the compConfigUI
	 */
	@Column(name = "comp_config_ui", length = 200, nullable = true)
	public String getCompConfigUI() {
		return compConfigUI;
	}

	/**
	 * @param compConfigUI
	 *            the compConfigUI to set
	 */
	public void setCompConfigUI(String compConfigUI) {
		this.compConfigUI = compConfigUI;
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
	 * @return the compConfigList
	 */
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "comp_id", insertable = false, updatable = false)
	public List<ComponentConfigEO> getCompConfigList() {
		return compConfigList;
	}

	/**
	 * @param compConfigList
	 *            the compConfigList to set
	 */
	public void setCompConfigList(List<ComponentConfigEO> compConfigList) {
		this.compConfigList = compConfigList;
	}

	/**
	 * String representation of the ComponentEO
	 * 
	 * @precondition
	 * @postcondition
	 * @return the string
	 */
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("< CompId= ");
		str.append(this.getCompId());
		str.append(", CompName= ");
		str.append(this.getCompName());
		str.append(", CompVerId= ");
		str.append(this.getCompVerId());
		str.append(", CompStatus = ");
		str.append(this.getCompStatus());
		str.append(", CompType= ");
		str.append(this.getCompType());
		str.append(", CompDesc = ");
		str.append(this.getCompDesc());
		str.append(", CompDeployDate = ");
		str.append(this.getCompDeployDate());
		str.append(", CompUndeployDate= ");
		str.append(this.getCompUndeployDate());
		str.append(", CreatedBy= ");
		str.append(this.getCreatedBy());
		str.append(", CreatedDate= ");
		str.append(this.getCreatedDate());
		str.append(", ModifiedBy= ");
		str.append(this.getModifiedBy());
		str.append(", ModifiedDate= ");
		str.append(this.getModifiedDate());
		if (this.getCompConfigList() != null) {
			str.append(", compConfigList= ");
			str.append(this.getCompConfigList().toString());
		}
		str.append(">");
		return str.toString();
	}

	@Transient
	public byte[] getByteData() {
		return byteData;
	}

	public void setByteData(byte[] byteData) {
		this.byteData = byteData;
	}

	@Transient
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}