package com.eenet.basequery.sales;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface SaleStudentService {

	/**
	 * 获取推广学员情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<SaleStudent> getSaleStudent(QueryCondition condition);
}
