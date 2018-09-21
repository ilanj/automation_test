package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Fb {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		boolean b;
		driver.navigate().to("http://fb.com");
		Actions act=new Actions(driver);
		
		driver.findElement(By.id("u_0_7")).sendKeys("Ila");
		act.sendKeys(Keys.TAB).release().sendKeys("jaya").perform(); //surname
		act.sendKeys(Keys.TAB).sendKeys("ila@gmail.com").perform(); //mobile no or email
		act.sendKeys(Keys.TAB).sendKeys("ila@gmail.com").perform(); //reenter email
		act.sendKeys(Keys.TAB).sendKeys("qwOd56$5").perform();// pass
		//ddddddddaaaaaaaaaaaatttttttttteeeeeeeeeeeeeeeee
		WebElement day=driver.findElement(By.id("day"));
		Select selday=new Select(day);
		act.moveToElement(day).click().perform();
		selday.selectByVisibleText("8");
		//mmmmmmmmmmmmmmmmmmmmmmmmoooooooonnnnnnnnnntttttttttthhhhhhhhhhhhhhhh
		WebElement month=driver.findElement(By.id("month"));
		Select selmonth=new Select(month);
		act.moveToElement(month).click().perform();
		selmonth.selectByVisibleText("Mar");
		//yyyyyyyyyeeeeeeeaaaaaaaarrrrrrrrrrrrrrrrrrrrrr
		WebElement year=driver.findElement(By.id("year"));
		Select selyear=new Select(year);
		act.moveToElement(year).click().perform();
		selyear.selectByVisibleText("1990");
		//Thread.sleep(5000);
		//rrraaaaadddddddddio button
		driver.findElement(By.xpath("//*[@id=\"u_0_n\"]/span[2]/label")).click();
		b=driver.findElement(By.xpath("//*[@id=\"u_0_n\"]/span[2]/label")).isEnabled();//can also use if
		System.out.println(b);
		//sccreeenshhottt
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:/screenshots/error.png"));
}
}
