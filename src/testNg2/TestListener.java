package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNg2.TestNG8.class)

public class TestListener {
WebDriver driver;
@Test
public void setup() {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

	

	
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	
}



@Test
public void test1() {
System.out.println("I am inside test 1");

}
@Test
public void test2() {
System.out.println("I am inside test 2");
//Assert.assertTrue(false);

}

@Test
public void test3() {
System.out.println("I am inside test 3");
//throw new SkipException("This is skipped");

}
@Test
public void test4() {
System.out.println("I am inside test 4");
}
	
	
}
