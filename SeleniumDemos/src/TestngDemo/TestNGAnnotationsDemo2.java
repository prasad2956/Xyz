package TestngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotationsDemo2 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestNGAnnotationsDemo2");
  }
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod of TestNGAnnotationsDemo2");  
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass of TestNGAnnotationsDemo2");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("afterTest of TestNGAnnotationsDemo2");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("afterSuite of TestNGAnnotationsDemo2");
  }

}
