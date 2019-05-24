//write script to click on "Sign up" button in FB-home page if that object is
//Enabled and read visibletext and "name" attribute  value of that element
package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		WebElement btnsignup = driver.findElement(By.xpath("//*[@id='u_0_11']"));
		String btntxt = btnsignup.getText();
		System.out.println("Object visibletext is"+btntxt);
		String btnname = btnsignup.getAttribute("name");
		System.out.println("Name attribute value is"+btnname);
		if(btnsignup.isEnabled())
		{
			System.out.println("Button is enabled");
			btnsignup.click();
		}
		else
		{
			System.out.println("Button is not enabled");
		}

	}

}
