package testNg4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNg4.Listener2.class)
public class Listener1  {

	WebDriver driver;
@Test
public void openbrowser() {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	
	}
@Test
public void signin() {
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
}
	
@Test
public void openbrowser2() {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");	
}
}