package SeleniumWithTestNG;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class WebTableDemo1 
{
	@Test
   public void webtable()
   {
	   WebDriver driver = new ChromeDriver();
	   driver .get("http://only-testing-blog.blogspot.com/2013/09/test.html");
	  WebElement text = driver .findElement(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[1]/td[1]"));
	  String TextValue = text.getText();
	  System.out.println("TextValue :"+TextValue);
	  List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr"));
	   int rowCount = allRows.size();
	   System.out.println(rowCount);
	   List<WebElement> columnCount = driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[1]/td"));
	   int allcolumnCountInFirstRow = columnCount.size();
	   System.out.println(allcolumnCountInFirstRow);
	   String xpath1 = "//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[";
	   String xpath2 = "]/td[";
	   String xpath3 = "]";
	   for(int i=1; i<=rowCount;i++)
	   {
		   for(int j=1; j<=allcolumnCountInFirstRow;j++)
		   {
			   String tableData = driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
			   System.out.println("\n"+tableData);
		   }
	   }
	   
	   
   }
}
