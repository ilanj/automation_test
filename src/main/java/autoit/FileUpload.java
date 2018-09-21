package autoit;


	import java.io.IOException;
	
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class FileUpload 
	{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.guru99.com/become-an-instructor.html");
	Thread.sleep(300);
	//WebElement frame=driver.findElement(By.xpath(".//*[@id='71343386835462']/div/ul"));
	driver.switchTo().frame(2);
	driver.findElement(By.id("input_1")).click();
	driver.findElement(By.id("input_1")).sendKeys("Gaurav");
	driver.findElement(By.id("input_2")).sendKeys("test.test@gmail.com");
	driver.findElement(By.id("input_3")).sendKeys("Gaurav gig  ggi ");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//*[@id='cid_7']/div/div/div/div[3]")).click();
	//driver.findElement(By.xpath(".//*[@id='cid_7']/div/div")).click();

	// below line execute the AutoIT script .
	Runtime.getRuntime().exec("./AutoIT/FU.exe");
	//driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");
	Thread.sleep(7000);
	driver.findElement(By.id("input_5")).click();
	driver.switchTo().defaultContent();
	//driver.close();
	}
	}


