package com.headstrong.fusion.messaging.model.endpoint.binding;

import org.apache.camel.component.mail.ContentTypeResolver;

public class MailEndpointContentTypeResolver implements ContentTypeResolver {

	@Override
	public String resolveContentType(String arg0) {
		// TODO Auto-generated method stub
		if(arg0.endsWith(".jpeg")||arg0.endsWith(".jpg"))
			return "image/jpeg";
		return "text/plain";
	}

}
