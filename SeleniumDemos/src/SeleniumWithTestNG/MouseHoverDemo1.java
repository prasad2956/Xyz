package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo1 
{
	@Test
  public void funA()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	 WebElement flag = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[2]"));
	 Actions act = new Actions(driver);
	 act.moveToElement(flag);
	 System.out.println("Done");
  }
}
