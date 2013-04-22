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
 * $Id: DBCacheLookupRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.lookup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.caching.CachingService;
import com.headstrong.fusion.services.caching.CachingServiceFactory;
import com.headstrong.fusion.services.caching.CachingServiceFactory.CACHE_TYPE;
import com.headstrong.fusion.services.caching.impl.dbCache.DBCache;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>DBCacheLookupRule</code> is the rule that loads the Database table
 * into cache and reads from the cache whenever required. This rule is
 * particularly useful in instances where static data has to be referred to from
 * database without making too many database calls.
 * <p>
 * The input parameters required by this rule includes:
 * <ul>
 * <li>cachename : The name of the cache. Particularly useful when the cache
 * has to be shared among different processes.
 * <li>lookupvalue : The value which needs to be looked in the cache to find
 * the mapping.
 * </ul>
 * <p>
 * the output parameter set by this rule includes:
 * <ul>
 * <li>result : The output result.
 * </ul>
 * 
 */
public class DBCacheLookupRule implements Rule {
	private static final Logger logger = LoggerFactory
			.getLogger(DBCacheLookupRule.class);

	public static final String CACHENAME = "cachename";

	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("dbcachelookup");
		ruleVO.setClassName(DBCacheLookupRule.class.getName());
		ruleVO.addInParameter(CACHENAME);
		ruleVO.addInParameter(OPERAND);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		// get cache name
		String cacheName = (String) data.get(CACHENAME);
		
		if (logger.isInfoEnabled()) {
			logger.info("DBCacheLookup Rule operating on :" + data);
		}
		
		CachingService<DBCache> cacheManager = CachingServiceFactory.getCacheManager(CACHE_TYPE.DB);
		DBCache cache = cacheManager.getCache(cacheName);
		
		if (logger.isInfoEnabled()) {
			logger.info("DBCache :" + cache);
		}

		if (cache == null) {
			throw new RuleOperationFailedException("No such cache present "
					+ cacheName);
		}
		
		Object result = null;
		if (data.get(OPERAND) != null) {
			Map<String, Object> cachedData = cache.getData();
			result = cachedData.get(data.get(OPERAND).toString().trim());
			if (logger.isInfoEnabled()) {
				logger.info("DBCache cached data :" + cachedData);
			}
		}

		if (result == null) {
			result = "";
			// throw new RuleOperationFailedException(
			// "Value not found in the cache ");
		}
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put(RESULT, result);
		return resultMap;
	}
}
