package com.modularframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent02{
	public void login(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
		driver.findElement(By.name("userName")).sendKeys("bank1");
		driver.findElement(By.name("password")).sendKeys("hdfc");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")).click();
		Thread.sleep(2000);
		System.out.println("Sucessfull Login");
		
	}

}
