package com.practise;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkBox {

	public static void main(String[] args) {
		WebDriver driver= null;
		 String URl="http://echoecho.com/htmlforms09.htm";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     //driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[2]")).click();
	     //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     //Wait<WebDriver> obj = new WebDriverWait(driver,30);
	     //obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class='table8']/input[2]")));
	    // FluentWait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	      driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click(); 
         
	}

}
