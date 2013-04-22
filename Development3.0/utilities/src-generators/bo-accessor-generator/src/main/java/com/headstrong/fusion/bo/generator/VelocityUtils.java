package com.headstrong.fusion.bo.generator;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

public class VelocityUtils {

	
	
	public static  byte[] getRichTemplateByName(String templateName, VelocityContext ctx){
		Template t = null;
		Writer w = new StringWriter();
		ctx.put("currDate", new Date());
		try {
			t = Velocity.getTemplate(templateName);
			t.merge(ctx, w);
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (ParseErrorException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return w.toString().getBytes();
	}
}
