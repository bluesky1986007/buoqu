package testCases.back;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.TestDriver;
import util.UtilBuoqu;


import com.thoughtworks.selenium.Selenium;

import data.back.BackNewMagazine28data;

import page.back.BackNewMagazinePage;

public class BackNewMagazine28 {
	public static Log log = LogFactory.getLog(BackNewMagazine28.class);

	BackNewMagazine28data data;
	Selenium selenium;

	@BeforeClass
	public void beforeClass() {
		try {

			// 测试驱动
//			TestDriver.initTest(this.getClass().getName());
			// 测试数据
//			data = new BackNewMagazine28data(TestDriver.doc);
			// 初始化SELENIUM
			selenium = TestDriver.seleniumInitial(selenium, TestDriver.FireFox,
					TestDriver.backUrl);
            //后台首页登入
			UtilBuoqu.backLogin(selenium);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("测试初始化出错！");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}

	/**
	 * 新建杂志功能
	 */
	@Test(enabled = true)
	public void newMagazineFunction() {

		try {

			for (int i = 1; i < 3; i++) {
				// 初始化循环数据
//				data.initData(TestDriver.doc, i);

				selenium.click(BackNewMagazinePage.getNewMagazineLink());
				selenium.waitForPageToLoad("30000");

				// 输入新建杂志内容
				selenium.type(BackNewMagazinePage.getName(), data.getName());
				selenium.select(BackNewMagazinePage.getSelect(), "label="
						+ data.getSelect());
				selenium.select(BackNewMagazinePage.getSubselect(), "label="
						+ data.getSubselect());
				selenium.type(BackNewMagazinePage.getDescript(),
						data.getDescript());
				selenium.type(BackNewMagazinePage.getCompany(),
						data.getCompany());
				selenium.type(BackNewMagazinePage.getPhone(), data.getPhone());
				selenium.type(BackNewMagazinePage.getOccupation(),
						data.getOccupation());
				selenium.type(BackNewMagazinePage.getFax(), data.getFax());
				selenium.type(BackNewMagazinePage.getEmail(), data.getEmail());
				selenium.type(BackNewMagazinePage.getPost(), data.getPost());
				selenium.type(BackNewMagazinePage.getPostcode(),
						data.getPostcode());
				selenium.type(BackNewMagazinePage.getStandedNum(),
						data.getStandedNum());
				selenium.type(BackNewMagazinePage.getUnitedNum(),
						data.getUnitedNum());
				selenium.type(BackNewMagazinePage.getPubDate(),
						data.getPubDate());

				// 点击提交
				selenium.click(BackNewMagazinePage.getSubmitButton());
				
				//检核
				Assert.assertEquals(selenium.getTitle(),data.getMagazineListTitle());//新建杂志成功后的跳转页面

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("新建杂志功能测试failed！");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}

	/**
	 * 新建杂志页面校验
	 */
	@Test(enabled = true)
	public void verifyPage() {
		
		String titleName;// 右侧栏标题名称
		String verifyName;// 右侧栏‘新建杂志’输入框名称

		selenium.click(BackNewMagazinePage.getNewMagazineLink());
		selenium.waitForPageToLoad("30000");

		// 验证标题
		titleName = selenium.getText(BackNewMagazinePage.getTitle());
		Assert.assertEquals(titleName, data.getTitle());

		// 验证输入框名称
		verifyName = selenium.getText(BackNewMagazinePage.getVerifyName());
		Assert.assertEquals(verifyName, data.getVerifyName());

	}

	@AfterClass
	public void afterClass() {
		TestDriver.seleniumStop(selenium);
	}

}
