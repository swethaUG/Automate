package object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class rediffHomepage {
	@FindBy(linkText="Sign in")
	WebElement signin;
	public WebElement signIn(WebDriver driver)
	{
		return(signin);
	}

}
