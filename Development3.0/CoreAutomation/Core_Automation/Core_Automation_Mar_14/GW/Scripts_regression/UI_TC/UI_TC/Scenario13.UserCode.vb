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
	Public Partial Class Scenario13

		Shared Sub New()
			'Your recording specific initialization code goes here.
		End Sub

		Public Shared Sub Click_test_13()
		Dim tableProcessGrid As Table
		tableProcessGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processGrid']"
		Dim temp As String=0
		Dim count As String=0
		Dim rowin As String=0
		count =tableProcessGrid.Rows.Count
		temp=1
		
		Do Until temp=count
		Dim columnProcess_Name As cell
		columnProcess_Name = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text~'^Process*']/cell[@columnindex='1' and @rowindex='"+temp+"']"
		If StrComp(columnProcess_Name.Text,"test_13")=0 Then
			rowin=temp
		End If
		temp=temp+1
		Loop
		Dim row_wq As Row
		row_wq = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/row[@index='"+rowin+"']"
		row_wq.DoubleClick
		End Sub



		Public Shared Sub getprocess_status()
		Dim tableProcessGrid As Table
		tableProcessGrid = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table[@id='processGrid']"
		Dim temp As String=0
		Dim count As String=0
		Dim rowin As String=0
		count =tableProcessGrid.Rows.Count
		Do Until temp=count
		Dim columnProcess_Name As cell
		columnProcess_Name = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Process Name']/cell[@columnIndex='1' and @rowIndex='"+temp+"']"
		If StrComp(columnProcess_Name.Text,"test_13")=0 Then
		rowin=temp
		End If
		temp=temp+1
		Loop
		Dim process_status As String
		
		Dim row_wq As cell
		row_wq = "/dom[@domain~'^.*']/body/flexobject/container/container[@id='mainArea']/container/element/table/column[@text='Status']/cell[@columnIndex='3' and @rowIndex='"+rowin+"']"
		process_status=row_wq.Text
		If process_status="PUBLISHED-MODIFIED" Then
			REPORT.Success("SCENARIO 13 FINISHED AND PASSED")
		Else
			REPORT.Failure("SCENARIO 13 IS FAILED")
		End If
					
		End Sub

		Public Shared Sub start13()
						report.Info("----------------------------------")
						report.Info("Started scenario 13")	
		End Sub

		Public Shared Sub end13()
						report.Info("----------------------------------")
						report.Info("End of scenario 13")	
						report.Info("----------------------------------")
		
		End Sub

	End Class
End Namespace