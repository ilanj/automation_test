package selenium;

import org.openqa.selenium.By;

public class Alert {
public static void main(String args[]) throws InterruptedException
{
	Browseropen.open();
	Browseropen.driver.get("file:///C:/Users/Ilanchezhian/Downloads/selenium%20attachements/Alert.html");
	//Browseropen.driver.switchTo().alert();
	Thread.sleep(5000);
	Browseropen.driver.findElement(By.xpath("/html/body/fieldset/button")).click();
	//Browseropen.driver.switchTo().alert().click();
	Thread.sleep(5000);
	System.out.println(Browseropen.driver.switchTo().alert().getText());
	Browseropen.driver.switchTo().alert().accept();
	Thread.sleep(5000);
	Browseropen.driver.close();
	
	
	
}
}
