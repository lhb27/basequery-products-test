package com.eenet.basequery.resource;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class REStudentAssess extends BaseEntity {

	private static final long serialVersionUID = 9184702401702565783L;
	private String networkSchoolCode;//院校
	private String schoolChineseName;//院校名称
	private String educationLevel;//层次编码
	private String educationLevelName;//层次名称
	private String educationProductId;//产品ID
	private String productName;//产品名称
	private String studentId;//学员ID
	private String studentName;//学员姓名
	private String unitCode;//单位编码
	private String customerName;//单位名称
	private String courseId;//课程ID
	private String courseName;//课程名称
	private String termId;//期ID
	private String termName;//期名称
	private String myCoursePoint;//课程成绩
	private String myExamPoint;//考试成绩
	private String myAllPoint;//总成绩
	private String assingScore;//课程要求合格分数
	private String allPoint;//课程要求总分
	private Date createdDt;//学员选课时间
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
	public String getEducationProductId() {
		return educationProductId;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
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
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
	public String getMyCoursePoint() {
		return myCoursePoint;
	}
	public void setMyCoursePoint(String myCoursePoint) {
		this.myCoursePoint = myCoursePoint;
	}
	public String getMyExamPoint() {
		return myExamPoint;
	}
	public void setMyExamPoint(String myExamPoint) {
		this.myExamPoint = myExamPoint;
	}
	public String getMyAllPoint() {
		return myAllPoint;
	}
	public void setMyAllPoint(String myAllPoint) {
		this.myAllPoint = myAllPoint;
	}
	public String getAssingScore() {
		return assingScore;
	}
	public void setAssingScore(String assingScore) {
		this.assingScore = assingScore;
	}
	public String getAllPoint() {
		return allPoint;
	}
	public void setAllPoint(String allPoint) {
		this.allPoint = allPoint;
	}
	
}
