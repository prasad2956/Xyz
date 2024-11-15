package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo2 
{
	@Test
   public void funA()
   {
	   WebDriver driver = new ChromeDriver();
	   driver .get("https://money.rediff.com/gainers");
	  WebElement details = driver.findElement(By.xpath("//table[@class='dataTable']"));
     String Text = details.getText();
     System.out.println("Text :"+Text);
   }
}
