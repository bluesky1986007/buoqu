package util;



import com.thoughtworks.selenium.Selenium;

import page.back.BackLoginPage;
import page.front.IndexPage;

/**
 * 博取项目公共方法
 * @author DELL
 *
 */
public class UtilBuoqu {
	
	/**
	 * 后台首页登入
	 * @param selenium
	 */
	public static void backLogin(Selenium selenium){
		
		selenium.open(TestDriver.backUrl);
		selenium.windowMaximize();
		
		//输入用户名和密码
		selenium.type(BackLoginPage.getUser(), TestDriver.user);
		selenium.type(BackLoginPage.getPassword(), TestDriver.password);
		
		selenium.click(BackLoginPage.getLoginButton());
		selenium.waitForPageToLoad("30000");
		
	}	
	
	/**
	 * 从前台首页进入登入页面
	 * @param selenium
	 */
	public static void frontLogin(Selenium selenium){
		
		selenium.open(TestDriver.frontUrl);
		selenium.windowMaximize();
		
		selenium.click(IndexPage.getLoginButton());
		selenium.waitForPageToLoad("30000");
		
	}

}
