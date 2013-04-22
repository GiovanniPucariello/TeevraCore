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
 * $Id: ComponentBundleVO.java
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 31, 2008 
 */
package com.headstrong.teevra.services.component.vo;

import java.io.Serializable;

/**
 * Bundle to hold all the information of a component
 */
public class ComponentBundleVO implements Serializable {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String bundleName;
	private byte[] bundleContents;

	public String getBundleName() {
		return bundleName;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	public byte[] getBundleContents() {
		return bundleContents;
	}

	public void setBundleContents(byte[] bundleContents) {
		this.bundleContents = bundleContents;
	}
}
