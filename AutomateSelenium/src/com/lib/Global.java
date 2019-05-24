package com.lib;

import org.openqa.selenium.WebDriver;

public class Global {
   
    
	public WebDriver driver;
	public String URL="http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php";
	public String UserName="admin";
	public String Password = "admin";
	public String text_Username="txtUserName";
	public String text_Password="txtPassword";
	public String text_SubmitButton="Submit";
	public String text_WelcomeMessage="//*[@id='option-menu']/li[1]";
			
}
