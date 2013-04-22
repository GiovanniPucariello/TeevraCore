///////////////////////////////////////////////////////////////////////////////////////////////////
//
// This file is part of the  R A N O R E X  Project.
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Data;

/// <summary>
/// Represents a data connector to a CSV-file.
/// </summary>
class CSVConnector
{
    private string fileName = null;
    private DataTable dt = null;

    /// <summary>
    /// Initializes a new instance of the <see cref="CSVConnector"/> class.
    /// </summary>
    /// <param name="fileName">The path to the CSV file.</param>
    public CSVConnector(String fileName)
    {
        if (fileName == null)
            throw new ArgumentNullException("fileName");

        this.fileName = fileName;
        dt = new DataTable();
        ParseCSVData();
    }

    /// <summary>
    /// Gets the data rows.
    /// </summary>
    public DataRowCollection Rows
    {
        get { return dt.Rows; }
    }

    /// <summary>
    /// Gets the data columns.
    /// </summary>
    public DataColumnCollection Header
    {
        get { return dt.Columns; }
    }

    private void ParseCSVData()
    {
        try
        {
            String[] csvData = System.IO.File.ReadAllLines(fileName);

            if (csvData.Length == 0)
                return;

            String[] headings = csvData[0].Split(';');

            foreach (string header in headings)
            {
                dt.Columns.Add(header, typeof(string));
            }
            
            for (int j = 1; j < csvData.Length; j++)
            {
                DataRow row = dt.NewRow();

                for (int i = 0; i < headings.Length; i++)
                {
                    row[i] = csvData[j].Split(';')[i];
                }
                dt.Rows.Add(row);
            }
        }
        catch (Exception ex)
        {
            throw new DataException("Failed to parse CSV file '" + fileName + "'.", ex);
        }
    }
}
