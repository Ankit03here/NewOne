package websitepractice1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class abstractuse extends basetest {
	public WebDriver driver;
	
	public abstractuse(WebDriver driver) {
		this.driver = driver;
		}
	public JavascriptExecutor js = (JavascriptExecutor) driver;
	public void windowscroll() 
	{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 570)");
	}

	public void tablescroll() 
	{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.tableFixHead').scrollTop= 80;");
	}

	public void mousescroll() 
	{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 680)");
	}

	public void framescroll() 
	{JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1800)");
	}

}
