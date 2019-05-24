package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbRadiobuttonclass {

	public static void main(String[] args) {
		WebDriver driver= null;
		 String URl="https://www.facebook.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     List<WebElement> radio = driver.findElements(By.className("_58mt"));
	     for(WebElement myradio:radio)
	     {
	    	 String radiotxt = myradio.getText();
	    	 System.out.println(radiotxt);
	    	 myradio.click();
	    	 
	     }
	}

}
