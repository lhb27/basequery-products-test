package com.eenet.basequery.sales;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface SaleCustomerService {
	
	/**
	 * 获取推广客户情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<SaleCustomer> getSaleCustomer(QueryCondition condition);

}
