package ExtentenTreportsDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo3 
{  
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentExtentLogger;
	public static ExtentTest childExtentLogger;
	
	@Test
  public void funA()
  {
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ASUS\\Desktop\\FrameWorkDemo\\extententreportsDemo1\\test3.html"); 
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("FunctionalFlow_1");
		childExtentLogger = parentExtentLogger.createNode("senario_1");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		childExtentLogger.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.RED));
		
		childExtentLogger = parentExtentLogger.createNode("senario_2");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		childExtentLogger.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case skiped", ExtentColor.GREY));
		extent.flush();
		System.out.println("Done");
  }
}
