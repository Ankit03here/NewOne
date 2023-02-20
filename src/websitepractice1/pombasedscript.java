package websitepractice1;

import java.io.IOException;
import org.testng.annotations.Test;

public class pombasedscript extends basetest {

	@Test
	public void websitetesting() throws IOException, InterruptedException {

		websiteopening starting = launchingbrowser();

		// selecting the radio button:
		starting.radiobutton();

		// Selecting country from suggestion countries:
		starting.countryselection();

		// selecting the dropdown:
		starting.optionselection();

		// Selecting the other checkbox:
		starting.checkboxselection();

		// switching to the other window:
		starting.windowswitcher();

		// Switching to the other tabs:
		starting.tabswitching();

		// Switching to Alerts:
		starting.alerts();

		// Refreshing/Reloading page:
		driver.navigate().refresh();

		// Scrolling window to desired location:
		starting.windowscroll();

		// clicking on show hide button:
		starting.hidebtn();

		// Scrolling in the table:
		starting.tablescroll();

		// hover mouse example:
		starting.mousescroll();
		starting.hovermosuse();

		// Handling frame:
		starting.framescroll();
		starting.frame();

		// Getting the number of links in the footer section:
		starting.footerlinksize();

	}

}
