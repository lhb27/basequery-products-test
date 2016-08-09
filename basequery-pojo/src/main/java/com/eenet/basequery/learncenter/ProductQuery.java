package com.eenet.basequery.learncenter;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class ProductQuery extends BaseEntity {

	private static final long serialVersionUID = -3582515039808105844L;	
	public String getNetWorkSchoolCode() {
		return netWorkSchoolCode;
	}
	public void setNetWorkSchoolCode(String netWorkSchoolCode) {
		this.netWorkSchoolCode = netWorkSchoolCode;
	}
	public String getSchoolChineseName() {
		return schoolChineseName;
	}
	public void setSchoolChineseName(String schoolChineseName) {
		this.schoolChineseName = schoolChineseName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStudyPreriod() {
		return studyPreriod;
	}
	public void setStudyPreriod(String studyPreriod) {
		this.studyPreriod = studyPreriod;
	}
	public String getFeeDesc() {
		return feeDesc;
	}
	public void setFeeDesc(String feeDesc) {
		this.feeDesc = feeDesc;
	}
	public String getProductHour() {
		return productHour;
	}
	public void setProductHour(String productHour) {
		this.productHour = productHour;
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
	public String getBaseNum() {
		return baseNum;
	}
	public void setBaseNum(String baseNum) {
		this.baseNum = baseNum;
	}
	public String getSalesStatus() {
		return salesStatus;
	}
	public void setSalesStatus(String salesStatus) {
		this.salesStatus = salesStatus;
	}
	public String getSalesModel() {
		return salesModel;
	}
	public void setSalesModel(String salesModel) {
		this.salesModel = salesModel;
	}
	public String getFeeAuditStatus() {
		return feeAuditStatus;
	}
	public void setFeeAuditStatus(String feeAuditStatus) {
		this.feeAuditStatus = feeAuditStatus;
	}
	public String getOnShelvesStatus() {
		return onShelvesStatus;
	}
	public void setOnShelvesStatus(String onShelvesStatus) {
		this.onShelvesStatus = onShelvesStatus;
	}
	public Date getApplyStartDt() {
		return applyStartDt;
	}
	public void setApplyStartDt(Date applyStartDt) {
		this.applyStartDt = applyStartDt;
	}
	public Date getApplyEndDt() {
		return applyEndDt;
	}
	public void setApplyEndDt(Date applyEndDt) {
		this.applyEndDt = applyEndDt;
	}
	private String netWorkSchoolCode;
	private String schoolChineseName;
	private String productCode;
	private String productName;
	private String studyPreriod;
	private String feeDesc;
	private String productHour;
	private String gradeId;
	private String gradeName;
	private String baseNum;
	private String salesStatus;
	private String salesModel;
	private String feeAuditStatus;
	private String onShelvesStatus;
	private Date applyStartDt;
	private Date applyEndDt;
	private String salesStatusName;
	private String salesModelName;
	private String feeAuditStatusName;
	private String onShelvesStatusName;
	private Date createdDt;
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public String getSalesStatusName() {
		return salesStatusName;
	}
	public void setSalesStatusName(String salesStatusName) {
		this.salesStatusName = salesStatusName;
	}
	public String getSalesModelName() {
		return salesModelName;
	}
	public void setSalesModelName(String salesModelName) {
		this.salesModelName = salesModelName;
	}
	public String getFeeAuditStatusName() {
		return feeAuditStatusName;
	}
	public void setFeeAuditStatusName(String feeAuditStatusName) {
		this.feeAuditStatusName = feeAuditStatusName;
	}
	public String getOnShelvesStatusName() {
		return onShelvesStatusName;
	}
	public void setOnShelvesStatusName(String onShelvesStatusName) {
		this.onShelvesStatusName = onShelvesStatusName;
	}
}
