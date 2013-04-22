package com.headstrong.fusion.services.caching;

import com.headstrong.fusion.services.caching.impl.dbCache.DBCachingService;


public class CachingServiceFactory {

	public static enum CACHE_TYPE {
		DB
	};
	
	public static CachingService getCacheManager(CACHE_TYPE cache_type) {
		
		switch (cache_type) {
		case DB: 
			return DBCachingService.getInstance();
		default:
			return null;
		}
	}

}
