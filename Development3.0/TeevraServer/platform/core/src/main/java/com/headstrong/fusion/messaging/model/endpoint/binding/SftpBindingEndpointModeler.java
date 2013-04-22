package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.InputStream;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.remote.SftpComponent;
import org.apache.camel.component.file.remote.SftpConfiguration;
import org.apache.camel.component.file.remote.SftpEndpoint;
import org.apache.camel.converter.IOConverter;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.service.DataToFileProcessor;


public class SftpBindingEndpointModeler extends AbstractBindingEndPointModeler {

	private static final Logger logger = LoggerFactory
			.getLogger(SftpBindingEndpointModeler.class);

	private static long DEFAULT_DELAY = 50000;
	/**
	 * SFTP server host name/id.
	 */
	private String host;
	/**
	 * Port number.
	 */
	private int port;
	/**
	 * User name
	 */
	private String user;
	/**
	 * Password.
	 */
	private String password;
	/**
	 * SFTP Directory.
	 */
	private String directory;
	/**
	 * Delay.
	 */
	private long delay;
	
	/**
	 * Pass the file as binary/ASCII mode.
	 */
	private Boolean binary; 
	
	private Boolean deleteFile;

	@Override
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		// call the init of the AbstractBindingEndpoint.
		super.init(config, SftpBindingProperty.values());
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
		
		if (properties.containsKey(SftpBindingProperty.host.toString())) {
			this.setHost(properties.get(SftpBindingProperty.host.toString()));
		}

		if (properties.containsKey(SftpBindingProperty.port.toString())) {
			this.setPort(Integer.parseInt(properties
					.get(SftpBindingProperty.port.toString())));
		}
		if (properties.containsKey(SftpBindingProperty.user.toString())) {
			this.setUser(properties.get(SftpBindingProperty.user.toString()));
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(SftpBindingProperty.password.toString())) {
			try {
				String encryptedPassword = properties
						.get(SftpBindingProperty.password.toString());
				if (!encryptedPassword.trim().equals("")) {
					this.setPassword(FusionUtil.decrypt(encryptedPassword));
				} else {
					this.setPassword(encryptedPassword);
				}
			} catch (DecryptionException e) {
				e.printStackTrace();
				logger.error("Error occured durion password decryption");
			}
		}
		if(properties.containsKey(SftpBindingProperty.binary.toString())){
			this.setBinary(Boolean.parseBoolean(properties.get(SftpBindingProperty.binary.toString())));
		}
		if (properties.containsKey(SftpBindingProperty.directory.toString())) {
			this.setDirectory(properties.get(SftpBindingProperty.directory
					.toString()));
		}
		
		if (properties.containsKey(SftpBindingProperty.deleteFile.toString()) &&
				properties.get(SftpBindingProperty.deleteFile.toString()).equalsIgnoreCase("true")) {
			this.setDeleteFile(true);
		}
		else
		{
			this.setDeleteFile(false);
		}
		
		this.setDelay(DEFAULT_DELAY);
		if (properties.containsKey(SftpBindingProperty.delay.toString())) {
			try {
				this.setDelay(Long.parseLong(properties
						.get(SftpBindingProperty.delay.toString())));
			} catch (Exception e) {
				logger.error("Invalid delay specified, setting to default "
						+ DEFAULT_DELAY);
			}
		}
	}

	
	

	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {         
        
		ProcessorDefinition processorType = null;

		SftpComponent component = new SftpComponent();
        component.setCamelContext(routeBuilder.getContext());
        registerComponent(routeBuilder.getContext(), "sftp", component);

        SftpConfiguration config = new SftpConfiguration();
        config.setHost(this.getHost());
        config.setPort(this.getPort());
        config.setUsername(this.getUser());
        config.setPassword(this.getPassword());
        config.setBinary(this.getBinary());
        config.setDirectory(this.getDirectory());
        config.setProtocol("sftp");
        config.setStepwise(false);

        
        SftpEndpoint endPoint = new SftpEndpoint("sftp", component, config);
        endPoint.setIdempotent(true);
        endPoint.setDelete(isDeleteFile());
  //   endPoint.setDelay(getDelay());
        
      
        processorType = routeBuilder.from(endPoint).convertBodyTo(String.class);
  
        return processorType;
        

  
}

	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {
				
		SftpComponent remoteComponent = new SftpComponent();
		remoteComponent.setCamelContext(routeBuilder.getContext());
			
		SftpConfiguration config = new SftpConfiguration();
		config.setHost(host);
		config.setPort(port);
		config.setUsername(user);
		config.setPassword(password);
		config.setBinary(this.getBinary());
		config.setDirectory(this.getDirectory());
		config.setProtocol("sftp");
		config.setStepwise(false);
		
				
		SftpEndpoint endpoint = new SftpEndpoint("sftp", remoteComponent, config);
		endpoint.setDelete(isDeleteFile());
		if (remoteComponent != null) {
			registerComponent(routeBuilder.getContext(), "sftp", remoteComponent);
		}
		
		processorType = processorType.process(new DataToFileProcessor()).to(
				endpoint).process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				Object data = exchange.getIn().getBody();
				if (data instanceof InputStream) {
					exchange.getIn().setBody(
							IOConverter.toString((InputStream) data));
				}

			}
		});

		
		return processorType;
	}
	
	/**
	 * Properties Expected by sftpBindingEndPointModeler.
	 * 
	 */
	private static enum SftpBindingProperty implements BindingProperty {

		host, port, user, password, directory, delay, binary,deleteFile {
			public boolean isMandatory() {
				return false;
			}
		};

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.BindingProperty#isMandatory()
		 */
		public boolean isMandatory() {
			return true;
		}
	}
	

	public static long getDEFAULT_DELAY() {
		return DEFAULT_DELAY;
	}

	public static void setDEFAULT_DELAY(long dEFAULTDELAY) {
		DEFAULT_DELAY = dEFAULTDELAY;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}


	public Boolean getBinary() {
		return binary;
	}


	public void setBinary(Boolean binary) {
		this.binary = binary;
	}


	public Boolean isDeleteFile() {
		return deleteFile;
	}


	public void setDeleteFile(Boolean deleteFile) {
		this.deleteFile = deleteFile;
	}

}
