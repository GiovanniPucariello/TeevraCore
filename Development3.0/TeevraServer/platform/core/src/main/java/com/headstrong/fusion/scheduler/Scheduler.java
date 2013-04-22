package com.headstrong.fusion.scheduler;

import com.headstrong.fusion.commons.exception.FusionException;

public interface Scheduler {

	public static final String GROUP = "fusion";
	public static final String SCHEDULE = "SCHEDULE";

	public boolean isActive();

	public boolean setActive(boolean active);

	public void start() throws FusionException;

	public void shutDown() throws FusionException;

}
