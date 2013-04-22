package com.headstrong.fusion.commons;

import com.headstrong.fusion.commons.ComponentEvent;
import com.headstrong.fusion.commons.ComponentEvent.Event;

import junit.framework.TestCase;

public class ComponentEventTest extends TestCase {

	public void testGetComponentId() throws Exception {
		ComponentEvent componentEvent = new ComponentEvent("1", Event.ERROR);
		assertEquals("1", componentEvent.getComponentId());
	}

	public void testSetComponentId() throws Exception {
		ComponentEvent componentEvent = new ComponentEvent("1", Event.ERROR);
		assertEquals("1", componentEvent.getComponentId());
		componentEvent.setComponentId("2");
		assertEquals("2", componentEvent.getComponentId());
	}

	public void testGetEvent() throws Exception {
		ComponentEvent componentEvent = new ComponentEvent("1", Event.ERROR);
		assertEquals(Event.ERROR, componentEvent.getEvent());
	}

	public void testSetEvent() throws Exception {
		ComponentEvent componentEvent = new ComponentEvent("1", Event.ERROR);
		assertEquals(Event.ERROR, componentEvent.getEvent());
		componentEvent.setEvent(Event.REGISTERED);
		assertEquals(Event.REGISTERED, componentEvent.getEvent());
	}
}
