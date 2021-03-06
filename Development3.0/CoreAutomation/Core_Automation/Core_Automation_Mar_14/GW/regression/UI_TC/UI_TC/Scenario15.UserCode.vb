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
	Public Partial Class Scenario15

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

		Public Shared Sub Close_button()
			Dim tableRefDataGrid As Table
			tableRefDataGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='refDataGrid']"
			Dim count As String=0
			Dim temp As String=0
			Dim rowin As String=0
			count=tableRefDataGrid.Rows.Count
			
			Do Until temp= count
				Dim name_dataref As cell
				name_dataref = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnIndex='1' and @rowindex='"+temp+"']"
				If StrComp( name_dataref.Text,"Name")=0 Then
					rowin=rowin+1
				End If
				temp=temp+1
			Loop
			If rowin=0 Then
				Report.Success("Close button passed")
			Else
				Report.Failure("Close button failed")
			End If			
		End Sub

		Public Shared Sub Save_button()
			Dim tableRefDataGrid As Table
			tableRefDataGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='refDataGrid']"
			Dim count As String=0
			Dim temp As String=0
			Dim rowin As String=0
			count=tableRefDataGrid.Rows.Count
			
			Do Until temp= count
				Dim name_dataref As cell
				name_dataref = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnIndex='1' and @rowindex='"+temp+"']"
				If StrComp( name_dataref.Text,"Name")=0 Then
					rowin=rowin+1
				End If
				temp=temp+1
			Loop
			If rowin=1 Then
				Report.Success("Save button passed")
			Else
				Report.Failure("Save button failed")
			End If
			
		End Sub

		Public Shared Sub Delete_NO_YEs()
			report.info("starting delete validation")
			Dim tableRefDataGrid As Table
			tableRefDataGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='refDataGrid']"
			Dim count As String=0
			Dim temp As String=0
			Dim rowin As String=0
			count=tableRefDataGrid.Rows.Count			
			Do Until temp= count
				Dim name_dataref As cell
				name_dataref = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnIndex='1' and @rowindex='"+temp+"']"
				If StrComp( name_dataref.Text,"Name")=0 Then
					rowin=temp
				End If
				temp=temp+1
			Loop
					
		Dim buttonDelete As Ranorex.Button
		buttonDelete = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/container/button[@id='deleteButton']"
		Dim row0 As Row
		row0 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/row[@index='"+rowin+"']"		
		report.Info("clicking row")
		row0.Click
		Report.Info("clicking delete")
		buttonDelete.Click
		Dim buttonYes As Ranorex.Button
		buttonYes = "/dom[@domain~'^.*']/body/flexobject/container[@caption='Confirm delete']/element[@type='AlertForm']/button[@text='Yes']"
		Dim buttonNo As ranorex.Button
		buttonNo = "/dom[@domain~'^.*']/body/flexobject/container[@caption='Confirm delete']/element[@type='AlertForm']/button[@text='No']"	

		buttonNo.Click
		Report.Info("---------------Delete ----------------------")
		Save_button()
		row0.Click
		buttonDelete.Click
		'delay(1000)
		buttonYes.Click
		Close_button
		Report.Info("--------------End Delete -------------------")
		
		End Sub

		Public Shared Sub click_testrecord()
			report.info("starting delete validation")
			Dim tableRefDataGrid As Table
			tableRefDataGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='refDataGrid']"
			Dim count As String=0
			Dim temp As String=0
			Dim rowin As String=0
			count=tableRefDataGrid.Rows.Count			
			Do Until temp= count
				Dim name_dataref As cell
				name_dataref = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Name']/cell[@columnIndex='1' and @rowindex='"+temp+"']"
				If StrComp( name_dataref.Text,"NamE")=0 Then
					rowin=temp
				End If
				temp=temp+1
			Loop
					
		Dim buttonDelete As Ranorex.Button
		buttonDelete = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/container/button[@id='deleteButton']"
		Dim row0 As Row
		row0 = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/row[@index='"+rowin+"']"		
		report.Info("clicking row")
		row0.DoubleClick
			
					End Sub

		Public Shared Sub Mouse_DoubleClick_CellString151()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info("Mouse Left DoubleClick item 'WebDocumentIceFish1.FlexObjectIceFish.CellString15' at 56;9.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.CellString15.DoubleClick("56;9")
		End Sub

		Public Shared Sub Mouse_DoubleClick_CellString152()
			'Your code here. Code inside this method will not be changed by the code generator.
			Report.Info("Mouse Left DoubleClick item 'WebDocumentIceFish1.FlexObjectIceFish.CellString15' at 104;8.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.CellString15.DoubleClick("104;8")
		End Sub

		Public Shared Sub start15()
							report.Info("----------------------------------")
						report.Info("scenario 15")	
						report.Info("----------------------------------")
				
		End Sub

		Public Shared Sub end15()
						report.Info("----------------------------------")
						report.Info("End--------scenario 15")	
						report.Info("----------------------------------")
		
		End Sub

		Public Shared Sub UserCodeMethod1()
			'Your code here. Code inside this method will not be changed by the code generator.
			
		End Sub

		Private Sub Init()
			' Your recording specific initialization code goes here.
		End Sub
	End Class
End Namespace
