/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ControlRequestTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 10, 2010 
 */

package com.headstrong.fusion.failover.request.control;

import org.jgroups.Message;

import junit.framework.TestCase;

/**
 * {@link ControlRequest} test case.
 */
public class ControlRequestTest extends TestCase {

	public void testGetRequestMemberInfo() throws Exception {
		Message message = new Message();
		message.setFlag(Request.MEMBER_INFO_REQUEST);
		assertTrue(ControlRequest.getReqest(message) instanceof MemberInfoRequest);
	}

	public void testGetRequestMemberSelfActivation() throws Exception {
		Message message = new Message();
		message.setFlag(Request.SELF_ACTIVATION_REQUEST);
		assertTrue(ControlRequest.getReqest(message) instanceof SelfActivationRequest);
	}

	public void testGetRequestMemberRegistration() throws Exception {
		Message message = new Message();
		message.setFlag(Request.MEMBER_REGISTRATION_REQUEST);
		assertTrue(ControlRequest.getReqest(message) instanceof MemberRegistrationRequest);
	}

}
