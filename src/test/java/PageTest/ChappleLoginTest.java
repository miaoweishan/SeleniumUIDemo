package PageTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.BrowserDriver;
import page.ChappleLoginPage;

public class ChappleLoginTest {
	private BrowserDriver browserDriver = new BrowserDriver();
	private ChappleLoginPage loginpage;
	private WebDriver webdriver;
	private String url="http://test-chappie.mandofin.com/new/index.html#/login?url=%2Fmng";
	
	@BeforeClass
	public void setUp() {
		this.webdriver = browserDriver.getWebDriver();
		
	}
	
	@Test
	public void loginSuccessTest() throws InterruptedException {
		loginpage = new ChappleLoginPage(webdriver, url);
		String actual = loginpage.loginSuccess("admin", "123456");
		System.out.println("actual: "+actual);
		assertEquals(actual, "admin");
	}

//	@AfterClass
//	public void setDown() {
//		webdriver.close();
//	}
}
