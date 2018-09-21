package selenium;

import org.openqa.selenium.By;

public class Alert1 {
	public static void main(String args[]) throws InterruptedException
	{
		Browseropen.open();
		Browseropen.driver.get("file:///C:/Users/Ilanchezhian/Downloads/selenium%20attachements/ConfirmationAlert.html");
		//Browseropen.driver.switchTo().alert();
		Thread.sleep(5000);
		Browseropen.driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		//Browseropen.driver.switchTo().alert().click();
		Thread.sleep(5000);
		System.out.println(Browseropen.driver.switchTo().alert().getText());
		Browseropen.driver.switchTo().alert().accept();
		String s=Browseropen.driver.findElement(By.id("confirmdemo")).getText().toLowerCase();
		if(s.contains("ok"))
			System.out.println("u pressed ok using accept()");
		else
			System.out.println("u pressed cancel using dismiss()");
		Thread.sleep(5000);
		
		Browseropen.driver.close();
		
		
		
	}

}
