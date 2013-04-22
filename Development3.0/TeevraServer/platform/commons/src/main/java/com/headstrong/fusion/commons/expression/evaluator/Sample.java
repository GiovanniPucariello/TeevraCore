package com.headstrong.fusion.commons.expression.evaluator;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Map.Entry;

public class Sample {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop
				.load(new FileInputStream(
						new File(
								"E:\\Projects\\ReEngg\\ReEngineering\\Application\\source\\Fusion\\commons\\src\\main\\java\\com\\headstrong\\fusion\\commons\\expression\\evaluator\\EvaluationContext.properties")));
		for (Entry<Object, Object> entry : prop.entrySet()) {
			System.out.println("addProperty(\"" + entry.getKey() + "\",\""
					+ entry.getValue() + "\");");
		}
	}
}
