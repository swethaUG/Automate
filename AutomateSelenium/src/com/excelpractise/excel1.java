package com.excelpractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel1 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new  FileInputStream("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/src/com/Readdata/demo123.xlsx");
	     XSSFWorkbook wb= new XSSFWorkbook(file);
	     XSSFSheet ws = wb.getSheet("Sheet1");
	     //to read single data from excel file
	    /* XSSFRow r = ws.getRow(0);
	     XSSFCell c = r.getCell(0);
	     String data = c.getStringCellValue();
	     System.out.println(data);*/
	     
	     
	     //to print excel data as an output
	   /* int rowcount =  ws.getLastRowNum();
	    for(int i=0;i<=rowcount;i++)
	    {
	    	XSSFRow r = ws.getRow(i);
	    	int cellcount = r.getLastCellNum();
	    	for(int j=0;j<=cellcount;j++)
	    	{
	    		XSSFCell c = r.getCell(j);
	    		c.getStringCellValue();
	    		
	    	}
	    }*/
	     
	     //to write data in to excel sheet
	    /* XSSFRow r = ws.createRow(2);
	     XSSFCell c = r.createCell(0);
	     c.setCellValue("swetha");
	     FileOutputStream file1 = new FileOutputStream("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/src/com/Readdata/demo123.xlsx");
	     wb.write(file1);*/
	     
	     
	    

	}

}
