package com.headstrong.teevra.client.graph.model
{
	import com.headstrong.teevra.client.graph.model.common.GraphNodeVO;
	
	[RemoteClass(alias="com.headstrong.teevra.services.process.vo.ProcessGraphNodeVO")]
	[Bindable]
	public class ProcessGraphNodeVO extends GraphNodeVO
	{
		/**
		 *unique componentId 
		 */
		private var _componentId:Number;
		
		/**
		 *service details 
		 */
		private var _serviceDetails:ProcessServiceVO
			
		public function ProcessGraphNodeVO()
		{
			super();
		}
		/**
		 * 
		 * @return componentId
		 * 
		 */
		public function get componentId():Number
		{
			return _componentId;
		}
			
		/**
		 * 
		 * @param compId set componentId
		 * 
		 */
		public function set componentId(compId:Number):void
		{
			_componentId = compId;
		}

		
		/**
		 * 
		 * @return serviceDetails
		 * 
		 */
		public function get serviceDetails():ProcessServiceVO
		{
			return _serviceDetails;
		}
			
		/**
		 * 
		 * @param svcDetails set serviceDetails
		 * 
		 */
		public function set serviceDetails(svcDetails:ProcessServiceVO):void
		{
			_serviceDetails = svcDetails;
		}

	}
}