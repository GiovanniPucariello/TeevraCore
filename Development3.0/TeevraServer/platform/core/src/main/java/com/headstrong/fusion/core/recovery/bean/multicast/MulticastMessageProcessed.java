package com.headstrong.fusion.core.recovery.bean.multicast;

import com.headstrong.fusion.core.recovery.bean.MessageProcessed;

/**
 * Processed Multicast Message
 * @author NBagchi
 *
 */
public class MulticastMessageProcessed extends MessageProcessed {

	/**
	 * Endpoint ID
	 */
	private String endPointId;
	/**
	 * Multicast ID.
	 */
	private String multicastId;

	/**
	 * Fetch the endpoint Id.
	 * @return
	 */
	public String getEndPointId() {
		return this.endPointId;
	}

	/**
	 * Set the endpoint id.
	 * @param endPointId
	 */
	public void setEndPointId(String endPointId) {
		this.endPointId = endPointId;
	}

	/**
	 * Fetch the multicast id.
	 * @return
	 */
	public String getMulticastId() {
		return multicastId;
	}

	/**
	 * Set the multicast id.
	 * @param multicastId
	 */
	public void setMulticastId(String multicastId) {
		this.multicastId = multicastId;
	}
}
