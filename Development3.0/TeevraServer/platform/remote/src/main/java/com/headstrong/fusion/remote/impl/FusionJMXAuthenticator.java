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
 * $Id: FusionJMXAuthenticator.java
 * $Revision: 
 * $Author: neagrawal
 * $DateTime: Oct 22, 2010 
 */

package com.headstrong.fusion.remote.impl;

import java.util.Collections;
import javax.management.remote.JMXAuthenticator;
import javax.management.remote.JMXPrincipal;
import javax.security.auth.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.remote.MBeanActivator;

public class FusionJMXAuthenticator implements JMXAuthenticator {
	private static Logger logger = LoggerFactory
	.getLogger(FusionJMXAuthenticator.class);

    public Subject authenticate(Object credentials) {

        if (!(credentials instanceof String[])) {
            if (credentials == null) {
                throw new SecurityException("Credentials required");
            }
            
            throw new SecurityException("Credentials should be String[]");
        }

        final String[] aCredentials = (String[]) credentials;
        if (aCredentials.length != 2) {
            throw new SecurityException("Credentials should have 2 elements");
        }

        String username = (String) aCredentials[0];
        String password = (String) aCredentials[1];
        
        if(username == null || password == null)
        {
        	throw new SecurityException("User Name or Password should not be null");
        }
       
        boolean authenticate = false;
			//authenticate = updateProcessStatus(username, password);
        authenticate = username.equals(MBeanActivator.FUSION_JMX_USERNAME_VAL)&&
        password.equals(MBeanActivator.FUSION_JMX_PASSWORD_VAL);
       
        if(authenticate)
        {
            return new Subject(true,
                               Collections.singleton(new JMXPrincipal(username)),
                               Collections.EMPTY_SET,
                               Collections.EMPTY_SET);
        } else {
            throw new SecurityException("Invalid credentials");
        }
    }
    
    
}

