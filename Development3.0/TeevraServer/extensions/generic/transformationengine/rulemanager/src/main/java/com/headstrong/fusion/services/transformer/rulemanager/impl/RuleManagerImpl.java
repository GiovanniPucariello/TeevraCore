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
 * $Id: RuleManagerImpl.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 11, 2008 
 */

package com.headstrong.fusion.services.transformer.rulemanager.impl;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleManager;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleAlreadyExistsException;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleNotFoundException;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * DefaultImplementation of {@link RuleManager}
 */
public class RuleManagerImpl implements RuleManager {

	/**
	 * ruleVOCache keeps the cache of the ruleVO registered.
	 */
	private Map<String, RuleVO> ruleVOCache;

	/**
	 * ruleObjectCache keeps the cache of the rule objects.
	 */
	private Map<String, Rule> ruleObjectCache;
	private static final Logger logger = LoggerFactory
			.getLogger(RuleManager.class);
	private ServiceResolver<Rule> serviceResolver;

	/**
	 * Only constructor. Needs {@link BundleContext} to get the service using
	 * {@link ServiceResolver}
	 * 
	 * @param context
	 *            {@link BundleContext}
	 */
	public RuleManagerImpl(BundleContext context) {
		this.setServiceResolver(new ServiceResolverImpl<Rule>(context));
		ruleVOCache = new HashMap<String, RuleVO>();
		ruleObjectCache = new HashMap<String, Rule>();
	}

	public void registerRule(RuleVO ruleVO) throws RuleAlreadyExistsException {
		logger.info("Registering rule :" + ruleVO);
		/*
		 * See if the ruleVO is already there. If so, throw exception.
		 */
		if (ruleVOCache.containsKey(ruleVO.getAliasName())) {
			throw new RuleAlreadyExistsException("Rule already exists "
					+ ruleVO);
		} else {
			ruleVOCache.put(ruleVO.getAliasName(), ruleVO);

		}
	}

	/**
	 * Will return the Rule object corresponding to the alias name provided.
	 * 
	 * @param aliasName
	 * @return {@link Rule}
	 * @throws RuleNotFoundException
	 */
	private Rule getRule(String aliasName) throws RuleNotFoundException {
		Rule rule = null;
		if (!ruleObjectCache.containsKey(aliasName)) {
			RuleVO ruleVO = ruleVOCache.get(aliasName);
			if (ruleVO == null) {
				throw new RuleNotFoundException("Rule not found :" + aliasName);
			}
			try {
				rule = serviceResolver.getService(ruleVO.getClassName(), 0);
				/*
				 * Class<Rule> ruleClass = (Class<Rule>)
				 * Class.forName(ruleVO.getClassName()); rule =
				 * ruleClass.newInstance();
				 */
				if (rule == null) {
					throw new RuleNotFoundException("Rule not found :" + ruleVO);
				}
				ruleObjectCache.put(aliasName, rule);
			} catch (Exception e) {
				throw new RuleNotFoundException(
						"Error while creating rule object :" + ruleVO, e);
			}
		}
		rule = ruleObjectCache.get(aliasName);

		if (rule == null) {
			// never to be reached here
			throw new RuleNotFoundException("rule is null in cache");
		}
		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.RuleManager#executeRule(java.lang.String,
	 *      java.util.Map)
	 */
	public Object executeRule(String aliasName, Map<String, Object> data)
			throws RuleNotFoundException, RuleOperationFailedException {
		Rule rule = getRule(aliasName);
		return rule.operate(data);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.RuleManager#unRegisterRule(com.headstrong.fusion.services.transformer.rulemanager.RuleVO)
	 */
	public void unRegisterRule(RuleVO ruleVO) {
		logger.info("Unregistering rule :" + ruleVO);
		ruleVOCache.remove(ruleVO.getAliasName());
		ruleObjectCache.remove(ruleVO.getAliasName());

	}

	/**
	 * @param serviceResolver
	 *            the serviceResolver to set
	 */
	public void setServiceResolver(ServiceResolver<Rule> serviceResolver) {
		this.serviceResolver = serviceResolver;
	}
}
