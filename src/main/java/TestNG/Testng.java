package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","./WebDrivers/geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Googl", driver.getTitle());
  }
}
