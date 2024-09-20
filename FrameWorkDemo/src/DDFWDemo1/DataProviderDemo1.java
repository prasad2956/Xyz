package DDFWDemo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 
{
	@Test
  public void funA(int a)
  {
	  System.out.println("funA of DataProviderDemo1");
	  System.out.println(a);
  }
	@DataProvider
	public Object[][] setData()
	{
		Object[][] obj = new Object[3][1];
 
		return obj;
	}
}
