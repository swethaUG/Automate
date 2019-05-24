package com.madhukarsirprogs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITex1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// To initialize browser
		WebDriver driver=null;
		String url="https://www.filemail.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		//to enter To mail id
				driver.findElement(By.xpath("//li[@class='tagit-new']//input[@placeholder='To (email)']")).sendKeys("seleniumuser15");
				//to enter Subject
				driver.findElement(By.id("FilemailSubject")).sendKeys("uploading file using selenium");
				Thread.sleep(9000);
				//to click on "addBtn"
				driver.findElement(By.id("addBtn")).click();
				Thread.sleep(8000);
				Runtime.getRuntime().exec("D:/AutoitExample1.exe");
		
		
	}

}
