package webSitePractice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class websiteactions extends abstractcomponent {
	public WebDriver driver;

	public websiteactions(WebDriver driver)

	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[type='search']")
	WebElement search;
	@FindBy(xpath = "//a[@class='increment']")
	WebElement add;

	public void searchitem() {
		search.sendKeys("cucumber");

	}

	public void selectitem() {
		WebElement adding = add;
		int i;
		for (i = 1; i < 5; i++) {
			adding.click();
		}

	}
	
	public void driverclose()
	{
		driver.close();
	}

	@FindBy(xpath = "//button[@type='button'] [.='ADD TO CART']")
	WebElement addtocart;
	@FindBy(css = ".cart-icon")
	WebElement clickcart;
	@FindBy(xpath = "//button[normalize-space()='PROCEED TO CHECKOUT']")
	WebElement checkout;

	public void cartactions() {
		addtocart.click();
		clickcart.click();
		checkout.click();
	}

	@FindBy(xpath = "//button [text()='Place Order']")
	WebElement plcordr;
	@FindBy(css = "div[class='wrapperTwo'] div select")
	WebElement ctry;
	@FindBy(css = ".chkAgree")
	WebElement box;
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement proceed;

	public void finalsteps() {
		plcordr.click();
		WebElement country = ctry;
		country.click();
		Select s = new Select(country);
		s.selectByVisibleText("India");
		s.getFirstSelectedOption().click();
		box.click();
		proceed.click();

	}
	
}
