package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uncheekAllcheckboxes {

	public static void main(String[] args) {
		WebDriver driver= null;
		 String URl="http://echoecho.com/htmlforms09.htm";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     List<WebElement> chks = driver.findElements(By.name("Checkbox"));
	     for(int i=0;i<chks.size();i++)
	     {
	    	 if(!chks.get(i).isSelected())
	    	 {
	    	    chks.get(i).click();
	    	 }
	     }

	}

}
