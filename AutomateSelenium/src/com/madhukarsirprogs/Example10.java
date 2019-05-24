//write program to find number of values in "Country" dropdown and also print those values in console


	package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example10 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		Select sc = new Select(country);
		List<WebElement> options = sc.getOptions();
		System.out.println("Number of options are"+options.size());
		for(WebElement option:options)
		{
			
			String countryname= option.getText();
			System.out.println("Selected country name is"+countryname);
			
		}
		

	}

}
