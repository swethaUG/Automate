package com.modularframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent01 extends Parent02{
	//WebDriver driver = null;
	public void Register(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("hdcdyhf");
		driver.findElement(By.name("lastName")).sendKeys("bank");
		//driver.findElement(By.name("phone")).sendKeys("hdcdyhf");
		driver.findElement(By.name("userName")).sendKeys("bank@gmail.com");
		driver.findElement(By.name("email")).sendKeys("bank1");
		driver.findElement(By.name("password")).sendKeys("hdfc");
		driver.findElement(By.name("confirmPassword")).sendKeys("hdfc");
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		System.out.println("Registered sucessfully");
	}
	public void tearDown(WebDriver driver)
	{
		driver.close();
		
	}

}
