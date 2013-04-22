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
 * $Id: AuthenticationProvider.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 7, 2009 
 */

package com.headstrong.teevra.services.userauthentication.provider;

import com.headstrong.teevra.services.userauthentication.exception.UserAuthenticationException;

/**
 * Interface to authenticate the user
 */
public interface AuthenticationProvider {

	/**
	 * Returns true for the given user credentials, if they are valid
	 * 
	 * @precondition
	 * @postcondition
	 * @param username
	 * @param password
	 * @throws UserAuthenticationException
	 */
	public Boolean authenticateUser(String username, String password)
			throws UserAuthenticationException;

}
