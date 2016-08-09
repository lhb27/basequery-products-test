package com.eenet.basequery.sales;

import java.util.Date;

import com.eenet.base.BaseEntity;

public class SaleCustomer extends BaseEntity{

	private static final long serialVersionUID = 1293028116411820946L;
	private String customerName;//客户名称
	private String personsScale;//客户人员规模
	private String regFund;//客户注册资金
	private String cooperateStatus;//客户合作状态
	private String cooperateStatusName;//客户合作状态
	private String provinceCode;//省份编码
	private String provinceName;//省名称
	private String cityCode;//城市编码
	private String cityName;//城市名称
	private String districtCode;//区编码
	private String distinctName;//区名称
	private Date activateDt;//激活时间
	private String channelName;//渠道名称
	private String channelCode;//渠道编码
	private String staffName;//推广人员名称
	public String getCooperateStatusName() {
		return cooperateStatusName;
	}
	public void setCooperateStatusName(String cooperateStatusName) {
		this.cooperateStatusName = cooperateStatusName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPersonsScale() {
		return personsScale;
	}
	public void setPersonsScale(String personsScale) {
		this.personsScale = personsScale;
	}
	public String getRegFund() {
		return regFund;
	}
	public void setRegFund(String regFund) {
		this.regFund = regFund;
	}
	public String getCooperateStatus() {
		return cooperateStatus;
	}
	public void setCooperateStatus(String cooperateStatus) {
		this.cooperateStatus = cooperateStatus;
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
	public Date getActivateDt() {
		return activateDt;
	}
	public void setActivateDt(Date activateDt) {
		this.activateDt = activateDt;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	
}
