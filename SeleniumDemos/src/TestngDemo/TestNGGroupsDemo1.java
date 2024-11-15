package TestngDemo;

import org.testng.annotations.Test;

public class TestNGGroupsDemo1 
{

@Test(groups="sanity")
	public void funA()
	{
		System.out.println("funA of TestngDemo2 ");
	}
@Test(groups="sanity")
	public void funB()
	{
		System.out.println("funB of TestngDemo2 ");
	}
@Test(groups="Regression")
	public void funC()
	{
		System.out.println("funC of TestngDemo2 ");
	}
@Test(groups="Regression")
	public void funD()
	{
		System.out.println("funD of TestngDemo2 ");
	}
}
