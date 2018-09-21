package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browseropen {
	public static WebDriver driver;

		public static void open()
	{
			Scanner in=new Scanner(System.in);
			System.out.println("enter the browser which u need to open");
			String browser;
			browser=in.next();
			switch(browser.toLowerCase())
			{ 
			case "chrome":
				System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver","C:/Users/Ilanchezhian/workspace/Selenium/WebDrivers/geckodriver.exe");
				driver=new FirefoxDriver();
				
				break;
			}
	}
	//---------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
