/*write script to click on "Register" link if that link is available in 
Mercury tours home page*/
package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example14 {

	public static void main(String[] args) {
		 WebDriver driver=null;
			String url="http://newtours.demoaut.com/";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.linkText("REGISTER")).click();
			List<WebElement> myLinks = driver.findElements(By.tagName("a"));
			System.out.println("Number of links"+myLinks.size());
			for(WebElement mylink:myLinks)
			{
				String linkname = mylink.getText();
				if(linkname.equalsIgnoreCase("Register"))
				{
					System.out.println("Register link exists");
					driver.findElement(By.linkText("REGISTER")).click();
					break;
				}
			}
			

	}

}
