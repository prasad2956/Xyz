package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo2 
{

	@Test 
 public void dropDownTest () throws InterruptedException
 {
	 WebDriver	driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	WebElement dropDownReturn = driver.findElement(By.xpath("//select[@name='toPort']"));
	Select select = new Select(dropDownReturn);
	select.selectByIndex(5);
	System.out.println("Done");
	
	Thread.sleep(5000);
	select.selectByVisibleText("Paris");
	Thread.sleep(5000);
	select.selectByValue("Acapulco");
	
	System.out.println("Done");
 }

	
	

}
