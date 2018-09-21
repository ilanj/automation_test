package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
 
public class Myntra {
 
   public static void main(String[] args) throws Exception {
 
      // Initialize WebDriver
	   System.setProperty("webdriver.gecko.driver","./BrowserDrivers/geckodriver.exe");
	   FirefoxProfile ffprofile = new FirefoxProfile();
	   ffprofile.setPreference("dom.webnotifications.enabled", false);
	   WebDriver driver = new FirefoxDriver();
     
      // Wait For Page To Load
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      // Go to URL
      driver.get("http://www.myntra.com/");
 
      // Maximize Window
     // driver.manage().window().maximize();
 
      // Mouse Over On " Men link "
      Actions act = new Actions(driver);
      By testlink = By.linkText("Men");
      WebElement test = driver.findElement(testlink);
      act.moveToElement(test).build().perform();
      Thread.sleep(5000);
      // Click on " bags & backpacks " link
      driver.findElement(By.linkText("Bags & Backpacks")).click();
 
      // Click on the categories - Bag-packs
      driver.findElement(By.xpath("//*[text()='Categories']//following::li[1]/label")).click();
      Thread.sleep(7000);
      // Mouse Hover on the 1st bag
      Actions sel = new Actions(driver);
      Thread.sleep(5000);
      sel.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/main/div[2]/div[2]/div/div[2]/section/ul/li[1]/a/img"))).build().perform();
 
      // Click on the "Add to Bag" icon of the 1st bag
      driver.findElement(By.xpath("html/body/div[2]/div/main/div[2]/div[2]/div/div[2]/section/ul/li[1]/div[3]/span[2]/span")).click();
 
      // add to  cart
      Actions mov = new Actions(driver);
      mov.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/main/div[2]/div[2]/div/div[2]/section/ul/li[1]/div[2]/div[2]/button"))).click().build().perform();
      Thread.sleep(2800);
      // Click on cart
      driver.findElement(By.xpath("html/body/div[1]/div/div/header/div[2]/div[2]/a/span[1]")).click();
      Thread.sleep(2800);
      // delete on cart
      driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div[1]/div[4]/div[1]/div[2]/div[7]/div/span[1]/span")).click();
 
      // Closing current driver window
      driver.close();
   }
}