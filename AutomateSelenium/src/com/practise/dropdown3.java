package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="https://www.facebook.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     Select sc = new Select(driver.findElement(By.id("month")));
	     String month = sc.getFirstSelectedOption().getText();
	    	 if(month.equals("sept"))
	    	 {
	    		 System.out.println("Already selected");
	    		 	 
	    	 }
	    	 else
	    	 {
	    		 System.out.println("month does not exist");
	    		 sc.selectByVisibleText("Sept");
	    		 
	    		
	    	 }
	     
	}
}

	



