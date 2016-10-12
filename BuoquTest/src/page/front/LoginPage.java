package page.front;

public class LoginPage {	
	
	//立即注册博取账号按钮
	private static String regButton;
	//用户名输入框
	private static String loginInput;
	//密码输入框
	private static String passwordInput;
	//登入按钮
	private static String loginButton;
	
	
	/**
	 * @return the loginButton
	 */
	public static String getLoginButton() {
		loginButton = "//form[@id='loginForm']/table/tbody/tr[4]/td[2]/a[1]/img";
		return loginButton;
	}

	/**
	 * @param loginButton the loginButton to set
	 */
	public static void setLoginButton(String loginButton) {
		LoginPage.loginButton = loginButton;
	}

	/**
	 * @return the loginInput
	 */
	public static String getLoginInput() {
		loginInput = "//form[@id='loginForm']/table/tbody/tr[1]/td[2]/input";
		return loginInput;
	}

	/**
	 * @return the passwordInput
	 */
	public static String getPasswordInput() {
		passwordInput = "//form[@id='loginForm']/table/tbody/tr[2]/td[2]/input";
		return passwordInput;
	}

	/**
	 * @param loginInput the loginInput to set
	 */
	public static void setLoginInput(String loginInput) {
		LoginPage.loginInput = loginInput;
	}

	/**
	 * @param passwordInput the passwordInput to set
	 */
	public static void setPasswordInput(String passwordInput) {
		LoginPage.passwordInput = passwordInput;
	}

	/**
	 * 立即注册博取账号按钮
	 * @return the regButton
	 */
	public static String getRegButton() {
		regButton="//div[@class='login_rightbar']/p[1]/a[1]/img";
		return regButton;
	}

	/**
	 * 立即注册博取账号按钮
	 * @param regButton the regButton to set
	 */
	public static void setRegButton(String regButton) {
		LoginPage.regButton = regButton;
	}			

}
