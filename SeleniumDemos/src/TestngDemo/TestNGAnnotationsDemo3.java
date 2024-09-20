package TestngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class TestNGAnnotationsDemo3 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestNGAnnotationsDemo3");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod of TestNGAnnotationsDemo3");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestNGAnnotationsDemo3");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest of TestNGAnnotationsDemo3");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of TestNGAnnotationsDemo3");
  }

}
