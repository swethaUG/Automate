package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbRadiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="https://www.facebook.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     WebElement radio = driver.findElement(By.xpath("//*[@id='u_0_z']"));
	     List<WebElement> myspan = radio.findElements(By.tagName("span"));
	     //System.out.println(myspan.size());
	     for(int i=0;i<myspan.size();i++)
	     {
	    	 String name = myspan.get(i).findElement(By.tagName("label")).getText();
	    	 System.out.println(name);
	    	  myspan.get(i).findElement(By.tagName("label")).click();
	    	  Thread.sleep(2000);
	    	 
	     }
	    
	   
	}

}
