package com.headstrong.fusion.eventlogger.beans;

import junit.framework.TestCase;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;

public class MessageEventLogBeanTest extends TestCase {

private MessageEventLogBean messageEventLogBean = null;
	public void testSetLogMessage() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setLogMessage("test data");
		assertEquals("test data",messageEventLogBean.getLogMessage());
	}

	public void testSetSequenceId() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setSequenceId("test data");
		assertEquals("test data",messageEventLogBean.getSequenceId());
	}

	public void testSetTotalSequences() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setTotalSequences("test data");
		assertEquals("test data",messageEventLogBean.getTotalSequences());
	}

	public void testSetMessageData() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setMessageData("test data");
		assertEquals("test data",messageEventLogBean.getMessageData());
	}

	public void testSetSessionId() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setSessionId("test data");
		assertEquals("test data",messageEventLogBean.getSessionId());
	}

	public void testSetMessageId() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setMessageId("test data");
		assertEquals("test data",messageEventLogBean.getMessageId());
	}

	public void testSetSavepointName() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setSavepointName("test data");
		assertEquals("test data",messageEventLogBean.getSavepointName());
	}

	public void testSetSavepointTime() throws Exception {
		messageEventLogBean = new MessageEventLogBean();
		messageEventLogBean.setSavepointTime("test data");
		assertEquals("test data",messageEventLogBean.getSavepointTime());
	}

}