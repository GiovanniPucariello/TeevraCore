package com.headstrong.teevra.client.graph.DrawingClasses
{
	import com.headstrong.teevra.client.graph.common.Designer;

	public class StateMachineDesigner extends Designer
	{
	 //   private var templateLine:ComponentConnector;
    
		public function StateMachineDesigner()
		{
			super();
			templateLine = new StateMachineConnector();
      		templateLine.designer = this;
      		templateLine.name="templateLine";
      		templateLine.visible = false;	
		}
	}
}