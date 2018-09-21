package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	//public static WebDriver driver;

	public static void main(String args[]) {
		Browseropen.open();

		try // if the below lines were test case
		{
			String site = "https://sites.google.com/";
			String site1 = "https://www.facebook.com/";
			Browseropen.driver.get(site);
			Browseropen.driver.navigate().to("https://www.facebook.com");// both are same
			System.out.println(Browseropen.driver.getTitle());
			// System.out.println(driver.getWindowHandle());
			System.out.println(Browseropen.driver.getCurrentUrl());
			Browseropen.driver.navigate().back();
			System.out.println(Browseropen.driver.getCurrentUrl());
			Browseropen.driver.navigate().forward();
			System.out.println(Browseropen.driver.getCurrentUrl());
			if (Browseropen.driver.getCurrentUrl().equalsIgnoreCase(site1))
				System.out.println("url passed and equal");
			else
				System.out.println("url passed is unequal");
			/*driver.findElement(By.name("email")).sendKeys("jgmhg");
			driver.findElement(By.name("pass")).sendKeys("hshshshshsh");
			driver.findElement(By.id("loginbutton")).click();*/
			Browseropen.driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("jgmhg");
			 Actions act = new Actions(Browseropen.driver);
			 
			 Thread.sleep(2000);
			 act.sendKeys("hshshshshsh");
			Browseropen.driver.findElement(By.name("pass")).sendKeys("hshshshshsh");
			//Browseropen.driver.findElement(By.id("loginbutton")).click();
			act.sendKeys(Keys.ENTER);
			Browseropen.driver.close();
			// driver.quit();

			System.out.println(" test case passed");
		} catch (Exception e) {
			System.out.println(e + " test case failed");
		}
	}

}
