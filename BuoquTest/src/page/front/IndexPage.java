package page.front;

/**
 * 首页
 * @author Allen
 */
public class IndexPage {	
	
	//注册按钮
	private static String regButton;
	//搜索按钮
	private static String searchButton;
	//登入按钮
	private static String loginButton;
	//登入用户名
	private static String loginUserInput;
	//登入密码
	private static String loginPasswordInput;
	//首页欢迎词
	private static String welcomeName;
	//登入后欢迎词
	private static String loginWelcomeName;

	
	/**
	 * 登入后欢迎词
	 * @return the loginWelcomeName
	 */
	public static String getLoginWelcomeName() {
		loginWelcomeName = "//ul[@class='fR']/li[1]";
		return loginWelcomeName;
	}

	/**
	 * 登入后欢迎词
	 * @param loginWelcomeName the loginWelcomeName to set
	 */
	public static void setLoginWelcomeName(String loginWelcomeName) {
		IndexPage.loginWelcomeName = loginWelcomeName;
	}

	/**
	 * 首页欢迎词
	 * @return the welcomeName
	 */
	public static String getWelcomeName() {
		welcomeName = "//form[@id='loginFormHeader']/li[1]";
		return welcomeName;
	}

	/**
	 * 首页欢迎词
	 * @param welcomeName the welcomeName to set
	 */
	public static void setWelcomeName(String welcomeName) {
		IndexPage.welcomeName = welcomeName;
	}

	/**
	 * 登入按钮
	 * @return the loginButton
	 */
	public static String getLoginButton() {
		loginButton = "loginImg";
		return loginButton;
	}

	/**
	 * 登入按钮
	 * @param loginButton the loginButton to set
	 */
	public static void setLoginButton(String loginButton) {
		IndexPage.loginButton = loginButton;
	}

	/**
	 * 登入用户名
	 * @return the loginUser
	 */
	public static String getloginUserInput() {
		loginUserInput = "emailInput";
		return loginUserInput;
	}

	/**
	 * 登入用户名
	 * @param loginUser the loginUser to set
	 */
	public static void setloginUserInput(String loginUserInput) {
		IndexPage.loginUserInput = loginUserInput;
	}

	/**
	 * 登入密码
	 * @return the loginPassword
	 */
	public static String getloginPasswordInput() {
		loginPasswordInput = "passwordInput";
		return loginPasswordInput;
	}

	/**
	 * 登入密码
	 * @param loginPassword the loginPassword to set
	 */
	public static void setloginPasswordInput(String loginPasswordInput) {
		IndexPage.loginPasswordInput = loginPasswordInput;
	}

	/**
	 * 首页注册按钮
	 * @return the regButton
	 */
	public static String getRegButton() {
		regButton="//form[@id='loginForm']/li[5]/a/img";
		return regButton;
	}

	/**
	 * 首页注册按钮
	 * @param regButton the regButton to set
	 */
	public static void setRegButton(String regButton) {
		IndexPage.regButton = regButton;
	}

	/**
	 * 首页搜索按钮
	 * @return the searchButton
	 */
	public static String getSearchButton() {
		searchButton="css=p.search > a > img";
		return searchButton;
	}

	/**
	 * 首页搜索按钮
	 * @param searchButton the searchButton to set
	 */
	public static void setSearchButton(String searchButton) {
		IndexPage.searchButton = searchButton;
	}

}
