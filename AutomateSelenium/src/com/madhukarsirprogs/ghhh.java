package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ghhh {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
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
