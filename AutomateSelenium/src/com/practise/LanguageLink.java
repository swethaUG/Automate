package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanguageLink {

	public static void main(String[] args) {
		WebDriver driver= null;
		 String URl="https://www.google.co.in/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	    WebElement lang =  driver.findElement(By.id("SIvCob"));
	    List<WebElement> langnames =  lang.findElements(By.tagName("a"));
	    System.out.println( langnames.size());
	    //langnames.size()
	    for(WebElement langname:langnames)
	    {
	    	String names = langname.getText();
	    	System.out.println(names);
	    	
	    }
	}

}
