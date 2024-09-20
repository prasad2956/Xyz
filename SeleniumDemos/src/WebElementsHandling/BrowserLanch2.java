package WebElementsHandling;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanch2

{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:gmail.com");
	}

}
