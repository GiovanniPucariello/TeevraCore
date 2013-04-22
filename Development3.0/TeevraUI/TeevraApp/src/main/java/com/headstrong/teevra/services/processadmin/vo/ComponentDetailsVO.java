/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * All rights reserved.
 * 
 * 
 * $Author : VSelvaraju
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $Id: ComponentDetailsVO.java
 * $DateTime: Feb 9, 2011
 */



package com.headstrong.teevra.services.processadmin.vo;

import java.io.Serializable;
import java.util.Date;


public class ComponentDetailsVO implements Serializable {
	

	
	public final static String MEAN_PRCS_RATE="MeanProcessingRate";
	/* Constants for MBean attributes */
	public final static String ENDPOINT_URI="EndpointUri";
	public final static String FIRST_MSG_TIME="FirstExchangeCompletedTimestamp";
	public final static String LAST_MSG_TIME="LastExchangeCompletedTimestamp";
	public final static String MEAN_PROCESSING_TIME="MeanProcessingTime";
	
	
	
	 /**
	 * Enpoint uri name of the component 
	 * */ 
	private String name;
	
	/**
	 * First Message completion time of the component 
	 * */
	private Date firstMsgTime;
	
	/**
	 * Last Message completion time of the component 
	 * */
	private Date lastMsgTime;
	
	
	/**
	 *  mean processing rate of the component 
	 * */
	private Long meanProcessingRate;
	

	
	
	/**
	 * 
	 * @return name
	 * 
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * 
	 * @param value set name
	 * 
	 */
	public void setName(final String name) {
		this.name = name;
		int i=0;
	}

	/**
	 * 
	 * @return firstMsgTime
	 * 
	 */
	public Date getFirstMsgTime() {
		return firstMsgTime;
	}

	/**
	 * 
	 * @param value set firstMsgTime
	 * 
	 */
	public void setFirstMsgTime(Date firstMsgTime) {
		this.firstMsgTime = firstMsgTime;
	}


	/**
	 * 
	 * @param value set meanProcessingRate
	 * 
	 */
	public void setMeanProcessingRate(Long processingTimeinMillis) {
		if (processingTimeinMillis > 0)
			meanProcessingRate= 1000 / processingTimeinMillis;
		else
			meanProcessingRate= 0l;

	}
	
	
	/**
	 * 
	 * @return meanProcessingRate
	 * 
	 */
	public Long getMeanProcessingRate() {
		return meanProcessingRate;
	}
	
	/**
	 * 
	 * @return lastMsgTime
	 * 
	 */
	public Date getLastMsgTime() {
		return lastMsgTime;
	}

	
	/**
	 * 
	 * @param value set lastMsgTime
	 * 
	 */
	public void setLastMsgTime(Date lastMsgTime) {
		this.lastMsgTime = lastMsgTime;
	}
		
	@Override
	public String toString()
	{
		StringBuffer str = new StringBuffer();
		str.append("< "+ComponentDetailsVO.ENDPOINT_URI+"= ");
		str.append(this.getName());
		str.append(", "+ComponentDetailsVO.FIRST_MSG_TIME+"= ");
		str.append(this.getFirstMsgTime());
		str.append(", "+ComponentDetailsVO.LAST_MSG_TIME+"= ");
		str.append(this.getLastMsgTime());
		str.append(", "+ComponentDetailsVO.MEAN_PRCS_RATE+"= ");
		str.append(this.getMeanProcessingRate());
		str.append(">");
		return str.toString();
	}
	
	
}
