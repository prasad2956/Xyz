package TestngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotationsDemo4 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestNGAnnotationsDemo4");  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod of TestNGAnnotationsDemo4");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod of TestNGAnnotationsDemo4");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestNGAnnotationsDemo4");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass of TestNGAnnotationsDemo4");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest of TestNGAnnotationsDemo4");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("afterTest of TestNGAnnotationsDemo4");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of TestNGAnnotationsDemo4");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("afterSuite of TestNGAnnotationsDemo4");
  }

}
