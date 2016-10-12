package page.back;

/**
 * 后台新建杂志页面
 * @author ALLEN
 *
 */
public class BackNewMagazinePage {
	
	//出版日期
	private static String pubDate;
	//传真
	private static String fax;
	//单位
	private static String company;
	//电子邮件
	private static String email;
	//‘分类’二级下拉菜单
	private static String subselect;
	//国际标准刊号
	private static String standedNum;
	//国际统一刊号
	private static String unitedNum;
	//联系电话
	private static String phone;
	//新建杂志名称
	private static String name;
	//‘分类’一级下拉菜单
	private static String select;
	//邮发代号
	private static String postcode;
	//邮编号码
	private static String post;
	//杂志描述
	private static String descript;
	//职位
	private static String occupation;
	//新建杂志链接
	private static String newMagazineLink;
	//杂志列表链接
	private static String magazineListLink;
	//确定按钮
	private static String submitButton;
    //右侧栏标题
	private static String title;
    //右侧栏‘新建杂志’输入框名称
	private static String verifyName;
	
	/**
	 * 出版日期
	 * @return the pubDate
	 */
	public static String getPubDate() {
		pubDate ="//input[@id='publishDate']";
		return pubDate;
	}
	
	/**
	 * 出版日期
	 * @param pubDate the pubDate to set
	 */
	public static void setPubDate(String pubDate) {
		BackNewMagazinePage.pubDate = pubDate;
	}
	
	/**
	 * 传真
	 * @return the fax
	 */
	public static String getFax() {
		fax = "//input[@id='faxNumber']";
		return fax;
	}
	
	/**
	 * 传真
	 * @param fax the fax to set
	 */
	public static void setFax(String fax) {
		BackNewMagazinePage.fax = fax;
	}
	
	/**
	 * 单位
	 * @return the company
	 */
	public static String getCompany() {
		company = "//input[@id='companyName']";
		return company;
	}
	
	/**
	 * 单位
	 * @param company the company to set
	 */
	public static void setCompany(String company) {
		BackNewMagazinePage.company = company;
	}
	
	/**
	 * 电子邮箱
	 * @return the email
	 */
	public static String getEmail() {
		email = "//input[@id='email']";
		return email;
	}
	
	/**
	 * 电子邮箱
	 * @param email the email to set
	 */
	public static void setEmail(String email) {
		BackNewMagazinePage.email = email;
	}
	
	/**
	 * ‘分类’二级下拉菜单
	 * @return the subselect
	 */
	public static String getSubselect() {
		subselect = "categroy1";
		return subselect;
	}
	
	/**
	 * ‘分类’二级下拉菜单
	 * @param subselect the subselect to set
	 */
	public static void setSubselect(String subselect) {
		BackNewMagazinePage.subselect = subselect;
	}
	
	/**
	 * 国际标准刊号
	 * @return the standedNum
	 */
	public static String getStandedNum() {
		standedNum = "//input[@id='serialNumber']";
		return standedNum;
	}
	
	/**
	 * 国际标准刊号
	 * @param standedNum the standedNum to set
	 */
	public static void setStandedNum(String standedNum) {
		BackNewMagazinePage.standedNum = standedNum;
	}
	
	/**
	 * 国际统一刊号
	 * @return the unitedNum
	 */
	public static String getUnitedNum() {
		unitedNum = "//input[@id='issn']";
		return unitedNum;
	}
	
	/**
	 * 国际统一刊号
	 * @param unitedNum the unitedNum to set
	 */
	public static void setUnitedNum(String unitedNum) {
		BackNewMagazinePage.unitedNum = unitedNum;
	}
	
	/**
	 * 联系电话
	 * @return the phone
	 */
	public static String getPhone() {
		phone = "//input[@id='telNumber']";
		return phone;
	}
	
	/**
	 * 联系电话
	 * @param phone the phone to set
	 */
	public static void setPhone(String phone) {
		BackNewMagazinePage.phone = phone;
	}
	
	/**
	 * 新建杂志名称
	 * @return the name
	 */
	public static String getName() {
		name = "//input[@id='magazineName']";
		return name;
	}
	
	/**
	 * 新建杂志名称
	 * @param name the name to set
	 */
	public static void setName(String name) {
		BackNewMagazinePage.name = name;
	}
	
	/**
	 * ‘分类’一级下拉菜单
	 * @return the select
	 */
	public static String getSelect() {
		select = "select1";
		return select;
	}
	
	/**
	 * ‘分类’一级下拉菜单
	 * @param select the select to set
	 */
	public static void setSelect(String select) {
		BackNewMagazinePage.select = select;
	}
	
	/**
	 * 邮发代号
	 * @return the postcode
	 */
	public static String getPostcode() {
		postcode = "//input[@id='postCode']";
		return postcode;
	}
	
	/**
	 * 邮发代号
	 * @param postcode the postcode to set
	 */
	public static void setPostcode(String postcode) {
		BackNewMagazinePage.postcode = postcode;
	}
	
	/**
	 * 邮编号码
	 * @return the post
	 */
	public static String getPost() {
		post = "//input[@id='postNumber']";
		return post;
	}
	
	/**
	 * 邮编号码
	 * @param post the post to set
	 */
	public static void setPost(String post) {
		BackNewMagazinePage.post = post;
	}
	
	/**
	 * 杂志描述
	 * @return the descript
	 */
	public static String getDescript() {
		descript = "//textarea[@id='magazineDescription']";
		return descript;
	}
	
	/**
	 * 杂志描述
	 * @param descript the descript to set
	 */
	public static void setDescript(String descript) {
		BackNewMagazinePage.descript = descript;
	}
	
	/**
	 * 职位
	 * @return the occupation
	 */
	public static String getOccupation() {
		occupation = "//input[@id='position']";
		return occupation;
	}
	
	/**
	 * 职位
	 * @param occupation the occupation to set
	 */
	public static void setOccupation(String occupation) {
		BackNewMagazinePage.occupation = occupation;
	}

	/**
	 * 新建杂志连接
	 * @return the newMagazineLink
	 */
	public static String getNewMagazineLink() {
		newMagazineLink = "link=新建杂志";
		return newMagazineLink;
	}

	/**
	 * 新建杂志连接
	 * @param newMagazineLink the newMagazineLink to set
	 */
	public static void setNewMagazineLink(String newMagazineLink) {
		BackNewMagazinePage.newMagazineLink = newMagazineLink;
	}

	/**
	 * 杂志列表链接
	 * @return the magazineListLink
	 */
	public static String getMagazineListLink() {
		magazineListLink = "link=杂志列表";
		return magazineListLink;
	}

	/**
	 * 杂志列表链接
	 * @param magazineListLink the magazineListLink to set
	 */
	public static void setMagazineListLink(String magazineListLink) {
		BackNewMagazinePage.magazineListLink = magazineListLink;
	}

	/**
	 * 确定按钮
	 * @return the submitButton
	 */
	public static String getSubmitButton() {
		submitButton = "css=#confirmBtn > img";
		return submitButton;
	}

	/**
	 * 确定按钮
	 * @param submitButton the submitButton to set
	 */
	public static void setSubmitButton(String submitButton) {
		BackNewMagazinePage.submitButton = submitButton;
	}

	/**
	 * 右侧栏标题
	 * @return the title
	 */
	public static String getTitle() {
		title = "//div[@class='xjzz_title font14b']";
		return title;
	}

	/**
	 * 右侧栏标题
	 * @param title the title to set
	 */
	public static void setTitle(String title) {
		BackNewMagazinePage.title = title;
	}

	/**
	 * 右侧栏‘新建杂志’输入框名称
	 * @return the verifyName
	 */
	public static String getVerifyName() {
		verifyName = "//div[@class='change_table']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]";
		return verifyName;
	}

	/**
	 * 右侧栏‘新建杂志’输入框名称
	 * @param verifyName the verifyName to set
	 */
	public static void setVerifyName(String verifyName) {
		BackNewMagazinePage.verifyName = verifyName;
	}

}
