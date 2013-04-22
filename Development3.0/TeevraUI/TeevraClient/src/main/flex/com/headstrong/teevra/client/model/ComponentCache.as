package com.headstrong.teevra.client.model
{
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	
	import mx.collections.ArrayCollection;
	import mx.collections.ICollectionView;
	
	public class ComponentCache
	{
		private static var componentCache : ComponentCache = new ComponentCache();
		private var componentMap:Object;
		
		public function ComponentCache(){
		}
		
		public static function getInstance():ComponentCache {
			return componentCache;
		}

		// stores all the components as map
		public function loadComponents(componentCollection : ICollectionView) :void {
			var componentList:ArrayCollection = ArrayCollection(componentCollection);
			if (componentList == null) {
				return;
			}
			componentMap = new Object();
			for(var i:int=0;i<componentList.length;i++) {
				var component:ComponentVO = ComponentVO(componentList.getItemAt(i));
				componentMap[component.compName] = component;
			}	
		} 
		// returns all the components present in the system
		public function getComponents() : ArrayCollection {
			var components:ArrayCollection = new ArrayCollection();
			for each(var component:ComponentVO in componentMap) {
					components.addItem(component);
			}
			return components;
		}
		
		// returns a component based on its name
		public function retrieveComponent(compName : String) : ComponentVO {
			var val:Object = componentMap[compName];
			if (val != null) {
				return ComponentVO(val);
			} else {
				return null;
			}
		}
		//returns all the components of the type "ACTION"
		public function getActions():ArrayCollection{
			var actions:ArrayCollection = new ArrayCollection();
			for each(var component:ComponentVO in componentMap) {
					if(component.compType == "ACTION")
					{
						actions.addItem(component);
					}
			}
			return actions;
		}
		public function getErrorReporter():ArrayCollection{
			var errorReporter:ArrayCollection = new ArrayCollection();
			for each(var component:ComponentVO in componentMap){
				if(component.compType == "ERRORREPORTER")
				{
					errorReporter.addItem(component);
				}
			}
			return errorReporter;
		}

		/**
		 * Retrives the component value object from the cache based on the given component id
		 */
		public function getComponentFromId(id:Number):ComponentVO {
			for each(var component:ComponentVO in componentMap) {
					if(component.compId == id)
					{
						return component;
					}
			}
			return null;
		}

	}
}
class SingletonEnforcer {}