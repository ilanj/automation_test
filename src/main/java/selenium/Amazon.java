package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
	FirefoxProfile ffprofile=new FirefoxProfile();
	ffprofile.setPreference("dom.webnotifications.enabled", false);
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://amazon.in");
	Actions act=new Actions(driver);
	// build.perform will just point mouse without clicking on category
	Thread.sleep(2000);
	WebElement category=driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/div[1]/div/a/span[2]"));
	
	act.moveToElement(category).perform();
	Thread.sleep(2000);
	// build.perform will just point mouse without clicking on obiles,computers
	WebElement mobncom=driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[2]/span[4]"));
	act.moveToElement(mobncom).perform();
	Thread.sleep(500);
	//click on lintext all mobiles
	driver.findElement(By.linkText("All Mobile Phones")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia");
	//act.keyDown(Keys.RETURN).release().build().perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.RETURN).release().perform();
}
}
