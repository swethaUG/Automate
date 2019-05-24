//write script to select May 20th in Calendar
package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example18 {

	public static void main(String[] args) {
		 WebDriver driver=null;
			String url="https://www.justdial.com/Travel/Train-Booking";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id("departDate")).click();
			driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[text()='20']")).click();

	}

}
