package DDFWDemo1;

import org.testng.annotations.Test;

public class TestNGInvokDemo1 
{
	@Test(invocationCount = 3)
	public void funA() 
	   {
		 System.out.println("funA of TestNGInvokDemo1");  
	   }
}
