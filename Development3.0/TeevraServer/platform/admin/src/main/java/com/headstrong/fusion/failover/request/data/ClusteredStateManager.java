package com.headstrong.fusion.failover.request.data;

import java.util.List;

import org.jgroups.Address;

public interface ClusteredStateManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManagerService#multicast(com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	public abstract void multicast(ClusteredStateRequest clusteredStateRequest)
			throws Exception;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateManagerService#multicast(com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	public abstract void unicast(Address destination,
			ClusteredStateRequest clusteredStateRequest) throws Exception;

	/**
	 * Register a data handler.
	 * 
	 * @param handlerName
	 * @param dataHandler
	 */
	public abstract void registerDataHandler(String handlerName,
			ClusteredStateHandler dataHandler) throws Exception;

	/**
	 * This method executes the pending data requests.
	 * 
	 * @param handlerName
	 * @throws Exception
	 */
	public abstract void executePendingDataRequests(String handlerName)
			throws Exception;

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param handlerName
	 * @return
	 */
	public abstract ClusteredStateHandler getDataHandler(String handlerName);

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param handlerName
	 * @param clusteredStateRequest
	 * @throws Exception
	 */
	public abstract void execute(String handlerName,
			ClusteredStateRequest clusteredStateRequest) throws Exception;

	/**
	 * Sends a synchronize request to all the data handlers.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	public abstract void synchronize(List<Address> destination)
			throws Exception;

}