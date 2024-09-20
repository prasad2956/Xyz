package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo1 
{

	@Test 
 public void dropDownTest () throws InterruptedException
 {
	 WebDriver	driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	WebElement dropDownReturn = driver.findElement(By.xpath("//select[@name='toMonth']"));
	Select select = new Select(dropDownReturn);
	select.selectByIndex(5);
	Thread.sleep(5000);
	select.selectByVisibleText("May");
	Thread.sleep(5000);
	select.selectByValue("12");
	
	System.out.println("Done");
 }

	
	

}
