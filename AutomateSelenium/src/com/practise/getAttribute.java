package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	 public static void main(String[] args) {
	 WebDriver driver= null;
	 String URl="https://opensource-demo.orangehrmlive.com/";
	 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
     driver=new ChromeDriver();
     driver.get(URl);
     String username = "swetha";
     WebElement uid = driver.findElement(By.id("txtUsername"));
     uid.sendKeys("swetha");
     String txtuid = uid.getText();
     if(txtuid.equals(username))
     {
    	 System.out.println("Expected value displayed");
     }
     else
     {
    	 System.out.println("Different value displayed");
     }
    
     
	}

}
