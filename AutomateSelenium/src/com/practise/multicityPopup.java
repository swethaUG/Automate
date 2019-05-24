package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multicityPopup {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://www.spicejet.com/";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Multicity']")).click();
		
		String text = driver.findElement(By.xpath("//*[@id='MultiCityModelPopup']/div/p[1]")).getText();
		System.out.println(text);
		driver.findElement(By.id("MultiCityModelAlert")).click();
	}

}
