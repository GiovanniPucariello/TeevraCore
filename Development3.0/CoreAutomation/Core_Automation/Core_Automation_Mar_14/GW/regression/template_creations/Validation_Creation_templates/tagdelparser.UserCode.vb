﻿'//////////////////////////////////////////////////////////////////////////////
'
' This file was automatically generated by RANOREX.
' http://www.ranorex.com
'
'//////////////////////////////////////////////////////////////////////////////

Imports System
Imports System.Collections.Generic
Imports System.Text
Imports System.Text.RegularExpressions
Imports System.Drawing
Imports System.Threading
Imports System.Windows.Forms

Imports Ranorex
Imports Ranorex.Core

Namespace Validation_Creation_templates

	''' <summary>
	''' The Recording1 recording.
	''' </summary>
	Public Partial Class tagdelparser

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

Public Shared Property Tempname_tagdel() As String  
    Get  
        Return Tempnametagdel   
    End Get  
    Set  
        Tempnametagdel = Value   
    End Set  
End Property  
Private Shared Tempnametagdel As String 
		Public Shared Sub getTempname_tagdel()
			'Your code here. Code inside this method will not be changed by the code generator.
			
			Keyboard.Press(Tempnametagdel)
		End Sub

		Private Sub Init()
			' Your recording specific initialization code goes here.
		End Sub

	End Class
End Namespace