package com.eenet.basequery;

/**
 * 处理结果代码
 * 2016年7月7日
 * @author Orion
 */
public interface BizCode {
	/**
	 * 代码由两位英文字母和四位数字组成
	 * AA~AZ开始的代码分配给底层框架和公共工具使用
	 * @return 错误代码
	 * 2016年7月7日
	 * @author Orion
	 */
	String getCode();
	
	/**
	 * @return 业务信息
	 * 2016年7月7日
	 * @author Orion
	 */
	String getInfo();
	
	/**
	 * @return 业务代码:业务信息
	 * 2016年7月7日
	 * @author Orion
	 */
	String toString();
}
