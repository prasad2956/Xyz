package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExplicitWaitDemo2 
{
    @Test
	public void funA() throws InterruptedException 
	{
    WebDriver driver = new ChromeDriver();
    driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
   WebElement flag = driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_LBI0T1']"));
	flag.click();
	Thread.sleep(30000);
	WebElement flag2 = driver.findElement(By.xpath("//td[@id='ContentHolder_lbModels_LBI16T1']"));
	flag2.click();
	System.out.println("done");
	}
}
