package com.headstrong.fusion.eventlogger.beans;

import junit.framework.TestCase;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;

public class ProcessEventLogBeanTest extends TestCase {

private ProcessEventLogBean processEventLogBean = null;
	public void testSetProcessId() throws Exception {
		processEventLogBean = new ProcessEventLogBean();
		processEventLogBean.setProcessId(1);
		assertEquals(1,processEventLogBean.getProcessId());
	}

	public void testSetProcessStatus() throws Exception {
		processEventLogBean = new ProcessEventLogBean();
		processEventLogBean.setProcessStatus("test data");
		assertEquals("test data",processEventLogBean.getProcessStatus());
	}

	public void testSetSessionId() throws Exception {
		processEventLogBean = new ProcessEventLogBean();
		processEventLogBean.setSessionId("test data");
		assertEquals("test data",processEventLogBean.getSessionId());
	}

	public void testSetEventCategory() throws Exception {
		processEventLogBean = new ProcessEventLogBean();
		processEventLogBean.setEventCategory("test data");
		assertEquals("test data",processEventLogBean.getEventCategory());
	}

	public void testSetEventDesc() throws Exception {
		processEventLogBean = new ProcessEventLogBean();
		processEventLogBean.setEventDesc("test data");
		assertEquals("test data",processEventLogBean.getEventDesc());
	}

	public void testSetEventType() throws Exception {
		processEventLogBean = new ProcessEventLogBean();
		processEventLogBean.setEventType("test data");
		assertEquals("test data",processEventLogBean.getEventType());
	}

	public void testSetEventSource() throws Exception {
		processEventLogBean = new ProcessEventLogBean();
		processEventLogBean.setEventSource("test data");
		assertEquals("test data",processEventLogBean.getEventSource());
	}

}