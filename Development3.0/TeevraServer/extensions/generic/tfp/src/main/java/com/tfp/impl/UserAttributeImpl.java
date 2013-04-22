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
 * $Id: UserAttributeImpl.java
 */
package com.tfp.impl;

import com.tfp.interfaces.UserAttribute;

/**
 *
 * This file is provided by MCH team for TFP integration.
 * Implementation class of UserAttribute interface
 *
 * @author clao
 * @author jreformado
 *
 * @param <K> name
 * @param <V> value
 */
public class UserAttributeImpl<K, V> implements UserAttribute<K, V> {

	/* (non-Javadoc)
	 * @see com.tfp.interfaces.UserAttribute#getName()
	 */
	@Override
	public K getName() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.tfp.interfaces.UserAttribute#getValue()
	 */
	@Override
	public V getValue(K name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.tfp.interfaces.UserAttribute#setName()
	 */
	@Override
	public void setName(K name) {
	}

	/* (non-Javadoc)
	 * @see com.tfp.interfaces.UserAttribute#setValue()
	 */
	@Override
	public void setValue(V value) {
	}
}
