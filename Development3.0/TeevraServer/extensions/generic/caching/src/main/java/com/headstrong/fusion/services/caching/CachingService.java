package com.headstrong.fusion.services.caching;

public interface CachingService<T> {
	
	public T getCache(String cacheType); 

	public void reloadCache(String cacheName); 

}
