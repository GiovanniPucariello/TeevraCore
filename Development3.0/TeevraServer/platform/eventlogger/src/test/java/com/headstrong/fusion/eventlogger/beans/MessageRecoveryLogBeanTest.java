package com.headstrong.fusion.eventlogger.beans;

import junit.framework.TestCase;
import com.headstrong.fusion.eventlogger.beans.MessageRecoveryLogBean;

public class MessageRecoveryLogBeanTest extends TestCase {

private MessageRecoveryLogBean messageRecoveryLogBean = null;
	public void testSetSessionId() throws Exception {
		messageRecoveryLogBean = new MessageRecoveryLogBean();
		messageRecoveryLogBean.setSessionId("test data");
		assertEquals("test data",messageRecoveryLogBean.getSessionId());
	}

	public void testSetMessageId() throws Exception {
		messageRecoveryLogBean = new MessageRecoveryLogBean();
		messageRecoveryLogBean.setMessageId("test data");
		assertEquals("test data",messageRecoveryLogBean.getMessageId());
	}

	public void testSetSavepointName() throws Exception {
		messageRecoveryLogBean = new MessageRecoveryLogBean();
		messageRecoveryLogBean.setSavepointName("test data");
		assertEquals("test data",messageRecoveryLogBean.getSavepointName());
	}

	public void testSetMessageData() throws Exception {
		messageRecoveryLogBean = new MessageRecoveryLogBean();
		messageRecoveryLogBean.setMessageData(null);
		assertEquals(null,messageRecoveryLogBean.getMessageData());
	}

}