package selenium;

import org.openqa.selenium.By;

public class Alert2 {
	public static void main(String args[]) throws InterruptedException
	{
		Browseropen.open();
		Browseropen.driver.get("file:///C:/Users/Ilanchezhian/Downloads/selenium%20attachements/Prompt%20Alert.html");
		//Browseropen.driver.switchTo().alert();
		Thread.sleep(5000);
		Browseropen.driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		//Browseropen.driver.switchTo().alert().click();
		Thread.sleep(5000);
		
		Browseropen.driver.switchTo().alert().sendKeys("ilanche");
		Thread.sleep(2000);
		
		Browseropen.driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		System.out.println(Browseropen.driver.findElement(By.id("promptdemo")).getText());
		String s=Browseropen.driver.findElement(By.id("promptdemo")).getText().toLowerCase();
		
		String a[]=s.split(" ");
		System.out.println(a[1]);
		Browseropen.driver.close();
		
		
		
	}


}
