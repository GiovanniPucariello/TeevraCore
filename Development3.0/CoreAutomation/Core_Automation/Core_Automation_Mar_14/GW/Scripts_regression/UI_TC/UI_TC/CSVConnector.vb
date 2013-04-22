'''////////////////////////////////////////////////////////////////////////////////////////////////
'
' This file is part of the  R A N O R E X  Project.
' http://www.ranorex.com
'
'''////////////////////////////////////////////////////////////////////////////////////////////////

Imports System
Imports System.Collections.Generic
Imports System.Text
Imports System.Data

''' <summary>
''' Represents a data connector to a CSV-file.
''' </summary>
Class CSVConnector
	Private fileName As String = Nothing
	Private dt As DataTable = Nothing

	''' <summary>
	''' Initializes a new instance of the <see cref="CSVConnector"/> class.
	''' </summary>
	''' <param name="fileName">The path to the CSV file.</param>
	Public Sub New(fileName As [String])
		If fileName Is Nothing Then
			Throw New ArgumentNullException("fileName")
		End If

		Me.fileName = fileName
		dt = New DataTable()
		ParseCSVData()
	End Sub

	''' <summary>
	''' Gets the data rows.
	''' </summary>
	Public ReadOnly Property Rows() As DataRowCollection
		Get
			Return dt.Rows
		End Get
	End Property

	''' <summary>
	''' Gets the data columns.
	''' </summary>
	Public ReadOnly Property Header() As DataColumnCollection
		Get
			Return dt.Columns
		End Get
	End Property

	Private Sub ParseCSVData()
		Try
			Dim csvData As [String]() = System.IO.File.ReadAllLines(fileName)

			If csvData.Length = 0 Then
				Return
			End If

			Dim headings As [String]() = csvData(0).Split(";"C)

			For Each header As String In headings
				dt.Columns.Add(header, GetType(String))
			Next

			For j As Integer = 1 To csvData.Length - 1
				Dim row As DataRow = dt.NewRow()

				For i As Integer = 0 To headings.Length - 1
					row(i) = csvData(j).Split(";"C)(i)
				Next
				dt.Rows.Add(row)
			Next
		Catch ex As Exception
			Throw New DataException("Failed to parse CSV file '" & fileName & "'.", ex)
		End Try
	End Sub
End Class
