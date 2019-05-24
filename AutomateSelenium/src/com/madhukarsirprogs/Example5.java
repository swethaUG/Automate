//write script to select one by one radiobutton in FB-home page and also read visibletext of each radiobuttonpackage
package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		//*[@id="u_0_z"]/span[1]/label
		//driver.findElement(By.xpath("//*[@id='u_0_z']/span[2]/label")).click();
		
		List<WebElement> radios = driver.findElements(By.className("_58mt"));
		System.out.println("Number of radio Buttons"+radios.size());
		for(WebElement radio : radios)
		{
			String radioTxt = radio.getText();
			System.out.println(radioTxt);
			radio.click();
		}

	}

}
