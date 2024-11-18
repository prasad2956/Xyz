package FEDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethodsDemo1 

{
	static WebDriver driver;
	public void openBrowser(String browserName)//"Chrome", "edge" "Firefox" ...
	{
		if(browserName.equals("chrome"))
			new ChromeDriver();
		if(browserName.equals("edge"))
			new EdgeDriver();
		if(browserName.equals("FireFox"))
			new FireFoxDriver();
		
	}

	public void enterURL(String url)
	{

	}

	public void enterData(String locatorType,String locatorValue,String data)
	{

	}
	
	public void clcikOnElement(String locatorType,String locatorValue)
	{

	}


}
