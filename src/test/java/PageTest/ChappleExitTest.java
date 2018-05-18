package PageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.BrowserDriver;
import page.ChappleExitPage;

public class ChappleExitTest {
	private BrowserDriver browserDriver;
	private ChappleExitPage chappleExitPage;
	
	private WebDriver webDriver;
	private String url;
	
	@BeforeClass
	public void setUp() {
		this.webDriver = browserDriver.getWebDriver();
	}
	
	@Test
	public void chappleExittest() {
		chappleExitPage = new ChappleExitPage(webDriver,url);
		chappleExitPage.ChappleExitUp();

	}
	
//	@AfterClass
//	public void setDown() {
//		webDriver.close();
//	}
}
