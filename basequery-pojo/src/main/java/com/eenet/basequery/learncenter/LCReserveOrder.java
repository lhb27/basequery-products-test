package com.eenet.basequery.learncenter;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class LCReserveOrder extends BaseEntity{

	private static final long serialVersionUID = -6486474886160536080L;
	private String userId;//用户ID
	private String userAccountId;//用户账号
	private String studentName;//用户名称
	private String mobile;//用户手机
	private String productId;//产品ID
	private String productName;//产品名称
	private String colleges;//院校
	private String schoolchinesename;//院校名称
	private String learncenterId;//跟进人所在学习中心ID
	private String learncenterName;//跟进人所在学习中心名称
	private String learncenterUserId;//跟进人账号ID
	private String loginAccount;//跟进人账号
	private String staffName;//跟进人姓名
	private String followResult;//跟进结果编码
	private String followResultName;//跟进结果名称
	private String followContent;//跟进内容
	private Date followDate;//跟进时间
	private String orderStatus;//预报读订单状态编码
	private String orderStatusName;//预报读订单状态名称
	private Date createdDt;//预报读订单创建时间
	public String getFollowResultName() {
		return followResultName;
	}
	public void setFollowResultName(String followResultName) {
		this.followResultName = followResultName;
	}
	public String getOrderStatusName() {
		return orderStatusName;
	}
	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserAccountId() {
		return userAccountId;
	}
	public void setUserAccountId(String userAccountId) {
		this.userAccountId = userAccountId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getColleges() {
		return colleges;
	}
	public void setColleges(String colleges) {
		this.colleges = colleges;
	}
	public String getSchoolchinesename() {
		return schoolchinesename;
	}
	public void setSchoolchinesename(String schoolchinesename) {
		this.schoolchinesename = schoolchinesename;
	}
	public String getLearncenterId() {
		return learncenterId;
	}
	public void setLearncenterId(String learncenterId) {
		this.learncenterId = learncenterId;
	}
	public String getLearncenterName() {
		return learncenterName;
	}
	public void setLearncenterName(String learncenterName) {
		this.learncenterName = learncenterName;
	}
	public String getLearncenterUserId() {
		return learncenterUserId;
	}
	public void setLearncenterUserId(String learncenterUserId) {
		this.learncenterUserId = learncenterUserId;
	}
	public String getLoginAccount() {
		return loginAccount;
	}
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getFollowResult() {
		return followResult;
	}
	public void setFollowResult(String followResult) {
		this.followResult = followResult;
	}
	public String getFollowContent() {
		return followContent;
	}
	public void setFollowContent(String followContent) {
		this.followContent = followContent;
	}
	public Date getFollowDate() {
		return followDate;
	}
	public void setFollowDate(Date followDate) {
		this.followDate = followDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
}
