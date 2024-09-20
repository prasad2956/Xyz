package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDemo1 
{
	@Test
	public void funA()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		// driver.switchTo().frame(0);
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(iframe1);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		System.out.println("Done");
	}
}
