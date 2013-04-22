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
 * $Id: SSLSocket.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 12, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigNotFoundException;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil.Config;

/**
 * creates {@link SSLSocketFactory} using the binding configuration provided. if
 * SSL is enabled.
 */
public class SSLSocket {
	private static final Logger logger = LoggerFactory
			.getLogger(SSLSocket.class);

	/**
	 * Key store type
	 */
	private static final String JKS = "JKS";

	/**
	 * if ssl is enaled or not.
	 */
	private boolean enabled;
	/**
	 * Endpoint.
	 */
	private BindingConfig bindingConfig;

	public SSLSocket(BindingConfig bindingConfig) {
		this.bindingConfig = bindingConfig;
		// check if the SSL is enabled.
		String sslEnabled;
		try {
			logger.debug("Checking if SSL is enabled.. ");
			sslEnabled = ConfigurationUtil.getConfig(bindingConfig,
					Config.sslEnabled, true);
			this.setEnabled(Boolean.parseBoolean(sslEnabled));
		} catch (ConfigNotFoundException e) {
			this.setEnabled(false);
		}
	}

	/**
	 * creates an SSL Context Factory.
	 * 
	 * @return SSLSocketFactory
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws CertificateException
	 * @throws KeyStoreException
	 * @throws UnrecoverableKeyException
	 * @throws ConfigNotFoundException
	 * @throws java.security.cert.CertificateException
	 */
	public SSLSocketFactory getSSLSocketFactory()
			throws NoSuchAlgorithmException, KeyManagementException,
			UnrecoverableKeyException, KeyStoreException, CertificateException,
			FileNotFoundException, IOException, ConfigNotFoundException,
			CertificateException {
		// check if key store location is present
		logger.debug("Start of getSSLSocketFactory method..");
		KeyManagerFactory keyManagerFactory = null;
		KeyManager[] keyManagers = null;
		if (ConfigurationUtil.isPresent(bindingConfig,
				Config.sslKeyStoreLocation)) {
			keyManagerFactory = initKeyStore();
			keyManagers = keyManagerFactory.getKeyManagers();
		}
		// mandatory.
		TrustManagerFactory trustManagerFactory = initTrustStore();
		SSLContext sslContext = SSLContext.getInstance(ConfigurationUtil
				.getConfig(bindingConfig, Config.sslAlgorithm));

		sslContext.init(keyManagers, trustManagerFactory.getTrustManagers(),
				null);
		SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
		logger
				.debug("Successfully creating a SSLSocketFactory in getSSLSocketFactory method.. ");
		return sslSocketFactory;
	}

	/**
	 * initialize the key store.
	 * 
	 * @return {@link KeyManagerFactory}
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws CertificateException
	 * @throws FileNotFoundException
	 * @throws UnrecoverableKeyException
	 * @throws ConfigNotFoundException
	 * @throws java.security.cert.CertificateException
	 */
	private KeyManagerFactory initKeyStore() throws KeyStoreException,
			IOException, NoSuchAlgorithmException, CertificateException,
			FileNotFoundException, UnrecoverableKeyException,
			ConfigNotFoundException, CertificateException {
		KeyStore ks = getKeyStore();
		KeyManagerFactory keyManagerFactory = KeyManagerFactory
				.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		keyManagerFactory.init(ks, ConfigurationUtil.getConfig(bindingConfig,
				Config.sslKeyStorePassword).toCharArray());
		logger
				.debug("In initKeyStore method.. succesfully creating the KeyManagerFactory..");
		return keyManagerFactory;
	}

	/**
	 * initialize the trust store.
	 * 
	 * @return {@link TrustManagerFactory}
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws CertificateException
	 * @throws FileNotFoundException
	 * @throws java.security.cert.CertificateException
	 * @throws ConfigNotFoundException
	 */
	private TrustManagerFactory initTrustStore() throws KeyStoreException,
			IOException, NoSuchAlgorithmException, CertificateException,
			FileNotFoundException, java.security.cert.CertificateException,
			ConfigNotFoundException {
		KeyStore trustStore = getTrustStore();
		// Create a default trust and key manager
		TrustManagerFactory trustManagerFactory = TrustManagerFactory
				.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		// Initialize the managers
		trustManagerFactory.init(trustStore);
		logger
				.debug("In initTrustStore method.. succesfully creating the TrustManagerFactory..");
		return trustManagerFactory;
	}

	/**
	 * returns the trust store. (key store)
	 * 
	 * @return {@link KeyStore}
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws CertificateException
	 * @throws FileNotFoundException
	 * @throws java.security.cert.CertificateException
	 * @throws ConfigNotFoundException
	 */
	private KeyStore getTrustStore() throws KeyStoreException, IOException,
			NoSuchAlgorithmException, CertificateException,
			FileNotFoundException, java.security.cert.CertificateException,
			ConfigNotFoundException {
		// Create a keystore object for the truststore
		KeyStore trustStore = KeyStore.getInstance(JKS);
		// Open our file and read the truststore (no password)
		trustStore.load(new FileInputStream(ConfigurationUtil.getConfig(
				bindingConfig, Config.sslTrustStoreLocation)), null);
		logger
				.debug("In getTrustStore method.. succesfully returning the KeyStore..");
		return trustStore;
	}

	/**
	 * returns the key store.
	 * 
	 * @return {@link KeyStore}
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws CertificateException
	 * @throws FileNotFoundException
	 * @throws java.security.cert.CertificateException
	 * @throws ConfigNotFoundException
	 */
	private KeyStore getKeyStore() throws KeyStoreException, IOException,
			NoSuchAlgorithmException, CertificateException,
			FileNotFoundException, ConfigNotFoundException {
		// instantiate a KeyStore with type JKS
		KeyStore ks = KeyStore.getInstance(JKS);
		// load the contents of the KeyStore
		ks.load(new FileInputStream(ConfigurationUtil.getConfig(bindingConfig,
				Config.sslKeyStoreLocation)), ConfigurationUtil.getConfig(
				bindingConfig, Config.sslKeyStorePassword, true).toCharArray());
		logger
				.debug("In getKeyStore method.. succesfully returning the KeyStore..");
		return ks;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
