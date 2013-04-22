package com.headstrong.fusion.commons.component;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;

import junit.framework.TestCase;

public class FusionComponentFactoryTest extends TestCase {

	public void testGetComponent() throws Exception {
		FusionComponentFactory.addComponent("Test", new FusionComponent() {
			@Override
			public FusionEndpoint<MessageExchange> createEndpoint(
					BindingConfig bindingConfig) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		assertNotNull(FusionComponentFactory.getComponent("Test"));
		FusionComponentFactory.removeComponent("Test");
	}

	public void testRemoveComponent() throws Exception {
		FusionComponentFactory.addComponent("Test", new FusionComponent() {
			@Override
			public FusionEndpoint<MessageExchange> createEndpoint(
					BindingConfig bindingConfig) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		FusionComponentFactory.removeComponent("Test");
		assertNull(FusionComponentFactory.getComponent("Test"));

	}
}
