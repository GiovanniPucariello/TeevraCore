package com.headstrong.fusion.bo.generator.components;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.headstrong.fusion.bo.generator.AccessorGeneratorUtil;

public class AccessorGenerator extends TemplateGenerator implements ClassFileCreator {

	private static final AccessorGenerator soleInstance = new AccessorGenerator();

	public static AccessorGenerator getSoleInstance() {
		return soleInstance;
	}

	private AccessorGenerator() {
		super();
		templateName = "BeanAccessorTemplate.vm";
	}

	@Override
	public String createClass() {
		Set<Class> inputClassSet = getClassesToLoad();
		for (Class clazz : inputClassSet) {
			buildAccessorTemplate(clazz);
		}
		return getPackagePath();
	}

	private Set<Class> getClassesToLoad() {
		Set<Class> classesToLoad = AccessorGeneratorUtil.getClassesByName((String) appProperties
				.getProperty("sourceClasses"));
		classesToLoad.addAll(AccessorGeneratorUtil.getAllClassesFromPackage((String) appProperties
				.getProperty("sourcePackage")));
		return classesToLoad;
	}

	private void buildAccessorTemplate(Class clazz) {
		AccessorFactoryGenerator.getInstance().registerClass(clazz);
		String fqn = clazz.getName();
		if(fqn.contains("package-info")){
			return;
		}
		Method[] methods = clazz.getMethods();
		Map<String, String> memberNameGetterMap = new HashMap();
		Map<String, String> memberNameSetterMap = new HashMap();
		Map<String, String> memberNameSetterParamMap = new HashMap();
		List<String> enumAttrs = new ArrayList<String>();
		
		Set<Class> nonPrimitiveAttributeTypes = new HashSet();
		Set<String> importClasses = new HashSet();
		for (Method m : methods) {
			String mName = m.getName();
			if (mName.startsWith("get") && mName.length() > 3) {
				String attribute = mName.substring(3, 4).toLowerCase() + mName.substring(4);
				memberNameGetterMap.put(attribute, mName);
				Class returnType = m.getReturnType();
				if ((!returnType.isPrimitive() && !returnType.getName().startsWith("java.") && !returnType.getName()
						.startsWith("javax."))
						|| returnType.getName().startsWith("javax.xml.bind.JAXBElement")) {
					nonPrimitiveAttributeTypes.add(m.getReturnType());
				}
			} else if (mName.startsWith("set") && mName.length() > 3) {
				String attribute = mName.substring(3, 4).toLowerCase() + mName.substring(4);
				Class setterClass = m.getParameterTypes()[0];

				String setterClassName = setterClass.getName();
				if (!m.getParameterTypes()[0].isPrimitive() && !setterClassName.startsWith("java.lang")) {
					importClasses.add(setterClassName);
				}
				String[] paramClassSimpleNameArr = setterClassName.split("[.]");
				String paramClassSimpleName = paramClassSimpleNameArr[paramClassSimpleNameArr.length - 1];
				if (!setterClass.isEnum()) {
					paramClassSimpleName = (null == primitiveToWrapperClassNameMap.get(paramClassSimpleName)) ? paramClassSimpleName
							: primitiveToWrapperClassNameMap.get(paramClassSimpleName);
					paramClassSimpleName = "("+paramClassSimpleName+")"+" obj";
				} else{
					enumAttrs.add(attribute);
					paramClassSimpleName = paramClassSimpleName+".valueOf(obj.toString())";
				}
				memberNameSetterMap.put(attribute, mName);
				memberNameSetterParamMap.put(attribute, paramClassSimpleName);
			}
		}
		for (Class c : nonPrimitiveAttributeTypes) {
			buildAccessorTemplate(c);

		}
		memberNameGetterMap.remove("class");
		ctx.put("fqn", fqn);
		String[] splitName = fqn.split("[.]");
		String simpleName = splitName[splitName.length - 1];
		ctx.put("simpleName", simpleName);
		ctx.put("memberNameGetterMap", memberNameGetterMap);
		ctx.put("memberNameSetterMap", memberNameSetterMap);
		ctx.put("importClasses", importClasses);
		ctx.put("memberNameSetterParamMap", memberNameSetterParamMap);
		ctx.put("enumAttrs", enumAttrs);
		super.writeClass(super.getRichTemplateByName(), getPackagePath(), simpleName + "BeanAccessor.java");
	}

}
