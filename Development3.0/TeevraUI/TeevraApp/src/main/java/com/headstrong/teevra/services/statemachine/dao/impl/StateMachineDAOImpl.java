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
 * $Id: StateMachineDAOImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.teevra.services.statemachine.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.statemachine.dao.StateMachineDAO;
import com.headstrong.teevra.services.statemachine.eo.StateMachineEO;
import com.headstrong.teevra.services.statemachine.exception.StateMachineServiceException;
import com.headstrong.teevra.services.statemachine.exception.UniqueStateMachineException;

/**
 * StateMachineDAOImpl implements StateMachineDAO and contains methods to
 * perform CRUD operations on state machines.
 */
public class StateMachineDAOImpl extends BaseHibernateDAO<StateMachineEO>
		implements StateMachineDAO {

	/**
	 * Logger for StateMachineDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(StateMachineDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.statemachine.dao.StateMachineDAO#deleteStateMachine(java.lang.String)
	 */
	public void deleteStateMachine(String stateMachineName)
			throws StateMachineServiceException {
		super.delete(getStateMachine(stateMachineName));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.statemachine.dao.StateMachineDAO#getStateMachineList()
	 */
	public List<StateMachineEO> getStateMachineList()
			throws StateMachineServiceException {
		String query = "from StateMachineEO stateMachine";
		return super.getByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.statemachine.dao.StateMachineDAO#saveStateMachine(com.headstrong.teevra.services.statemachine.eo.StateMachineEO)
	 */
	public void saveStateMachine(StateMachineEO stateMachineToSave)
			throws StateMachineServiceException {
		DetachedCriteria criteria = DetachedCriteria
				.forClass(StateMachineEO.class);
		criteria.add(Restrictions.eq("stateMachineName", stateMachineToSave
				.getStateMachineName()));
		if (stateMachineToSave.getStateMachineId() != null) {
			criteria.add(Restrictions.ne("stateMachineId", stateMachineToSave
					.getStateMachineId()));
		}
		List<StateMachineEO> stateMachineList = super.getByCriteria(criteria);

		if (!stateMachineList.isEmpty()) {
			logger
					.error("A state machine with the same name already exists in the system");
			throw new UniqueStateMachineException(
					"A state machine with the name " + "'"
							+ stateMachineToSave.getStateMachineName() + "'"
							+ " already exists in the system");
		} else {
			super.saveOrUpdate(stateMachineToSave);
		}

	}

	private StateMachineEO getStateMachine(String stateMachineName) {
		return super.getByCriteria(
				DetachedCriteria.forClass(StateMachineEO.class).add(
						Restrictions.eq("stateMachineName", stateMachineName)))
				.get(0);
	}

}
