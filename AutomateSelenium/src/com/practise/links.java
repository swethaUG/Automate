package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		WebDriver driver= null;
		 String URl="https://www.rediff.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println( links.size());
	     for(int i=0;i<links.size();i++)
	     {
	    	 if(links.get(i).isDisplayed())
	    	 {
	    	 String text = links.get(i).getText();
	    	 System.out.println(text);
	    	 }
	     }
	     

	}

}
