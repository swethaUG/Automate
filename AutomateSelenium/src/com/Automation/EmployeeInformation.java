package com.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Selection;

public class EmployeeInformation {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=null;
		String url="http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php";
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		//*[@id="rightMenu"]
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='rightMenu']")));
		WebElement searchby = driver.findElement(By.xpath("//*[@id='loc_code']"));
        Select sc = new Select(searchby);
       List<WebElement> element = sc.getOptions();
       int size = element.size();
       System.out.println(size);
       for(int i=1;i<size;i++)
        	{
    	        //FileInputStream file = new FileInputStream("C:/Users/admin/Desktop/New folder (2)/AutomateSelenium/src/com/Readdata/empdetails.xlsx");
    	        //XSSFWorkbook workbook = new XSSFWorkbook(file);
    	        //XSSFSheet sheet = workbook.getSheet("Sheet1");
    	        //int rcount = sheet.getLastRowNum();
    	        //for(int k=0;k<rcount;k++)
    	       // {	
    	        //Row r = sheet.getRow(k);
    	        System.out.println(i);
    	        WebElement searchby1 = driver.findElement(By.xpath("//*[@id='loc_code']"));
    	        Select sc1 = new Select(searchby1);
    	        element = sc1.getOptions();
        		String e = element.get(i).getText();
        		System.out.println(e);
        		element.get(i).click();
        		if(element.get(i).isSelected())
        		{
        			driver.findElement(By.xpath("//*[@id='loc_name']")).clear();	
        		driver.findElement(By.xpath("//*[@id='loc_name']")).sendKeys("Swetha");
        		Thread.sleep(1000);
        		driver.findElement(By.xpath("//*[@id='standardView']/div[2]/input[2]")).click();
        		Thread.sleep(1000);
        		//driver.findElement(By.xpath("//*[@id='standardView']/div[2]/input[3]")).click();
        		WebElement table = driver.findElement(By.xpath("//*[@id='standardView']/table"));
        		List<WebElement> rows = table.findElements(By.tagName("tr"));
        		for(int j=1;j<rows.size();j++)
        		{
        			System.out.println(j);
        			List<WebElement> cols = rows.get(j).findElements(By.tagName("td"));
        			for(int l=0;l<cols.size();l++)
        			{
        				System.out.println(l);
        			String data = cols.get(0).getText();
        			System.out.print(data);
        			if(data.contains("swetha"))
        			{
        			   System.out.println("   match found");
        			}
        			else 
        			{
        			   System.out.println("  no match found");
        			}
        		
        			
        		}
        		
        	
        	   }
        	}
        	
        }
	}
      
	}
//}

