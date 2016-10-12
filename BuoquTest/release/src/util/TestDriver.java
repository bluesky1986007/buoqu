package util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.openqa.selenium.SeleneseCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * 测试前后需要初始化的一些数据和配置
 * 
 * @author ALLEN
 * 
 */
public class TestDriver {
	public static Log log = LogFactory.getLog(TestDriver.class);

	/**
	 * selenium服务器
	 */
	public static SeleniumServer server; 
	/**
	 * 前台首页地址
	 */
	public static String frontUrl;
	/**
	 * 后台首页地址
	 */
	public static String backUrl;
	/**
	 * IE浏览器
	 */
	public static String IE;
	/**
	 * FireFox浏览器
	 */
	public static String FireFox;
	/**
	 * 后台登入用户名
	 */
	public static String user;
	/**
	 * 后台登入密码
	 */
	public static String password;
	/**
	 * config.xml对应的doc文档
	 */
	public static Document configDoc;
	/**
	 * 配置文件更节点名称，初始默认为 "config"
	 */
	public static String configRootName = "config";
	/**
	 * config.xml路径
	 */
	public static String configXMLPath = "XML\\config.xml";
	/**
	 * 响应最大超时时间
	 */
	public static String timeOut = "180000";
	/**
	 * selenium服务器状态
	 */
	public static Boolean ServerStatus = false;


	/**
	 * 启动基于selenium的webDriver
	 * @param selenium
	 * @param browser
	 */ 
	public static WebDriver SeleniumWebdriverStart(Selenium selenium,String browser){
		WebDriver driver=null ;
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(browser);
			CommandExecutor executor = new SeleneseCommandExecutor(selenium);
			driver= new RemoteWebDriver(executor, capabilities); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("初始化WebDriverBackedSelenium时出错！");
			e.printStackTrace();
		}		
		return driver;
	}
	
	/**
	 * 初始化一个基于selenium的WebDriver
	 * @param selenium
	 * @param browser
	 * @return
	 */
	public static WebDriver webDriverInitialize(Selenium selenium,String browser){ 
    	WebDriver driver = null;
		try {			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(browser);
			CommandExecutor executor = new SeleneseCommandExecutor(selenium);
			driver = new RemoteWebDriver(executor, capabilities); 
			selenium.setTimeout(timeOut);	
			transIEXpath(selenium,browser);			
			log.fatal("WebDriver Initialized Successfully!");			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("初始化WebDriver时出错！");
			e.printStackTrace();
		}
		return driver;		
	}

	/**
	 * 得到相应的dataXML document
	 * @param classObjectName
	 * @return
	 */
	public static Document getDataDoc(String classObjectName){
		
		String dataXmlPath="";	
		String frontOrBack="";
		String dataXml = null;
		Document doc = null;
		
		try {
			ArrayList<String> classInfo = getClassInfo(classObjectName);
			String className = (String) classInfo.get(0);
			
			if (2==classInfo.size()) {
				frontOrBack = (String) classInfo.get(1);
			} 
			
			if ("".equals(frontOrBack)) {
				dataXmlPath = "dataxml," + className;
			} else {
				dataXmlPath = "dataxml," + frontOrBack + "," + className;
			}
			
			dataXml = Autoxml.getConfigValueByPath(configDoc, dataXmlPath);
			doc = Autoxml.loadDocument(dataXml);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("初始化dataXML document时出错");
			log.fatal("config.xml中XML路径: "+dataXmlPath);
			log.fatal("数据XML路径："+dataXml);
			e.printStackTrace();
		}
		
		return doc;		
	}
	
	/**
	 * 初始化config.xml文件数据
	 * 
	 * @param projectName 项目名
	 * @param className 类名
	 */
	public static void initConfig() {

		String frontUrlPath = "url,frontIndex";
		String backUrlPath = "url,backIndex";
		String iePath = "browser,ie";
		String firefoxPath = "browser,firefox";
		String userPath = "userInfo,user";
		String passwordPath = "userInfo,password";
		
		try {			
			
			configDoc = Autoxml.loadDocument(configXMLPath);

			frontUrl = Autoxml.getConfigValueByPath(configDoc, frontUrlPath);
			backUrl = Autoxml.getConfigValueByPath(configDoc, backUrlPath);
			IE = Autoxml.getConfigValueByPath(configDoc, iePath);
			FireFox = Autoxml.getConfigValueByPath(configDoc, firefoxPath);
			user = Autoxml.getConfigValueByPath(configDoc, userPath);
			password = Autoxml.getConfigValueByPath(configDoc, passwordPath);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("读取config信息时出错");
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取包名中的信息
	 */
	public static ArrayList<String> getClassInfo(String classObjectName) {

		ArrayList<String> classNameInfo = new ArrayList<String>();
		try {
			String[] classInfo = classObjectName.split("\\.");

			if (2 == classInfo.length) {
				classNameInfo.add(0, classInfo[1]);
			} else if (3 == classInfo.length) {				
				classNameInfo.add(0,classInfo[2]);
				classNameInfo.add(1,classInfo[1]);
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.fatal("取Class名信息时出错");
			e.printStackTrace();
		}
		
		return classNameInfo;
	}

	/**
	 * 启动selenium服务器
	 * 
	 * @throws Exception
	 */
	public static void serverStart() throws Exception {

		if (!ServerStatus) {
			server = new SeleniumServer();
			server.start();
			ServerStatus = true;
			log.fatal("Selenium Server Started Successfully");
		}
	}

	/**
	 * 单独启动一个selenium
	 * @param selenium
	 * @param browser
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static Selenium seleniumInitial(Selenium selenium, String browser,
			String url) throws Exception{
		
		selenium = new DefaultSelenium("localhost",
				4444, browser, url);
		selenium.start();
		log.fatal("Selenium Initialized Successfully");
		
		return selenium;
	}
	
	/**
	 * 初始化webDriver-Selenium
	 * 
	 * @param selenium
	 * @param browser
	 * @param url
	 * @return selenium
	 * @throws Exception
	 */
	public static Map<String,Object> SeleniumWebdriverInitial(Selenium selenium, String browser,
			String url) throws Exception {
		
		Map<String,Object> map=new HashMap<String,Object>();
		selenium = new DefaultSelenium("localhost",
				4444, browser, url);		

		map.put("webDriver",SeleniumWebdriverStart(selenium,browser)); 
		
		selenium.setTimeout(timeOut);	
		transIEXpath(selenium,browser);
		
		map.put("selenium", selenium);
		log.fatal("Selenium-WebDriver Initialized Successfully");
		return map;
	}
	
//	public static Selenium SeleniumWebdriverInitial(Selenium selenium, String browser,
//			String url) throws Exception {		
//
//		selenium = new DefaultSelenium("localhost",
//				4444, browser, url);		
//		SeleniumWebdriverStart(selenium,browser);
//
//		selenium.setTimeout(timeOut);	
//		transIEXpath(selenium,browser);
//		log.fatal("Selenium-WebDriver Initialized Successfully");
//
//		return selenium;
//	}

	/**
	 * 关闭窗口，停止selenium
	 * 
	 * @param selenium
	 */
	public static void seleniumStop(Selenium selenium) {
		selenium.close();
		if (selenium != null) {
			selenium.stop();
			log.fatal("Selenium Stoped");
		}
	}
	
	/**
	 * 使ie对xpath支持更快
	 * @param selenium
	 * @param browser
	 */
	public static void transIEXpath(Selenium selenium,String browser){	
		if (browser.equalsIgnoreCase("*iexplore")) {
			selenium.useXpathLibrary("javascript-xpath");
		}		
	}

	/**
	 * 停止selenium服务器
	 */
	public static void serverStop() {
		if (ServerStatus) {
			server.stop();
			ServerStatus = false;
			log.fatal("Selenium Server Stoped Successfully");
		}
	}

}
