package SeleniumWithTestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksCountDemo1A 
{
	@Test
	public void linksCount ()
	{
	WebDriver	driver = new ChromeDriver();
	driver.get("https://www.bbc.com/");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int allLinksCount = allLinks.size();
	System.out.println("allLinksCount :" +allLinksCount);
	System.out.println("DOne");
	}
	 
	 
}
