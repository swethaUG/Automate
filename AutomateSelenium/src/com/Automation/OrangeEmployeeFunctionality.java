package com.Automation;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeEmployeeFunctionality {

	public static void main(String[] args) throws InterruptedException, Exception {
		
			WebDriver driver=null;
			String url="http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get(url);
			driver.manage().window().maximize();
			String LoginName="admin";
			String Password="admin";
			String Lastname="Gummala";
			String Middlename="Sagar";
			String Nickname="Swe";
			String FirstName="Swetha";
			driver.findElement(By.name("txtUserName")).sendKeys(LoginName);
			driver.findElement(By.name("txtPassword")).sendKeys(Password);
			driver.findElement(By.name("Submit")).click();
			WebElement a=driver.findElement(By.cssSelector("#pim > a > span"));
		    Actions act= new Actions(driver);
		    act.moveToElement(a).perform();
		    driver.findElement(By.cssSelector("#pim > ul > li:nth-child(2) > a > span")).click();
		    driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		    String ExpectedCode = driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
			System.out.println("Expected Employee code is"+ExpectedCode );
		    driver.findElement(By.id("txtEmpLastName")).sendKeys(Lastname);;
		    driver.findElement(By.name("txtEmpFirstName")).sendKeys(FirstName);
		    driver.findElement(By.id("txtEmpMiddleName")).sendKeys(Middlename);
		    driver.findElement(By.id("txtEmpNickName")).sendKeys(Nickname);
		    driver.findElement(By.id("btnEdit")).click();
		    driver.switchTo().defaultContent();
		    driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		    String ActualCode = driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
		    System.out.println("The Actual Employee Code is"+ActualCode);
		    try
		    {
		        if(ActualCode.equals(ExpectedCode))
		          {
			          System.out.println("Login validation is sucessfull,PASS");
		          }
		        else 
		          {
		    	   throw new Exception();
			      }
		        driver.findElement(By.xpath("//*[@id='btnEditPers']")).click();
		    }    
		   catch(Exception e)
		   {
	              System.out.println("Login validation is unsucessfull,Fail");
                   File Error_Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                   FileUtils.copyFile(Error_Screenshot,new File("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/screenshot/ErroeScreen.png"));
		   }
		  driver.switchTo().defaultContent();  
		  driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();  
		  //driver.quit();
		
	}
   
	
}
