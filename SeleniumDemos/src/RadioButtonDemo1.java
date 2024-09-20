import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1
{

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.findElement(By.xpath("//input[@name='tripType'][1] "));

	}

}
