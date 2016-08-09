package com.eenet.basequery.sales;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class SaleStudent extends BaseEntity{

	private static final long serialVersionUID = -7818506854912605881L;
	private String studentId;//学员id
	private String studentName;//学员名称
	private String mobile;//手机
	private String provinceCode;//省份编码
	private String provinceName;//省名称
	private String cityCode;//城市编码
	private String cityName;//城市名称
	private String districtCode;//区编码
	private String distinctName;//区名称
	private Date addDate;//下单时间
	private String orderStatus;//订单状态
	private String customerName;//客户企业名称
	private String loginAccount;//推广账户
	private String staffName;//推广人员名称
	private String saleLoginAccount;//销售人员账号
	private String saleStaffName;//销售人员姓名
	private Date createdDt;//学员学籍创建时间
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistinctName() {
		return distinctName;
	}
	public void setDistinctName(String distinctName) {
		this.distinctName = distinctName;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	public String getSaleLoginAccount() {
		return saleLoginAccount;
	}
	public void setSaleLoginAccount(String saleLoginAccount) {
		this.saleLoginAccount = saleLoginAccount;
	}
	public String getSaleStaffName() {
		return saleStaffName;
	}
	public void setSaleStaffName(String saleStaffName) {
		this.saleStaffName = saleStaffName;
	}
	
}
