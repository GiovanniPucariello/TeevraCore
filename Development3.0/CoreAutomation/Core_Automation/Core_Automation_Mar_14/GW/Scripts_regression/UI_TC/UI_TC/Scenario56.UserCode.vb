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

Namespace UI_TC

	''' <summary>
	''' The Recording1 recording.
	''' </summary>
	Public Partial Class Scenario56

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

'		Public Shared Sub getProcessname()
'			  Dim tableProcessStatus As Table
'			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
'			  
'			  Dim count As String
'			count = tableProcessStatus.Rows.Count
'			Dim temp As String
'			temp = 0
'			dim val as String =0
'			
'			Do Until temp = count
'			Dim cellString As Cell
'			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
'			If StrComp( cellString.Text,"test1")=0 Or StrComp( cellString.Text,"test2")=0 Then
'				val= val+1
'				End If
'				temp=temp+1	
'	
'			Loop
'			
'			If val=2 Then
'				report.Success("test case 1545 passed")
'				
'			End If
'			
'			'checking the process for Server 2
'
'			Loop
'		End Sub
'
		Public Shared Sub checkProcessforserver1()
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			  
			Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			dim val as String =0			
			Do Until temp = count
			Dim cellString As Cell
			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellString.Text,"test1")=0 Or StrComp( cellString.Text,"test2")=0 Then
				val= val+1
				End If
				temp=temp+1	
			Loop			
			If val=2 Then
				report.Success("test1 and test2 exist for server1")
				END IF
		End Sub

		Public Shared Sub CHEKPROCESSFORSERVER2()
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			  
			  Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			dim val as String =0
			
			Do Until temp = count
			Dim cellString As Cell
			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellString.Text,"test1")=0 Or StrComp( cellString.Text,"test2")=0 Then
				val= val+1
				End If
				temp=temp+1	
	
			Loop
			
			If val=0 Then
				report.Success("No process exist for server 2")	
				End If
		End Sub

		Public Shared Sub PROCESSFORSERVER2_1()
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			  
			  Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			dim val as String =0
			
			Do Until temp = count
			Dim cellString As Cell
			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellString.Text,"test1")=0 Then
				val= val+1
				End If
				temp=temp+1	
	
			Loop
			
			If val=1 Then
				report.Success("test1 exist for server 1 after assigning the same to server 2")	
				End If	
		End Sub

		Public Shared Sub CHECKPROCESS_SERVER1_1()
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"
			  
			  Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			dim val as String =0
			
			Do Until temp = count
			Dim cellString As Cell
			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellString.Text,"test1")=0  Then
				val= val+1
				End If
				temp=temp+1	
	
			Loop
			
			If val=0 Then
				report.Success("test1 not exist for server1 AFTER assigning the same to server 2 ")	
				End If
				temp = 0
				val=0
				Do Until temp = count
		Dim cellString As Cell
			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellString.Text,"test2")=0  Then
				val= val+1
				End If
				temp=temp+1	
				Loop
					If val=0 Then
				report.Success("test2 exist for server1 AFTER assigning test1 to  server 2 ")	
				End If
		End Sub

		Public Shared Sub unassignprocess_server2()
			report.Info("starting user code")
			Dim cellString As Cell
			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/row/cell[@text='test1']"		
			cellString.Click
			Dim buttonUnassign As ranorex.Button
			buttonUnassign = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/container/button[@id='unassignServerButton']"
			buttonUnassign.Click
			Dim buttonOK As Ranorex.Button
			buttonOK = "/dom[@domain~'^.*']/body/flexobject/container[@caption='Unassign Server']/element[@type='AlertForm']/button[@text='OK']"
			buttonOK.Click
			
			
			'checking the process exist for server2 or not
			
		End Sub

		Public Shared Sub Assign_server2()
			Dim tableProcessStatus As Table
			tableProcessStatus = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processStatus']"			  
			 Dim count As String
			count = tableProcessStatus.Rows.Count
			Dim temp As String
			temp = 0
			dim val as String =0
			
			Do Until temp = count
			Dim cellString As Cell
			cellString = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnindex='2' and @rowindex='"+temp+"']"
			If StrComp( cellString.Text,"test1")=0 Then
				val= val+1
				End If
				temp=temp+1	
	
			Loop
			
			If val=0 Then
				report.Success("test1 exist for server 2 after assigning the same to server 1")	
				End If		
		End Sub

		Public Shared Sub results()
			Report.Success("test cases for Scenario56 (<iceFish><IT6><1542 to <iceFish><IT6><1558) passed")
		End Sub

	End Class
End Namespace
