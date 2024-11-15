package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConformBoxDemo2 
{
	@Test
  public void comfortbox() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	 WebElement conformbox = driver.findElement(By.xpath("//button[@id='confirmBox']"));
	 conformbox.click();
	 Thread.sleep(4000);
	 driver.switchTo().alert().dismiss();
  }
}
