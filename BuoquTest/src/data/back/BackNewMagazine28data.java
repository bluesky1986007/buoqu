package data.back;

import java.util.HashMap;


import org.dom4j.Document;

import util.Autoxml;


public class BackNewMagazine28data {
	
	//出版日期
	private String pubDate;
	//传真
	private String fax;
	//单位
	private String company;
	//电子邮箱
	private String email;
	//‘分类’二级下拉框
	private String subselect;
	//国际标准刊号
	private String standedNum;
	//国际统一刊号
	private String unitedNum;
	//联系电话
	private String phone;
	//新建杂志名称
	private String name;
	//‘分类’一级下拉框
	private String select;
	//邮发代号
	private String postcode;
	//邮编
	private String post;
	//杂志描述
	private String descript;
	//职位
	private String occupation;
	//新建杂志页面标题
	private String title;
	//‘新建杂志’输入框名称
	private String verifyName;
	//杂志列表标题
	private String magazineListTitle;
	//创建杂志数据集
	@SuppressWarnings("rawtypes")
	private HashMap cycMaganize;
	
	
	/**
	 * 带参数构造函数
	 * @param doc
	 */
	public BackNewMagazine28data(Document doc){
		
		initData(doc);
		
	}
			
	/**
	 * 初始化非循环测试数据
	 * @param doc
	 */
	public void initData(Document doc){
		
		title = Autoxml.getNodeValueByPath(doc, "pageVerify,navigation,title");
		verifyName = Autoxml.getNodeValueByPath(doc, "pageVerify,navigation,verifyName");
		magazineListTitle = Autoxml.getNodeValueByPath(doc, "pageVerify,magazineListTitle");
				
	}
	
	/**
	 * 循环数据初始化
	 * @param doc
	 * @param num
	 */
	public void initData(Document doc,int num){
		
		cycMaganize = Autoxml.getNodeValuesByPath(doc, "creatMagazine,magazine", num);
		
		pubDate = cycMaganize.get("pubDate").toString();
		fax = cycMaganize.get("fax").toString();
		company = cycMaganize.get("company").toString();
		email = cycMaganize.get("email").toString();
		subselect = cycMaganize.get("subselect").toString();
		standedNum = cycMaganize.get("standedNum").toString();
		unitedNum = cycMaganize.get("unitedNum").toString();
		phone = cycMaganize.get("phone").toString();
		name = cycMaganize.get("name").toString();
		select = cycMaganize.get("select").toString();
		postcode = cycMaganize.get("postcode").toString();
		post = cycMaganize.get("post").toString();
		descript = cycMaganize.get("descript").toString();
		occupation = cycMaganize.get("occupation").toString();		
		
	}	
	
	
	/**
	 * @return the magazineListTitle
	 */
	public String getMagazineListTitle() {
		return magazineListTitle;
	}

	/**
	 * @param magazineListTitle the magazineListTitle to set
	 */
	public void setMagazineListTitle(String magazineListTitle) {
		this.magazineListTitle = magazineListTitle;
	}

	/**
	 * @return the pubDate
	 */
	public String getPubDate() {
		return pubDate;
	}
	/**
	 * @param pubDate the pubDate to set
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the subselect
	 */
	public String getSubselect() {
		return subselect;
	}
	/**
	 * @param subselect the subselect to set
	 */
	public void setSubselect(String subselect) {
		this.subselect = subselect;
	}
	/**
	 * @return the standedNum
	 */
	public String getStandedNum() {
		return standedNum;
	}
	/**
	 * @param standedNum the standedNum to set
	 */
	public void setStandedNum(String standedNum) {
		this.standedNum = standedNum;
	}
	/**
	 * @return the unitedNum
	 */
	public String getUnitedNum() {
		return unitedNum;
	}
	/**
	 * @param unitedNum the unitedNum to set
	 */
	public void setUnitedNum(String unitedNum) {
		this.unitedNum = unitedNum;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the select
	 */
	public String getSelect() {
		return select;
	}
	/**
	 * @param select the select to set
	 */
	public void setSelect(String select) {
		this.select = select;
	}
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * @return the descript
	 */
	public String getDescript() {
		return descript;
	}
	/**
	 * @param descript the descript to set
	 */
	public void setDescript(String descript) {
		this.descript = descript;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the verifyName
	 */
	public String getVerifyName() {
		return verifyName;
	}
	/**
	 * @param verifyName the verifyName to set
	 */
	public void setVerifyName(String verifyName) {
		this.verifyName = verifyName;
	}

	
	
	

}
