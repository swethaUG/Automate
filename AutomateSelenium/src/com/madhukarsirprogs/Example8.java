//Write script to select "KOVUR-NLR" in "From" dropdown in 
package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example8 {

	public static void main(String[] args) throws InterruptedException {
	/*	WebDriver driver=null;
		String url="https://www.spicejet.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id="ctl00_mainContent_ddl_originStation1_CTXT"]"))*/
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
	    driver.findElement(By.id("fromPlaceName")).sendKeys("NLR");
	    Thread.sleep(5000);
	    driver.findElement(By.id("ui-id-17")).click();
		
        
	}

}
