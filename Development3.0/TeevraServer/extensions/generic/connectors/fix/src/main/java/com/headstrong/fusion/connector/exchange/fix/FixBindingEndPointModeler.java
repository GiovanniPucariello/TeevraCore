package com.headstrong.fusion.connector.exchange.fix;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.quickfixj.QuickfixjComponent;
import org.apache.camel.component.quickfixj.QuickfixjConfiguration;
import org.apache.camel.model.ProcessorDefinition;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.SessionID;
import quickfix.fix42.ExecutionReport;
import quickfix.fix42.Message;
import quickfix.fix42.NewOrderSingle;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.model.endpoint.binding.AbstractBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.BindingProperty;

/**
 * 
 * 
 * @author mali
 * 
 */
public class FixBindingEndPointModeler extends AbstractBindingEndPointModeler {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FixBindingEndPointModeler.class);

	private BundleContext bundleContext;
	
	private String connectionType;
	
	private String heartBtInt;
	private String socketConnectHost;
	private String senderCompID;
	private String targetCompID;
	private String beginString;
	private String socketConnectPort;
	private String startTime;
	private String endTime;
	private String useDataDictionary;
	private String defaultMarketPrice="";

	public FixBindingEndPointModeler(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	@Override
	public void init(CamelProcessContext arg0, ConnectorConfig config)
			throws InitializationException {
		// call the init of the AbstractBindingEndpoint.
		super.init(config, FixBindingProperty.values());
		this.configure(config);
	
	}
	
	/**
	 * Reads the properties from the properties map and set the bean properties.
	 * 
	 * @precondition config != null
	 * @param properties
	 * @param bean
	 * @throws InitializationException
	 */
	private void configure(ConnectorConfig config)
			throws InitializationException {
		Map<String, String> properties = config.getProperties();
		if (properties.containsKey(FixBindingProperty.heartBtInt.toString())) {
			this.setHeartBtInt((properties.get(FixBindingProperty.heartBtInt.toString())));
		}
		if (properties.containsKey(FixBindingProperty.socketConnectHost.toString())) {
			this.setSocketConnectHost((properties.get(FixBindingProperty.socketConnectHost.toString())));
		}
		if (properties.containsKey(FixBindingProperty.senderCompID.toString())) {
			this.setSenderCompID((properties.get(FixBindingProperty.senderCompID.toString())));
		}if (properties.containsKey(FixBindingProperty.targetCompID.toString())) {
			this.setTargetCompID((properties.get(FixBindingProperty.targetCompID.toString())));
		}if (properties.containsKey(FixBindingProperty.socketConnectPort.toString())) {
			this.setSocketAcceptPort((properties.get(FixBindingProperty.socketConnectPort.toString())));
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		ProcessorDefinition processorType = null;
		FusionQuickfixjComponent component = new FusionQuickfixjComponent();
		component.setCamelContext(routeBuilder.getContext());
		registerComponent(routeBuilder.getContext(), "quickfix", component);
		QuickfixjConfiguration quickFixConfig = new QuickfixjConfiguration();
		
		Map<Object, Object> defaultSettingsMap = new HashMap<Object, Object>();

		defaultSettingsMap.put("HeartBtInt", this.heartBtInt);		
		defaultSettingsMap.put("SocketConnectHost", this.socketConnectHost);
		defaultSettingsMap.put("SenderCompID", this.senderCompID);
		defaultSettingsMap.put("TargetCompID", this.targetCompID);
		defaultSettingsMap.put("UseDataDictionary", "Y");
		
		quickFixConfig.setDefaultSettings(defaultSettingsMap);
		
		Map<Object, Object> sessionSettingsMap = new HashMap<Object, Object>();
		sessionSettingsMap.put("ConnectionType", "initiator");
		sessionSettingsMap.put("BeginString", "FIX.4.2");
		sessionSettingsMap.put("SocketConnectPort", this.socketConnectPort);
		
		SessionID sessionId = new SessionID("FIX.4.2:"+senderCompID+"->"+targetCompID);

		quickFixConfig.addSessionSetting(sessionId, sessionSettingsMap);
		
		Map<String, QuickfixjConfiguration> quickFixConfigMap = component.getConfigurations();
		quickFixConfigMap.put("teevra", quickFixConfig);
		
		component.setConfigurations(quickFixConfigMap);
		
		try {

			processorType = routeBuilder.from(component.createEndpoint("quickfix:teevra")).process(new Processor(){
				public void process(Exchange messageExchange)
						throws Exception {
				
					
					Message message = (Message) messageExchange.getIn().getBody();
					
					if (!(message instanceof ExecutionReport)){
			            messageExchange.setProperty("CamelRouteStop", Boolean.TRUE);
			          }
					
				}
				  
			  });
		} catch (Exception e) {
			logger.error("Error while creating the endpoint",e);
		}
		
		return processorType;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {
		return null;
	}

	/**
	 * Properties Expected by FixBindingEndPointModeler.
	 * 
	 */
	private static enum FixBindingProperty implements BindingProperty {

		
		senderCompID,targetCompID,socketConnectHost,socketConnectPort,heartBtInt;
		public boolean isMandatory() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getHeartBtInt() {
		return heartBtInt;
	}

	public void setHeartBtInt(String heartBtInt) {
		this.heartBtInt = heartBtInt;
	}

	public String getSocketConnectHost() {
		return socketConnectHost;
	}

	public void setSocketConnectHost(String socketConnectHost) {
		this.socketConnectHost = socketConnectHost;
	}

	public String getSenderCompID() {
		return senderCompID;
	}

	public void setSenderCompID(String senderCompID) {
		this.senderCompID = senderCompID;
	}

	public String getTargetCompID() {
		return targetCompID;
	}

	public void setTargetCompID(String targetCompID) {
		this.targetCompID = targetCompID;
	}

	public String getBeginString() {
		return beginString;
	}

	public void setBeginString(String beginString) {
		this.beginString = beginString;
	}

	public String getSocketAcceptPort() {
		return socketConnectPort;
	}

	public void setSocketAcceptPort(String socketAcceptPort) {
		this.socketConnectPort = socketAcceptPort;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUseDataDictionary() {
		return useDataDictionary;
	}

	public void setUseDataDictionary(String useDataDictionary) {
		this.useDataDictionary = useDataDictionary;
	}

	public String getDefaultMarketPrice() {
		return defaultMarketPrice;
	}

	public void setDefaultMarketPrice(String defaultMarketPrice) {
		this.defaultMarketPrice = defaultMarketPrice;
	}

	
	
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	

}
