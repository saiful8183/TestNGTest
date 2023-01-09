package testNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	
WebDriver ldriver;
	
	LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy (id = "user-name")
	WebElement txtusername;
	
	@FindBy (css = "#password")
	WebElement txtpassword;
	
	@FindBy (id="login-button")
	WebElement loginbtn;



	public void setUserName (String urname)
	{
		txtusername.sendKeys("problem_user");
	}
	
	public void setPassword (String password)
	{
		txtpassword.sendKeys("secret_sauce");	
	}
	
	public void clicklogin ()
	{
		loginbtn.click();	
	}
	
	}

