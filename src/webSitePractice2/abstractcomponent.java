package webSitePractice2;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class abstractcomponent extends baseTest{
	WebDriver driver;

	public abstractcomponent(WebDriver driver) 
	{
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}

	public void time() throws InterruptedException {
		Thread.sleep(1000);
	}
	

}
