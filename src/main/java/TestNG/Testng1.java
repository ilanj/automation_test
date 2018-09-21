package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

public class Testng1 {
  @Test(groups={"tct"})
  public void f() {
	  System.out.println("test in testng1");
  }
  @BeforeMethod(groups={"mm","trar"})
  public void beforeMethod() {
	  System.out.println("before method in testng1");
  }

  @BeforeClass(groups={"tct"})
  public void beforeClass() {
	  System.out.println("before class in testng1");
  }
  @Test(groups={"mm"})
  public void f1() {
	  System.out.println("second test in testng1");
  }
  @Test(groups={"tct","trar"})
  public void f2() {
	  System.out.println("third test in testng1");
  }

}
