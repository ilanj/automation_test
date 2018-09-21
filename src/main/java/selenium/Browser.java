package basics;
import java.util.List;

//programmed after css interview
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//html input is in proj folder
public class Browser {
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","./BrowserDrivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ilanchezhian/Music/Desktop/table.html");
		Boolean status=driver.findElement(By.xpath("//th")).isDisplayed();
		System.out.println(status);
		//if(status)
		if(driver.findElement(By.xpath("//th")).isDisplayed())//both if throws no sch element fond exception
			System.out.println("element found");
		else
			System.out.println("element not found");
		System.out.println(driver.findElement(By.xpath("//th")).getText());
		List <WebElement> l=driver.findElements(By.xpath("//table//tr/td"));
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i).getText());
		
		System.out.println(l.size());
		//----------------------sing list to store single element
		//in list cannot use findelement-- should use findelements
		List <WebElement> l1=driver.findElements(By.xpath("//tjj"));
		if(l1!=null)//cannot use NULL- here list is used to avoid exception
			System.out.println("element found");
		else
			System.out.println("element not found");
		List <WebElement> l2=driver.findElements(By.xpath("//tr"));
		System.out.println("row size="+l2.size());
		List <WebElement> l3=l2.get(2).findElements(By.tagName("td"));//size of any column
		System.out.println("col size="+l3.size());
		driver.close();
		
	}

}
