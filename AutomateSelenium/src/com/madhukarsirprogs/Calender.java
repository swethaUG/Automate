package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		 WebDriver driver=null;
			String url="https://www.justdial.com/Travel/Train-Booking";
		
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id("departDate")).click();
			WebElement Mtable = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
			List<WebElement> rows = Mtable.findElements(By.tagName("tr"));
			for(int i=0;i<rows.size();i++)
			{
				List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cols.size();j++)
				{
					String data = cols.get(j).getText();
					System.out.println(data);
				}
			}
			

	}

}
