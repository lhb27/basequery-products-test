package com.eenet.basequery.resource;

import java.util.Date;

import com.eenet.base.BaseEntity;
import com.eenet.basequery.BizCode;

public class RECourse extends BaseEntity{

	private static final long serialVersionUID = 239669991553396615L;
	private String courseId;//课程ID
	private String courseName;//课程名称
	private String courseStatus;//课程状态编码
	private String courseStatusName;//课程状态名称
	private String courseType;//课程类型编码
	private String courseTypeName;//课程类型名称
	private String networkSchoolCode;//网院编码
	private String schoolChineseName;//网院名称
	private Date publishDt;//发布时间
	private Date createdDt;//创建时间
	public String getCourseStatusName() {
		return courseStatusName;
	}
	public void setCourseStatusName(String courseStatusName) {
		this.courseStatusName = courseStatusName;
	}
	public String getCourseTypeName() {
		return courseTypeName;
	}
	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName;
	}
	private BizCode bizCode;
	public BizCode getBizCode() {
		return bizCode;
	}
	public void setBizCode(BizCode bizCode) {
		this.bizCode = bizCode;
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
	public String getCourseStatus() {
		return courseStatus;
	}
	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
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
	public Date getPublishDt() {
		return publishDt;
	}
	public void setPublishDt(Date publishDt) {
		this.publishDt = publishDt;
	}
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
}
