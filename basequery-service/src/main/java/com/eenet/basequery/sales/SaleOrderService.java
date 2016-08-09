package com.eenet.basequery.sales;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface SaleOrderService {
	
	/**
	 * 获取销售订单情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<SaleOrder> getSaleOrder(QueryCondition condition);

}
