package data.front;

import java.util.HashMap;


import org.dom4j.Document;

import util.Autoxml;


public class FrontLogin58data {
	
	//登入用户名
	private String loginUser;
	//登入密码
	private String loginPassword;
	//首页欢迎词
	private String welcomeName;
	//登入后的欢迎词
	private String loginWelcomeName;
	//登入数据
	@SuppressWarnings("rawtypes")
	private HashMap loginData;
	
	
	public FrontLogin58data(Document doc){
		initData(doc);	
	}
	
	
	public void initData(Document doc){
		
		welcomeName = Autoxml.getNodeValueByPath(doc, "FrontLogin58,welcomeName");

	}
	
	public void initData(Document doc,int num){
		
		loginData = Autoxml.getNodeValuesByPath(doc, "FrontLogin58,login", num);
		
		loginUser = loginData.get("loginUser").toString();
		loginPassword = loginData.get("loginPassword").toString();
		loginWelcomeName = loginData.get("loginWelcomeName").toString();
	}


	/**
	 * @return the loginWelcomeName
	 */
	public String getLoginWelcomeName() {
		return loginWelcomeName;
	}


	/**
	 * @param loginWelcomeName the loginWelcomeName to set
	 */
	public void setLoginWelcomeName(String loginWelcomeName) {
		this.loginWelcomeName = loginWelcomeName;
	}


	/**
	 * @return the welcomeName
	 */
	public String getWelcomeName() {
		return welcomeName;
	}


	/**
	 * @param welcomeName the welcomeName to set
	 */
	public void setWelcomeName(String welcomeName) {
		this.welcomeName = welcomeName;
	}


	/**
	 * @return the loginUser
	 */
	public String getLoginUser() {
		return loginUser;
	}


	/**
	 * @param loginUser the loginUser to set
	 */
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}


	/**
	 * @return the loginPassword
	 */
	public String getLoginPassword() {
		return loginPassword;
	}


	/**
	 * @param loginPassword the loginPassword to set
	 */
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

}
