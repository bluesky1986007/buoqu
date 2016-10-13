package SelTest;

import java.net.URL;

import org.dom4j.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.SeleneseCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.TestDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import data.front.LoginData;


public class SelTest{
	
	Document doc;
	private Selenium selenium;
    String url;

  @BeforeClass
  public void beforeClass() {
		
		try {
//			TestDriver.initTest(ProjectName.buoqu, "FrontRegister62");
//			// 转换XML
//			doc = Autoxml.loadDocument(TestDriver.dataXml);
//
//			// 测试环境地址
//			this.url = TestDriver.backUrl;
//
//			// 初始化SELENIUM	
//			selenium = TestDriver.seleniumInitial(selenium, "*firefox D:\\Program Files\\Mozilla Firefox\\firefox.exe",
//					TestDriver.frontUrl);	
//			selenium = TestDriver.seleniumInitial(selenium,"*firefox", "http://www.baidu.com/");

			selenium = new DefaultSelenium("localhost",4444, "*firefox", "http://192.168.0.61/buoqu");
//			selenium.start();
			
			
			System.out.println("testaa");
			

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
  
  
  @Test
  public void f() throws Exception {
	  
        try {
//			WebDriver driver = new FirefoxDriver();
//        	selenium = new WebDriverBackedSelenium(driver, "http://www.baidu.com/");
//			
//            
//        	
//			selenium.open("http://www.baidu.com/");
//			selenium.waitForPageToLoad("30000");
//			selenium.windowMaximize();
			


//			  driver.get("http://www.sina.com.cn/");
//			  
//			  WebElement ele = driver.findElement(By.id("kw"));
//			  
//			  ele.sendKeys("test");
//			  ele.submit();
//			  ele.wait(300000);


        	
        	
        	DesiredCapabilities capabilities = new DesiredCapabilities();
        	capabilities.setBrowserName("*firefox");

        	CommandExecutor executor = new SeleneseCommandExecutor(selenium);
//        	CommandExecutor executor = new SeleneseCommandExecutor(new URL("http://localhost:4444/console"), new URL("http://www.baidu.com/"), capabilities);
        	WebDriver driver = new RemoteWebDriver(executor, capabilities);
			  driver.get("http://192.168.0.61/buoqu");
			  selenium.windowMaximize();
			  
			  driver.findElement(By.id("keyWord")).sendKeys("test");			  
			  driver.findElement(By.xpath("//a[@id='commitButton']/img")).click();

        	
        	
        	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        
//        String testName=selenium.getText("tj_news");
//        System.out.println(testName);        
//        assertEquals("",testName);
//        assertTrue(selenium.isTextPresent(""));
//        selenium.type("xpath=//input[@id='kw']", "aaaa");
//        selenium.click("xpath=//input[@type='submit']"); 
//	  	  
  }
  
//  @Test
  public void f1() throws Exception {
	 
//        selenium.open(url);
//        selenium.waitForPageToLoad("20000");
//        selenium.windowMaximize();
//        
//        selenium.type("xpath=//input[@id='kw']", "test");
//        selenium.click("xpath=//input[@type='submit']");
//        selenium.close();
	  
//	  selenium.open("http://zh-cn.start3.mozilla.com/");
//	  selenium.windowMaximize();

//	  selenium.click("name=tj_login");
//	  selenium.waitForPageToLoad("30000");
//	  selenium.click("name=mem_pass");
	  
 	  	  
  }
  
//@SuppressWarnings("rawtypes")
//@Test
//  public void f2(){
//	  
//	  Document doc = Autoxml.loadDocument("XML\\Test\\Test.xml");  
//	  List a = doc.selectNodes("/employees/Test/test1/*");  
//	  Iterator list = a.iterator();	  
//	  while(list.hasNext()){		  
//		  Element bb = (Element)list.next();		  
//		  String name = bb.getName(); 
//		  System.out.println(name); 
//	  }
//	  
//  }
  
  @Test
  public void test01(){
	  
//	  String a = this.getClass().getName();
//	  String[] b = a.split("\\.");
//	  System.out.println(a);
//	  System.out.println(b.length);
//	  System.out.println(b[0]);
//	  System.out.println(b[1]);
	  
	  try {
		WebDriver driver = new FirefoxDriver();

		  driver.get("http://www.baidu.com/");
		  
		  WebElement ele = driver.findElement(By.id("kw"));
		  
		  ele.sendKeys("test");
		  ele.submit();

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  
  }

  
 
  @AfterClass
  public void afterClass() {
//	  selenium.close();
//	  
//	  if (selenium!=null) {
//		  selenium.stop();
//		
//	}
	  
  }
  

}
