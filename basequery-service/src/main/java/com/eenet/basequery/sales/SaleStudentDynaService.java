package com.eenet.basequery.sales;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface SaleStudentDynaService {

	/**
	 * 获取推广学员学习情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<SaleStudentDyna> getSaleStudentDyna(QueryCondition condition);
}
