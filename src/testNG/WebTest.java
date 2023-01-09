package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTest {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

		
	
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		}
	  
    @Test
     public void titleTest() {
     String title=driver.getTitle();
      System.out.println("The title is:"+title);
      
    }
    
    @Test
    public void currentUrl() {
        String url=driver.getCurrentUrl();
        System.out.println("The current url is:"+url);
        
    }
    
    
    @Test
    public void login() throws InterruptedException {
    
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
    	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    	driver.findElement(By.id("login-button")).click();
 
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
   }

	@Test
	public void logouttest() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		Thread.sleep(3000);
	}
    @AfterClass
    public void tearDown() {
        driver.close();
        
    }
	
	
}
