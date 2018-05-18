package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 * 百度页面相关的元素定位操作
 */


public class BaiduLoginPage {
	private static String DL_text = "登录";//点击弹出登录页面
	
	private static String YHMDL_xpath = "//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]";
	private static String username_xpath="//*[@id=\"TANGRAM__PSP_10__userName\"]";//用户名输入框
	private static String password_xpath="//*[@id=\"TANGRAM__PSP_10__password\"]";//密码输入框
	private static String DLButton_xpath="//*[@id=\"TANGRAM__PSP_10__submit\"]";//登录按钮
	
	private WebDriver webDriver;
	private String url;
	
	public BaiduLoginPage(WebDriver webDriver,String url) {
		this.webDriver = webDriver;
		this.url = url;
		this.webDriver.get(url);
	}
	
	public String loginSuccess(String username,String password) throws InterruptedException {
		this.webDriver.findElement(By.linkText(DL_text)).click();
		Thread.sleep(2000);
		this.webDriver.findElement(By.xpath(YHMDL_xpath)).click();
		this.webDriver.findElement(By.xpath(username_xpath)).clear();
		this.webDriver.findElement(By.xpath(password_xpath)).clear();
		this.webDriver.findElement(By.xpath(username_xpath)).sendKeys(username);
		this.webDriver.findElement(By.xpath(password_xpath)).sendKeys(password);
		this.webDriver.findElement(By.xpath(DLButton_xpath)).click();
		return null;		
	}

}
