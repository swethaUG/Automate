package com.objectarray;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Firstarraydata extends Bclass {
	
		@DataProvider
		
			public Object[][] getValue()
			{
				Object[][] data = new Object[3][2];
				data[0][0] ="admin";
				data[0][1] ="swetha";
				data[1][0] ="admin";
				data[1][1] ="swetha";
				data[2][0] ="admin";
				data[2][1] ="admin";
				return data;
		   }
		@Test(dataProvider ="getValue")
		public void main(String Uname,String pwd) throws IOException, InterruptedException
		{
		   //<input name="txtUserName" type="text" class="loginText" tabindex="1">
			driver.findElement(By.name("txtUserName")).clear();
			driver.findElement(By.name("txtUserName")).sendKeys(Uname);
			//<input name="txtPassword" type="password" class="loginText" tabindex="2">
			driver.findElement(By.name("txtPassword")).clear();
			driver.findElement(By.name("txtPassword")).sendKeys(pwd);
			//<input type="Submit" name="Submit" value="Login" class="button" tabindex="3">
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(10000);
			driver.navigate().back();
			
	    }		
		   
			   
		
	

}



