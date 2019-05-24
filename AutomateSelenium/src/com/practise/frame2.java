package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame2 {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="https://seleniumhq.github.io/selenium/docs/api/java/index.html";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		//System.out.println(frames.size());
		for(WebElement frame:frames)
		{
			String fname = frame.getAttribute("name");
			System.out.println(fname);
			if(fname.equalsIgnoreCase("classframe"))
			{
				driver.switchTo().frame("classFrame");
				driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
			}
		}

	}

}
