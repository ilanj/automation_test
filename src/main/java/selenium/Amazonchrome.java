package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonchrome {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
		Thread.sleep(1500);
		//click on lintext all mobiles
		driver.findElement(By.linkText("All Mobile Phones")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia");
		//act.keyDown(Keys.RETURN).release().build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.RETURN).perform();
		Thread.sleep(7000);
		// check all check box
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[10]/div/li[2]/span/span/div/label/span/span"));
		checkbox.click();
		act.moveToElement(checkbox).click().build().perform();
	/*	if(!driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[10]/div/li[2]/span/span/div/label/span/span")).isSelected())
			driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[10]/div/li[2]/span/span/div/label/span/span")).click();
		else
			System.out.println("already checkbox selected"); */
		Thread.sleep(5000);
		
				
	}

}
