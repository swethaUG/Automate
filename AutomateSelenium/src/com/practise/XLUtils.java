package com.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static void setExcelfile(String xfile, String xsheet) throws IOException
	{
		try
		{
		FileInputStream file = new FileInputStream(xfile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(xsheet);
		}
		catch(Exception e)
		{
			throw(e);
		}
		
	}
	public static int getRowcount(String xfile, String xsheet) throws IOException
	{
		fi= new FileInputStream(xfile);
		wb= new XSSFWorkbook(fi);
		ws = wb.getSheet(xsheet);
		int rowcount =ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	public static int getCellcount(String xfile, String xsheet,int row) throws IOException
	{
		fi= new FileInputStream(xfile);
		wb= new XSSFWorkbook(fi);
		ws = wb.getSheet(xsheet);
		int rowcount =ws.getLastRowNum();
		
		
	}

}
