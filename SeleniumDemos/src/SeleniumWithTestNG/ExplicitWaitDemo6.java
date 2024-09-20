package SeleniumWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo6 
{
	@Test
	public void funA()  
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement flag = driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_LBI0T1']"));
		flag.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentHolder_lbModels_10_D']")));
		WebElement flag2 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_RGB_D']"));
		flag2.click();

		WebElement bluetooth = driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_LBI1T1']"));
		bluetooth.click();
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='ContentHolder_lbModels_LBI26T1']")));
		WebElement model = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		model.click();
		System.out.println("done");

	}
}
