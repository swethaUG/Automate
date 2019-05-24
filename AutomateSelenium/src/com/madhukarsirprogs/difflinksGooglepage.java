package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class difflinksGooglepage {
	 WebDriver driver=null;
	public void setUp()
	{
		String url="https://google.co.in";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void langClick(String mylanguage)
	{
		driver.findElement(By.linkText(mylanguage)).click();
	}
	public void tearDown()
	{
		driver.close();
	}

	public static void main(String[] args)
	{
		
		difflinksGooglepage gl = new difflinksGooglepage();
		gl.setUp();
		gl.langClick("??????");//click on telugu
		//gl.langClick("हिन्दी");//click on Hindi
		//gl.langClick("मराठी");//click on marati
		//gl.langClick("English");
		//gl.tearDown();
	}

}
