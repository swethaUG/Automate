//TestScrip to display visible links in Orange Hrm
package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link1 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/index.php";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		List<WebElement> mylinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are"+mylinks.size());
		for(WebElement mylink:mylinks)
		{
			if(mylink.isDisplayed())
			{
				String link = mylink.getText();
				System.out.println(link);
			}
		}
	}

}
