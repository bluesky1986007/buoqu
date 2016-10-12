package page.front;

/**
 * 搜索-文章页面
 * @author Allen
 *
 */
public class FrontSearchArticlePage {
	
	//注册按钮
	private static String regButton;
	
	
	/**
	 * 搜索-文章页面注册按钮
	 * @return the regButton
	 */
	public static String getRegButton() {
		regButton ="//html/body/div[1]/div/ul[2]/li[5]/a/img";
		return regButton;
	}

	/**
	 * 搜索-文章页面注册按钮
	 * @param regButton the regButton to set
	 * @return 
	 */
	public static void setRegButton(String regButton) {
		FrontSearchArticlePage.regButton = regButton;
	}

}
