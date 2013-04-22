package com.headstrong.teevra.client.graph.common
{
	import com.headstrong.teevra.client.graph.ComponentGraphCanvasItem;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.Canvas;
	import mx.controls.Alert;
	import mx.core.ClassFactory;
  
  public class Designer
  {
    private var boxes:ArrayCollection = new ArrayCollection();
    private var lines:ArrayCollection = new ArrayCollection();
    private var designArea:Canvas;
    private var _isDrawEnable:Boolean;
    private var isDrawing:Boolean;
    private var _isCurveEnable:Boolean;
    private var _templateLine:Line;
    
    private var _currentFromBox:GraphCanvasItem;
    private var _currentToBox:GraphCanvasItem;
    private var _designer:Designer;
	private var _lineFactory:ClassFactory;
	private var _color:Number;    
    public var xOff:Number = 50;
	public var yOff:Number = 40;  

    // designer is a manager class. 
    public function Designer(){        
      templateLine = new Line();
      templateLine.designer = this;
      templateLine.name="templateLine";
      templateLine.visible = false;
    }    
    public function get lineFactory():ClassFactory {
    	return _lineFactory;
    }
    
    public function set lineFactory(factory:ClassFactory):void {
    	_lineFactory = factory;
    }
    public function get color():Number
    {
    	return _color;
    }
    public function set color(value:Number):void
    {
    	this._color = value;
    }
    
    private function getNewLine():Line {
    	return Line(lineFactory.newInstance());
    }
    
    public function getBoxList():ArrayCollection{
      return boxes;
    }
    public function getLineList():ArrayCollection{
      return lines;
    }
   
    public function getId(type:String):String{
      var idString:String  = type + Math.round(Math.random()*10000).toString();
      return idString;
    }
      
    public function setDesignArea(value:Canvas):void{
      this.designArea = value;
      designArea.addChild(templateLine);      
      designArea.addEventListener(MouseEvent.MOUSE_MOVE,mouseMove);
    }
    public function mouseMove(event:MouseEvent):void{
      if (isDrawing){
        drawLine();  
      }
    }
    public function addBoxItem(item:Object):void {
    	boxes.addItem(item);
    }
    public function prepareDrawing():void{    
      if (isDrawEnable){
        templateLine.graphics.clear();
        templateLine.setX1(designArea.mouseX);
        templateLine.setY1(designArea.mouseY);
        templateLine.visible = true;
        isDrawing = true;      
      }  
    }
    public function drawLine():void{   
      if (isDrawing){
        templateLine.setX2(designArea.mouseX);
        templateLine.setY2(designArea.mouseY);
        templateLine.drawLine();
      }
    }
    public function addLine():void
    { 
 		if (isDrawing){ 			
        var newLine:Line = getNewLine();
        newLine.designer = this;
        newLine.setId(getId("Line"));
        newLine.color= color;
        newLine.fromBox = currentFromBox;
        newLine.toBox = currentToBox;
        newLine.drawLine();        
        currentFromBox.addFromLine(newLine);
        currentToBox.addToLine(newLine);          
        lines.addItem(newLine);
        designArea.addChild(newLine);
        templateLine.visible = false;        
        isDrawEnable = false;
        isDrawing = false;        
      }
      else{
        cancelDrawing();
      }
    }
    public function addCurve():void
    {
    	var newLine:Line = getNewLine();
        newLine.designer = this;
        newLine.setId(getId("Curve"));
        newLine.fromBox = currentFromBox;
        newLine.toBox = currentToBox;
        newLine.drawCurve();   
        currentFromBox.addFromCurve(newLine);
        currentToBox.addToCurve(newLine);          
        lines.addItem(newLine);
        designArea.addChild(newLine); 
        templateLine.visible = false;        
        isCurveEnable = false;
    }
    public function loadLine(startBox:GraphCanvasItem, endBox:GraphCanvasItem, startX:Number, startY:Number, endX:Number, endY:Number):void
    { 
		var newLine:Line = getNewLine();
        newLine.designer = this;
        newLine.color = color;
        newLine.setId(getId("Line"));
        newLine.fromBox = startBox;
        newLine.toBox= endBox;
        newLine.setX1(startX);
        newLine.setY1(startY);
        newLine.setX2(endX);
        newLine.setY2(endY);
        newLine.drawWithoutCoordCalculation();   
        startBox.addFromLine(newLine);
        endBox.addToLine(newLine);
        lines.addItem(newLine);
        designArea.addChild(newLine);
    }
    public function loadCurve(startBox:GraphCanvasItem, endBox:GraphCanvasItem, startX:Number, startY:Number, endX:Number, endY:Number):void
    {
    	var newLine:Line = getNewLine();
    	newLine.designer = this;
        newLine.setId(getId("Curve"));
        newLine.fromBox = startBox;
        newLine.toBox = endBox;
        newLine.setX1(startX);
        newLine.setY1(startY);
        newLine.setX2(endX);
        newLine.setY2(endY);
      
        
        newLine.drawWithoutCoordCalculationForCurve(); 
        startBox.addFromCurve(newLine);
        endBox.addToCurve(newLine);
        
        lines.addItem(newLine);
        designArea.addChild(newLine);
    }  
    
  	public function deleteLine(line:Line):void
  	{
 		var lineIndex:int = lines.getItemIndex(line);
  		//remove from the local collection
  		if (lineIndex != -1)
  		{
			lines.removeItemAt(lineIndex);
  		}
  		//remove line from the associated from and to boxes
  		var fromLines:ArrayCollection = line.fromBox.fromLines;
  		fromLines.removeItemAt(fromLines.getItemIndex(line));
  		line.fromBox= null;
  		var toLines:ArrayCollection = line.toBox.toLines;
  		toLines.removeItemAt(toLines.getItemIndex(line));
  		line.toBox= null;
  		
  		//remove from the UI
		designArea.removeChild(line);
  	}
	public function deleteBox(box:GraphCanvasItem):void
  	{
  		var boxIndex:int = boxes.getItemIndex(box);
  		if (boxIndex != -1)
  		{
  			boxes.removeItemAt(boxIndex);
  		}
  		//remove all lines connected to / from the box
  		var fromLines:ArrayCollection = box.fromLines;
  		var size:int = fromLines.length;
  		for(var i:int=0;i<size;i++)
  		{
  			deleteLine(Line(fromLines.getItemAt(0)));	
  		}
  		var toLines:ArrayCollection = box.toLines;
  		size = toLines.length;
  		for(i=0;i<size;i++)
  		{
  			deleteLine(Line(toLines.getItemAt(0)));	
  		}
  		
  		designArea.removeChild(box);
  	}
  	public function deleteCurveLine(line:Line):void
  	{
 		var lineIndex:int = lines.getItemIndex(line);
  		//remove from the local collection
  		if (lineIndex != -1)
  		{
			lines.removeItemAt(lineIndex);
  		}
  		//remove line from the associated from and to boxes
  		var fromCurveLines:ArrayCollection = line.fromBox.fromCurveLines;
  		//To check wheather Line is self connector or P2P line
  		if(fromCurveLines.getItemIndex(line)==-1)
  		{
  			var fromLines:ArrayCollection = line.fromBox.fromLines;
  		fromLines.removeItemAt(fromLines.getItemIndex(line));
  		line.fromBox= null;
  		var toLines:ArrayCollection = line.toBox.toLines;
  		toLines.removeItemAt(toLines.getItemIndex(line));
  		line.toBox= null;
  		
  		//remove from the UI
		designArea.removeChild(line);
		return;
  		}
  		fromCurveLines.removeItemAt(fromCurveLines.getItemIndex(line));
  		line.fromBox= null;
  		var toCurveLines:ArrayCollection = line.toBox.toCurveLines;
  		toCurveLines.removeItemAt(toCurveLines.getItemIndex(line));
  		line.toBox= null;
  		
  		//remove from the UI
		designArea.removeChild(line);
  	}
  	public function deleteCurveBox(box:GraphCanvasItem):void
	{
		var boxIndex:int = boxes.getItemIndex(box);
		var i:int;
  		if (boxIndex != -1)
  		{
  			boxes.removeItemAt(boxIndex);
  		}
  		//remove all lines connected to / from the box
  		var fromCureveLines:ArrayCollection = box.fromCurveLines;
  		var size:int = fromCureveLines.length;
  		for(i=0;i<size;i++)
  		{
  			deleteCurveLine(Line(fromCureveLines.getItemAt(0)));	
  		}
  		var toCurveLines:ArrayCollection = box.toCurveLines;
  		size = toCurveLines.length;
  		for(i=0;i<size;i++)
  		{
  			deleteCurveLine(Line(toCurveLines.getItemAt(0)));	
  		}
  		//for deletion of lines of to / from box if available
  		var fromLines:ArrayCollection = box.fromLines;
  		size = fromLines.length;
  		for(i=0;i<size;i++)
  		{
  			deleteLine(Line(fromLines.getItemAt(0)));	
  		}
  		var toLines:ArrayCollection = box.toLines;
  		size = toLines.length;
  		for(i=0;i<size;i++)
  		{
  			deleteLine(Line(toLines.getItemAt(0)));	
  		}
  		designArea.removeChild(box);
  		
	}
    public function cancelDrawing():void{
      templateLine.visible = false;
      isDrawEnable = false;
      isDrawing = false;
    }
    public function set designer(value:Designer):void
	{
		this._designer = value;
	}

	public function get designer():Designer
	{
		return _designer;
	}
	
	public function set templateLine(value:Line):void
	{
		this._templateLine = value;
	}

	public function get templateLine():Line
	{
		return _templateLine;
	}	
	public function set isDrawEnable(value:Boolean):void
	{
        this._isDrawEnable = value;
    }
    public function get isDrawEnable():Boolean{
        return this._isDrawEnable;
    }
    public function set isCurveEnable(value:Boolean):void
	{
        this._isCurveEnable = value;
    }
    public function get isCurveEnable():Boolean{
        return this._isCurveEnable;
    }	   
    public function set currentFromBox(value:GraphCanvasItem):void
    {
        this._currentFromBox = value;
    }
    public function get currentFromBox():GraphCanvasItem{
        return this._currentFromBox ;
    }
    public function set currentToBox(value:GraphCanvasItem):void{
  	   this._currentToBox = value;
    }
    public function get currentToBox():GraphCanvasItem{
        return this._currentToBox ;
    }
  }
}