package com.madhukarsirprogs;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapshots {

	public static void main(String[] args) throws IOException {
WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		Date dt = new Date();
		System.out.println(dt);
		DateFormat f1 = new SimpleDateFormat("YYY/MM/DD HH:MM:SS");
		System.out.println(f1.format(dt));
		File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //FileUtils.copyFile(file1, new File("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/snapsdefects/"+f1.format(dt)+".png"));
		
	}

}
