package com.practise;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertclass {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://secure.aponline.gov.in/CitizenPortal/UserInterface/Citizen/LoginForm.aspx";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Wait<WebDriver> wt = new WebDriverWait(driver,30);
		//wt.until(ExpectedConditions.presenceOfElementLocated(By.name("userId")));
		//FluentWait wt= new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS);
		//FluentWait wt= new FluentWait(driver).pollingEvery(30,TimeUnit.SECONDS);
		//FluentWait wt= new FluentWait(driver).ignoring(NoSuchElementException.class);
		driver.findElement(By.name("userId")).sendKeys("swetha");
		driver.findElement(By.id("ImageButton1")).click();
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();

	}

}
