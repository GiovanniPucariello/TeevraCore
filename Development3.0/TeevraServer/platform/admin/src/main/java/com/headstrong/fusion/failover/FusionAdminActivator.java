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
 * $Id: FusionAdminActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 28, 2009 
 */

package com.headstrong.fusion.failover;

import java.net.InetAddress;
import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.request.control.MemberRegistrationRequest;
import com.headstrong.fusion.failover.request.data.ClusteredStateManager;

/**
 * Activates fusion Administrator Module.
 * <p>
 * Admin module starts checks if the application is to be started in clustered
 * mode. If that case it creates the infrastructure for instance fail-over and
 * state replication.
 * 
 */
public class FusionAdminActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(FusionAdminActivator.class);
	/**
	 * Fusion Admin member context.
	 */
	private MemberContext memberContext;

	/**
	 * Member name prefix.
	 */
	private static final String MEMBER_NAME_PREFIX = "fusion";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		logger.info("Activating fusion administrator.");
		// Initialize the Member context.
		this.memberContext = this.initMemberContext(bundleContext);
		if (this.memberContext.getMemberInfo().isClustered()) {
			// if the application is to be started in clustered mode
			// bootstrap the application in the clustered mode.
			this.handleClusteredBootstrap(bundleContext);
		}
		this.registerAdminService(bundleContext, memberContext);
		logger.info("Member info :" + this.memberContext.getMemberInfo());
	}

	/**
	 * Initialize member context.
	 * 
	 * @param bundleContext
	 * @return
	 */
	private MemberContext initMemberContext(BundleContext bundleContext)
			throws Exception {
		MemberContext memberContext = new MemberContext(bundleContext);
		memberContext.setMemberInfo(this.initMemberInfo(bundleContext));
		// TODO
		// Need requirement clarification. State change is primarily
		// happening currently in clustered mode. Would same be the case in
		// non-clustered mode. for the time being observer being registered
		// always.
		// Register a Member Info state change observer. This state observer
		// would send a state change event to all the service registered
		// with the Apache OSGi context with the name :
		/**
		 * StateChangeObserverService.class.getName()
		 */
		memberContext.getMemberInfo().addObserver(
				new StateObserver(bundleContext));

		memberContext.getMemberInfo().setState(State.NEW);
		if (memberContext.getMemberInfo().isClustered()) {
			GroupMember groupMember = new GroupMember(memberContext);
			memberContext.setGroupMember(groupMember);
		} else {
			// Directly bootstrap the application without
			// creating J-group channel and adding this as a
			// node in the cluster.
			memberContext.getMemberInfo().setNodeType(
					Properties.MEMBER_MASTER_NODE_TYPE);
			memberContext.getMemberInfo().setState(State.ACTIVE);
		}
		return memberContext;
	}

	/**
	 * Registers Admin service.
	 * 
	 * @param bundleContext
	 * @param memberContext
	 */
	private void registerAdminService(BundleContext bundleContext,
			MemberContext memberContext) {
		logger.info("Registering " + AdminService.class.getName() + " service");
		// Clustered State Manager.
		ClusteredStateManager clusteredStateManager = null;
		if (memberContext.getGroupMember() != null) {
			clusteredStateManager = memberContext.getGroupMember()
					.getClusteredStateManager();
		}
		// Admin service
		AdminService adminService = new AdminServiceImpl(memberContext,
				clusteredStateManager);

		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, AdminService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Admin Service");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		bundleContext.registerService(AdminService.class.getName(),
				adminService, props);

	}

	/**
	 * Handles application startup . Checks the application mode. If clustered
	 * checks if the application node is master node. In that case it sends an
	 * Self activation request to other nodes and on non-negative responses from
	 * all the other nodes bootstraps application.
	 * 
	 * 
	 * @precondition Application Context is initialized.
	 */
	@SuppressWarnings("unchecked")
	private void handleClusteredBootstrap(BundleContext bundleContext)
			throws Exception {
		if (this.memberContext.getMemberInfo().getClusterId() == 0
				|| this.memberContext.getMemberInfo().getClusterName() == null
				|| this.memberContext.getMemberInfo().getClusterName().trim()
						.equals("")) {
			// set the state as stand by
			this.memberContext.getMemberInfo().setNodeType(
					Properties.MEMBER_SLAVE_NODE_TYPE);
			this.memberContext.getMemberInfo().setState(State.STANDBY);
		} else {
			this.memberContext.getGroupMember().start();
			// once all done publish the Self-registration request to all.
			MemberRegistrationRequest memberRegistrationRequest = new MemberRegistrationRequest();
			memberRegistrationRequest.setMemberInfo(this.memberContext
					.getMemberInfo());
			// Returns the membership registration responses.
			// Contains the member information of other nodes in the cluster.
			List<MemberInfo> memberInfos = null;
			memberInfos = (List) this.memberContext.getGroupMember()
					.multicastControl(memberRegistrationRequest, true);
			this.handleMemberRegistration(this.memberContext.getMemberInfo(),
					memberInfos);
			// request for member info.
			this.memberContext.getGroupMember().updateCluster();
		}
	}

	/**
	 * Verifies all the response and local member info and checks if bootstrap
	 * is required.
	 * 
	 * @param responses
	 * @return true if bootstrap of local instance is required or false.
	 */
	private void handleMemberRegistration(MemberInfo localMemberinfo,
			List<MemberInfo> responses) {
		if (Properties.MEMBER_MASTER_NODE_TYPE.equalsIgnoreCase(localMemberinfo
				.getNodeType())) {
			// Default state.
			localMemberinfo.setState(State.ACTIVE);
			for (MemberInfo response : responses) {
				if (Properties.MEMBER_MASTER_NODE_TYPE
						.equalsIgnoreCase(response.getNodeType())
						|| response.getState().equals(State.ACTIVE)) {
					// Conflict set this as slave node.
					localMemberinfo
							.setNodeType(Properties.MEMBER_SLAVE_NODE_TYPE);
					localMemberinfo.setState(State.STANDBY);
					break;
				}
			}
		} else {
			localMemberinfo.setState(State.STANDBY);
		}
	}

	/**
	 * Create member information .
	 * 
	 * @param bundleContext
	 * @return {@link MemberInfo}
	 * @bug 2011-01-07 #140 Port is no longer present as program argument. Port is available at properties file.
	 */
	private MemberInfo initMemberInfo(BundleContext bundleContext)
			throws Exception {
		MemberInfo memberInfo = new MemberInfo();
		String memberName = bundleContext
				.getProperty(Properties.CLUSTER_NODE_NAME);
		if (memberName == null || memberName.trim().equals("")) {
			// TODO Need re-look.
			memberName = MEMBER_NAME_PREFIX + System.currentTimeMillis();
		}
		memberInfo.setMemberName(memberName);
		memberInfo.setStartTime(new Date());
		boolean isClustered = Boolean.parseBoolean(bundleContext
				.getProperty(Properties.CLUSTERED));
		memberInfo.setClustered(isClustered);
		if (isClustered) {
			// if the application node is master node.
			String nodeType = bundleContext
					.getProperty(Properties.CLUSTER_NODE_TYPE);
			if (nodeType != null
					&& nodeType
							.equalsIgnoreCase(Properties.MEMBER_MASTER_NODE_TYPE)) {
				memberInfo.setNodeType(Properties.MEMBER_MASTER_NODE_TYPE);
			} else {
				memberInfo.setNodeType(Properties.MEMBER_SLAVE_NODE_TYPE);
			}

			// get the cluster Id and Cluster Name.
			// FIXME cluster name is used to create the channel so the
			// verification
			// of cluster ID across all the nodes is a pending task.
			String clusterName = (String) bundleContext
					.getProperty(Properties.CLUSTER_NAME);
			memberInfo.setClusterName(clusterName);
			String clusterId = (String) bundleContext
					.getProperty(Properties.CLUSTER_ID);
			if (clusterId != null && !clusterId.trim().equals("")) {
				try {
					memberInfo.setClusterId(Integer.parseInt(clusterId));
				} catch (NumberFormatException e) {
					// TODO: handle exception
					logger.error("invalid cluster Id, only number accepted");
					// ignore.
				}
			}
		}

		try {
			String jmxPort = bundleContext.getProperty("fusion.jmx.port");
			if (jmxPort != null && !"".equals(jmxPort.trim()))
				memberInfo.setConnectorUrl(this.getConnectorUrl(jmxPort));
		} catch (Exception e) {
			logger.error("Error getting the connector URL");
			throw e;
		}
		return memberInfo;
	}

	/**
	 * @bug 2011-01-07 #140 Reading port from properties file.   
	 */
	private String getConnectorUrl(String jmxPort) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		String hostAddress = addr.getHostAddress();
		return "service:jmx:rmi:///jndi/rmi://" + hostAddress + ":" + jmxPort
				+ "/jmxrmi";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Stopping fusion admin module");
	}

}
