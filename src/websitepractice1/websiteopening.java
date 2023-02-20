package websitepractice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class websiteopening extends abstractuse {
	public WebDriver driver;

	public websiteopening(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[value='radio1']")
	WebElement radio;

	public void urlopening() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	public void radiobutton() {
		radio.click();
	}

	@FindBy(id = "autocomplete")
	WebElement country;
	@FindBy(css = "li[class='ui-menu-item']")
	List<WebElement> countrylist;

	public void countryselection() throws InterruptedException {
		country.sendKeys("In");
		Thread.sleep(1000);
		List<WebElement> options = countrylist;
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Argentina")) {
				option.click();
				break;
			}
		}
	}

	@FindBy(css = "[id='dropdown-class-example']")
	WebElement dropdown;

	public void optionselection() {
		dropdown.click();
		Select S = new Select(dropdown);
		S.selectByVisibleText("Option3");
		S.getFirstSelectedOption().click();
	}

	@FindBy(css = "[id='checkBoxOption2']")
	WebElement checkbox;

	public void checkboxselection() {
		checkbox.click();
	}

	@FindBy(id = "openwindow")
	WebElement wndo;

	public void windowswitcher() {
		wndo.click();
		Set<String> wndow = driver.getWindowHandles();
		Iterator<String> it = wndow.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
	}

	@FindBy(id = "opentab")
	WebElement tab;

	public void tabswitching() {
		tab.click();
		Set<String> Wh = driver.getWindowHandles();
		ArrayList<String> tab = new ArrayList<String>(Wh);
		driver.switchTo().window(tab.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tab.get(0));
		System.out.println(driver.getTitle());
	}

	@FindBy(id = "name")
	WebElement name;
	@FindBy(id = "confirmbtn")
	WebElement confirm;
	@FindBy(id = "alertbtn")
	WebElement alert;

	public void alerts() {
		name.sendKeys("Jai Ho");
		confirm.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		alert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

	@FindBy(name = "show-hide")
	WebElement hide;
	@FindBy(id = "hide-textbox")
	WebElement txtbox;

	public void hidebtn() {
		hide.sendKeys("Hello there");
		txtbox.click();
	}

	@FindBy(id = "mousehover")
	WebElement mse;
	@FindBy(linkText = "Top")
	WebElement top;

	public void hovermosuse() {
		WebElement mouse = mse;
		Actions a = new Actions(driver);
		a.moveToElement(mouse).build().perform();
		top.click();
	}

	@FindBy(css = "[id='courses-iframe']")
	WebElement frm;

	public void frame() {
		WebElement frame = frm;
		driver.switchTo().frame(frame);
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent(); // getting out of the frame.
	}

	@FindBy(id = "gf-BIG")
	WebElement gif;
	@FindBy(tagName = "a")
	WebElement link;

	public void footerlinksize() {
		WebElement footer = gif;
		int number = footer.findElements(By.tagName("a")).size();
		System.out.println(number);
	}

}
