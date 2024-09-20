package SeleniumWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaitDemo2 
{
	@Test
	public void funA()  
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement flag = driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_RBG0T1']"));
		flag.click();
		WebElement flag2 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		flag2.click();

		WebElement bluetooth = driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_LBI1T1']"));
		bluetooth.click();
		WebElement model = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		model.click();
		System.out.println("done");
}
}