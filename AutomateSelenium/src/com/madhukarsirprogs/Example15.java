/*write script to find number of language links in Google home page
script:*/
	package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example15 {

	public static void main(String[] args) {
		    WebDriver driver=null;
			String url="https://www.google.co.in/";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			WebElement mylang = driver.findElement(By.id("SIvCob"));
			List<WebElement> mylangs = mylang.findElements(By.tagName("a"));
			System.out.println("Number of language links are"+mylangs.size());
			for(WebElement lang:mylangs)
			{
				String langname = lang.getText();
				System.out.println(langname);
			}
			

	}

}
