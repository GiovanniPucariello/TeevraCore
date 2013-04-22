package com.headstrong.fusion.services.savepointpersist.impl;

import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jms.ConnectionFactory;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.camel.component.ActiveMQConfiguration;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jms.JmsConfiguration;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;

public class testSavePointMessages {

	/**
	 *
	 * @precondition
	 * @postcondition 	
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		readData();
		//sendMessages();
	}

	public static void sendMessages() throws Exception {

		CamelContext context = new DefaultCamelContext();

		ActiveMQComponent activeMQComponent = ActiveMQComponent.activeMQComponent();
		activeMQComponent.setConnectionFactory(new PooledConnectionFactory());
		activeMQComponent.setUsePooledConnection(true);
		
		activeMQComponent.setCamelContext(context);
		activeMQComponent.setAcknowledgementMode(Session.AUTO_ACKNOWLEDGE);
		activeMQComponent.setBrokerURL("tcp://localhost:61616");

		// Set up the ActiveMQ JMS Components
		//ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
		// Note we can explicit name of the component
		context.addComponent("jms", activeMQComponent);
		ProducerTemplate template = context.createProducerTemplate();
		context.start();

		String[] savepointNames = new String[] {
				FusionConstants.DEFAULT_START_SP_NAME,
				FusionConstants.DEFAULT_END_SP_NAME, "savepoint1",
				"savepoint2", "savepoint3"

		};
		System.out.println("testSavePointMessages.sendMessages() start"
				+ new Timestamp(System.currentTimeMillis()));

		// send out the request message
		for (int i = 1; i < 1000; i++) {
			DefaultMessage msg = new DefaultMessage();
			msg.setHeader(FusionConstants.MESSAGE_ID, Integer.toString(10));
			msg.setHeader(FusionConstants.SESSION_ID, Integer.toString(1));
			msg.setHeader(FusionConstants.SEQUENCE_ID, Integer.toString(1));
			msg.setHeader(FusionConstants.SEQUENCE_ID, Integer.toString(1));
			msg.setHeader(FusionConstants.TOTAL_SEQUENCE, Integer.toString(2));

			//System.out.println("Taking savepoint :"+ temp);
			msg.setHeader(FusionConstants.SAVEPOINT_NAME, savepointNames[0]);
			msg.setHeader(FusionConstants.SAVEPOINT_TIME, Long.toString(System
					.currentTimeMillis()));

			msg
					.setBody("<requestQuote>} <header> 		<messageId>"
							+ i
							+ "</messageId> 		<sentBy>som soni</sentBy> 	</header> 	<creditDefaultSwap> 		<generalTerms> 			<scheduledTerminationDate> 				<unadjustedDate>2007-09-06Z</unadjustedDate> 			</scheduledTerminationDate> 			<referenceInformation> 				<referenceEntity> 					<id>referenceEntity</id> 					<entityName> 						Tenet Healthcare Corporation 					</entityName> 					<entityId>8G836J</entityId> 				</referenceEntity> 			</referenceInformation> 		</generalTerms> 	</creditDefaultSwap> </requestQuote>} ");
			Exchange exc = new DefaultExchange(context);
			exc.setIn(msg);
			template.send("jms:recovery", exc);
		}
		// Wait a while before stop the context
		//   Thread.sleep(1000 * 5);
		context.stop();
		System.out.println("testSavePointMessages.sendMessages() stop"
				+ new Timestamp(System.currentTimeMillis()));

	}

	public static void readData() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(
					"jdbc:postgresql://10.200.15.76/stridehub", "postgres",
					"stride");

			stmt = conn
					.prepareStatement("select message_data,header_data,message_id from message_recoverylog where prcs_run_id=483");
			rs = stmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					byte[] data=rs.getBytes(1);
					//XMLDecoder decoder=new XMLDecoder(new ByteArrayInputStream(rs.getBytes(1)));
					System.out.println(data.length);
					
					ByteArrayInputStream bis=new ByteArrayInputStream(rs.getBytes(1));
					Object objHeaders=null;
					ObjectInputStream ois=null;
					try {
						ois = new ObjectInputStream(bis);
						objHeaders=ois.readObject();
						System.out.println("header is :"+ objHeaders);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw new FusionException(e);
					}
					
					/*InputStream is = rs.getBinaryStream(1);
					  if (is != null) {
						XMLDecoder decoder = new XMLDecoder(is);
						System.out.println(decoder.readObject());
						decoder.close();
					}
					
					is = rs.getBinaryStream(2);
					if (is != null) {
						XMLDecoder decoder = new XMLDecoder(is);
						System.out.println(decoder.readObject());
						decoder.close();
					}*/
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
