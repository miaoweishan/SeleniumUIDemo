package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {
	
	public static WebDriver webDriver;
	public BrowserDriver() {
//		System.setProperty("webdriver.firefox.marionette", "file/geckodriver.exe");
//		//实例化火狐浏览器
//		webDriver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "file/chromedriver.exe");
		//实例化Google浏览器
		webDriver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "file/MicrosoftWebDriver.exe");
//		webDriver = new EdgeDriver();
		
		//最大化浏览器f
		webDriver.manage().window().maximize();
		//设置隐形等待时间8s
		webDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); 
		
	}
	
	public static WebDriver getWebDriver() {
		return webDriver;
	}
	
	
	
//	public static void main(String[] args) {
//		BrowserDriver a = new BrowserDriver();
//	}

}
