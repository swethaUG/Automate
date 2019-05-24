package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioOwnclass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="http://echoecho.com/htmlforms10.htm";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     WebElement RadioButtonBlock = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
	     List<WebElement> group1_RadioButton = RadioButtonBlock.findElements(By.name("group1"));
	     for(int i=0; i<group1_RadioButton.size();i++)
	     {
	    	 Thread.sleep(2000);
	    	 group1_RadioButton.get(i).click();
	    	 for(int j=0;j<group1_RadioButton.size();j++)
	    	 {
	    		 System.out.println(group1_RadioButton.get(j).getAttribute("value")+" - "+ group1_RadioButton.get(j).getAttribute("checked"));
	    	 }
	     }
	     
	}

}
