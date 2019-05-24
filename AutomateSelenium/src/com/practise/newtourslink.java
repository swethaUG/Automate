package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtourslink {

	public static void main(String[] args) {
		WebDriver driver= null;
		 String URl="http://newtours.demoaut.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     List<WebElement> links =  driver.findElements(By.tagName("a"));
	     for(int i=0;i<links.size();i++)
	     {
	    	 System.out.println(links.get(i).getText());
	    	 links.get(i).click();
	    	 driver.navigate().back();
	    	links =  driver.findElements(By.tagName("a"));
	    	
	    	 
	     }
	     
	}

}
