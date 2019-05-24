package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkAnduncheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="https://login.salesforce.com";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     Thread.sleep(2000);
	     //driver.findElement(By.name("rememberUn")).click();
	     driver.findElement(By.xpath("//*[@id='rememberUn']")).click();

	}

}
