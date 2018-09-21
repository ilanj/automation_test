package selenium;
import java.nio.file.*;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.util.Scanner;
public class Pondiuni {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		int i;
		int start,end;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the last 3 digits of start and end reg no");
		start=in.nextInt();
		end=in.nextInt();
		Browseropen.open();
		String d="Browseropen.driver";
		Browseropen.driver.get("http://result.pondiuni.edu.in/candidate.asp");
		
		//WebElement degree=Browseropen.driver.findElement(By.id("cmbdegree"));
		//WebElement sem=Browseropen.driver.findElement(By.id("cmbexamno"));
		
		
		for(i=start;i<=end;i++)
		{
			//Thread.sleep(3000);
			Browseropen.driver.findElement(By.id("txtregno")).sendKeys("16tc1"+i);
			WebElement degree=Browseropen.driver.findElement(By.id("cmbdegree"));
			Select degopt=new Select(degree);
			
			degopt.selectByVisibleText("BTHEC");
			WebElement sem=Browseropen.driver.findElement(By.id("cmbexamno"));
			
			Select semopt=new Select(sem);
			semopt.selectByVisibleText("Second");
			Browseropen.driver.findElement(By.id("button1")).click();
			//Thread.sleep(5000);
			File src= ((TakesScreenshot)Browseropen.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:/study materials/testing/screenshots/16TC1"+i+".png"));
			Browseropen.driver.get("http://result.pondiuni.edu.in/candidate.asp");
			System.out.println(Browseropen.driver.findElement(By.xpath("/html/body/form/strong/font/font/table[4]/tbody/tr/td/font/b/b/font")).getText());
			

			
		}
		
		
	}

}
