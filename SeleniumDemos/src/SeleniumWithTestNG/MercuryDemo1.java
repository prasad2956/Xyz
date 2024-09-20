 package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MercuryDemo1 
{
	@Test
	public void funA() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");

		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement loginText = driver.findElement(By.xpath("//h3[text( )='Login Successfully']"));
		System.out.println("loginText :"+loginText);
		String expectedTitle = "Login: Mercury Tours";
		String actualTitle = driver.getTitle();
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(actualTitle,expectedTitle);
		sAssert.assertAll();
	}
}
