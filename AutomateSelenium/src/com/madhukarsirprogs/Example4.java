//Create script to select unchecked checkboxes in a page 
package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://echoecho.com/htmlforms09.htm";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		
		List<WebElement> chks = driver.findElements(By.name("Checkbox"));
		int cnum = chks.size();
		System.out.println("No of checkBoxes are"+cnum);
		for(WebElement chk: chks)
		{
			if(!chk.isSelected())
			{
				chk.click();
			}
		}
		
		
	}

}
