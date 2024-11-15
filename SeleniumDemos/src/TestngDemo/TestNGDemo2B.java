package TestngDemo;

import org.testng.annotations.Test;

public class TestNGDemo2B 
{

@Test(priority = 2)
	public void funA()
	{
		System.out.println("funA of TestngDemo2B");
	}
@Test(priority = 3)
	public void funB()
	{
		System.out.println("funB of TestngDemo2B ");
	}
@Test(priority = 4)
	public void funC()
	{
		System.out.println("funC of TestngDemo2B ");
	}
@Test(priority = 1)
	public void funD()
	{
		System.out.println("funD of TestngDemo2B ");
	}
}
