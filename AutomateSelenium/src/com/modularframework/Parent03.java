package com.modularframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent03 extends Parent01{

	static WebDriver driver=null;
	
	public void setUp()
	{
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
 
	public static void main(String[] args) throws InterruptedException
	{
		Parent03 obj = new Parent03();
		obj.setUp();
		obj.Register(driver);
		obj.login(driver);
		obj.tearDown(driver);
		
	}

}
