//create script to select "Sept" value in "Month" dropdown when that values is not selected
package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example12 {

	public static void main(String[] args) {
		    WebDriver driver=null;
			String url="https://www.facebook.com/";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			Select monthlist = new Select(driver.findElement(By.id("month")));
			String actMonth = monthlist.getFirstSelectedOption().getText();
			if(actMonth.equals("sept"))
			{
				System.out.println("Expected month already exists");
			}
			else
			{
				monthlist.selectByVisibleText("Sept");
				System.out.println("WD selected required month");
			}

}
}