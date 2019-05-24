package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link2 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> mylinks =  driver.findElements(By.tagName("a"));
		System.out.println("Number of Links"+mylinks.size());
		for(int i=0;i<mylinks.size();i++)
		{
			String link = mylinks.get(i).getText();
			System.out.println(link);
			mylinks.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			mylinks =  driver.findElements(By.tagName("a"));
		}
		
	}

}
