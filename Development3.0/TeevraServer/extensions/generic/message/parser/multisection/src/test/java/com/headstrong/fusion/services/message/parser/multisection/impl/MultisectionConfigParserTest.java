package com.headstrong.fusion.services.message.parser.multisection.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Before;

import com.headstrong.fusion.services.message.commons.config.parser.fl.FlConfigParserImpl;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;
import com.headstrong.fusion.services.message.commons.config.parser.td.TdBindConfigParserImpl;

/**
 * 
 */
public class MultisectionConfigParserTest extends TestCase {

	@Override
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void testParseConfiguration() throws Exception {
		MultisectionConfigParserImpl configParser = MultisectionConfigParserImpl
				.getInstance();
		String configuration = getConfiguration("config_multisection.xml");
		Object configObject = configParser.parseConfiguration(configuration,
				new TdBindConfigParserImpl(), new FlConfigParserImpl());
		assertTrue(configObject instanceof MultiSectionParserConfiguration);

		MultiSectionParserConfiguration config = (MultiSectionParserConfiguration) configObject;
		assertTrue(config.isGenericHeaderPresent());
		assertEquals(new Integer(1), config.getGenericHeaderLine());
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

}
