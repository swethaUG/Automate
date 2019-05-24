package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender5 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.justdial.com/Travel/Train-Booking";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("departDate")).click();
		
		for(int m=1;m<=2;m++)
		{
		String title = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div["+ m +"]/div/div")).getText();
		System.out.println(title);
		if(!title.isEmpty())
		{
			
			WebElement mytable = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div["+ m +"]/table"));
			List<WebElement> rows = mytable.findElements(By.tagName("tr"));
			for(int i=0;i<rows.size();i++)
			{
				List<WebElement> cols = rows.get(i).findElements(By.tagName("th"));
				for(int j=0;j<cols.size();j++)
				{
					String data = cols.get(j).getText();
					System.out.print(data+"");
				}
				System.out.println();
			}
			WebElement mytbody = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div["+ m +"]/table/tbody"));
			List<WebElement> rows1 = mytbody.findElements(By.tagName("tr"));
			for(int k=0;k<rows1.size();k++)
			{
				List<WebElement> cols = rows1.get(k).findElements(By.tagName("td"));
				for(int l=0;l<cols.size();l++)
				{
					String data1 = cols.get(l).getText();
					System.out.print(data1 +""  );
				}
				System.out.println();
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
		
		
		
		

	}

}
