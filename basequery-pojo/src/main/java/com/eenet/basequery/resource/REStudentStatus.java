package com.eenet.basequery.resource;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class REStudentStatus extends BaseEntity {

	private static final long serialVersionUID = 1666880081344714801L;
	private String studentId;//学员ID
	private String studentName;//学员名称
	private String sex;//性别
	private String idCard;//身份证
	private String unitCode;//单位编码
	private String customerName;// 单位名称
	private String provinceCode;//省编码
	private String provinceName;//省名称
	private String cityCode;//市编码
	private String cityName;//城市名称
	private String districtCode;//区编码
	private String districtName;//区名称
	private String educationProductId;//产品
	private String productName;//产品名称
	private String networkSchoolCode;//网院编码
	private String schoolChineseName;//网院名称
	private String educationLevel;//层次
	private String educationLevelName;//层次名称
	private Date learningStart;//学习开始时间
	private Date learningEnd;//学习结束时间
	private Date createdDt;//学员学籍创建时间
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public String getEducationLevelName() {
		return educationLevelName;
	}
	public void setEducationLevelName(String educationLevelName) {
		this.educationLevelName = educationLevelName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
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
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getEducationProductId() {
		return educationProductId;
	}
	public void setEducationProductId(String educationProductId) {
		this.educationProductId = educationProductId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getNetworkSchoolCode() {
		return networkSchoolCode;
	}
	public void setNetworkSchoolCode(String networkSchoolCode) {
		this.networkSchoolCode = networkSchoolCode;
	}
	public String getSchoolChineseName() {
		return schoolChineseName;
	}
	public void setSchoolChineseName(String schoolChineseName) {
		this.schoolChineseName = schoolChineseName;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public Date getLearningStart() {
		return learningStart;
	}
	public void setLearningStart(Date learningStart) {
		this.learningStart = learningStart;
	}
	public Date getLearningEnd() {
		return learningEnd;
	}
	public void setLearningEnd(Date learningEnd) {
		this.learningEnd = learningEnd;
	}
}
