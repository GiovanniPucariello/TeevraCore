package com.headstrong.teevra.client.graph.DrawingClasses
{
  import com.headstrong.teevra.client.graph.ComponentGraphCanvasItem;
  import com.headstrong.teevra.client.graph.common.Designer;
  
  import flash.events.MouseEvent;
  
  import mx.collections.ArrayCollection;
  import mx.containers.Canvas;
  
  public class ComponentDesigner extends Designer
  {
  	
  //  private var templateLine:ComponentConnector;  

    public function ComponentDesigner(){        
      super();
      templateLine = new ComponentConnector();
      templateLine.designer = this;
      templateLine.name="templateLine";
      templateLine.visible = false;
    }
  }
}