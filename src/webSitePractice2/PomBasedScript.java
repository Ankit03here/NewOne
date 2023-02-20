package webSitePractice2;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class PomBasedScript extends baseTest{
	ExtentReports extent;
	@BeforeMethod
	public void extentreport()
	{
		String path = System.getProperty("D:\\Eclipse Workspace\\MyPractice") + "\\report\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Website Actions");
		reporter.config().setDocumentTitle("Website Result");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ankit");
		}
	@Test
	public void werbsiteaction() throws IOException, InterruptedException
	{   ExtentTest test =extent.createTest("intital Demo"); 
		websiteactions start= launchbrowser();
		start.searchitem();
		start.time();
		start.selectitem();
		start.cartactions();
		start.time();
		start.finalsteps();
		start.driverclose();
		extent.flush();
	}

}
