package com.practise;

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

public class screenshot1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver= null;
		 String URl="https://www.google.com";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     Date dt =  new Date();
	     System.out.println(dt);
	     DateFormat f1= new SimpleDateFormat("DD_MM_YYY HH_MM_SS");
	     File fo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(fo, new File("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/snapdefect/"+f1.format(dt)+".png"));
	     
	}

}
