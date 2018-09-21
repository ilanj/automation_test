package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng2 {
	 @Test(groups={"mm"})
	  public void f() {
		  System.out.println("test in testng2");
	  }
	  @BeforeMethod(groups={"rr","tct"})
	  public void beforeMethod() {
		  System.out.println("before method in testng2");
	  }
	  @BeforeClass(groups={"rr"})
	  public void beforeClass() {
		  System.out.println("before class in testng2");
	  }
	  @Test(groups={"mm"})
	  public void f1() {
		  System.out.println("second test in testng2");
	  }
	  @Test(groups={"tct"})
	  public void f2() {
		  System.out.println("third test in testng2");
	  }

}
