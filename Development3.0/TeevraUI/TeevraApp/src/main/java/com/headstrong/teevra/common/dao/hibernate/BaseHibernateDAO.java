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
 * $Id: BaseHibernateDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.teevra.common.dao.hibernate;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.headstrong.teevra.common.dao.BaseDAO;

/**
 * BaseHibernateDAO class implements BaseDAo
 */
public class BaseHibernateDAO<T> implements BaseDAO<T> {

	private HibernateTemplate hibernateTemplate = null;
	private SessionFactory sessionFactory = null;
	private Session hibernateSession = null;

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		setHibernateSession(sessionFactory.openSession());
	}

	/**
	 * @return the hibernSession
	 */
	protected Session getHibernateSession() {
		return sessionFactory.openSession();
	}

	/**
	 * @param hibernSession
	 *            the hibernSession to set
	 */
	protected void setHibernateSession(Session hibernateSession) {
		this.hibernateSession = hibernateSession;
	}

	/**
	 * Deletes the given entity into database
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 * @throws DataAccessException
	 */
	public void delete(T t) throws DataAccessException {
		getHibernateTemplate().delete(t);

	}

	/**
	 * Updates the given entity into database
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 */
	public void update(T t) {
		getHibernateTemplate().update(t);
	}

	/**
	 * Executes an HQL query.
	 * 
	 * @precondition
	 * @postcondition
	 * @param query
	 * @return List of entities T
	 */
	@SuppressWarnings("unchecked")
	public List<T> getByQuery(String query) {
		return getHibernateTemplate().find(query);
	}

	/**
	 * Executes an SQL query for selected columns.
	 * 
	 * @precondition
	 * @postcondition
	 * @param query
	 * @return List of entities T
	 */
	@SuppressWarnings("unchecked")
	public Iterator createSQLQuery(final String criteriaQuery) {
		return hibernateSession.createSQLQuery(criteriaQuery).list()
				.iterator();
	}
	
	/**
	 * Executes an HQL query for selected columns.
	 * 
	 * @precondition
	 * @postcondition
	 * @param query
	 * @return List of entities T
	 */
	@SuppressWarnings("unchecked")
	public Iterator createQuery(final String criteriaQuery) {
		return hibernateSession.createQuery(criteriaQuery).list()
				.iterator();
	}

	/**
	 * Persists the given entity into database
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 */
	public void save(T t) {
		getHibernateTemplate().save(t);

	}

	/**
	 * Save or update the given persistent instance
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            an entity
	 */
	public void saveOrUpdate(T t) {
		getHibernateTemplate().saveOrUpdate(t);

	}

	/**
	 * Save or update all the given instances
	 * 
	 * @precondition
	 * @postcondition
	 * @param t
	 *            collection of entities that need to be saved
	 */
	public void saveOrUpdate(Collection<T> t) {
		getHibernateTemplate().saveOrUpdateAll(t);
	}

	/**
	 * Update/delete all objects according to the given query, binding one value
	 * to a "?" parameter in the query string.
	 * 
	 * @precondition
	 * @postcondition
	 * @param queryString
	 *            Parameterized delete / update hibernate query
	 * @param values
	 *            the values of the parameters
	 * @return the number of entity instances updated/deleted.
	 */
	public int bulkUpdate(String queryString, Object[] values) {
		return getHibernateTemplate().bulkUpdate(queryString, values);
	}

	/**
	 * Return the persistent instance of the given entity class with the given
	 * identifier, or null if not found
	 * 
	 * @precondition
	 * @postcondition
	 * @param cls
	 * @param id
	 * @return the persistent instance T
	 */
	@SuppressWarnings("unchecked")
	public T get(Class cls, long id) {
		Long idL = new Long(id);
		return (T) getHibernateTemplate().get(cls, idL);
	}

	/**
	 * Executes a query based on a given Hibernate criteria object
	 * 
	 * @precondition
	 * @postcondition
	 * @param criteria
	 * @return List of entities T
	 */
	@SuppressWarnings("unchecked")
	public List<T> getByCriteria(DetachedCriteria criteria) {
		return getHibernateTemplate().findByCriteria(criteria);
	}

	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate
	 *            the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
		this.hibernateTemplate.setCacheQueries(true);
	}
}
