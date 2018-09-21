package TestNG;



import selenium.Browseropen;

import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;

class First
{
	@AfterClass
	void close()
	{
		Browseropen.driver.close();
	}
	@BeforeMethod
	public void launchBrowser()
	{
	Browseropen.open();
	}
	@Test 
	public void passurl()
	{
		Browseropen.open();
		Browseropen.driver.get("http://www.fb.com");
	}
	@Test
	void nexturl()
	{
		Browseropen.driver.get("http://www.google.com");	
	}
	
}
