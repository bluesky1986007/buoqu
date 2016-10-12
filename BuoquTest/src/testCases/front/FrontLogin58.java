package testCases.front;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.front.IndexPage;
import page.front.LoginPage;
import util.TestDriver;

import com.thoughtworks.selenium.Selenium;

import data.front.FrontLogin58data;

public class FrontLogin58 {

	public static Log log = LogFactory.getLog(Regist.class);

	FrontLogin58data data;
	Document doc;
	Selenium se;
    
	@BeforeClass
	public void beforeClass() {

		try {
			TestDriver.initConfig();
			doc = TestDriver.getDataDoc(this.getClass().getName());
			data = new FrontLogin58data(doc);
			se = (Selenium) TestDriver.SeleniumWebdriverInitial(se, TestDriver.FireFox,
					TestDriver.frontUrl).get("selenium");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("测试初始化失败!");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	/**
	 * 登入
	 */
	@Test(enabled = true)
	public void indexLogin() {

		try {
			for (int i = 1; i < 2; i++) {
				se.open(TestDriver.frontUrl);
				se.windowMaximize();

				data.initData(doc, i);// 循环测试数据

				// 登入前欢迎词检核
//				Assert.assertEquals(se.getText(IndexPage.getWelcomeName()),
//						data.getWelcomeName());

				se.click(IndexPage.getLoginButton());
				se.waitForPageToLoad("30000");
				
				se.type(LoginPage.getLoginInput(), data.getLoginUser());
				se.type(LoginPage.getPasswordInput(), data.getLoginPassword());
				se.click(LoginPage.getLoginButton());

				// 登入后欢迎词检核
//				 String name = selenium
//				 .getText(FrontIndexPage.getLoginWelcomeName());
//				 String loginWelcomeName = name.substring(0, name.length() -
//				 23);
//				 Assert.assertEquals(loginWelcomeName,
//				 data.getLoginWelcomeName());

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("登入测试出错");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}

	@AfterClass
	public void afterClass() {
		TestDriver.seleniumStop(se); 
	}

}
