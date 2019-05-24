package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Telugulink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		 String URl="https://www.google.co.in/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     WebElement link = driver.findElement(By.id("SIvCob"));
	     System.out.println("Before click on Telugu link");

			int n=driver.findElements(By.linkText("??????")).size();
			if(n !=0) {
				System.out.println("Number of Telugu link exist are: "+n);
			}
			else {
				System.out.println("Telugu link doesn't exist");
			}
			
			//to click on Telugu link
			driver.findElement(By.linkText("??????")).click();
			Thread.sleep(5000);
			System.out.println("After click on Telugu link");
			n=driver.findElements(By.linkText("??????")).size();
			if(n !=0) {
				System.out.println("Number of Telugu link exist are: "+n);
			}
			else {
				System.out.println("Telugu link doesn't exist");
			}
	     

	}

}
