package com.headstrong.teevra.components.common
{
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	
	import mx.collections.ArrayCollection;
	
	/**
	 * 
	 * @author PAakash
	 * 
	 */
	public interface IComponentConfigurationUI
	{
		/**
		 * 
		 * @return BaseComponentConfigurationUI
		 * 
		 */
		function getConfigurationUI():BaseComponentConfigurationUI;
	}
}