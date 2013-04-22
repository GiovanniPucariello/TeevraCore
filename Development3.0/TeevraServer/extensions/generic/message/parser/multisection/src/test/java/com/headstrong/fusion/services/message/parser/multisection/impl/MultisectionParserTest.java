package com.headstrong.fusion.services.message.parser.multisection.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.messaging.error.DefaultErrorHandler;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlConfigParserImpl;
import com.headstrong.fusion.services.message.commons.config.parser.td.TdBindConfigParserImpl;

/**
 * 
 */
public class MultisectionParserTest extends TestCase {

	private ObjectDescriptor stringDesc = null;
	private ObjectDescriptor longDesc = null;
	
	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void testProcess() throws Exception {
		MultisectionConfigParserImpl configParser = MultisectionConfigParserImpl
				.getInstance();
		String configuration = getConfiguration("config_multisection.xml");
		Object configObject = configParser.parseConfiguration(configuration,
				new TdBindConfigParserImpl(), new FlConfigParserImpl());

		String inputMessage = getConfiguration("sampleInput.txt");
		MultisectionParserServiceImpl service = new MultisectionParserServiceImpl();
		HashMap<String, Object> headers = new HashMap<String, Object>();
		stringDesc = new ObjectDescriptor();
		stringDesc.setId(new Long(1));
		stringDesc.setName("STRING");
		stringDesc.setDesc("STRING");
		stringDesc.setPrimitive(true);

		longDesc = new ObjectDescriptor();
		longDesc.setId(new Long(2));
		longDesc.setName("LONG");
		longDesc.setDesc("LONG");
		longDesc.setPrimitive(true);
		
		List<BusinessObject> records = service.process(null, inputMessage,
				headers, (MultiSectionParserConfiguration) configObject,
				new DefaultErrorHandler(), createObjectDescriptor(), "prcsid", "serviceId", "serviceType");

		assertTrue(configObject instanceof MultiSectionParserConfiguration);

		MultiSectionParserConfiguration config = (MultiSectionParserConfiguration) configObject;
		assertTrue(config.isGenericHeaderPresent());
		assertEquals(new Integer(1), config.getGenericHeaderLine());
		assertEquals(15, records.size());
	}

	private String getConfiguration(String fileName) throws IOException {
		File file = new File("src/test/resources/" + fileName);
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}
			buffer.append(line).append("\n");
		}
		reader.close();
		return buffer.toString();
	}
	
	private AttributeDescriptor createAttribute(Long attrId, String name, ObjectDescriptor type) {
		AttributeDescriptor attr = new AttributeDescriptor();
		attr.setAttributeId(attrId);
		attr.setAttributeName(name);
		attr.setType(type);
		return attr;
	}
	
	private ObjectDescriptor createObjectDescriptor() {
		ObjectDescriptor objDesc = new ObjectDescriptor();
		objDesc.setId(new Long(3));
		objDesc.setName("CustodianAvailabilitySchema");
		objDesc.setDesc("CustodianAvailabilitySchema");
		objDesc.setPrimitive(false);
		
		Map<String, AttributeDescriptor> attrMap = new HashMap<String, AttributeDescriptor>();
		objDesc.setAttributes(attrMap);
		
		attrMap.put("Date", createAttribute(new Long(1), "Date", stringDesc));
		attrMap.put("CustodyAccount", createAttribute(new Long(1), "CustodyAccount", stringDesc));
		attrMap.put("LenderName", createAttribute(new Long(1), "LenderName", stringDesc));
		attrMap.put("LenderAccountId", createAttribute(new Long(1), "LenderAccountId", stringDesc));
		attrMap.put("IdentifierType", createAttribute(new Long(1), "IdentifierType", stringDesc));
		attrMap.put("SecurityId", createAttribute(new Long(1), "SecurityId", stringDesc));
		attrMap.put("SecurityName", createAttribute(new Long(1), "SecurityName", stringDesc));
		attrMap.put("Quantity", createAttribute(new Long(1), "Quantity", stringDesc));
		attrMap.put("DepositoryCode", createAttribute(new Long(1), "DepositoryCode", stringDesc));
		attrMap.put("LenderSubAcAtDepository", createAttribute(new Long(1), "LenderSubAcAtDepository", stringDesc));
		
		return objDesc;
	}
}
