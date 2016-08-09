package com.eenet.basequery.learncenter;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.query.QueryCondition;

public interface LCReserveOrderService {

	/**
	 * 获取预报读订单情况
	 * @param condition
	 * @return
	 */
	public SimpleResultSet<LCReserveOrder> getLCReserveOrder(QueryCondition condition);
}
