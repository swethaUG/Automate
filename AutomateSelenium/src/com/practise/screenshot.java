package com.practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= null;
		 String URl="https://www.rediff.com/";
		 System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URl);
	     //File Error_Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(Error_Screenshot,new File("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/screenshot/WrongAddEmployee.png"));
	     File Error_screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(Error_screenshot,new File("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/Defectosnaps/screen.png"));
	}

}
