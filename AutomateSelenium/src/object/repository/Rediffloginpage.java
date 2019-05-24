package object.repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Rediffloginpage {
		@FindBy(id="login1")
		WebElement login;
		public WebElement logIn(WebDriver driver)
		{
			return(login);
		}
		@FindBy(id="password")
		WebElement Password;
		public WebElement password(WebDriver driver)
		{
			return(Password);
		}
		@FindBy(name="proceed")
		WebElement Go;
		public WebElement go(WebDriver driver)
		{
			return(Go);
		}
		

	}



