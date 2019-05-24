package com.madhukarsirprogs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassEx {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("swetha.uppara@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form"));
		Thread.sleep(5000);
		WebElement data = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		
		data.sendKeys("Gummala30586");
		WebElement d = driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[2]/div"));
		d.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.findElement(By.name("to")).sendKeys("swetha.uppara@gmail.com");
		//driver.findElement(By.xpath("//*[@id=':r9']")).sendKeys("swetha.uppara@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Uploading a file");
		driver.findElement(By.xpath("//*[@id=':qo']")).click();
		
		
		
	
		
		
		
		
		

	}

}
