package com.headstrong.teevra.client.graph.model
{
	[RemoteClass(alias="com.headstrong.teevra.services.process.vo.ProcessGraphVO")]
	[Bindable]
	public class ProcessGraphVO
	{
		/**
		 *unique processId 
		 */
		private var _processId:Number;
		/**
		 *node object 
		 */
		private var _nodes:Object;
		/**
		 *link object 
		 */
		private var _links:Object;
		
		/**
		 * process Service VO for containing error detail at process level 
		 */
		private var _errorReportNHandlingConfigs:ProcessServiceVO;
		
		/**
		 * process Service VO for containing error formatter type detail at process level 
		 */
		private var _errorFormatter:ProcessServiceVO;
		
		public function ProcessGraphVO()
		{
		}
		
		/**
		 * 
		 * @return processId
		 * 
		 */
		public function get processId():Number
		{
			return _processId;
		}

		/**
		 * 
		 * @param pId set processId
		 * 
		 */
		public function set processId(pId:Number):void
		{
			this._processId = pId;
		}

		/**
		 * 
		 * @return nodes
		 * 
		 */
		public function get nodes():Object
		{
			return _nodes;
		}

		/**
		 * 
		 * @param n set nodes
		 * 
		 */
		public function set nodes(n:Object):void
		{
			this._nodes = n;
		}

		/**
		 * 
		 * @return links
		 * 
		 */
		public function get links():Object
		{
			return _links;
		}

		/**
		 * 
		 * @param l set links
		 * 
		 */
		public function set links(l:Object):void
		{
			this._links = l;
		}
		/**
		 * 
		 * @return ProcessServiceVO
		 * 
		 */
		public function get errorReportNHandlingConfigs():ProcessServiceVO
		{
			return _errorReportNHandlingConfigs;
		}
		/**
		 * 
		 * @param value set ProcessServiceVO
		 * 
		 */
		public function set errorReportNHandlingConfigs(value:ProcessServiceVO):void
		{
			this._errorReportNHandlingConfigs = value;
		}
		/**
		 * 
		 * @return ProcessServiceVO
		 * 
		 */
		public function get errorFormatter():ProcessServiceVO
		{
			return _errorFormatter;
		}
		/**
		 * 
		 * @param value set ProcessServiceVO
		 * 
		 */
		public function set errorFormatter(value:ProcessServiceVO):void
		{
			this._errorFormatter = value;
		}
	}
}