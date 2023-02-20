package webSitePractice2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	public WebDriver driver;

	public WebDriver browserstart() throws IOException {
		Properties prop = new Properties();
		FileInputStream fl = new FileInputStream("D:\\Eclipse Workspace\\MyPractice\\globaldata.properties");
		prop.load(fl);
		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			// Edge
		} else if (browsername.equalsIgnoreCase("firefox")) {
			// firefox
		}

		driver.manage().window().maximize();
		return driver;
	}

	public websiteactions launchbrowser() throws IOException {
		driver = browserstart();
		websiteactions start = new websiteactions(driver);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		return start;
	}
	
}
