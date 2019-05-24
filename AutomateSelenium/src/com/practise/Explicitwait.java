package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicitwait {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.apsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("source")).sendKeys("NLR");
		//Wait<WebDriver> wt= new WebDriverWait(driver, 30);
		//wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("KOVUR-NLR")));
	    Wait<WebDriver> wt = new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("KOVUR-NLR")));


	}

}
