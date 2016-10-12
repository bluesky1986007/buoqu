package data.front;

import java.util.HashMap;


import org.dom4j.Document;

import util.Autoxml;


public class RegistData {
	
	//注册电子邮件
	private String mailAddress;
	//注册手机号码
	private String mobile;
	//注册昵称
	private String selName;
	//注册密码
	private String password;
	//注册密码确认
	private String passwordConfirm;
	//注册验证码
	private String verifyCode;
	//注册成功账号
	private String account;
	//注册成功地址
	private String regSuccessUrl;
	@SuppressWarnings("rawtypes")
	//注册测试数据集
	private HashMap maganize;

	
	public RegistData(Document doc){
		initData(doc);			
		
	}
	
	/**
	 * 初始化非循环数据
	 * @param doc
	 */
	public void initData(Document doc){
		
		regSuccessUrl = Autoxml.getNodeValueByPath(doc, "Regist,verify,regSuccessUrl");
				
	}
	
	/**
	 * 初始化循环测试数据
	 * @param doc
	 * @param num 为节点名尾数编号
	 */
	public void initData(Document doc,int num){
		
		maganize = Autoxml.getNodeValuesByPath(doc, "Regist,register,register", num);
		
		mailAddress = (String) maganize.get("mailAddress");
		mobile = (String) maganize.get("mobile");
		selName = (String) maganize.get("selName");
		password = (String) maganize.get("password");
		passwordConfirm = (String) maganize.get("passwordConfirm");
		verifyCode = (String) maganize.get("verifyCode");
		account = (String) maganize.get("account");

	}
	
	
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the regSuccessUrl
	 */
	public String getRegSuccessUrl() {
		return regSuccessUrl;
	}

	/**
	 * @param regSuccessUrl the regSuccessUrl to set
	 */
	public void setRegSuccessUrl(String regSuccessUrl) {
		this.regSuccessUrl = regSuccessUrl;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}
	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the selName
	 */
	public String getSelName() {
		return selName;
	}
	/**
	 * @param selName the selName to set
	 */
	public void setSelName(String selName) {
		this.selName = selName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return password;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.password = passWord;
	}
	/**
	 * @return the passWordConfirm
	 */
	public String getPassWordConfirm() {
		return passwordConfirm;
	}
	/**
	 * @param passWordConfirm the passWordConfirm to set
	 */
	public void setPassWordConfirm(String passWordConfirm) {
		this.passwordConfirm = passWordConfirm;
	}
	/**
	 * @return the verifyCode
	 */
	public String getVerifyCode() {
		return verifyCode;
	}
	/**
	 * @param verifyCode the verifyCode to set
	 */
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
