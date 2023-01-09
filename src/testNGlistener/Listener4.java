package testNGlistener;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners (testNGlistener.Listener3.class)
public class Listener4 {

	
@Test	
public void setup() {
	
	System.setProperty("webdriver.firefox.driver", " C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\geckodriver-v0.32.0-win32>\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	driver.get("https://www.javatpoint.com/java-tutorial");
}
	
	
@Test	
	
	public void login() {
	System.out.println("I am in side login");
}
	
@Test	

public void logout() {
System.out.println("I am in side logout");	
	
	
	
	
	
	
	
}	
	
}
