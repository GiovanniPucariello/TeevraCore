package com.headstrong.fusion.bo.generator.components;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.headstrong.fusion.bo.generator.AccessorGeneratorUtil;
import com.headstrong.fusion.bo.generator.VelocityUtils;

public class TemplateGenerator {

	static Properties appProperties;
	static boolean initialized = false;
	protected VelocityContext ctx;
	final static Map<String, String> primitiveToWrapperClassNameMap = new HashMap();
	static {
		primitiveToWrapperClassNameMap.put("byte", "Byte");
		primitiveToWrapperClassNameMap.put("short", "Short");
		primitiveToWrapperClassNameMap.put("int", "Integer");
		primitiveToWrapperClassNameMap.put("long", "Long");	
		primitiveToWrapperClassNameMap.put("float", "Float");
		primitiveToWrapperClassNameMap.put("double", "Double");
		primitiveToWrapperClassNameMap.put("char", "Character");
		primitiveToWrapperClassNameMap.put("boolean", "Boolean");
	}
	String templateName;

	public TemplateGenerator() {
		ctx = new VelocityContext();
		ctx.put("beanAccessorPkg", appProperties.getProperty("destinationPackage"));
		ctx.put("generatorName", "bo-accessor-generator");
		if (!initialized) {
			try {
				Velocity.init(appProperties);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
			initialized = true;
		}
	}

	public static void setAppProperties(Properties appProperties) {
		if (!initialized) {
			TemplateGenerator.appProperties = appProperties;
		}
	}

	public static String writeClass(byte[] stream, String path, String fileName) {
		return AccessorGeneratorUtil.writeClass(stream, path, fileName);
	}

	public String getPackagePath() {
		return appProperties.getProperty("destinationPackage",
				"com.headstrong.fusion.boAccessor").replace('.', '\\');
	}

	public byte[] getRichTemplateByName() {
		return VelocityUtils.getRichTemplateByName(templateName, ctx);
	}

}
