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
 * $Id: UserDAO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * Offers APIs to perform CRUD operations on users
 */
public interface UserDAO extends BaseDAO<UserEO> {

	/**
	 * Fetches all the details along with the roles of the users registered in
	 * the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws UserAdminServiceException
	 */
	public List<UserEO> getUsers() throws UserAdminServiceException;

	/**
	 * Persists the given user details
	 * 
	 * @precondition
	 * @postcondition
	 * @param userToSave
	 * @throws UserAdminServiceException
	 */
	public void saveUser(UserEO userToSave) throws UserAdminServiceException;

	/**
	 * Deletes the given user from the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param userId
	 * @throws UserAdminServiceException
	 */
	public void deleteUser(Long userId) throws UserAdminServiceException;

	/**
	 * Retrieves the user for the given user name and password
	 * 
	 * @precondition
	 * @postcondition
	 * @param userName
	 * @param password
	 * @return
	 * @throws UserAdminServiceException
	 */
	public UserEO getUser(String userName, String password)
			throws UserAdminServiceException;

	/**
	 * Retrieves the user along with its roles for the given user name
	 * 
	 * @precondition
	 * @postcondition
	 * @param userName
	 * @return
	 * @throws UserAdminServiceException
	 */
	public UserEO getUser(String userName) throws UserAdminServiceException;
}
