package websitepractice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class originalScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// selecting the radio button:
		driver.findElement(By.cssSelector("[value='radio1']")).click();
		
		// Selecting country from suggestion countries:
		driver.findElement(By.id("autocomplete")).sendKeys("In");
	    Thread.sleep(1000);
	   List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item']"));	    
			   for(WebElement option : options )
	    {
	    	if(option.getText().equalsIgnoreCase("Argentina"))
	    	{ option.click();
	    	break;}}	
	
		// selecting the dropdown:
		driver.findElement(By.cssSelector("[id='dropdown-class-example']")).click();
		Select S = new Select(driver.findElement(By.cssSelector("[id='dropdown-class-example']")));
		S.selectByVisibleText("Option3");
		S.getFirstSelectedOption().click();
		
		// Selecting the other checkbox:
		driver.findElement(By.cssSelector("[id='checkBoxOption2'] ")).click();
		
		// switching to the other window:
		driver.findElement(By.id("openwindow")).click();
		Set<String>wndow =driver.getWindowHandles();
		Iterator <String> it= wndow.iterator();
		String parentwindow =it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		
		// Switching to the other tabs:
		driver.findElement(By.id("opentab")).click();
		Set<String>Wh =driver.getWindowHandles();
		ArrayList <String> tab = new ArrayList<String>(Wh);
		
		driver.switchTo().window(tab.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tab.get(0));
		System.out.println(driver.getTitle());
		
		// Switching to Alerts:
		driver.findElement(By.id("name")).sendKeys("jai ho");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		//Refreshing/Reloading page:
		driver.navigate().refresh();
		
		//Scrolling window to desired location:
		js.executeScript("window.scrollBy(0, 570)");
		
		// clicking on show hide button:
		driver.findElement(By.name("show-hide")).sendKeys("Hello there");
		driver.findElement(By.id("hide-textbox")).click();
		
		//Scrolling in the table:
		js.executeScript("document.querySelector('.tableFixHead').scrollTop= 80;");
		
		// hover mouse example:
		js.executeScript("window.scrollBy(0, 680)");
		WebElement mouse =driver.findElement(By.id("mousehover"));
		Actions a = new Actions(driver);
		a.moveToElement(mouse).build().perform();
		driver.findElement(By.linkText("Top")).click();
		
		// Handling frame:
		js.executeScript("window.scrollBy(0, 1800)");
		WebElement frame =driver.findElement(By.cssSelector("[id='courses-iframe']"));
		driver.switchTo().frame(frame);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent(); // getting out of the frame.
		
		// Getting the number of links in the footer section:
		WebElement footer= driver.findElement(By.id("gf-BIG"));
		int number =footer.findElements(By.tagName("a")).size();
		System.out.println(number);
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
