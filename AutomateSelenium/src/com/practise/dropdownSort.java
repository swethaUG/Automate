package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownSort {

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
		List<String> originalList = new ArrayList();
		for(WebElement options:option)
		{
		      originalList.add(options.getText());
		}
		List<String> tempList= originalList;
		System.out.println(originalList);
		Collections.sort(tempList);
		System.out.println(tempList);
		boolean testPassed= false;
		//Assert.assertEquals(tempList,originalList);
		
		/*for(String Expected:originalList)
		{
			if(tempList.contains(Expected))
			{
				System.out.println("Search funstion verified");
			}
			else
			{
				System.out.println("search function verification failed");
			}
			
		}*/
	/*if( tempList.containsAll(originalList))
	{
		System.out.println("contains all values");
		testPassed = true;
		
	}*/
		Set<String> expectedSet = new HashSet<>(originalList);
		Set<String> actualSet = new HashSet<>(tempList);
		if(actualSet.equals(expectedSet))
		{
			System.out.println("contains all values");
			testPassed = true;
			
		}
		
		
	}

}
