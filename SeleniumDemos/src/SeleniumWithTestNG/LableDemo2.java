package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LableDemo2 
{
	@Test
  public void funA()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/Users/ASUS/Downloads/Iframe1%20(1).html");
	 // driver.switchTo().frame(1);
	 WebElement iframe1 = driver.findElement(By.xpath("/html/body/iframe[2]"));
	 driver.switchTo().frame(iframe1);
  }
}
