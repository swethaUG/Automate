//write script to select August 15th in calendar
package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example19 {

	public static void main(String[] args) {
		    WebDriver driver=null;
			String url="https://www.justdial.com/Travel/Train-Booking";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id("departDate")).click();
			String month1 =driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
			System.out.println(month1);
			if(month1.equalsIgnoreCase("August"))
			{
				driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[text()='15']")).click();
				
			}
			else
				//to read next month name
				do
				{
					String month2 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
					System.out.println(month2);
					if(month2.equalsIgnoreCase("August"))
					{
						driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[text()='15']")).click();
						break;
					}
					else
					{
						//click on next
						driver.findElement(By.xpath("//span[text()='Next']")).click();	
					}
					
				}
				while(true);
			
	}

}
