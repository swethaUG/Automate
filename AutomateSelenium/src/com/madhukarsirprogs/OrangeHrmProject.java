package com.madhukarsirprogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrmProject {
	 WebDriver driver=null;
		public void setUp()
		{
			String url="http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php";
			System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		public void userLogin(String uname,String password)
		{
			driver.findElement(By.name("txtUserName")).sendKeys(uname);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			
		}
		public void tearDown()
		{
			driver.close();
		}
		public void report() throws InterruptedException
		{
			WebElement pim = driver.findElement(By.xpath("//span[contains(.,'PIM')]"));
			Actions act= new Actions(driver);
			act.moveToElement(pim).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(.,'Employee List')]")).click();
			System.out.println("Viewed EmployeeList");
		}
		public void logOut()
		{
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("logged out sucessfully");
		}

	public static void main(String[] args) throws InterruptedException {
		
		OrangeHrmProject hrm = new OrangeHrmProject();
		hrm.setUp();
		hrm.userLogin("admin","admin");
		hrm.report();
		hrm.logOut();
	    hrm.tearDown();
		

	}

}
