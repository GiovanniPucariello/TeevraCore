package com.headstrong.fusion.core.recovery.multicast;

import com.headstrong.fusion.core.recovery.Recoverable;

/**
 * Multicast Recoverable
 * @author NBagchi
 *
 */
public class MulticastRecoverable extends Recoverable {

	/**
	 * Multicast ID.
	 */
	private String multicastId;
	/**
	 * Endpoint ID.
	 */
	private String endPointId;

	/**
	 * Return the endpoint Id.
	 * @return
	 */
	public String getEndPointId() {
		return this.endPointId;
	}

	/**
	 * Set the endpoint ID.
	 * @param endPointId
	 */
	public void setEndPointId(String endPointId) {
		this.endPointId = endPointId;
	}

	/**
	 * Return the multicast ID.
	 * @return
	 */
	public String getMulticastId() {
		return multicastId;
	}

	/**
	 * Set the Multicast ID.
	 * @param multicastId
	 */
	public void setMulticastId(String multicastId) {
		this.multicastId = multicastId;
	}
}
