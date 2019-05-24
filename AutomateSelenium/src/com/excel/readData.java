package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readData {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//WebDriver driver= null;
		 ///String URl="http://newtours.demoaut.com/";
		// System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	    // driver=new ChromeDriver();
	    // driver.get(URl);
	     FileInputStream file = new  FileInputStream("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/src/com/Readdata/demo123.xlsx");
	     XSSFWorkbook wb= new XSSFWorkbook(file);
	     XSSFSheet ws = wb.getSheet("Sheet1");
	     XSSFRow r = ws.getRow(0);
	     XSSFCell c = r.getCell(0);
	     String data = c.getStringCellValue();
	     System.out.println(data);
	     

	}

}
