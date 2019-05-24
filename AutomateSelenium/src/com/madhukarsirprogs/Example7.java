//create script to select "GOA" in "From:" dropdown in "www.spicejet.com"
//home page
package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.spicejet.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText(" Goa (GOI)")).click();

	}

}
