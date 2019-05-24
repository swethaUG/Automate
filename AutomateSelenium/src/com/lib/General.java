package com.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class General extends Global{
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}
	public void tearDown()
	{
		driver.quit();
	}
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/src/com/Readdata/Readfile.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    int rcount = sheet.getLastRowNum();
	    for(int i=1;i<rcount;i++)
	    {
	    Row r =sheet.getRow(i);
		driver.findElement(By.name(text_Username)).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name(text_Password)).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.name(text_SubmitButton)).click();
	    }
	    
	}
	public void verifyLogin()
	{
		String actual_VerifyLoginTest =driver.findElement(By.xpath(text_WelcomeMessage)).getText();
	    Assert.assertTrue(actual_VerifyLoginTest.equalsIgnoreCase("Welcome Admin"));
		System.out.println("Login sucessfully");
	}
	

}
