package com.madhukarsirprogs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender1 {

	public static void main(String[] args) {
		 WebDriver driver=null;
			String url="https://www.justdial.com/Travel/Train-Booking";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id("departDate")).click();
			String title = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div")).getText();
			System.out.println(title);
			WebElement mytable = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table"));
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
			
			WebElement mytbody = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody"));
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
			String title1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div")).getText();
			System.out.println(title1);
			WebElement mytable1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table"));	
			List<WebElement> rows2 = mytable1.findElements(By.tagName("tr"));
			for(int m=0;m<rows.size();m++)
			{
				List<WebElement> cols2 = rows2.get(m).findElements(By.tagName("th"));
				for(int j=0;j<cols2.size();j++)
				{
					String data2 = cols2.get(j).getText();
					System.out.print(data2+"");
				}
				System.out.println();
			}
			WebElement mytbody1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody"));
			List<WebElement> rows3 = mytbody1.findElements(By.tagName("tr"));
			for(int n=0;n<rows3.size();n++)
			{
				List<WebElement> cols3 = rows3.get(n).findElements(By.tagName("td"));
				for(int p=0;p<cols3.size();p++)
				{
					String data1 = cols3.get(p).getText();
					System.out.print(data1 +""  );
				}
				System.out.println();
			}
	}
}
