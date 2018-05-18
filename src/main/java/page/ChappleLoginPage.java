package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChappleLoginPage {
	private static String logintitle_xpath = "//div/div[2]/div/div[2]/div[3]/button";
	private static String username_xpath = "//div/div[2]/div/div[2]/div[1]/input";
	private static String pastword_xpath = "//*[@id=\"userPwd\"]/input";
	private static String DLButton_xpath = "//div/div[2]/div/div[2]/div[3]/button";
	private static String DLUser_xpath = "//div/div[1]/div/div/span[2]";
	
	private WebDriver webDriver;
	private String url;
	
	public ChappleLoginPage(WebDriver webDriver, String url) {
		this.webDriver = webDriver;
		this.url = url;
		this.webDriver.get(url);
	}
	
	public String loginSuccess(String username,String password) throws InterruptedException {
		//显性等待
		(new WebDriverWait(webDriver, 30)).until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(logintitle_xpath)));
		this.webDriver.findElement(By.xpath(username_xpath)).clear();
		this.webDriver.findElement(By.xpath(pastword_xpath)).clear();
		this.webDriver.findElement(By.xpath(username_xpath)).sendKeys(username);
		this.webDriver.findElement(By.xpath(pastword_xpath)).sendKeys(password);
		Thread.sleep(500);
		this.webDriver.findElement(By.xpath(DLButton_xpath)).click();
		
		String resStr = this.webDriver.findElement(By.xpath(DLUser_xpath)).getText().toString();
		return resStr;
		
	}

}
