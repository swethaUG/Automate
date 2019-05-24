package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTable {

	public static void main(String[] args) {
		WebDriver driver= null;
		 String URl="https://www.w3schools.com/";
		//*[@id="customers"]/tbody/tr[3]/td[2]
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     driver.findElement(By.linkText("Learn HTML")).click();
	     driver.findElement(By.linkText("HTML Tables")).click();
	     WebElement mytable = driver.findElement(By.id("customers"));
	     List<WebElement> rows= mytable.findElements(By.tagName("tr"));
	     for(int i=0;i<rows.size();i++)
	     {
	    	 List<WebElement> header = rows.get(i).findElements(By.tagName("th"));
	    	 for(int j=0;j<header.size();j++)
	    	 {
	    		 String th = header.get(j).getText();
	    		 System.out.print(th);
	    	 }
	    	 System.out.println();
	    	 
	    }
	   for(int k=0;k<rows.size();k++) 
	    {
	    	List<WebElement> cols = rows.get(k).findElements(By.tagName("td"));
	    	for(int l=0;l<cols.size();l++)
	    	{
	    		String td = cols.get(l).getText();
	    		System.out.print(td);
	    	}
	    	System.out.println();
	    }
	     
	     
	}

}
