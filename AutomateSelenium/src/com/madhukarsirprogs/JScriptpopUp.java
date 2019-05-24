package com.madhukarsirprogs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScriptpopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//confg. JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//to get Alert
		js.executeScript("window.alert('Hi, Running JavascriptExecutor') ");
		Thread.sleep(5000);
		//to read msg from popup
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		//to close popup
		driver.switchTo().alert().accept();
		//to close browser
		driver.close();

	}

}
