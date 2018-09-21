package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Droplist {
	
	public static void selectvalue(WebElement bday,String value)
	{
		Select bd=new Select(bday);
		bd.selectByVisibleText(value);
	}
public static void main(String args[])
{
	
	Browseropen.open();
	/*
	Browseropen.driver.get("https://www.fb.com");
	WebElement d=Browseropen.driver.findElement(By.id("day"));
	WebElement m=Browseropen.driver.findElement(By.id("month"));
	WebElement y=Browseropen.driver.findElement(By.id("year"));
	
	Droplist.selectvalue(d,"12");
	Droplist.selectvalue(m,"Mar");
	Droplist.selectvalue(y,"1990");*/
	Browseropen.driver.get("file:///D:/study%20materials/testing/sd.html");
	
	
	
}
}



