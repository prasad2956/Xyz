package SeleniumWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo3 
{
    @Test
	public void funA()  
	{
    WebDriver driver = new ChromeDriver();
    driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
   WebElement flag = driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_LBI0T1']"));
	flag.click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='ContentHolder_lbModels_LBI16T1']")));
	WebElement flag2 = driver.findElement(By.xpath("//td[@id='ContentHolder_lbModels_LBI16T1']"));
	flag2.click();
	System.out.println("done");
	}
}
