package com.headstrong.teevra.client.model
{
	import com.headstrong.teevra.client.view.entity.DataSourceConfigVO;
	
	import mx.collections.ArrayCollection;
	import mx.collections.ICollectionView;
	
	public class DataSourceCache
	{
		private static var dataSourceCache : DataSourceCache = new DataSourceCache();
		private var dataSourceMap:Object;
		
		public function DataSourceCache(){
		}
		
		public static function getInstance():DataSourceCache {
			return dataSourceCache;
		}

		public function loadDataSourceConfigs(dataSourceCollection : ICollectionView) :void {
			var dataSourceConfigList:ArrayCollection = ArrayCollection(dataSourceCollection);
			if (dataSourceConfigList == null) {
				return;
			}
			dataSourceMap = new Object();
			for(var i:int=0;i<dataSourceConfigList.length;i++) {
				var dataSourceConfig:DataSourceConfigVO = DataSourceConfigVO(dataSourceConfigList.getItemAt(i));
				dataSourceMap[dataSourceConfig.dataSourceName] = dataSourceConfig;
			}	
		} 
		
		public function getConfigs() : ArrayCollection {
			var configList:ArrayCollection = new ArrayCollection();
			for each(var dataSourceConfig:DataSourceConfigVO in dataSourceMap) {
					configList.addItem(dataSourceConfig);
			}
			return configList;
		}
	}
}
class SingletonEnforcer {}