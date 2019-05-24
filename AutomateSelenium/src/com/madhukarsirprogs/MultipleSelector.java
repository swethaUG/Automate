package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelector {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		WebElement multilist =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/p[6]/select"));


		Select sc = new Select(multilist);
		if(sc.isMultiple())
		{
		sc.selectByValue("msperformance");
		sc.selectByValue("msmanual");
		sc.selectByValue("msselenium");
		//sc.selectByValue("msagile");
        List<WebElement> names = sc.getAllSelectedOptions();
		for(WebElement name:names)
		{
			System.out.println(name.getText());
		}
		
	}
		
	}

}
