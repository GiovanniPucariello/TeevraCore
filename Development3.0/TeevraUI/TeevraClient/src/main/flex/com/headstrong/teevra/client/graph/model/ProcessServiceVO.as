package com.headstrong.teevra.client.graph.model
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.process.eo.ProcessServiceEO")]
	[Bindable]
	public class ProcessServiceVO
	{
		/**
		 * Unique identifier for a component instance in process
		 */
		private var _prcsCompId:Number;
		/**
		 *identifier for a process 
		 */
		private var _prcsId:Number;
		/**
		 *Identifier for the component 
		 */
		private var _compId:Number;
		/**
		 * Service id for the component that is unique within a process model 
		 */
		private var _serviceId:String;
		/**
		 *User name who created the Process 
		 */
		private var _createdBy :String;
		/**
		 *Time when created the Process 
		 */
		private var _createdDate:Date;
		/**
		 *User name who modified the Process 
		 */
		private var _modifiedBy :String;
		/**
		 *Time when modified the Process 
		 */
		private var _modifiedDate :Date;
		/**
		 * Process model graph 
		 */
		private var _configurations:ArrayCollection;
		
		/**
		 * Error strategy for business error
		 */
		private var _businessErrorStrategy:String;
		
		/**
		 * Error strategy for system error
		 */
		private var _systemErrorStrategy:String;
		
		public function ProcessServiceVO()
		{
		}
		
		
		/**
		 * 
		 * @return prcsCompId
		 * 
		 */
		public function get prcsCompId():Number
		{
			return _prcsCompId;
		}

		/**
		 * 
		 * @param v set prcsCompId
		 * 
		 */
		public function set prcsCompId(v:Number):void
		{
			_prcsCompId = v;
		}

		/**
		 * 
		 * @return prcsId
		 * 
		 */
		public function get prcsId():Number
		{
			return _prcsId;
		}

		/**
		 * 
		 * @param v set prcsId
		 * 
		 */
		public function set prcsId(v:Number):void
		{
			_prcsId = v;
		}

		/**
		 * 
		 * @return compId
		 * 
		 */
		public function get compId():Number
		{
			return _compId;
		}

		/**
		 * 
		 * @param v set compId
		 * 
		 */
		public function set compId(v:Number):void
		{
			_compId = v;
		}

		/**
		 * 
		 * @return serviceId
		 * 
		 */
		public function get serviceId():String
		{
			return _serviceId;
		}

		/**
		 * 
		 * @param v set serviceId
		 * 
		 */
		public function set serviceId(v:String):void
		{
			_serviceId = v;
		}

		/**
		 * 
		 * @return configurations
		 * 
		 */
		public function get configurations():ArrayCollection
		{
			return _configurations;
		}

		/**
		 * 
		 * @param v set configurations
		 * 
		 */
		public function set configurations(v:ArrayCollection):void
		{
			_configurations = v;
		}
		/**
		 * 
		 * @return businessErrorStrategy 
		 * 
		 */
		public function get businessErrorStrategy():String
		{
			return this._businessErrorStrategy;
		}
		/**
		 * 
		 * @param value for setting businessErrorStrategy
		 * 
		 */
		public function set businessErrorStrategy(value:String):void
		{
			this._businessErrorStrategy = value;
		}
		/**
		 * 
		 * @return systemErrorStrategy
		 * 
		 */
		public function get systemErrorStrategy():String
		{
			return _systemErrorStrategy;
		}
		/**
		 * 
		 * @param value for setting systemErrorStrategy
		 * 
		 */
		public function set systemErrorStrategy(value:String):void
		{
			this._systemErrorStrategy = value;
		}
		
			
		public function toString():String
		{
			var str:String = prcsCompId.toString() + ":" + prcsId.toString() + ":" + compId.toString() + ":" + serviceId;
			for(var i:int=0;i<configurations.length;i++)
			{
				str = str + ":" + ProcessServiceConfigurationVO(configurations.getItemAt(i)).toString();	
			}
			return  str;
		}
	}
}