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
 * $Id: StateMachineServiceDelegate.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 10, 2009 
 */
package com.headstrong.teevra.client.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.headstrong.teevra.client.view.entity.StateMachineVO;
	
	import mx.rpc.IResponder;
	
	/**
	 * StateMachineServiceDelegate calls StateMachineService on the server side
	 * which perform operation related to state machines
	 * @author ViswanathP
	 * 
	 */
	public class StateMachineServiceDelegate
	{
		private var responder:IResponder;
		private var service:Object;
		
		/**
		 * StateMachineServiceDelegate constructor 
		 * @param responder
		 * 
		 */
		public function StateMachineServiceDelegate(responder:IResponder)
		{
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("stateMachineService");
		}
		/**
		 * Fetches all the state machines modeled in the system
		 * by calling the the service on the server side 
		 * 
		 */
		public function getStateMachineList():void{
			var call:Object = service.getStateMachineList();
			call.addResponder( responder );
		}
		/**
		 * Persists the given state machine in the system
		 * 
		 */
		public function saveStateMachine(stateMachineVO:StateMachineVO):void
		{
			var call:Object = service.saveStateMachine(stateMachineVO);
			call.addResponder( responder );
		}
		/**
		 * deletes the given state machine from the system
		 * 
		 */
		public function deleteStateMachine(stateMachineName:String):void
		{
			var call:Object = service.deleteStateMachine(stateMachineName);
			call.addResponder( responder );
		}
		public function publishStateMachine(stateMachineVO:StateMachineVO):void
		{
			var call:Object = service.publishStateMachine(stateMachineVO);
			call.addResponder( responder );
		}
	}
}