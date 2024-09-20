package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpWindowHandlingDemo1 
{
	@Test
  public void funA()
  {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-1642717023%3A1724651884355934&ddm=0");
    WebElement guestmodeLink = driver.findElement(By.xpath("//a[@href='https://support.google.com/chrome/answer/6130773?hl=en']"));
    guestmodeLink.click();
  }
}
