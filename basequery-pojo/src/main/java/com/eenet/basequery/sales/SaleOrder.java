package com.eenet.basequery.sales;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class SaleOrder extends BaseEntity{

	private static final long serialVersionUID = 2400024894180087598L;
	private String orderId;//订单ID
	private String orderSn;//订单号
	private String orderStatus;//订单状态编码
	private String orderStatusName;//订单状态名称
	private String payStatus;//支付状态编码
	private String payStatusName;//支付状态名称
	private String learncenterCode;//学习中心编码
	private String learncenterName;//学习中心名称
	private String networkSchoolCode;//网院编码
	private String schoolChineseName;//网院名称
	private String studentId;//学员
	private String studentName;//学员名称
	private String learncenterUserId;//下单人账号ID
	private String loginAccount;//下单人账号
	private String staffName;//下单人名称
	private Date addDate;//下单时间
	private String productId;//产品
	private String productName;//产品名称
	public String getOrderStatusName() {
		return orderStatusName;
	}
	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
	}
	public String getPayStatusName() {
		return payStatusName;
	}
	public void setPayStatusName(String payStatusName) {
		this.payStatusName = payStatusName;
	}
	public String getSchoolChineseName() {
		return schoolChineseName;
	}
	public void setSchoolChineseName(String schoolChineseName) {
		this.schoolChineseName = schoolChineseName;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getLearncenterCode() {
		return learncenterCode;
	}
	public void setLearncenterCode(String learncenterCode) {
		this.learncenterCode = learncenterCode;
	}
	public String getLearncenterName() {
		return learncenterName;
	}
	public void setLearncenterName(String learncenterName) {
		this.learncenterName = learncenterName;
	}
	public String getNetworkSchoolCode() {
		return networkSchoolCode;
	}
	public void setNetworkSchoolCode(String networkSchoolCode) {
		this.networkSchoolCode = networkSchoolCode;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
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
	
	
}
