package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSHighlightEdit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement ele1=driver.findElement(By.id("username"));
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//to highlight element
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px dashed red;')", ele1);
		


	}

}
