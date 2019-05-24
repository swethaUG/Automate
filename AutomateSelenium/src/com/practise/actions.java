package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions  {
	

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://amazon.in";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement searchtxt = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act = new Actions(driver);
		act.moveToElement(searchtxt).click().keyDown(Keys.SHIFT).sendKeys("demagaasoft").build().perform();
		
		//act.moveToElement(searchtxt).click().contextClick().build().perform();
	}

}
