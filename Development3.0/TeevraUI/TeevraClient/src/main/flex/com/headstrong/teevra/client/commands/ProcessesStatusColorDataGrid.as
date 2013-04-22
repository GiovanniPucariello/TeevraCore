package com.headstrong.teevra.client.commands
{ 
  import flash.display.Sprite;
  
  import mx.collections.ArrayCollection;
  import mx.controls.DataGrid;

  public class ProcessesStatusColorDataGrid extends DataGrid 
  {
  	
 	override protected function drawRowBackground(s:Sprite, rowIndex:int, y:Number, height:Number, color:uint,
                                                                       dataIndex:int):void
	{
       var dp:ArrayCollection = dataProvider as ArrayCollection;
       var item:Object;
       if( dataIndex < dp.length ) item = dp.getItemAt(dataIndex);
       if( item != null && item.prcsMsgsError > 0 ) color = 0xF77474;
       super.drawRowBackground(s,rowIndex,y,height,color,dataIndex);
    }
  }
}
