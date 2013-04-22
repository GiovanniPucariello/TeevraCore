/**
 * 
 */
package com.headstrong.fusion.bo.java;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * stores class Metadata information.
 * 
 */
public class ClassMetadataFactory {
	private static final HashMap<String, ClassMetadata> classMetadataMap = new HashMap<String, ClassMetadata>();

	public static void addClassMetadata(ClassMetadata classMetadata) {
		classMetadataMap.put(classMetadata.getJavaClass().getName(),
				classMetadata);
	}

	public static ClassMetadata getClasMetadata(String className) {
		ClassMetadata classMetadata = null;
		classMetadata = classMetadataMap.get(className);
		if (classMetadata == null) {
			try {
				classMetadata = createClassMetada(Class.forName(className));
			} catch (ClassNotFoundException e) {
				// ignore.
			}
			addClassMetadata(classMetadata);
		}
		return classMetadata;
	}

	/**
	 * Initializes the cache of getter and setter method references
	 */
	private static ClassMetadata createClassMetada(Class javaClass) {
		ClassMetadata classMetadata = new ClassMetadata();
		classMetadata.setJavaClass(javaClass);
		Method[] allMethods = javaClass.getMethods();
		for (Method method : allMethods) {
			String methodName = method.getName();
			if (methodName.startsWith("get") && methodName.length() > 3) {
				// convert first character after "get" to lower case
				String attrName = methodName.substring(3, 4).toLowerCase()
						+ methodName.substring(4);
				classMetadata.addGetterMethod(attrName, method);
			} else if (methodName.startsWith("set") && methodName.length() > 3) {
				// convert first character after "set" to lower case
				String attrName = methodName.substring(3, 4).toLowerCase()
						+ methodName.substring(4);
				classMetadata.addSetterMethod(attrName, method);
			}
		}
		return classMetadata;
	}

}
