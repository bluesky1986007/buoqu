package page.back;

/**
 * 后台首页登入页面
 * @author ALLEN
 *
 */
public class BackLoginPage {
	
	private static String user;
	private static String password;
	private static String loginButton;
	
	
	/**
	 * 登入按钮
	 * @return the loginButton
	 */
	public static String getLoginButton() {
		loginButton = "//a[@id='commitButton']/img";
		return loginButton;
	}
	/**
	 * 登入按钮
	 * @param loginButton the loginButton to set
	 */
	public static void setLoginButton(String loginButton) {
		BackLoginPage.loginButton = loginButton;
	}
	/**
	 * 后台登入用户
	 * @return the user
	 */
	public static String getUser() {
		user = "username";
		return user;
	}
	/**
	 * 后台登入用户
	 * @param user the user to set
	 */
	public static void setUser(String user) {
		BackLoginPage.user = user;
	}
	/**
	 * 后台登入密码
	 * @return the password
	 */
	public static String getPassword() {
		password = "password";
		return password;
	}
	/**
	 * 后台登入密码
	 * @param password the password to set
	 */
	public static void setPassword(String password) {
		BackLoginPage.password = password;
	}
	
	

}
