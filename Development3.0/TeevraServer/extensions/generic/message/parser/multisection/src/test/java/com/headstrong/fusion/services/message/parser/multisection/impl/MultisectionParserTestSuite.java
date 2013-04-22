package com.headstrong.fusion.services.message.parser.multisection.impl;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MultisectionConfigParserTest.class, MultisectionParserTest.class})
public class MultisectionParserTestSuite {

	public static Test suite() {
		return new JUnit4TestAdapter(MultisectionParserTestSuite.class);
	}

}
