package com.headstrong.fusion.bo.generator.components;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AccessorFactoryGenerator extends TemplateGenerator implements
		ClassFileCreator {

	static boolean init = false;
	private Set<Class> classes;

	private static final AccessorFactoryGenerator soleInstance = new AccessorFactoryGenerator();

	private AccessorFactoryGenerator() {
		super();
		classes = new HashSet();
		templateName = "factoryTemplate.vm";
	}

	public static AccessorFactoryGenerator getInstance() {
		return soleInstance;
	}

	String generatedClassName = "BeanAccessorFactory.java";

	/**
	 * Register ClassNames to be Registered with this Factory.
	 * 
	 * @param className
	 * @return true if this class was not registered previously
	 */
	public synchronized boolean registerClass(Class className) {
		boolean b = false;
		if (className.isInterface()
				|| Modifier.isAbstract(className.getModifiers())) {
			b = false;
		} else {
			b = classes.add(className);
		}
		return b;
	}

	public boolean isClassRegistered(Class className) {
		return classes.contains(className);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.bo.generator.ClassCreator#createClass(java.util
	 * .Properties)
	 */
	public String createClass() {
		List classList = processClassList(classes);
		ctx.put("registeredClasses", classList);
		ctx.put("fqnSimpleNameMap", getSimpleNameMap(classes));
		String[] className = generatedClassName.split("[.]");
		ctx.put("className", className[className.length - 2]);
		return writeClass(getRichTemplateByName(), getPackagePath(),
				generatedClassName);
	}

	private List processClassList(Set<Class> classes2) {
		List<String> classList = new ArrayList();
		List<String> abstractClasses = new ArrayList();
		for (Class className : classes2) {
			String[] simpleNames = className.getName().split("[.]");
			if (simpleNames[simpleNames.length - 1].startsWith("Abstract")
					|| className.isInterface()
					|| Modifier.isAbstract(className.getModifiers())) {
				abstractClasses.add(className.getName());
			} else {
				classList.add(className.getName());
			}
		}
		Collections.sort(classList);
		Collections.sort(abstractClasses);
		classList.addAll(abstractClasses);
		return classList;
	}

	private Map<String, String> getSimpleNameMap(Set<Class> classNameSet) {
		Map map = new HashMap();
		for (Class className : classNameSet) {
			String[] classNameSplit = className.getName().split("[.]");
			map.put(className.getName(),
					classNameSplit[classNameSplit.length - 1]);
		}
		return map;
	}
}
