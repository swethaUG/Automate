//Write script to select values from "Country" dropdown using different options script:
package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Example9 {

	public static void main(String[] args) {
		
	

	WebDriver driver=null;
	String url="http://newtours.demoaut.com/";
	System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.findElement(By.linkText("REGISTER")).click();
	WebElement country = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
	Select sc = new Select(country);
	//Select sc = new Select(country);
	List<WebElement> options = sc.getOptions();
	sc.selectByValue("251");
	
	sc.selectByIndex(2);
    sc.selectByVisibleText("ANDORRA ");
    
  
   
    
}
}
