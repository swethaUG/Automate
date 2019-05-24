package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioOwnclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="http://echoecho.com/htmlforms10.htm";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     WebElement mytable = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
	     List<WebElement> rows = mytable.findElements(By.tagName("tr"));
	     //System.out.println(rows.size());
	     for(int i=0;i<rows.size();i++)
	     {
	    	 List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	    	 //System.out.println(cols.size());
	    	 for(int j=0;j<cols.size();j++)
	    	 {
	    		 List<WebElement> Radio_group1 = cols.get(j).findElements(By.name("group1"));
	    		 //System.out.println(Radio_group1.size());
	    		 for(int k=0;k<Radio_group1.size();k++)
	    		 {
	    			 Thread.sleep(2000);
	    			 String names =  Radio_group1.get(k).getAttribute("value");
	    			 System.out.println(names);
	    			 Radio_group1.get(k).click();
	    		 }
	    	 }
	     }
	}

}
