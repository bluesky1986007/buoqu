package page.front;

/**
 * 注册成功页面
 * @author ALLEN
 *
 */
public class FrontRegisterSuccessPage {
	
	private static String account;

	
	/**
	 * 页面账号显示
	 * @return the account
	 */
	public static String getAccount() {
		account = "//span[@class='red']";
		return account;
	}

	/**
	 * 页面账号显示
	 * @param account the account to set
	 */
	public static void setAccount(String account) {
		FrontRegisterSuccessPage.account = account;
	}

}
