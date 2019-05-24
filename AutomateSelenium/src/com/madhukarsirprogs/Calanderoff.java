package com.madhukarsirprogs;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calanderoff {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.findElement(By.id("j_username")).sendKeys("krishnaveni.daravath@rangsubbs.com");
		driver.findElement(By.id("j_password")).sendKeys("Rangsubbs");
		driver.findElement(By.id("LoginButton")).click();
		driver.findElement(By.xpath("//*[@id='Master']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Master']/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='id-date-range-picker-1']")).click();
		driver.findElement(By.xpath("/html/body/div[19]/div[3]/ul/li[8]")).click();
		WebElement mytable = driver.findElement(By.className("table-condensed"));
		WebElement header = mytable.findElement(By.xpath("/html/body/div[19]/div[1]/div/table/thead"));
		List<WebElement> header1 = header.findElements(By.tagName("select"));
		
		
		
		
		
		
	}

}
