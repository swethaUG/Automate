//Radio button with group
package com.madhukarsirprogs;

import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		WebElement myradio = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radio_group1 = myradio.findElements(By.name("group1"));
		System.out.println(radio_group1.size());
		for(int i=0;i<radio_group1.size();i++)
		{
			///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table
			//System.out.println(radio_group1.get(i).getAttribute("value"));
			radio_group1.get(i).click();
			System.out.println(radio_group1.get(i).getAttribute("value")+ "_"+radio_group1.get(i).getAttribute("Checked"));
			Thread.sleep(1000);
			/*for(int j=0;j<radio_group1.size();j++)
			{
			System.out.println(radio_group1.get(j).getAttribute("value")+ "_"+radio_group1.get(j).getAttribute("Checked"));
				
				
			}*/
		}
		/*List<WebElement> radio_group2 = myradio.findElements(By.name("group2"));
		System.out.println(radio_group2.size());
		for(int i=0;i<radio_group2.size();i++)
		{
			//System.out.println(radio_group2.get(i).getAttribute("value"));
			radio_group2.get(i).click();
			Thread.sleep(1000);
			for(int j=0;j<radio_group2.size();j++)
			{
			System.out.println(radio_group2.get(j).getAttribute("value")+ "_"+radio_group2.get(j).getAttribute("Checked"));
				
				
			}
		}*/

	}

}
