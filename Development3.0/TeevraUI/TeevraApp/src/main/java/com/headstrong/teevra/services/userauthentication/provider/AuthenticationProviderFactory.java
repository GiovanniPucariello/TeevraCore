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
 * $Id: AuthenticationProviderFactory.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 4, 2009 
 */

package com.headstrong.teevra.services.userauthentication.provider;

import java.util.Map;

import com.headstrong.teevra.services.userauthentication.exception.UserAuthenticationServiceException;

/**
 * Provides the AuthenticationProvider object at run time based on the type of
 * authentication (JDBC/LDAP)
 */
public class AuthenticationProviderFactory {

	@SuppressWarnings("unchecked")
	private Map providerType;

	/**
	 * Returns the the respective authentication provider based on the
	 * authentication type
	 * 
	 * @precondition
	 * @postcondition
	 * @param authenticationType
	 * @return
	 * @throws UserAuthenticationServiceException
	 */
	public AuthenticationProvider getAuthenticationProvider(
			String authenticationType)
			throws UserAuthenticationServiceException {

		return (AuthenticationProvider) providerType.get(authenticationType);
	}

	/**
	 * @return the providerType
	 */
	@SuppressWarnings("unchecked")
	public Map getProviderType() {
		return providerType;
	}

	/**
	 * @param providerType
	 *            the providerType to set
	 */
	@SuppressWarnings("unchecked")
	public void setProviderType(Map providerType) {
		this.providerType = providerType;
	}

}
