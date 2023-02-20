package websitepractice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basetest {

	public WebDriver driver;
		public WebDriver browser() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fls = new FileInputStream("D:\\Eclipse Workspace\\MyPractice\\globaldata.properties");
		prop.load(fls);
		//prop.getProperty("browser");
		String browsername= prop.getProperty("browser");
		
	    if(browsername.equalsIgnoreCase("Chrome"))
		{
		
	System.setProperty("Webdriver.Chrome.driver", "D:\\Software Testing\\chromedriver.exe");
	driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			//edge
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			// firefox
		}
		
		driver.manage().window().maximize();
		return driver;
			}
	
	public  websiteopening launchingbrowser() throws IOException
	{
		driver =browser();
		websiteopening starting = new websiteopening(driver);
        // Opening URL:
		starting.urlopening();
		return starting;
	}

	
}
