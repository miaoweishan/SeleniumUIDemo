package PageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.BrowserDriver;
import page.BaiduLoginPage;
/*
 * 百度页面登录
 */
public class BaiduLoginTest {
	private BrowserDriver browserDriver = new BrowserDriver();
	private BaiduLoginPage baiduLoginPage;
	private WebDriver webDriver;
	private String url="https://www.baidu.com/";
	
	private static String username="miaoweishan9";
	private static String password="miao33";
	
	@BeforeTest
	public void setUp() {
		webDriver = browserDriver.getWebDriver();
		
	}
	
	@Test
	public void baiduLoginSuccess() throws InterruptedException {
		baiduLoginPage = new BaiduLoginPage(webDriver, url);
		baiduLoginPage.loginSuccess(username, password);
	}
	
	
	public void setDown() {
		
	}

}
