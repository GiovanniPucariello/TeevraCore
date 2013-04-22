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
 * $Id: CompoenentServiceImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.teevra.services.component;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.controller.StartupServlet;
import com.headstrong.teevra.services.component.dao.ComponentConfigDAO;
import com.headstrong.teevra.services.component.dao.ComponentDAO;
import com.headstrong.teevra.services.component.dao.ComponentTemplateDAO;
import com.headstrong.teevra.services.component.eo.ComponentConfigEO;
import com.headstrong.teevra.services.component.eo.ComponentEO;
import com.headstrong.teevra.services.component.eo.ComponentTemplateEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;
import com.headstrong.teevra.services.component.vo.ComponentBundleVO;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Fetches components (functional as well as connector components) those are
 * deployed on to the system. Will also be extended in later iterations to
 * deploy and undeploy components.
 * 
 * Loads configuration details related to a component that is deployed in STRIDE
 * Hub. If the component has a custom screen to configure them, this service is
 * responsible to fetch the screen details
 */
public class ComponentServiceImpl implements ComponentService {

	/**
	 * Logger for ComponentServiceImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ComponentServiceImpl.class);

	private static final String JMX_URL = "service:jmx:rmi:///jndi/rmi://10.200.41.12:8004/jmxrmi";
	private static final String DOMAIN = "fusion";
	private static final String BEAN_TYPE = "ApplicationContext";
	private static final String BEAN_NAME = "Application Context";
	private static final String IMAGEFOLDERPATH = "/images/components/";
	private static final String SWFFOLDERPATH = "/";
	private static final String ZIPFILEIMAGEPATH = "ui/images/";
	private static final String ZIPFILESWFPATH = "ui/";
	private static final String ZIPFILEJARPATH = "bundle/";

	private ComponentDAO componentDAO;
	private ComponentConfigDAO componentConfigDAO;
	private ComponentTemplateDAO componentTemplateDAO;
	@SuppressWarnings("unused")
	private byte[] bundleContents;

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.component.ComponentService#
	 * getComponentConfiguration(long)
	 */

	public List<ComponentConfigEO> getComponentConfiguration(long componentId)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return componentConfigDAO.getComponentConfigList(componentId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.ComponentService#getComponents ()
	 */
	public List<ComponentEO> getComponents() throws ComponentServiceException,
			UserAuthorizationException, SessionTimeOutException {
		List<ComponentEO> coll = ComponentsCache.getInstance().getComponents();
		if (coll == null) {
			coll = componentDAO.getComponents();
			ComponentsCache.getInstance().addToCache(coll);
		}
		return coll;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.ComponentService#saveComponent(com.headstrong.teevra.services.component.eo.ComponentEO)
	 */
	public void saveComponent(ComponentEO componentToSave)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException {

		componentToSave.setCreatedBy(System.getProperty("user.name"));
		componentToSave
				.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		componentToSave.setCompStatus("ACTIVE");
		// first step to save all the images and swf to thier specified location

		ByteArrayInputStream inputStream = new ByteArrayInputStream(
				componentToSave.getByteData());
		ComponentBundleVO componentBundleVO = extractComponentResources(
				componentToSave, inputStream, StartupServlet
						.getRootApplicationFolder()
						+ IMAGEFOLDERPATH, StartupServlet
						.getRootApplicationFolder()
						+ SWFFOLDERPATH, ZIPFILEIMAGEPATH, ZIPFILESWFPATH,
				ZIPFILEJARPATH);

		// second step to save in component table
		if (componentToSave.getCompImageRef() == ""
				|| componentToSave.getCompImageRef() == null) {
			componentToSave.setCompImageRef("tilePlaceholder.png");
		}
		componentDAO.saveComponent(componentToSave);

		List<ComponentEO> coll = ComponentsCache.getInstance().getComponents();
		if (coll != null) {
			coll = componentDAO.getComponents();
			ComponentsCache.getInstance().addToCache(coll);
		}

		// third step to call the Jmx
		Object[] params = new Object[2];
		params[0] = componentBundleVO.getBundleContents();// componentToSave.getByteData();
		params[1] = componentBundleVO.getBundleName();// componentToSave.getFileName();

		String[] signature = new String[2];
		signature[0] = byte[].class.getName();
		signature[1] = String.class.getName();

		try {
			invoke("installBundle", params, signature);
		} catch (Exception e) {
			logger.error("Exception while invoking installBundle", e);
			componentDAO.delete(componentToSave);
			throw new ComponentServiceException(e.getMessage());

		}
	}

	public ComponentBundleVO extractComponentResources(
			ComponentEO componentToSave, InputStream ipStream,
			String imageFolderPath, String swfFolderPath,
			String zipFileImagePath, String zipFileSwfPath,
			String zipFileJarPath) throws ComponentServiceException {
		ComponentBundleVO componentBundleVO = null;
		try {
			ZipInputStream zipStream = new ZipInputStream(ipStream);
			String fileName;
			ZipEntry entry = zipStream.getNextEntry();
			while (entry != null) {
				if (entry.isDirectory()) {
					entry = zipStream.getNextEntry();
					continue;
				}

				if (entry.getName().contains(zipFileImagePath)) {
					fileName = entry.getName();
					int pos = fileName.lastIndexOf("/");
					fileName = fileName.substring(pos + 1);
					componentToSave.setCompImageRef(fileName);
					copyInputStream(zipStream, new BufferedOutputStream(
							new FileOutputStream(imageFolderPath + fileName)));
				} else if (entry.getName().contains(zipFileSwfPath)) {
					fileName = entry.getName();
					int pos = fileName.lastIndexOf("/");
					fileName = fileName.substring(pos + 1);
					componentToSave.setCompConfigUI(fileName);
					copyInputStream(zipStream, new BufferedOutputStream(
							new FileOutputStream(swfFolderPath + fileName)));
				} else if (entry.getName().contains(zipFileJarPath)) {
					componentBundleVO = new ComponentBundleVO();
					fileName = entry.getName();
					int pos = fileName.lastIndexOf("/");
					componentBundleVO
							.setBundleName(fileName.substring(pos + 1));
					componentBundleVO.setBundleContents(toBytes(zipStream));
				}
				entry = zipStream.getNextEntry();
			}
			zipStream.close();

		} catch (IOException ioe) {
			logger
					.error("Exception while extracting component resources ",
							ioe);
			throw new ComponentServiceException(ioe.getMessage());
		}

		return componentBundleVO;
	}

	public final void copyInputStream(InputStream in, OutputStream out)
			throws IOException {
		byte[] buffer = new byte[1024];
		int len;
		while ((len = in.read(buffer)) >= 0)
			out.write(buffer, 0, len);
		out.close();
	}

	public static byte[] toBytes(InputStream stream) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		copy(stream, bos);
		return bos.toByteArray();
	}

	protected static void copy(InputStream stream, ByteArrayOutputStream bos)
			throws IOException {
		byte[] data = new byte[4096];
		int read = stream.read(data);
		while (read != -1) {
			bos.write(data, 0, read);
			read = stream.read(data);
		}
		bos.flush();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.ComponentService#deleteComponent(long)
	 */
	public void deleteComponent(Long componentId)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException {
		componentDAO.deleteComponent(componentId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.ComponentService#getComponentTemplateEO(java.lang.Long,
	 *      java.lang.String)
	 */
	public ComponentTemplateEO getComponentTemplateEO(Long compId,
			String compTemplateName) throws ComponentServiceException,
			UserAuthorizationException, SessionTimeOutException {
		return componentTemplateDAO.getComponentTemplateEO(compId,
				compTemplateName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.ComponentService#getComponentTemplateNames()
	 */
	public Map<Long, List<String>> getComponentTemplateNames()
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return componentTemplateDAO.getComponentTemplateNames();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.ComponentService#getTemplateNames(java.lang.Long)
	 */
	public List<String> getTemplateNames(Long compId)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return componentTemplateDAO.getComponentTemplateNames(compId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.component.ComponentService#saveComponentTemplate(com.headstrong.teevra.services.component.eo.ComponentTemplateEO)
	 */
	public void saveComponentTemplate(ComponentTemplateEO compTemplateToSave)
			throws ComponentServiceException, UserAuthorizationException,
			SessionTimeOutException {
		assert ((compTemplateToSave.getCompId() != null) && (compTemplateToSave
				.getTemplateName() != null));

		// due to serialization, even if compTemplateId is not set, the default
		// value 0 gets assigned by Adobe
		if (compTemplateToSave.getCompTemplateId().intValue() == 0) {
			compTemplateToSave.setCompTemplateId(null);
		}
		componentTemplateDAO.saveComponentTemplate(compTemplateToSave);
	}

	private Object invoke(String method, Object[] params, String[] signature)
			throws Exception {
		String jmxUrl = JMX_URL;
		String domain = DOMAIN;
		String beanType = BEAN_TYPE;
		String beanName = BEAN_NAME;

		Object returnType = null;
		// Create an RMI connector client
		// 
		try {
			JMXServiceURL url = new JMXServiceURL(jmxUrl);
			JMXConnector jmxc = JMXConnectorFactory.connect(url, null);
			MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();

			ObjectName mbeanName = ObjectName.getInstance(domain + ":type="
					+ beanType + ",index=" + beanName);

			returnType = mbsc.invoke(mbeanName, method, params, signature);
			jmxc.close();
		} catch (Exception e) {
			logger.error("Exception while connecting to jmx server ", e);
			throw e;
		}

		return returnType;
	}

	/**
	 * 
	 * @return the componentDAO
	 */
	public ComponentDAO getComponentDAO() {
		return componentDAO;
	}

	/**
	 * 
	 * @param componentDAO
	 *            the componentDAO to set
	 */
	public void setComponentDAO(ComponentDAO componentDAO) {
		this.componentDAO = componentDAO;
	}

	/**
	 * @return the componentConfigDAO
	 */
	public ComponentConfigDAO getComponentConfigDAO() {
		return componentConfigDAO;
	}

	/**
	 * @param componentConfigDAO
	 *            the componentConfigDAO to set
	 */
	public void setComponentConfigDAO(ComponentConfigDAO componentConfigDAO) {
		this.componentConfigDAO = componentConfigDAO;
	}

	/**
	 * @return the componentTemplateDAO
	 */
	public ComponentTemplateDAO getComponentTemplateDAO() {
		return componentTemplateDAO;
	}

	/**
	 * @param componentTemplateDAO
	 *            the componentTemplateDAO to set
	 */
	public void setComponentTemplateDAO(
			ComponentTemplateDAO componentTemplateDAO) {
		this.componentTemplateDAO = componentTemplateDAO;
	}

}
