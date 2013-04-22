/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright �?© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: RestrictedTextInput.as
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Nov 20, 2009  
 */
package com.headstrong.teevra.client.util
{
	import mx.controls.TextInput;

	/**
	 * Restricts user not to enter special characters
	 */
	public class RestrictedTextInput extends TextInput
	{
		
		public function RestrictedTextInput(){
			super();
			this.restrict="a-zA-Z0-9";		
		}
	}

}