package testCases.front;


import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.TestDriver;


import com.thoughtworks.selenium.Selenium;

import data.front.RegistData;

import page.front.IndexPage;
import page.front.RegistPage;
import page.front.FrontRegisterSuccessPage;
import page.front.FrontSearchArticlePage;

public class Regist {

	public static Log log = LogFactory.getLog(Regist.class);

	RegistData data;
	Selenium se;
	Document doc;
	Map<String,Object> map;
	
	@BeforeClass
	public void beforeClass() {

		try {
			TestDriver.initConfig();
			doc = TestDriver.getDataDoc(this.getClass().getName());
			data = new RegistData(doc);
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

	/**
	 * 注册功能
	 */
	@Test(enabled = true)
	public void register() {

		try {

			for (int i = 1; i < 2; i++) {// 循环XML中的测试数据

				se.open(TestDriver.frontUrl);
				se.windowMaximize();

				data.initData(doc, i);// 循环测试数据

				// 点击搜索按钮
				se.click(IndexPage.getSearchButton());
				se.waitForPageToLoad("30000");

				// 点击进入注册页面进行注册
				se.click(FrontSearchArticlePage.getRegButton());
				se.type(RegistPage.getMailAddress(),
						data.getMailAddress());
				se.type(RegistPage.getMobile(), data.getMobile());
				se.click(RegistPage.getSexRadio());
				se.type(RegistPage.getSelName(), data.getSelName());
				se.type(RegistPage.getPassWord(),
						data.getPassWord());
				se.type(RegistPage.getPassWordConfirm(),
						data.getPassWordConfirm());
				se.click(RegistPage.getConfrimCheckbox());
				se.click(RegistPage.getConfirmButton());
				
				//检核
				String account = se.getText(FrontRegisterSuccessPage.getAccount());
				Assert.assertEquals(data.getRegSuccessUrl(),se.getLocation());//注册成功地址
				Assert.assertEquals(data.getAccount(),account);//账号信息

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("前台注册功能测试failed！");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}

	@AfterClass
	public void afterClass() {
		TestDriver.seleniumStop(se);
	}

}
