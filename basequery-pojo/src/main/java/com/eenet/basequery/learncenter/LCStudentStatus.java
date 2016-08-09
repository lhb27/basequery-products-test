package com.eenet.basequery.learncenter;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class LCStudentStatus extends BaseEntity{

	private static final long serialVersionUID = 3519236379970736963L;
	private String networkSchoolCode;//网院编码
	private String schoolChineseName;//网院名称
	private String learncenterId;//学习中心ID
	private String learncenterName;//学习中心名称
	private String productTypeCode;//产品类型编码
	private String productTypeName;//产品类型名称
	private String educationProductId;//产品ID
	private String productName;//产品名称
	private String educationLevel;//层次编码
	private String educationLevelName;//层次名称
	private String gradeId;//年级/期ID
	private String gradeName;//年级/期名称
	private String rollStatus;//学籍状态编码
	private String rollStatusName;//学籍状态名称
	private String studyPeriod;//学制
	private Date learningStart;//开始时间
	private Date learningEnd;//结束时间
	private String studentName;//学员名称
	private String provinceCode;//省编码
	private String provinceName;//省名称
	private String citycode;//市编码
	private String cityName;//城市名称
	private String districtCode;//区编码
	private String districtName;//区名称
	private String unitCode;//企业/单位ID
	private String customerName;//企业名称
	private Date createdDt;//学籍表创建时间
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getEducationLevelName() {
		return educationLevelName;
	}
	public void setEducationLevelName(String educationLevelName) {
		this.educationLevelName = educationLevelName;
	}
	public String getRollStatusName() {
		return rollStatusName;
	}
	public void setRollStatusName(String rollStatusName) {
		this.rollStatusName = rollStatusName;
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
	public String getProductTypeCode() {
		return productTypeCode;
	}
	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
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
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public String getRollStatus() {
		return rollStatus;
	}
	public void setRollStatus(String rollStatus) {
		this.rollStatus = rollStatus;
	}
	public String getStudyPeriod() {
		return studyPeriod;
	}
	public void setStudyPeriod(String studyPeriod) {
		this.studyPeriod = studyPeriod;
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
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
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
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
