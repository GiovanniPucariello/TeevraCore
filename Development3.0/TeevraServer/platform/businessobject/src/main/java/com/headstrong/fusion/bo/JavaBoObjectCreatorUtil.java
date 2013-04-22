package com.headstrong.fusion.bo;

import com.headstrong.fusion.bo.java.FixmlNamespace;

public class JavaBoObjectCreatorUtil {
	
	/**
	 *  Creates a Object of a particular class irrespective of the type of FIXML type.
	 * @param namespace
	 * @param className
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public Object createJavaBo(String namespace, String className)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		String qualifiedName = (FixmlNamespace.valueOf(namespace)
				.getFixmlContext()
				+ "." + className).trim();
		return Class.forName(qualifiedName).newInstance();
	}
}
