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
 * $Id: AuthenticationService.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 4, 2009 
 */

package com.headstrong.teevra.services.userauthentication;

import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.userauthentication.exception.UserAuthenticationServiceException;

/**
 * Service for user authentication
 */
public interface UserAuthenticationService {

	/**
	 * Performs authentication for the given username and password and returns
	 * the corresponding user entity with the roles,activities assigned to the
	 * user
	 * 
	 * @precondition
	 * @postcondition
	 * @param userName
	 * @param password
	 * @return
	 * @throws UserAuthenticationServiceException
	 */
	public UserEO authenticateUser(String userName, String password)
			throws UserAuthenticationServiceException;

	/**
	 * Removes the attributes stored in the session
	 * 
	 * @precondition
	 * @postcondition
	 * @throws UserAuthenticationServiceException
	 */
	public void logoutUser() throws UserAuthenticationServiceException;

}
