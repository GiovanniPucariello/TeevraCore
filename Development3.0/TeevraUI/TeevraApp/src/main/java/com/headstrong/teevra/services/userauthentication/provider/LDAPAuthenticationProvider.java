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
 * $Id: LDAPAuthenticationProvider.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 7, 2009 
 */

package com.headstrong.teevra.services.userauthentication.provider;

import java.util.List;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;

import com.headstrong.teevra.services.userauthentication.exception.UserAuthenticationException;

/**
 * Implements AuthenticationProvider and authenticates the user through LDAP
 */
public class LDAPAuthenticationProvider implements AuthenticationProvider {

	/**
	 * Logger for LDAPAuthenticationProvider
	 */
	private static Logger logger = LoggerFactory
			.getLogger(LDAPAuthenticationProvider.class);

	private LdapTemplate ldapTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.userauthentication.provider.AuthenticationProvider#authenticateUser(java.lang.String,
	 *      java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public Boolean authenticateUser(String username, String password)
			throws UserAuthenticationException {

		AndFilter andFilter = new AndFilter();
		andFilter.and(new EqualsFilter("objectclass", "person"));
		andFilter.and(new EqualsFilter("uid", username));
		andFilter.and(new EqualsFilter("userpassword", password));
		logger.info("LDAP Query " + andFilter.encode());
		// TO-DO Instead of searching the userlist, user authenticate method of
		// the ldapTemplate
		List userList = ldapTemplate.search("", andFilter.encode(),
				new ContactAttributeMapper());

		if ((userList != null) && !userList.isEmpty()) {
			logger.info(username + " found in the directory server");

			return true;

		} else {
			logger.error("User Doesn't exist in the directory server");
			return false;
		}

	}

	/**
	 * @return the ldapTemplate
	 */
	public LdapTemplate getLdapTemplate() {
		return ldapTemplate;
	}

	/**
	 * @param ldapTemplate
	 *            the ldapTemplate to set
	 */
	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}
}

class ContactAttributeMapper implements AttributesMapper {

	public Object mapFromAttributes(Attributes attributes) {
		String commonName = "";
		try {
			commonName = (String) attributes.get("cn").get();
			System.out.println("commonName " + commonName);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commonName;
	}

}
