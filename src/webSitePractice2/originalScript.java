package webSitePractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class originalScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		// typing in the search box
		driver.findElement(By.cssSelector("[type='search']")).sendKeys("cucumber");
		
		Thread.sleep(1000);
		//increasing the number of cucumber:
		WebElement adding =driver.findElement(By.xpath("//a[@class='increment']"));
	     int i;
		for(i=1;i<5;i++)
		{
			adding.click();
		}
		//Adding to the cart:
		driver.findElement(By.xpath("//button[@type='button'] [.='ADD TO CART']")).click();
		// cart page actions:
		driver.findElement(By.cssSelector(".cart-icon")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button [text()='Place Order']")).click();
// Selecting Country and final placing order:
		WebElement country = driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"));
		country.click();
		Select s = new Select(country);
		s.selectByVisibleText("India");
		s.getFirstSelectedOption().click();
		
		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
