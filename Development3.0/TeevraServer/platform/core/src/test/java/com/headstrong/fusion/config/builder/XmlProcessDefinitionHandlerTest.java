package com.headstrong.fusion.config.builder;

import static org.easymock.EasyMock.expect;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.FusionTest;
import com.headstrong.fusion.config.BatchSplitStrategy;
import com.headstrong.fusion.config.CBREndPointConfig;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.config.PartitionKeyStrategy;
import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.config.Otherwise;
import com.headstrong.fusion.config.Process;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.Route;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;
import com.headstrong.fusion.config.SplitterConfig;
import com.headstrong.fusion.config.When;
import com.headstrong.fusion.config.manager.XmlProcessDefinitionParser;

/**
 * ConfigBuilderTest is a Test Case written to test the ConfigBuilder class
 * 
 * @author ViswanathP
 * 
 */
public class XmlProcessDefinitionHandlerTest extends FusionTest {
	private File fileMapping = new File("src/main/resources/ProcessSchema.xml");
	// A common definition file is being used to check all the elements.
	private String processDefinition = "src/test/resources/processDefinition.xml";

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Verifies is the connectors are being parsed properly.
	 * 
	 * @throws Exception
	 */
	public void testConnectors() throws Exception {
		ProcessConfigurationModel model = this
				.parseDefinition(processDefinition);
		// Assertions
		// 1: EndPoint verification
		List<ConnectorConfig> connectors = model.getConnectors();
		// A : JMS 1
		ConnectorConfig connector1 = connectors.get(0);
		assertEquals("jms1", connector1.getId());
		assertEquals("JMS", connector1.getType());
		// compare properties.
		// Expected properties.
		Map<String, String> prop = new HashMap<String, String>();
		prop.put("brokerUrl", "tcp://localhost:61616");
		prop.put("destination", "source");
		prop.put("destinationType", "queue");
		prop.put("provider", "Active MQ");
		assertEquals(true, this.compareMap(connector1.getProperties(), prop));

		// A : JMS 2
		ConnectorConfig connector2 = connectors.get(1);
		assertEquals("jms2", connector2.getId());
		assertEquals("JMS", connector2.getType());
		// compare properties.
		// Expected properties.
		Map<String, String> prop2 = new HashMap<String, String>();
		prop2.put("brokerUrl", "tcp://localhost:61616");
		prop2.put("destination", "destination");
		prop2.put("destinationType", "queue");
		prop2.put("provider", "Active MQ");
		assertEquals(true, this.compareMap(connector2.getProperties(), prop2));

	}

	/**
	 * Verifies if the mediators are being parsed properly.
	 * 
	 * @throws Exception
	 */
	public void testMediators() throws Exception {
		ProcessConfigurationModel model = this
				.parseDefinition(processDefinition);
		// verify mediation service config
		List<MediatorConfig> mediators = model.getMediators();
		MediatorConfig mediator = mediators.get(0);
		// assertions.
		assertEquals("transformer", mediator.getId());
		assertEquals("com.headstrong.fusion.services.transformer.Transformer",
				mediator.getType());
	}

	/**
	 * Test if the Content Based router configuration is being parsed properly.
	 * 
	 * @throws Exception
	 */
	public void testCBRRouter() throws Exception {
		ProcessConfigurationModel model = this
				.parseDefinition(processDefinition);
		// Routers
		List<RouterConfig> routers = model.getRouters();
		CBREndPointConfig cbr = null;

		// To pick the individual router.
		for (RouterConfig routerConfig : routers) {
			if (routerConfig instanceof CBREndPointConfig) {
				cbr = (CBREndPointConfig) routerConfig;
			}
		}
		// assertions
		assertEquals("cbr1", cbr.getId());
		assertEquals("XPATH", cbr.getExpressionType());

		When when = cbr.getWhen().get(0);
		assertEquals(
				"(({$attrname}REL_OPR{constantValue})LOG_OPR({$attrname}REL_OPR{$attrname}))",
				when.getExpression());
		assertEquals("transformer", when.getTo().getEndPointId());
		Otherwise otherwise = cbr.getOtherwise();
		assertEquals("transformer", otherwise.getTo().getEndPointId());

	}

	public void testSplitterRouterWithPartitionKeyStrategy() throws Exception {
		ProcessConfigurationModel model = this
				.parseDefinition(processDefinition);

		List<RouterConfig> routers = model.getRouters();
		SplitterConfig splitter = null;

		// To pick the individual router.
		for (RouterConfig routerConfig : routers) {
			if (routerConfig instanceof SplitterConfig
					&& ((SplitterConfig) routerConfig).getId().equals("split1")) {
				splitter = (SplitterConfig) routerConfig;
			}
		}
		assertNotNull(splitter);
		PartitionKeyStrategy splitStrategy = (PartitionKeyStrategy) splitter
				.getSplitterStrategy();
		assertEquals(2, splitStrategy.getPartitionKeys().size());
	}

	public void testSplitterRouterWithBatchSplitStrategy() throws Exception {
		ProcessConfigurationModel model = this
				.parseDefinition(processDefinition);

		List<RouterConfig> routers = model.getRouters();
		SplitterConfig splitter = null;

		// To pick the individual router.
		for (RouterConfig routerConfig : routers) {
			if (routerConfig instanceof SplitterConfig
					&& ((SplitterConfig) routerConfig).getId().equals("split2")) {
				splitter = (SplitterConfig) routerConfig;
			}
		}
		assertNotNull(splitter);
		BatchSplitStrategy splitStrategy = (BatchSplitStrategy) splitter
				.getSplitterStrategy();
		assertEquals(10, splitStrategy.getBatchSize());
	}

	public void testSavePointRouter() {

	}

	public void testOnErrorConfig() throws Exception {
		ProcessConfigurationModel model = this
				.parseDefinition(processDefinition);

		List<MediatorConfig> mediators = model.getMediators();
		OnErrorConfig onErrorConfig = null;

		// To pick the individual router.
		for (MediatorConfig mediatorConfig : mediators) {
			if (mediatorConfig.getId().equals("errorMediator")) {
				onErrorConfig = mediatorConfig.getErrorConfigList().get(0);
			}
		}
		assertNotNull(onErrorConfig);
		assertEquals("jmsErrorhandler1", onErrorConfig.getErrorReporters().get(
				0).getErrorReporterId());
		assertEquals("formatter", onErrorConfig.getErrorReporters().get(0)
				.getFormatter());
		assertEquals("ReportAndAbortJobIfThresholdCrossed", onErrorConfig
				.getErrorHandlingStrategy().getStrategy());
	}

	public void testRoutes() throws Exception {
		ProcessConfigurationModel model = this
				.parseDefinition(processDefinition);
		// verify process sequence
		Process process = model.getProcess();
		assertEquals("1", process.getId());
		List<Route> routes = process.getRoutes();

		// verify Route1
		Route route1 = routes.get(0);
		assertEquals("sequence1", route1.getId());
		List<SequenceType> sequences1 = route1.getSequence();
		SourceSequence from1 = (SourceSequence) sequences1.get(0);
		assertEquals("jms1", from1.getEndPointId());
		EndPointSequence to1 = (EndPointSequence) sequences1.get(1);
		assertEquals("cbr1", to1.getEndPointId());

		// verify Route2
		Route route2 = routes.get(1);
		assertEquals("sequence2", route2.getId());
		List<SequenceType> sequences2 = route2.getSequence();
		SourceSequence from2 = (SourceSequence) sequences2.get(0);
		assertEquals("transformer", from2.getEndPointId());
		EndPointSequence to2 = (EndPointSequence) sequences2.get(1);
		assertEquals("jms2", to2.getEndPointId());
	}

	/**
	 * Parses the process definition file and generates a process configuration
	 * model.
	 * 
	 * @param definitionURI
	 * @return Process Configuration Model.
	 * @throws Exception
	 */
	private ProcessConfigurationModel parseDefinition(String definitionURI)
			throws Exception {
		// setup the behavior
		expect(bundleMock.getEntry("ProcessSchema.xml")).andReturn(
				fileMapping.toURL());
		super.replayCommonBehavior();
		File file = new File(definitionURI);
		XmlProcessDefinitionParser xmlProcessDefinitionParser = new XmlProcessDefinitionParser(
				bundleContextMock);
		ProcessConfigurationModel model = xmlProcessDefinitionParser
				.parseProcessDefinition(file);

		return model;
	}

	/**
	 * Compares two HashMap.
	 * 
	 * @param properties1
	 * @param properties2
	 * @return true if both Maps contains same data or else false.
	 */
	private boolean compareMap(Map<String, String> properties1,
			Map<String, String> properties2) {
		if (properties1.size() != properties2.size()) {
			return false;
		}

		for (String key : properties1.keySet()) {
			if (!properties2.get(key).equals(properties1.get(key))) {
				return false;
			}
		}
		return true;
	}
}
