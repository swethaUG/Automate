package com.practise;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="http://newtours.demoaut.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     System.out.println("Enter country name");
	     Scanner scan =new Scanner(System.in);
	     String myvalue = scan.nextLine();
	     boolean Mystatus=false;
	     Thread.sleep(2000);
         driver.findElement(By.linkText("REGISTER")).click();
         WebElement country = driver.findElement(By.name("country"));
         Select sc = new Select(country);
         List<WebElement> options = sc.getOptions();
         for(WebElement option:options)
         {
        	 String name = option.getText().trim();
        	 if(name.equalsIgnoreCase(myvalue))
        	 {
        		 System.out.println("expected country name exists");
        		 sc.selectByVisibleText(name);
        		 Mystatus=true;
        		 break;
        		 
        	 }
         }	 
        	 if(Mystatus=false)
        	 {
        		 System.out.println("no country with specified name");
        	 }
         }
        
	}


