package com.eenet.basequery.learncenter;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class LCStudentDyna extends BaseEntity{

	private static final long serialVersionUID = 4589766533123113709L;
	private String studentId;//学员ID
	private String studentName;//学员姓名
	private String learnNumber;//学号
	private String networkSchoolCode;//网院
	private String schoolChineseName;//网院名称
	private String learncenterId;//学习中心
	private String learncenterName;//学习中心名称
	private String educationProductId;//报读产品ID
	private String productName;//产品名称
	private String productTypeCode;//产品类型编码
	private String productTypeName;//产品类型名称
	private String termId;//期
	private String termName;//期名
	private String classId;//班级
	private String className;//班名
	private String actCount;//活动数
	private String mustCount;//必修活动数
	private String myActcount;//已完成活动数
	private String myMustactcount;//已完成必修数
	private String myCourseProgress;//进度
	private Date createdDt;//创建时间
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
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
	public String getLearnNumber() {
		return learnNumber;
	}
	public void setLearnNumber(String learnNumber) {
		this.learnNumber = learnNumber;
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
	public String getProductTypeCode() {
		return productTypeCode;
	}
	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	public String getTermName() {
		return termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getActCount() {
		return actCount;
	}
	public void setActCount(String actCount) {
		this.actCount = actCount;
	}
	public String getMustCount() {
		return mustCount;
	}
	public void setMustCount(String mustCount) {
		this.mustCount = mustCount;
	}
	public String getMyActcount() {
		return myActcount;
	}
	public void setMyActcount(String myActcount) {
		this.myActcount = myActcount;
	}
	public String getMyMustactcount() {
		return myMustactcount;
	}
	public void setMyMustactcount(String myMustactcount) {
		this.myMustactcount = myMustactcount;
	}
	public String getMyCourseProgress() {
		return myCourseProgress;
	}
	public void setMyCourseProgress(String myCourseProgress) {
		this.myCourseProgress = myCourseProgress;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	

}

