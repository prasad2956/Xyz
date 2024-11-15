package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2 
{
	@Test
    public void dropDownTest() throws InterruptedException
    {
    	WebDriver	driver = new ChromeDriver();
    	driver.get("https://www.meghanabus.in/index.html");
    	driver.manage().window().maximize();
//       WebElement closethelightbox = driver.findElement(By.xpath("//img[@title='click to close']"));
//       closethelightbox.click();
       Thread.sleep(4000);
       WebElement managebookings = driver.findElement(By.xpath("//a[@title='Manage Bookings']"));
       managebookings.click();
       Thread.sleep(4000);
       WebElement searchbutton = driver.findElement(By.xpath("//button[@type='submit']"));
       searchbutton.click();
       Thread.sleep(4000);
       driver.switchTo().alert().accept();
       WebElement text = driver.findElement(By.xpath("//span[text( )='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
       String TextValue = text.getText();
       System.out.println("TextValue: "+TextValue);
       
       
    
    
    }
}
