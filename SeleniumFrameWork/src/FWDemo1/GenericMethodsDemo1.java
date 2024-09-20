package FWDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodsDemo1
{
	WebDriver driver;
	public void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriver driver = new  ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			WebDriver driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			WebDriver driver = new EdgeDriver();
		}
	}

	public void enterURL(String url)
	{ 

		driver.get(url);

	}


	public void enterData(String locatorType,String locatorValue,String data)
	{
		if(locatorType.equals("Xpath"))
		{
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
		}
		else if(locatorType.equals("id"))
		{
			driver.findElement(By.id(locatorValue)).sendKeys(data);
		}
	}

	public void clickOnElement(String locatorType,String value)
	{

	}
}
