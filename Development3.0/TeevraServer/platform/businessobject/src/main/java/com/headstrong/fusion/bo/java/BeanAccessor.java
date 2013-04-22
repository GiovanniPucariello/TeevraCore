package com.headstrong.fusion.bo.java;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;

public interface BeanAccessor<T> {

	public void setTarget(T obj);
	
	public Object get(String accessPath) throws AttributeNotFoundException;
	
	public void set(String accessPath, Object obj) throws AttributeNotFoundException;
}
