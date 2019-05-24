package com.madhukarsirprogs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivendemo {

	
		public static FileInputStream fi;
		public static FileOutputStream fo;
		public static XSSFWorkbook wb;
		public static XSSFSheet ws;
		public static XSSFRow row;
		public static XSSFCell cell;
		
		public static void setExcelFile(String xfile,String xsheet) throws Exception
		{
			try
			{
			FileInputStream ExcelFile = new FileInputStream(xfile);
			wb = new XSSFWorkbook(ExcelFile);
			ws = wb.getSheet("Sheet1");
			}
			catch(Exception e)
			{
				throw(e);
			}
		}
		public static int getRowCount(String xfile,String xsheet) throws IOException
		{
			fi = new FileInputStream(xfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet("Sheet1");
			int rowcount = ws.getLastRowNum();
			wb.close();
			fi.close();
			return rowcount;	
			
		}
		public static int getCellCount(String xfile,String xsheet,int rownum) throws IOException
		{
			fi = new FileInputStream(xfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet("Sheet1");
			row = ws.getRow(rownum);
			int cellcount = row.getLastCellNum();
			wb.close();
			fi.close();
			return cellcount;
			
		}
		public static String getCellData(String xfile,String xsheet,int rownum, int cellnum) throws IOException
		{
			fi = new FileInputStream(xfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet("Sheet1");
			row = ws.getRow(rownum);
			cell = row.getCell(cellnum);
			String data;
			try
			{
				DataFormatter formatter = new DataFormatter();
				String cellData = formatter.formatCellValue(cell);
				return cellData;
			}
			catch(Exception e)
			{
				data = "";
			}
			wb.close();
			fi.close();
			return data;
			
		}
		public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException 
		{
			fi = new FileInputStream(xlfile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet("Sheet1");
			row = ws.getRow(rownum);
			cell = row.getCell(colnum);
			cell = row.createCell(colnum);
			cell.setCellValue(data);
			fo= new FileOutputStream(xlfile);
			wb.write(fo);
			wb.close();
			fi.close();
			fo.close();
		}
       
	}


