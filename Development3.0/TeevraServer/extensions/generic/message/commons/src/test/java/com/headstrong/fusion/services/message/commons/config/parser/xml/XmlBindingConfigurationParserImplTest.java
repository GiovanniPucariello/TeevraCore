package com.headstrong.fusion.services.message.commons.config.parser.xml;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

import junit.framework.TestCase;

public class XmlBindingConfigurationParserImplTest extends TestCase {

	public void testParse() {
		String configuration = "<binding> 	<field name=\"requestQuote\" xpath=\"/requestQuote\"></field><field name=\"requestQuote.header\" xpath=\"/requestQuote/header\"></field><field name=\"requestQuote.header.messageId\" xpath=\"/requestQuote/header/messageId\"></field></binding>";
		XmlBindConfigParser parser = new XmlBindConfigParserImpl();
		try {
			SchemaDescriptor<XPathBinding> schema = (SchemaDescriptor<XPathBinding>) parser
					.parseConfiguration(configuration);
			System.out
					.println("XmlBindingConfigurationParserImplTest.testParse()");
		} catch (ServiceConfigurationParseException e) {
			fail();
		}
	}
}
