//create script to uncheck 2nd checkbox in "http://echoecho.com/htmlforms09.htm" page

package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://echoecho.com/htmlforms09.htm";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click();
        
	}

}
