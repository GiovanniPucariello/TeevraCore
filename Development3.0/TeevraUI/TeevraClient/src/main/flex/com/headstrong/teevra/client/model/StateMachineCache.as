package com.headstrong.teevra.client.model
{
	import com.headstrong.teevra.client.view.entity.StateMachineVO;
	
	import mx.collections.ArrayCollection;
	import mx.collections.ICollectionView;
	
	public class StateMachineCache
	{
		private static var stateMachineCache : StateMachineCache = new StateMachineCache();;
		private var stateMachineMap:Object;
		
		public function StateMachineCache(){
		}
		
		public static function getInstance():StateMachineCache {
			return stateMachineCache;
		}

		public function loadStateMachines(stateMachineCollection : ICollectionView) :void {
			var stateMachineList:ArrayCollection = ArrayCollection(stateMachineCollection);
			if (stateMachineList == null) {
				return;
			}
			stateMachineMap = new Object();
			for(var i:int=0;i<stateMachineList.length;i++) {
				var stateMachine:StateMachineVO = StateMachineVO(stateMachineList.getItemAt(i));
				stateMachineMap[stateMachine.stateMachineName] = stateMachine;
			}	
		} 
		
		public function getStateMachines() : ArrayCollection {
			var stateMachines:ArrayCollection = new ArrayCollection();
			for each(var stateMachine:StateMachineVO in stateMachineMap) {
					stateMachines.addItem(stateMachine);
			}
			return stateMachines;
		}
		
		public function retrieveStateMachine(stateMachineName : String) : StateMachineVO {
			var val:Object = stateMachineMap[stateMachineName];
			if (val != null) {
				return StateMachineVO(val);
			} else {
				return null;
			}
		}
	}
}
class SingletonEnforcer {}