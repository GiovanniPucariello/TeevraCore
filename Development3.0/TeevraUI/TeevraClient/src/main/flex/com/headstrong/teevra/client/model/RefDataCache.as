package com.headstrong.teevra.client.model
{
	import com.headstrong.teevra.client.view.entity.RefDataConfigVO;

	import mx.collections.ArrayCollection;
	import mx.collections.ICollectionView;
	
	public class RefDataCache
	{
		private static var refDataCache : RefDataCache = new RefDataCache();;
		private var refDataMap:Object;
		
		public function RefDataCache(){
		}
		
		public static function getInstance():RefDataCache {
			return refDataCache;
		}

		public function loadRefDataConfigs(refDataCollection : ICollectionView) :void {
			var refDataConfigList:ArrayCollection = ArrayCollection(refDataCollection);
			if (refDataConfigList == null) {
				return;
			}
			refDataMap = new Object();
			for(var i:int=0;i<refDataConfigList.length;i++) {
				var refDataConfig:RefDataConfigVO = RefDataConfigVO(refDataConfigList.getItemAt(i));
				refDataMap[refDataConfig.refDataName] = refDataConfig;
			}	
		} 
		
		public function getConfigs() : ArrayCollection {
			var configList:ArrayCollection = new ArrayCollection();
			for each(var refDataConfig:RefDataConfigVO in refDataMap) {
					configList.addItem(refDataConfig);
			}
			return configList;
		}
	}
}
class SingletonEnforcer {}