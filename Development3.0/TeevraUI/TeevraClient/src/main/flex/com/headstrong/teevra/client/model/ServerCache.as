package com.headstrong.teevra.client.model
{
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	import mx.collections.ArrayCollection;
	import mx.collections.ICollectionView;
	
	public class ServerCache
	{
		private static var serverCache : ServerCache = new ServerCache();;
		private var serverMap:Object;
		
		public function ServerCache(){
		}
		
		public static function getInstance():ServerCache {
			return serverCache;
		}

		public function loadServerConfigs(serverCollection : ICollectionView) :void {
			var serverConfigList:ArrayCollection = ArrayCollection(serverCollection);
			if (serverConfigList == null) {
				return;
			}
			serverMap = new Object();
			for(var i:int=0;i<serverConfigList.length;i++) {
				var serverConfig:ServerConfigVO = ServerConfigVO(serverConfigList.getItemAt(i));
				serverMap[serverConfig.serverName] = serverConfig;
			}	
		} 
		
		public function getConfigs() : ArrayCollection {
			var configList:ArrayCollection = new ArrayCollection();
			for each(var serverConfig:ServerConfigVO in serverMap) {
					configList.addItem(serverConfig);
			}
			return configList;
		}
		
		public function retrieveServer(serverName : String) : ServerConfigVO {
			var val:Object = serverMap[serverName];
			if (val != null) {
				return ServerConfigVO(val);
			} else {
				return null;
			}
		}
		/**
		 * Adds the given server details to the cache 
		 */
		public function addServer(server:ServerConfigVO):void
		{
			serverMap[server.serverName] = server;
		}
		/**
		 * Removes the given server details from the cache 
		 */
		public function removeServer(server:ServerConfigVO):void
		{
			//Can be removed directly if we use Dictionary i guess-visu
			
			//Create a temporary map, add the details of all the servers except the given to it 
			//and assign the same to serverMap
			var tempMap:Object;
			for each(var serverConfig:ServerConfigVO in serverMap) {
					if(serverConfig.serverName!=server.serverName)
					{
						tempMap[serverConfig.serverName]=serverConfig;
					}
			serverMap = tempMap;
			}
		}
	}
}
class SingletonEnforcer {}