package basics;
import java.util.List;

//programmed after css interview
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setc {
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver","./BrowserDrivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.tnstc.in/");
	driver.findElement(By.xpath("html/body/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[7]/td[2]/a")).click();
	}
}
