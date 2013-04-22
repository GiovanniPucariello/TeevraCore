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
 * $Id: SavePointBootstrapManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 4, 2009 
 */

package com.headstrong.fusion.services.savepointpersist;

import com.headstrong.fusion.services.savepointpersist.impl.SavePointServiceImpl;

/**
 * 
 */
public class SavePointBootstrapManager {
	private SavePointServiceImpl savepoint;

	public SavePointBootstrapManager(SavePointServiceImpl savepoint) {
		this.savepoint = savepoint;
	}

	public void bootstrap() throws Exception {
		this.savepoint.start();
	}

	public void pause() throws Exception {
		this.savepoint.start();
	}

	/**
	 * @return the savepoint
	 */
	public SavePointServiceImpl getSavepoint() {
		return savepoint;
	}

	/**
	 * @param savepoint the savepoint to set
	 */
	public void setSavepoint(SavePointServiceImpl savepoint) {
		this.savepoint = savepoint;
	}
}
