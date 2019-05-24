package com.madhukarsirprogs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSscroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//to highlight element
		js.executeScript("window.scrollBy(0, 3000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1500)");
	}

}
