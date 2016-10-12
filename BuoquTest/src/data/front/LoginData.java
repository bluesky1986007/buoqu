package data.front;

import org.dom4j.Document;

import util.Autoxml;

public class LoginData {
	
	//跳转到的注册页标题
	private String regPageTitle;
	//跳转到的注册页的用户注册链接文字
	private String regLinkText;
	//登入页的标题
	private String logPageTitle;
	
	
	public LoginData(Document doc){
		initData(doc);	
	}
	
	
	public void initData(Document doc){
		
		regPageTitle = Autoxml.getNodeValueByPath(doc, "Login,pageVerify,regPageTitle");
		regLinkText = Autoxml.getNodeValueByPath(doc, "Login,pageVerify,regLinkText");
		logPageTitle = Autoxml.getNodeValueByPath(doc, "Login,pageVerify,logPageTitle");
	}


	/**
	 * @return the logPageTitle
	 */
	public String getLogPageTitle() {
		return logPageTitle;
	}


	/**
	 * @param logPageTitle the logPageTitle to set
	 */
	public void setLogPageTitle(String logPageTitle) {
		this.logPageTitle = logPageTitle;
	}


	/**
	 * @return the regPageTitle
	 */
	public String getRegPageTitle() {
		return regPageTitle;
	}


	/**
	 * @param regPageTitle the regPageTitle to set
	 */
	public void setRegPageTitle(String regPageTitle) {
		this.regPageTitle = regPageTitle;
	}


	/**
	 * @return the regLinkText
	 */
	public String getRegLinkText() {
		return regLinkText;
	}


	/**
	 * @param regLinkText the regLinkText to set
	 */
	public void setRegLinkText(String regLinkText) {
		this.regLinkText = regLinkText;
	}	
	

}
