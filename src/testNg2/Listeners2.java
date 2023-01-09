package testNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNg2.Listeners.class)
public class Listeners2 {



WebDriver driver;

@Test
public void test5() {
System.out.println("I am inside test 5");




System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

 driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");

}
@Test
public void test6() {
System.out.println("I am inside test 6");
//Assert.assertTrue(false);

}
@Test
public void test7() {
System.out.println("I am inside test 7");
//throw new SkipException("This is skipped");

}
@Test
public void test8() {
System.out.println("I am inside test 8");
}
}