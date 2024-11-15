package DDFWDemo1;

import org.testng.annotations.Test;

public class DDFWDemo1 
{
	@Test
   public void funA() 
   {
	 System.out.println("funA of DDFWDemo1");  
   }
	@Test
   public void funB(int a) 
   {
	   System.out.println("funB of DDFWDemo1");
	   System.out.println(a);
   }
   
}
