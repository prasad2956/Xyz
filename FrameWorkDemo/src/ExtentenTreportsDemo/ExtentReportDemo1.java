package ExtentenTreportsDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo1 
{  
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentExtentLogger;
	public static ExtentTest childExtentLogger;
	
	@Test
  public void funA()
  {
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo\\extententreportsDemo1\\test1.html"); 
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("test1");
		childExtentLogger = parentExtentLogger.createNode("senario_1");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		extent.flush();
		System.out.println("Done");
  }
}
