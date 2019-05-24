package com.swethaproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class neoconHome {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://neoconuser:N3oc0n2019@neocon2019.revalweb.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Home")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		File fo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fo, new File("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/neoconscreens/neoconHomeScreen.png"));
		
	}

}
