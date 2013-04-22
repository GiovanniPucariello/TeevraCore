package com.headstrong.teevra.client.graph.common
{	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.core.UIComponent;
  
  public class Line extends UIComponent
  {
    public var thicknessNumber:uint = 2;
    public var alphaNumber:uint = 4.0;
    private var arrowWidth:int = 4;
    private var arrowHeight:int = 8;
    private var x1:int;
    private var y1:int;
    private var x2:int;
    private var y2:int;
    public var color:uint = 0x000000;

    private var _fromBox:GraphCanvasItem;
    private var _toBox:GraphCanvasItem;
    
    private var isSelect:Boolean=false;
    private var _designer:Designer;
      
    public function Line(){
      super();
       //this.addEventListener(MouseEvent.CLICK,mouseClick);
    }
  	
    public function clear():void{
      graphics.clear();
    }
    public function rightClickEvent():void
	{
	}
    public function mouseClick(event:MouseEvent):void{
    	
    // select(event);
    }
  //this method select line 
//    public function select(event:MouseEvent):void{
//      	
//    }
    
	//draws a straight line on UIComponent graphics. 
    public function drawLine():void{
       if(name != "templateLine"){
        calculateCoordinate();
      }
  	  graphics.clear();

  	  graphics.lineStyle(8,color,0.0);
  	  graphics.moveTo(getX1(),getY1());
  	  graphics.lineTo(getX2(),getY2());

  	  graphics.lineStyle(thicknessNumber,color,alphaNumber);
  	  graphics.moveTo(getX1(),getY1());
  	  graphics.lineTo(getX2(),getY2());
 	  
  	  createArrow();
    }
    
    // draws a curve on UIComponent graphics. 
    public function drawCurve():void{
      if(name != "templateLine"){
        calculateCoordinate();
      }
     graphics.clear();
     graphics.moveTo(fromBox.getX()+(fromBox.getWidth()/2),fromBox.getY());
  	 graphics.lineStyle(thicknessNumber,color,alphaNumber);
	 graphics.curveTo(fromBox.getX()+fromBox.getWidth()*2,fromBox.getY()-(fromBox.getHeight()/2)*2.5,fromBox.getX()+fromBox.getWidth(), fromBox.getY()+fromBox.getHeight()/2);
  	  
  	//  createArrow();
    }
    
	public function drawWithoutCoordCalculation():void{
  	  graphics.clear();
 
  	  graphics.lineStyle(8,color,0.0);
  	  graphics.moveTo(getX1(),getY1());
  	  graphics.lineTo(getX2(),getY2());

  	  graphics.lineStyle(thicknessNumber,color,alphaNumber);
  	  graphics.moveTo(getX1(),getY1());
  	  graphics.lineTo(getX2(),getY2());
  	  createArrow();
    }
    
    public function drawWithoutCoordCalculationForCurve():void
    {
    	graphics.clear();
    	graphics.moveTo(fromBox.getX()+(fromBox.getWidth()/2),fromBox.getY());
  	 	graphics.lineStyle(thicknessNumber,color,alphaNumber);
	 	graphics.curveTo(fromBox.getX()+fromBox.getWidth()*2,fromBox.getY()-(fromBox.getHeight()/2)*2.5,fromBox.getX()+fromBox.getWidth(), fromBox.getY()+fromBox.getHeight()/2);
		
		  	  
    }
 	  //Draw the arrow
  	public function createArrow():void{
  	  var angle:Number = Math.atan2(getY2()-getY1(), getX2()-getX1());
  	  graphics.lineTo(getX2()-arrowHeight*Math.cos(angle)-arrowWidth*Math.sin(angle),
  									getY2()-arrowHeight*Math.sin(angle)+arrowWidth*Math.cos(angle));
  	  graphics.lineTo(getX2(), getY2());
  	  graphics.lineTo(getX2()-arrowHeight*Math.cos(angle)+arrowWidth*Math.sin(angle),	
  									getY2()-arrowHeight*Math.sin(angle)-arrowWidth*Math.cos(angle));										
  	}
  	
		//this method find which way "from" box sides.
  	public function getDrawDirection():String{
  	  var drawDirection :String;
  	  var boxFromX2:int = fromBox.getX()+fromBox.getWidth();
  	  var boxFromY2:int = fromBox.getY()+fromBox.getHeight();
  	  var boxToX2:int = toBox.getX()+toBox.getWidth();
  	  var boxToY2:int = toBox.getY()+toBox.getHeight();
  		
  	  if(boxFromX2==boxToX2 && boxFromY2==boxToY2)
  	  {
  	  	drawDirection = "SELF";
  	  }		
  		
  	  if (fromBox.getX()>boxToX2 && boxFromY2<toBox.getY()){
  		  drawDirection = "RIGHT_TOP";
  	  }
  	  else if (fromBox.getX()>boxToX2 && fromBox.getY()>boxToY2){
  	    drawDirection  = "RIGHT_BOTTOM";
  	  }
  	  else if (boxFromX2<toBox.getX() && fromBox.getY()>boxToY2){
  	    drawDirection  = "LEFT_BOTTOM";
  	  }
  	  else if (boxFromX2<toBox.getX() && boxFromY2<toBox.getY()){
  	    drawDirection  = "LEFT_TOP";
  	  }
  	  else if (fromBox.getX()>boxToX2){
  	    drawDirection  = "RIGHT";
  	  }
  	  else if (boxFromY2<toBox.getY()){
  	    drawDirection  = "TOP";
  	  }
  	  else if (fromBox.getY()>boxToY2){
  	    drawDirection  = "BOTTOM";
  	  }
  	  else if (boxFromX2<toBox.getX()){
  	    drawDirection  = "LEFT";
  	  }
  	 // Alert.show("drawDirection=>"+drawDirection);
  	  return drawDirection;
  	}
  	//this methos calculate coordinate for draw line. it use two side of box distance
  	public function calculateCoordinate():void{
  	  var drawDirection:String = getDrawDirection();
  	  var boxFromX2:int = fromBox.getX()+fromBox.getWidth();
  	  var boxFromY2:int = fromBox.getY()+fromBox.getHeight();
  	  var boxToX2:int = toBox.getX()+toBox.getWidth();
  	  var boxToY2:int = toBox.getY()+toBox.getHeight();
  	  var diffY:int = 0;
  	  var diffX:int = 0;
  	  
  	  if (drawDirection =="BOTTOM" || drawDirection =="TOP")
  	  {
    		if (fromBox.getX()<=toBox.getX() && boxFromX2>=boxToX2){					
    		  diffX =(toBox.getWidth())/2;
    		  diffX = toBox.getX() + diffX;				
    		}
    		else if (fromBox.getX()>toBox.getX() && boxFromX2>boxToX2){					
    		  diffX =(boxToX2 - fromBox.getX())/2;
    		  diffX = fromBox.getX() + diffX;				
    	  }
    	  else if (fromBox.getX()<toBox.getX() && boxFromX2<boxToX2){					
    		  diffX =(boxFromX2 - toBox.getX())/2;
    		  diffX = toBox.getX() + diffX;				
    		}
    		else if (fromBox.getX()>toBox.getX() && boxFromX2<boxToX2){					
    		  diffX =(fromBox.getWidth())/2;
    		  diffX = fromBox.getX() + diffX;
    		}
    	  if (diffX == 0){
    		  diffX = fromBox.getX() + (fromBox.getWidth()/2);
    		}
  	  }
  	  if (drawDirection =="RIGHT" || drawDirection =="LEFT" ){				
    		if (fromBox.getY()<=toBox.getY() && boxFromY2>=boxToY2){				
    		  diffY =(boxToY2 - toBox.getY())/2;					
    		  diffY = toBox.getY() + diffY;						
    		}
    		else if (fromBox.getY()>toBox.getY() && boxFromY2>boxToY2){					
    		  diffY =(boxToY2 - fromBox.getY())/2;
    		  diffY = fromBox.getY() + diffY;
    		}
    		else if (fromBox.getY()<toBox.getY() && boxFromY2<boxToY2){					
    	    diffY =(boxFromY2 - toBox.getY())/2;
    		  diffY = toBox.getY() + diffY;								
    		}
    		else if (fromBox.getY()>toBox.getY() && boxFromY2<boxToY2){					
    		  diffY =(fromBox.getHeight())/2;
    		  diffY = fromBox.getY() + diffY;															
    		}				
  	  }
  	  switch (drawDirection ){
  	    case "RIGHT_BOTTOM":
  		  this.x1 = fromBox.getX()+diffX;
  		  this.y1 = fromBox.getY();
  		  this.x2 = boxToX2;
  		  this.y2 = boxToY2-diffY;				
  		break;
  		case "RIGHT_TOP":
  		  this.x1 = fromBox.getX();
  		  this.y1 = boxFromY2-diffY;
  		  this.x2 = boxToX2-diffX;
  		  this.y2 = toBox.getY();				
  		break;
  		case "LEFT_BOTTOM":
  		  this.x1 = boxFromX2-diffX;
  		  this.y1 = fromBox.getY() ;
  		  this.x2 = toBox.getX();
  		  this.y2 = boxToY2-diffY;				
  		break;					
  		case "LEFT_TOP":
  		  this.x1 = boxFromX2;
  		  this.y1 = boxFromY2-diffY;
  		  this.x2 = toBox.getX()+diffX;
  		  this.y2 = toBox.getY();				
  		break;					
  		case "RIGHT":
  		  this.x1 = fromBox.getX();
  		  this.y1 = diffY;
  		  this.x2 = boxToX2;
  		  this.y2 = diffY;			
  		break;
  		case "TOP":
  		  this.x1 = diffX;
  		  this.y1 = boxFromY2;
  		  this.x2 = diffX;
  		  this.y2 = toBox.getY();				
  		break;
  		case "BOTTOM":
  		  this.x1= diffX;
  		  this.y1= fromBox.getY();
  		  this.x2= diffX;
  		  this.y2= boxToY2;				
  		break;
  		case "LEFT":
  		  this.x1= boxFromX2;
  		  this.y1= diffY;
  		  this.x2= toBox.getX();
  		  this.y2= diffY;
  		break;
  		case "SELF":
//  		Alert.show("fromBox.getX()=>"+fromBox.getX());
//  		Alert.show("fromBox.getY()=>"+fromBox.getY());
//  				
  		  this.x1= boxFromX2;
  		  this.y1= boxFromY2;
  		  this.x2= boxToX2;
  		  this.y2= boxToY2;
  		  
  		break;
  	  }
  	}
    
    public function setId(value:String):void{
  	  this.id = value;
  	}
  	public function getId():String{
  	  return this.id;
  	}   
  	public function getX1():int{
  	  return this.x1;
  	}
  	public function setX1(value:int):void{
  	  this.x1 = value;
  	}
  	public function getY1():int{
  	  return this.y1;
  	}
  	public function setY1(value:int):void{
  	  this.y1 = value;
  	}
  	public function getX2():int{
  	  return this.x2;
  	}
  	public function setX2(value:int):void{		
  	  this.x2 = value;
  	}
  	public function getY2():int{
  	  return this.y2;
  	}
  	public function setY2(value:int):void{
  	  this.y2 = value;
  	}	
  	   
    public function set fromBox(value:GraphCanvasItem):void
    {
    	this._fromBox = value;
    }
    
    public function get fromBox():GraphCanvasItem
    {
    	return this._fromBox;
    }

    public function set toBox(value:GraphCanvasItem):void
    {
    	this._toBox = value; 
    }
    
    public function get toBox():GraphCanvasItem
    {
    	return this._toBox;
    }
	
	public function get designer():Designer
  	{
  		return _designer;
  	}
  	
  	public function set designer(value:Designer):void
  	{
  		this._designer = value;
  	}
  }
}