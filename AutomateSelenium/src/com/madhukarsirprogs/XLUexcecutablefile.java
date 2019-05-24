package com.madhukarsirprogs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XLUexcecutablefile {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String path = "D:/MercuryLoginData.xlsx";
		ExcelUtils.getExcelfile(path,"Sheet1");
		int rowcount = ExcelUtils.getRowcount(path, "Sheet1");
		for(int i=0;i<=rowcount;i++)
		{
			String username = ExcelUtils.getCellData(path,"Sheet1",i,0);
			String password = ExcelUtils.getCellData(path,"Sheet1",i,1);
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			Thread.sleep(8000);
			String pgTitle=driver.getTitle();
			if(pgTitle.equals("Find a Flight: Mercury Tours:")) {
				System.out.println("Test passed");
				ExcelUtils.setCelldata(path, "Sheet1", i, 2, "Successful login operation");
				driver.findElement(By.linkText("SIGN-OFF")).click();
				
			}
			else {
				System.out.println("Test Failed");
				ExcelUtils.setCelldata(path, "Sheet1", i, 2, "Unsuccessful login operation");
		
			}
			driver.findElement(By.linkText("Home")).click();
		}
	}

}
