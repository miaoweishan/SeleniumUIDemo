package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChappleExitPage {
	private static String exit_xpaht = "//div/div[1]/div/div/i"; //退出按钮
	private static String OKButton_xpaht = "//div/div[4]/button[1]"; //确认退出
	private static String logintitle_xpath = "//div/div[2]/div/div[1]";
	
	private WebDriver wedDriver;
	private String url;
	
	public ChappleExitPage(WebDriver webDriver,String url) {
		this.wedDriver=webDriver;
		this.url=url;
//		this.wedDriver.get(url);
	}
	
	public String ChappleExitUp() {
		this.wedDriver.findElement(By.xpath(exit_xpaht)).click();
		this.wedDriver.findElement(By.xpath(OKButton_xpaht)).click();
		return null;
		
	}

}
