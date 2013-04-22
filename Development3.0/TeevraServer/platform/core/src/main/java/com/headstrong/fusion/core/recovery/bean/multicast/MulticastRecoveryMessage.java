package com.headstrong.fusion.core.recovery.bean.multicast;

import java.util.Set;

import com.headstrong.fusion.core.recovery.bean.RecoveryMessage;

/**
 * Multicast Recovery Message
 * 
 * @author NBagchi
 * 
 */
public class MulticastRecoveryMessage extends RecoveryMessage {

	/**
	 * Set of processed endpoints
	 */
	private Set<String> endPoints;

	/**
	 * Returns the end point set.
	 * 
	 * @return
	 */
	public Set<String> getEndPointSet() {
		return endPoints;
	}

	/**
	 * Set the endpoint set.
	 * 
	 * @param endPoints
	 */
	public void setEndPointSet(Set<String> endPoints) {
		this.endPoints = endPoints;
	}
}
