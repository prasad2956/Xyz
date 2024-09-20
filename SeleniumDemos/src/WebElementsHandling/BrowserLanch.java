package WebElementsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLanch 

{

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https:gmail.com");
	
	WebDriver driver1 = new FirefoxDriver();
	driver.get("https:gmail.com");
	WebDriver driver2 = new EdgeDriver();
	
	WebDriver driver3 = new InternetExplorerDriver();
	
	}

}
