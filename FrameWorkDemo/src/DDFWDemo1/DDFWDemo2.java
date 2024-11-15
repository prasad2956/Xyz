package DDFWDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDFWDemo2 
{
	@Test
 public void funA() throws InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	 System.out.println("done");
 }
}
