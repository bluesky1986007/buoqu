package page.front;

/**
 * 注册页面
 * @author Allen
 *
 */
public class RegistPage {
	
	//电子邮件
	private static String mailAddress;
	//手机号码
	private static String mobile;
	//性别选择框
	private static String sexRadio;
	//昵称
	private static String selName;
	//密码
	private static String password;
	//密码确认
	private static String passwordConfirm;
	//验证码
	private static String verifyCode;
	//条款阅读复选框
	private static String confrimCheckbox;
	//注册确认按钮
	private static String confirmButton;
	//用户注册链接
	private static String regLink;
	
	
	/**
	 * 用户注册链接
	 * @return the regLink
	 */
	public static String getRegLink() {
		regLink="//div[@class='crumb_bar font12 fL']/a[2]";
		return regLink;
	}
	
	/**
	 * 用户注册链接
	 * @param regLink the regLink to set
	 */
	public static void setRegLink(String regLink) {
		RegistPage.regLink = regLink;
	}
	/**
	 * 电子邮箱
	 * @return the mailAddress
	 */
	public static String getMailAddress() {
		mailAddress="//input[@id='textfield']";
		return mailAddress;
	}
	/**
	 * 电子邮箱
	 * @param mailAddress the mailAddress to set
	 */
	public static void setMailAddress(String mailAddress) {
		RegistPage.mailAddress = mailAddress;
	}
	/**
	 * 手机号码
	 * @return the mobile
	 */
	public static String getMobile() {
		mobile="//input[@id='textfield2']";
		return mobile;
	}
	/**
	 * 手机号码
	 * @param mobile the mobile to set
	 */
	public static void setMobile(String mobile) {
		RegistPage.mobile = mobile;
	}
	/**
	 * 性别选择按钮
	 * @return the sexRadio
	 */
	public static String getSexRadio() {
		sexRadio="id=radio";
		return sexRadio;
	}
	/**
	 *  性别选择按钮
	 * @param sexRadio the sexRadio to set
	 */
	public static void setSexRadio(String sexRadio) {
		RegistPage.sexRadio = sexRadio;
	}
	/**
	 * 昵称
	 * @return the selName
	 */
	public static String getSelName() {
		selName="//input[@id='textfield3']";
		return selName;
	}
	/**
	 * 昵称
	 * @param selName the selName to set
	 */
	public static void setSelName(String selName) {
		RegistPage.selName = selName;
	}
	/**
	 * 密码
	 * @return the passWord
	 */
	public static String getPassWord() {
		password="//input[@id='textfield4']";
		return password;
	}
	/**
	 * 密码
	 * @param password the password to set
	 */
	public static void setPassWord(String passWord) {
		RegistPage.password=passWord;
	}
	/**
	 * 密码确认
	 * @return the passWordConfirm
	 */
	public static String getPassWordConfirm() {
		passwordConfirm="//input[@id='textfield5']";
		return passwordConfirm;
	}
	/**
	 * 密码确认
	 * @param passwordConfirm the passwordConfirm to set
	 */
	public static void setPassWordConfirm(String passWordConfirm) {
		RegistPage.passwordConfirm = passWordConfirm;
	}
	/**
	 * 验证码
	 * @return the verifyCode
	 */
	public static String getVerifyCode() {
		verifyCode="//input[@id='textfield6']";
		return verifyCode;
	}
	/**
	 * 验证码
	 * @param verifyCode the verifyCode to set
	 */
	public static void setVerifyCode(String verifyCode) {
		RegistPage.verifyCode = verifyCode;
	}
	/**
	 * 条款阅读复选框
	 * @return the confrimCheckbox
	 */
	public static String getConfrimCheckbox() {
		confrimCheckbox="id=checkbox";
		return confrimCheckbox;
	}
	/**
	 * 条款阅读复选框
	 * @param confrimCheckbox the confrimCheckbox to set
	 */
	public static void setConfrimCheckbox(String confrimCheckbox) {
		RegistPage.confrimCheckbox = confrimCheckbox;
	}
	/**
	 * 注册确认按钮
	 * @return the confirmButton
	 */
	public static String getConfirmButton() {
		confirmButton="//td[2]/a/img";
		return confirmButton;
	}
	/**
	 * 注册确认按钮
	 * @param confirmButton the confirmButton to set
	 */
	public static void setConfirmButton(String confirmButton) {
		RegistPage.confirmButton = confirmButton;
	}


}
