package prasad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLunch 
{

	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\prasad\\src\\prasad\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rbgtechnologies.com/");

	}

}
