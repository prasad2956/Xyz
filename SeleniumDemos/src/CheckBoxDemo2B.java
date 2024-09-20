import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2B 
{

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.calculator.net/mortgage-calculator.html");
	WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/form/table/tbody/tr[6]/td/label/span"));
	boolean actualcheckboxisdisplayed=checkbox.isDisplayed();		
	boolean expectedcheckboxisdisplayed=true;
	if(actualcheckboxisdisplayed==expectedcheckboxisdisplayed)
	{
		System.out.println("chickbox is displayed");
		
	}
	else
	{
		System.out.println("chickbox is not displayed");
	}
	boolean actualcheckboxisenabled=checkbox.isEnabled();
	boolean expectedcheckboxisenabled=true;
	if(actualcheckboxisenabled==expectedcheckboxisenabled)
	{
		System.out.println("chickbox is enabled");
	}
	else
	{
		System.out.println("chickbox is not enabled");
	}
	boolean actualcheckboxisselected=checkbox.isSelected();
	boolean expectedcheckboxisselected=true;
	if(actualcheckboxisselected==expectedcheckboxisselected)
	{
		System.out.println("chickbox is selected");
	}
	else
	{
		System.out.println("chickbox is not selected");
	}
	checkbox .click();
	boolean actualcheckboxisselectedforafterclick=checkbox.isSelected();
	boolean expectedcheckboxisselectedforafterclick=true;
	if(actualcheckboxisselectedforafterclick==expectedcheckboxisselectedforafterclick)
	{
		System.out.println("chickbox is selectedforafterclick");
	}
	else
	{
		System.out.println("chickbox is not selectedforafterclick");
	}


	}

}
