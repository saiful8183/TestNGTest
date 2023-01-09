package testNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {


	WebDriver driver;
		
		@BeforeClass
		
		void setup()
		{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\New folder\\chromedriver_win32");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}	
		@Test
		void login()
		
		{
			LoginPage ip= new LoginPage(driver);
			ip.setUserName("standard_user");
			ip.setPassword("secret_sauce");
			ip.clicklogin();



	}

}
