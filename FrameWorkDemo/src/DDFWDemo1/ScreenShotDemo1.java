package DDFWDemo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNGUtils;
import org.testng.annotations.Test;

public class ScreenShotDemo1 
{
	@Test
    public void ScreenShotDemo() throws InterruptedException, IOException
    {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	Thread.sleep(5000);
    	TakesScreenshot ScreenShot = (TakesScreenshot) driver;
    	File source = ScreenShot.getScreenshotAs(OutputType.FILE);
    	File target = new File("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo\\ScreenShot\\text1.png");
    	FileUtils.copyFile(source, target);
    	System.out.println("Done");
    }
}
