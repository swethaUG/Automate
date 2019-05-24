package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="http://newtours.demoaut.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     Thread.sleep(2000);
         driver.findElement(By.linkText("REGISTER")).click();
         WebElement country = driver.findElement(By.name("country"));
         Select sc = new Select(country);
         String Defaultvalue = sc.getFirstSelectedOption().getText();
         System.out.println(Defaultvalue);
        /* sc.selectByIndex(5);
         sc.selectByValue("4");
         sc.selectByVisibleText("ANGUILLA ");
         sc.deselectAll();*/
       /*  List<WebElement> cnames = sc.getOptions();
         for(int i=0;i<cnames.size();i++)
         {
        	 String values = cnames.get(i).getText();
        	 System.out.println(values);
        	 
         }*/
         
	}

}
