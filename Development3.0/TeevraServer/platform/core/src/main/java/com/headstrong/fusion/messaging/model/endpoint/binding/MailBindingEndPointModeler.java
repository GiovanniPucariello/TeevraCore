package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Properties;

import javax.activation.*;
import javax.mail.Message;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import com.sun.mail.handlers.multipart_mixed;
import org.apache.camel.Component;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
//import org.springframework.mail.javamail.JavaMailSender;
import org.apache.camel.component.mail.MailComponent;
import org.apache.camel.component.mail.MailConfiguration;
import org.apache.camel.component.mail.MailEndpoint;
import org.apache.camel.impl.DefaultProducerTemplate;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.apache.camel.component.mail.DefaultJavaMailSender;
import org.apache.commons.io.IOUtils;
import org.hsqldb.lib.InOutUtil;

import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;


public class MailBindingEndPointModeler extends AbstractBindingEndPointModeler {
	
	private static Logger logger = LoggerFactory
	.getLogger(MailBindingEndPointModeler.class);

private ConnectorConfig config;
	
	private String host;
	private int port;
	private String username;
	private String password;
	private String contentType;
	private String toRecipients;
	private String ccRecipients;
	private String bccRecipients;
	private String fromSender;
	private String subject;
	private String protocol;
	private long connectionTimeout;
	@Override
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		// TODO Auto-generated method stub
		super.init(config,MailBindingProperty.values());
		this.configure(config);
	}
	
	private void configure(ConnectorConfig config)
	throws InitializationException 
	{
		Map<String, String> properties = config.getProperties();
		if (properties.containsKey(MailBindingProperty.host.toString())) {
			this.setHost(properties.get(MailBindingProperty.host
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.port.toString())) {
			this.setPort(Integer.parseInt(properties.get(MailBindingProperty.port
					.toString())));
		}
		if (properties.containsKey(MailBindingProperty.username.toString())) {
			this.setUsername(properties.get(MailBindingProperty.username
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.password.toString())) {
			try {
				String encryptedPassword  = properties.get(MailBindingProperty.password
						.toString());
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
		if (properties.containsKey(MailBindingProperty.contentType.toString())) {
			this.setContentType(properties.get(MailBindingProperty.contentType
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.to.toString())) {
			this.setToRecipients(properties.get(MailBindingProperty.to
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.cc.toString())) {
			this.setCcRecipients(properties.get(MailBindingProperty.cc
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.bcc.toString())) {
			this.setBccRecipients(properties.get(MailBindingProperty.bcc
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.from.toString())) {
			this.setFromSender(properties.get(MailBindingProperty.from
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.subject.toString())) {
			this.setSubject(properties.get(MailBindingProperty.subject
					.toString()));
		}
		if (properties.containsKey(MailBindingProperty.connTimeout.toString())) {
			this.setConnectionTimeout(Long.parseLong(properties.get(MailBindingProperty.connTimeout
					.toString())));
		}
		if (properties.containsKey(MailBindingProperty.protocol.toString())) {
			this.setProtocol(properties.get(MailBindingProperty.protocol.toString()));
		}
	}
	@SuppressWarnings("unchecked")
	private Component getMailComponent(RouteBuilder routeBuilder)
	{
			Properties javaMailprops=new Properties();
			DefaultJavaMailSender javaMailSender=new DefaultJavaMailSender();
			MailComponent mailComponent=new MailComponent(routeBuilder.getContext());
			mailComponent.setCamelContext(routeBuilder.getContext());
			MailConfiguration mconfig=mailComponent.getConfiguration();
			if(this.getHost()!=null)
			{
				mconfig.setHost(host);
				
				javaMailSender.setHost(host);
			}
			if(this.getPort()!= 0)
			{
				mconfig.setPort(port);
				javaMailSender.setPort(port);
			}
			if(this.getUsername()!=null)
			{
				mconfig.setUsername(username);
				
				javaMailSender.setUsername(username);
			}
			if(this.getPassword()!=null)
			{
				mconfig.setPassword(password);
			
				javaMailSender.setPassword(password);
			}
			if(this.getContentType()!=null)
				mconfig.setContentType(contentType);
			if(this.getToRecipients()!=null)
				mconfig.setTo(toRecipients);
			if(this.getCcRecipients()!=null)
				mconfig.setCC(ccRecipients);
			if(this.getBccRecipients()!=null)
				mconfig.setBCC(bccRecipients);
			if(this.getFromSender()!=null)
				mconfig.setFrom(fromSender);
			if(this.getSubject()!=null)
				mconfig.setSubject(subject);
			if(this.getConnectionTimeout()!=0)
				mconfig.setConnectionTimeout(connectionTimeout);
			if(this.getProtocol()!=null)
			{
				mconfig.setProtocol(protocol);
				javaMailSender.setProtocol(protocol);
			}
			mconfig.setDebugMode(true);
			if(mconfig.getJavaMailSender()==null)
			{
				
				mconfig.setJavaMailSender(javaMailSender);
			}
			
			return mailComponent;
	}

	@Override
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		// TODO Auto-generated method stub
		Component mailComponent=null;
		String uri=this.protocol+"://"+this.username+"@"+this.host+":"+this.port;
		Endpoint mailEndpoint=null;
		mailComponent=this.getMailComponent(routeBuilder);
		
		try{
		mailEndpoint=mailComponent.createEndpoint(uri);
		
		} catch (Exception e) {
			logger.error("Error creating JMS EndPointModeler.", e);
			throw new ProcessModellingException(
					"Error creating JMS EndPointModeler.", e);
		}
		return routeBuilder.from(mailEndpoint);
	}

	@Override
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {
		// TODO Auto-generated method stub
		Component mailComponent=null;
		String uri="";
		if(this.getPort()!=0)
			uri=this.getProtocol()+"://"+this.username+"@"+this.host+":"+this.port;
		else
			uri=this.getProtocol()+"://"+this.username+"@"+this.host;
		MailEndpoint mailEndpoint=null;
		mailComponent=this.getMailComponent(routeBuilder);
		if(mailComponent!=null)
		{
			registerComponent(routeBuilder.getContext(),"mail", mailComponent);
		}
		try{
			
		mailEndpoint=(MailEndpoint)mailComponent.createEndpoint(uri);
		mailEndpoint.setContentTypeResolver(new MailEndpointContentTypeResolver());
//		mailEndpoint.createExchange().getIn().addAttachment("Desert.jpg",new DataHandler(new FileDataSource("src/main/resources/Desert.jpg")));
//		new DefaultProducerTemplate(routeBuilder.getContext()).sendBody("Hello World !!!");
		} catch (Exception e) {
			logger.error("Error creating SMTP EndPointModeler.", e);
			throw new ProcessModellingException(
					"Error creating SMTP EndPointModeler.", e);
		}
//		return processorType.process(new Processor() {
//			
//			@Override
//			public void process(Exchange arg0) throws Exception {
//				// TODO Auto-generated method stub
//				Object body=arg0.getIn().getBody();
//				FileDataSource fds=new FileDataSource("Desert.jpg");
//				DataHandler dh=new DataHandler(new FileDataSource("Desert.jpg"));
//				arg0.getIn().addAttachment("desert.jpg",dh);
//				logger.debug("mailcommandmap:::"+arg0.getIn().getAttachment("desert.jpg").getContentType());
//				logger.debug("contenttype of header ::: "+arg0.getIn().getHeader("Content-Type"));
//				logger.debug("GetName-Data handler:::"+dh.getName());
//				MailcapCommandMap mc=(MailcapCommandMap)CommandMap.getDefaultCommandMap();
//				String[] mimTypes=mc.getMimeTypes();
//				for(int i=0;i<mimTypes.length;i++)
//					logger.debug("mime type :::"+mimTypes[i]);
//				mc.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");mc.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");mc.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");mc.addMailcap("multipart/mixed;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");mc.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");CommandMap.setDefaultCommandMap(mc);
//				DataContentHandler dch=mc.createDataContentHandler("multipart/mixed");
//				logger.debug("Data Content Handler::::"+dch);
//				dh.setCommandMap(mc);
//				CommandMap.setDefaultCommandMap(mc);
//				MailcapCommandMap mc1=(MailcapCommandMap)CommandMap.getDefaultCommandMap();
//				String[] mimTypes1=mc1.getMimeTypes();
//				for(int i=0;i<mimTypes1.length;i++)
//					logger.debug("mime type :::"+mimTypes1[i]);
//				multipart_mixed mm=new multipart_mixed();
				//Try to get bytearray from the content of file and then send as attachment
			/*	final byte[] attachment = IOUtils.toByteArray(new FileInputStream("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg"));
				MimeMultipart multipart = new MimeMultipart();   
		        MimeBodyPart part = new MimeBodyPart();   
		        part.setDataHandler(   
		           new DataHandler(   
		                   new DataSource() {   
		    
		            public String getContentType() {   
		                return "image/jpeg";   
		            }   
		    
		            public InputStream getInputStream() throws IOException {   
		                return new ByteArrayInputStream(attachment);   
		            }   
		    
		            public String getName() {   
		                return "Desert.jpg";   
		            }   
		    
		            public OutputStream getOutputStream() throws IOException {   
		                return null;   
		            }}));   
		    
		        multipart.addBodyPart(part); 
		        arg0.getIn().setBody(multipart); */ 
//				MimeMultipart mp=new MimeMultipart();
//				MimeBodyPart mbp1=new MimeBodyPart();
//				mbp1.attachFile(new File("Desert.jpg"));
//				mbp1.setHeader("Content-Type","image/jpeg;name=\"Desert.jpg\"");
//				MimeBodyPart mbp2=new MimeBodyPart();
//				mbp2.setText(body.toString());
//				mbp2.setHeader("Content-Type","text/plain");
//				mp.addBodyPart(mbp1);
//				mp.addBodyPart(mbp2);
//				arg0.getIn().setBody(mp);
//				arg0.getIn().getAttachment("Desert.jpg").getContentType(); 
//			}
//		}).to(mailEndpoint);
		return processorType.to(mailEndpoint);
	}
	public static enum MailBindingProperty implements BindingProperty {
		host{public boolean isMandatory() {
			return true;
		}},username{public boolean isMandatory() {
			return true;
		}},to{public boolean isMandatory() {
			return true;
		}},from{public boolean isMandatory() {
			return true;
		}},protocol{public boolean isMandatory() {
			return true;
		}}
		,port,password,contentType,cc,bcc,subject,connTimeout;
		public boolean isMandatory() {
			return false;
		}
	
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getToRecipients() {
		return toRecipients;
	}

	public void setToRecipients(String toRecipients) {
		this.toRecipients = toRecipients;
	}

	public String getCcRecipients() {
		return ccRecipients;
	}

	public void setCcRecipients(String ccRecipients) {
		this.ccRecipients = ccRecipients;
	}

	public String getBccRecipients() {
		return bccRecipients;
	}

	public void setBccRecipients(String bccRecipients) {
		this.bccRecipients = bccRecipients;
	}

	public String getFromSender() {
		return fromSender;
	}

	public void setFromSender(String fromSender) {
		this.fromSender = fromSender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(long connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
}
