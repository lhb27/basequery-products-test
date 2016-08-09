package com.eenet.basequery.learncenter;

import java.util.ArrayList;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.biz.SimpleBizImpl;
import com.eenet.base.query.OrderBy;
import com.eenet.base.query.Rank;
import com.eenet.base.query.QueryCondition;

public class LCReserveOrderServiceImpl extends SimpleBizImpl implements LCReserveOrderService {

	@Override
	public SimpleResultSet<LCReserveOrder> getLCReserveOrder(QueryCondition condition) {
		if(condition.getOrderBySet()== null ||condition.getOrderBySet().isEmpty()){
			ArrayList<OrderBy> orderList = new ArrayList<OrderBy>();
			OrderBy order = new OrderBy();
			order.setAttName("createdDt");
			order.setRank(Rank.DESC);
			orderList.add(order);
			condition.setOrderBySet(orderList);
		}
		return super.query(condition);
	}

	@Override
	public Class<LCReserveOrder> getPojoCLS() {
		// TODO Auto-generated method stub
		return LCReserveOrder.class;
	}

}
