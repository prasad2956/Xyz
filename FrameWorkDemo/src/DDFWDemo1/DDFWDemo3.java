package DDFWDemo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWDemo3 
{
	@Test(dataProvider ="setData" )
 public void funA(String username,String password) 
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	 System.out.println("done");
 } 
	 @DataProvider
		public Object[][] setData()
		{
			Object[][] obj = new Object[3][2];
			obj[0][0]="RBG";
			obj[0][1]="technologies";
			obj[1][0]="Selenium";
			obj[1][1]="java";
			obj[2][0]="API testing";
			obj[2][1]="rest Assured";
			return obj;
 }
}
