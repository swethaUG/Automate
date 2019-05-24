package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
		
			WebDriver driver= null;
			 String URl="https://www.w3schools.com/";
			 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.get(URl);
		     driver.findElement(By.linkText("Learn HTML")).click();
		     driver.findElement(By.linkText("HTML Tables")).click();
		     String cellData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
		     
		    // String cellData=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]")).getText();
		     System.out.println(cellData);
		     
	}

}
