package com.practise;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XLUtilexecutablefile {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String path="D:\\MercuryLoginData.xlsx";
		XLUtilsconcept.setExcelFile(path, "Sheet1");
		int rows=XLUtilsconcept.getRowCount(path, "Sheet1");
		for(int i=1; i<=rows; i++) {
			
			String username=XLUtilsconcept.getCellData(path, "Sheet1", i, 0);
			String pwd=XLUtilsconcept.getCellData(path, "Sheet1", i, 1);
			
			//to perform login operation
			
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			Thread.sleep(8000);
			//to read page title
			String pgTitle=driver.getTitle();
			if(pgTitle.equals("Find a Flight: Mercury Tours:")) {
				System.out.println("Test passed");
				XLUtilsconcept.setCellData(path, "Sheet1", i, 2, "Successful login operation");
				driver.findElement(By.linkText("SIGN-OFF")).click();
				
			}
			else {
				System.out.println("Test Failed");
				XLUtilsconcept.setCellData(path, "Sheet1", i, 2, "Unsuccessful login operation");
		
			}
			driver.findElement(By.linkText("Home")).click();
		}
	}


	}



