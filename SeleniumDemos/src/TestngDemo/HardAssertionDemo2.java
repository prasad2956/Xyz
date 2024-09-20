package TestngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo2 
{
	@Test
    public void funA()
    {
    	System.out.println("funA start");
    	String expectedData = "RBG Technologies";
    	String actualData = "RBG Technologies";
    Assert.assertEquals(actualData, expectedData,"Data is not matching");
    	System.out.println("funA Done");
    }
	@Test
    public void funB()
    {
    	System.out.println("funB start");
    	String expectedData = "RBG Technologies";
    	String actualData = "selenium";
    Assert.assertEquals(actualData, expectedData,"Data is not matching");
    	System.out.println("funB Done");
    }
	@Test
    public void funC()
    {
    	System.out.println("funC start");
    	String expectedData = "RBG Technologies";
    	String actualData = "selenium";
    Assert.assertNotEquals(actualData, expectedData);
    	System.out.println("funC Done");
    }
	@Test
    public void funD()
    {
    	System.out.println("funD start");
    	String expectedData = "RBG Technologies";
    	String actualData = "RBG Technologies";
    Assert.assertNotEquals(actualData, expectedData);
    	System.out.println("funD Done");
    }
	@Test
    public void funE()
    {
	   System.out.println("funE start");
	   Assert.assertTrue(true);
	   System.out.println("funE Done");
    }
	@Test
    public void funF()
    {
	   System.out.println("funF start");
	   Assert.assertTrue(false);
	   System.out.println("funF Done");
    }
	@Test
    public void funG()
    {
	   System.out.println("funG start");
	   Assert.assertFalse(false);
	   System.out.println("funG Done");
    }
	@Test
    public void funH()
    {
	   System.out.println("funH start");
	   Assert.assertFalse(true);
	   System.out.println("funH Done");
    }
    
	
		
		

	}


