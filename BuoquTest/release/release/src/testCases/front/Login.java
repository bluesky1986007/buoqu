package testCases.front;

import java.util.Map;

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
 
import data.front.LoginData;

public class Login {
	public static Log log = LogFactory.getLog(Login.class);

	LoginData data; 
	Document doc;
	Selenium se;
	Map<String,Object> map;
	@BeforeClass
	public void beforeClass() {

		try {
			TestDriver.initConfig();
			doc = TestDriver.getDataDoc(this.getClass().getName());
			data = new LoginData(doc);
			map=TestDriver.SeleniumWebdriverInitial(se, TestDriver.FireFox,
					TestDriver.frontUrl);
			se = (Selenium)map.get("selenium");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("测试初始化出错！");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
    
  @Test(enabled=true)
  public void regButtonTest() {
	  se.open(TestDriver.frontUrl);
	  se.windowMaximize();
	  se.click(IndexPage.getLoginButton());
	  se.waitForPageToLoad("30000");
	  se.click(LoginPage.getRegButton());
	  se.waitForPageToLoad("30000");
	  //检核
	  Assert.assertEquals("注册", se.getTitle());  
  }
  
   
  @AfterClass
  public void afterClass() {
	  TestDriver.seleniumStop(se);
  }
}
