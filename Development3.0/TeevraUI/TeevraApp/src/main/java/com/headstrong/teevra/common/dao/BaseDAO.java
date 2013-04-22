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
 * $Id: BaseDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.common.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Generic DAO, contains the methods for DB operations
 */
public interface BaseDAO<T> {
	/**
	 * Deletes the given entity from database
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 * @throws DataAccessException
	 */
	public void delete(T t) throws DataAccessException;

	/**
	 * Updates the given entity in the database
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 */
	public void update(T t);

	/**
	 * Returns the persistent instance of the given entity class with the given
	 * identifier, or null if not found
	 * 
	 * @precondition
	 * @postcondition
	 * @param cls
	 * @param id
	 * @return the persistent instance T
	 */
	@SuppressWarnings("unchecked")
	public T get(Class cls, long id);

	/**
	 * Loads entities by executing the HQL query.
	 * 
	 * @precondition
	 * @postcondition
	 * @param query
	 * @return List of entities T
	 */
	public List<T> getByQuery(String query);

	/**
	 * Persists the given entity into database
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 */
	public void save(T t);

	/**
	 * Saves or updates the given persistent instance based on the id of the
	 * entity
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 */
	public void saveOrUpdate(T t);

	/**
	 * Executes a query based on a given Hibernate criteria object
	 * 
	 * @precondition
	 * @postcondition
	 * @param criteria
	 * @return List of entities T
	 */
	public List<T> getByCriteria(DetachedCriteria criteria);

	/**
	 * 
	 * 
	 * @precondition
	 * @postcondition
	 * @param hibernateTemplate
	 *            the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate);

	/**
	 * 
	 * 
	 * @precondition
	 * @postcondition
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate();

}
