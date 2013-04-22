package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.File;

import org.apache.camel.Expression;
import org.apache.camel.Message;
import org.apache.camel.component.file.FileComponent;
import org.apache.camel.component.file.GenericFileEndpoint;
import org.apache.camel.component.file.GenericFileOperations;
import org.apache.camel.component.file.GenericFileProducer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MCHFileProducer extends GenericFileProducer{

	protected MCHFileProducer(GenericFileEndpoint endpoint,
			GenericFileOperations operations) {
		super(endpoint, operations);
		// TODO Auto-generated constructor stub
	}
	
	
}
