/*write script to find number of links in rediffmail home page and also print
those links in console*/
package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example13 {

	public static void main(String[] args) {
		WebDriver driver = null;
		//System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		String URL="https://www.rediff.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		List<WebElement> myLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links are"+myLinks.size());
		for(WebElement mylink:myLinks)
		{
			String linknames = mylink.getText();
			System.out.println(linknames);
			
		}

	}

}
