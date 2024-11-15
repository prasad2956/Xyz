package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHYRDemo1 
{
	@Test
   public void alert() throws InterruptedException
   {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
WebElement clickme = driver.findElement(By.xpath("//button[@id='alertBox']"));
clickme.click();
Thread.sleep(4000);
driver.switchTo().alert().accept();
   }
}
