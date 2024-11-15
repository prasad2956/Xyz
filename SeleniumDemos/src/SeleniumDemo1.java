import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 
{

	public static void main(String[] args)
	{
      WebDriver	driver = new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
     
   WebElement loginbutton = driver.findElement(By.xpath("//button[@id='loginbutton']"));  
   boolean actualloginbuttonisdisplayed=loginbutton.isDisplayed();
   boolean expectedloginbuttonisdisplayed=true;
   if(actualloginbuttonisdisplayed==expectedloginbuttonisdisplayed)
   {
	   System.out.println("login button is displayed");
   }
   else
   {
	   System.out.println("login button is not displayed");
   }
   boolean actualloginbuttonisenabled=loginbutton.isEnabled();
   boolean expectedloginbuttonisenabled=true;
   if(actualloginbuttonisenabled==expectedloginbuttonisenabled)
   {
	   System.out.println("login button is enabled");  
   }
   else
   {
	   System.out.println("login button is not enabled");
   }
   String actual=loginbutton.getAttribute("name");
   String expected="loginbutton";
   if(actual.equals(expected))
   {
	   System.out.println(" button is matched");  
   }
   else
   {
	   System.out.println(" button is not matched");
   }
   loginbutton.click();
}
}