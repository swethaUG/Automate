package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String url="https://www.google.com";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement searchtxt = driver.findElement(By.name("q"));
	    //Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.moveToElement(searchtxt).sendKeys("selenium").build().perform();
		searchtxt.sendKeys(Keys.ARROW_DOWN);
		searchtxt.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		/*Thread.sleep(2000);
		 searchtxt.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 searchtxt.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);

		 searchtxt.sendKeys(Keys.ARROW_DOWN);
		
		 Thread.sleep(2000);
		// searchtxt.sendKeys(Keys.BACK_SPACE);
		 searchtxt.sendKeys(Keys.ENTER);*/
		
		 
	}

}
