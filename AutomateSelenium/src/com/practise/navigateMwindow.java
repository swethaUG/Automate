package com.practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMwindow {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://gmail.com";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String pgtitle1 = driver.getTitle();
		System.out.println(pgtitle1);
		driver.findElement(By.linkText("Help")).click();
		Set<String> pgHandles = driver.getWindowHandles();
		Iterator<String> winhandles = pgHandles.iterator();
		String w1 =winhandles.next();
		String w2 =winhandles.next();
		System.out.println(w1);
		System.out.println(w2);
		driver.switchTo().window(w2);
		String pgTitle2=driver.getTitle();
		System.out.println(pgTitle2);
C
	}

}
