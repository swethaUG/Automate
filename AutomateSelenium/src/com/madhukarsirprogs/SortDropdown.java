package com.madhukarsirprogs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortDropdown {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		Select sc = new Select(country);
		List<WebElement> option = sc.getOptions();
		List<String> originallist = new ArrayList();
		for(WebElement e:option)
		{
			originallist.add(e.getText());
		}
		System.out.println();
		List<String> templist = originallist;
		System.out.println("original list before sorting is"+originallist);
		Collections.sort(templist);
		System.out.println("original list after sorting"+originallist);
		System.out.println("temporary list is"+templist);
		 Assert.assertEquals(templist, originallist);
		 System.out.println("options is in ascending order");
		

	}

}
