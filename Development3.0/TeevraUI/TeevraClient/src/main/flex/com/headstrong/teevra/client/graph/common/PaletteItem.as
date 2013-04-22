/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: PaletteItem.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph.common
{
	import mx.containers.VBox;
	
	public class PaletteItem extends VBox
	{
		public function PaletteItem()
		{
			super();
			this.setStyle("borderStyle", "none");
		}
		
		public function addItems():void
		{
		}
		
		public function formatStringForWidth(str:String, width:int):String
		{
			var strLength:int = str.length;
			
			if (strLength <= width)
			{
				return str;
			}
			return str.substr(0, width - 1) + "-\n" + formatStringForWidth(str.substring(width - 1, strLength), width);
		}
	}
}