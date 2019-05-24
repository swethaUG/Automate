package com.practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoitscript1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=null;
		String url="https://www.filemail.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='tagit-new']//input[@placeholder='To (email)']")).sendKeys("seleniumuser15");
		driver.findElement(By.id("FilemailSubject")).sendKeys("uploading file using selenium");
		driver.findElement(By.id("addBtn")).click();
		Thread.sleep(8000);
		Runtime.getRuntime().exec("C:/Users/admin/Desktop/upload3.exe");
		//driver.findElement(By.xpath("//*[@class='gb_ya gbii']")).click();
		
	}

}
