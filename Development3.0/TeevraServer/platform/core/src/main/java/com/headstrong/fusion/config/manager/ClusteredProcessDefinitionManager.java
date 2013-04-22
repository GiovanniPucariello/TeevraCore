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
 * $Id: ClusteredProcessDefinitionManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 2, 2009 
 */

package com.headstrong.fusion.config.manager;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.request.data.ClusteredStateHandler;
import com.headstrong.fusion.failover.request.data.ClusteredStateManager;
import com.headstrong.fusion.failover.request.data.ClusteredStateRequest;

/**
 * Process file Manager.
 */
public class ClusteredProcessDefinitionManager extends ClusteredStateHandler
		implements ProcessDefinitionManager {

	private BundleContext bundleContext;
	private static final String FILE_EXTN = ".xml";
	private static int REQUEST_WRITE = 1;
	private static int REQUEST_DELETE = 2;

	public ClusteredProcessDefinitionManager(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateHandler#execute(com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	@Override
	public void execute(ClusteredStateRequest clusteredStateRequest)
			throws Exception {
		ByteArrayInputStream bais = new ByteArrayInputStream(
				clusteredStateRequest.getBuffer());
		DataInputStream dais = new DataInputStream(bais);
		int requestType = dais.readInt();
		if (requestType == REQUEST_WRITE) {
			String processId = dais.readUTF();
			int bufferLength = dais.readInt();
			byte[] definition = new byte[bufferLength];
			dais.read(definition);
			this.persistProcessFile(processId, definition);
		} else if (requestType == REQUEST_DELETE) {
			String processId = dais.readUTF();
			this.deleteProcessFile(processId);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.config.manager.ProcessDefinitionManager#write(java.lang.String,
	 *      byte[])
	 */
	public void write(String processId, byte[] definition) throws Exception {
		this.persistProcessFile(processId, definition);

		// Generate a multicast request.
		ClusteredStateManager clusteredStateManager = this
				.getClusteredStateManager();
		if (clusteredStateManager != null) {
			ClusteredStateRequest request = this.getPersistProcessRequest(
					processId, definition); // create write process request.
			clusteredStateManager.multicast(request);
		}
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param definition
	 * @return
	 * @throws IOException
	 */
	private ClusteredStateRequest getPersistProcessRequest(String processId,
			byte[] definition) throws IOException {
		ClusteredStateRequest request = new ClusteredStateRequest();
		request.setHandlerName(ClusteredProcessDefinitionManager.class
				.getName());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream daos = new DataOutputStream(baos);

		daos.writeInt(REQUEST_WRITE);
		daos.writeUTF(processId);
		daos.writeInt(definition.length);
		daos.write(definition);
		request.setBuffer(baos.toByteArray());

		daos.close();
		baos.close();
		return request;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.config.manager.ProcessDefinitionManager#delete(java.lang.String)
	 */
	public void delete(String processId) throws Exception {
		this.deleteProcessFile(processId);
		// Generate a multi-cast delete request on successful deletion on local
		// process file.
		// Generate a multicast request.
		ClusteredStateManager clusteredStateManager = this
				.getClusteredStateManager();
		if (clusteredStateManager != null) {
			ClusteredStateRequest request = new ClusteredStateRequest();
			request.setHandlerName(ClusteredProcessDefinitionManager.class
					.getName());
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream daos = new DataOutputStream(baos);

			daos.writeInt(REQUEST_DELETE);
			daos.writeUTF(processId);
			request.setBuffer(baos.toByteArray());
			// create write process request.
			if (clusteredStateManager != null) {
				clusteredStateManager.multicast(request);
			}
			daos.close();
			baos.close();
		}
	}

	/**
	 * Returns the ClusteredStateManager.
	 * 
	 * @return
	 */
	private ClusteredStateManager getClusteredStateManager() {
		ClusteredStateManager stateManager = null;
		// publish the same to other instances also.
		ServiceReference adminServiceRef = this.getBundleContext()
				.getServiceReference(AdminService.class.getName());
		AdminService adminService = null;
		if (adminServiceRef != null) {
			adminService = (AdminService) this.getBundleContext().getService(
					adminServiceRef);
			if (adminService != null
					&& adminService.getMemberInfo().isClustered()) {
				stateManager = adminService.getClusteredStateManager();
			}
		}
		return stateManager;
	}

	/**
	 * @return the bundleContext
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * @param bundleContext
	 *            the bundleContext to set
	 */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/**
	 * Private utility method to persist the process definition in the local
	 * process directory.
	 * 
	 * @param processId
	 * @param definition
	 * @throws InitializationException
	 * @throws IOException
	 */
	private void persistProcessFile(String processId, byte[] definition)
			throws InitializationException, IOException {
		// persist the file in the process directory.

		String processHome = this.bundleContext
				.getProperty(Properties.PROCESS_HOME);
		// If the directory is not present , create the directory.
		// TC: Check if process home directory exists , If not create the
		// directory.
		// If create fails throw InitializationException.
		File processHomeDir = new File(processHome);
		if (!processHomeDir.exists()) {
			boolean success = processHomeDir.mkdirs();
			if (!success) {
				throw new InitializationException(
						"Unable to create process temp directory.");
			}
		}
		// File name is Fusion_${System.currentTimeMillis()}
		File processFile = new File(processHome + "/" + processId + FILE_EXTN);
		OutputStream out = new FileOutputStream(processFile);
		// Transfer bytes from in to out
		out.write(definition);
		out.close();
	}

	private void deleteProcessFile(String processId) {
		String processHome = this.bundleContext
				.getProperty(Properties.PROCESS_HOME);
		// If the directory is not present , create the directory.
		// TC: Check if process home directory exists , If not create the
		// directory.
		// If create fails throw InitializationException.
		File processHomeDir = new File(processHome);
		if (processHomeDir.exists()) {
			File processFile = new File(processHome + "/" + processId
					+ FILE_EXTN);
			if (processFile.exists()) {
				processFile.delete();
			}
		}
	}

	@Override
	public List<ClusteredStateRequest> synchronize() throws Exception {
		// FIXME byte overflow not handled.
		List<ClusteredStateRequest> requests = new ArrayList<ClusteredStateRequest>();
		String processHome = this.bundleContext
				.getProperty(Properties.PROCESS_HOME);
		File processHomeDir = new File(processHome);
		if (processHomeDir.exists()) {
			for (File processFile : processHomeDir.listFiles()) {
				if (processFile.isFile()) {
					InputStream stream = new FileInputStream(processFile);
					byte[] bytes = new byte[(int) processFile.length()];
					stream.read(bytes);
					ClusteredStateRequest request = this
							.getPersistProcessRequest(processFile.getName()
									.replace(FILE_EXTN, ""), bytes);
					requests.add(request);
				}
			}
		}
		return requests;
	}
}
