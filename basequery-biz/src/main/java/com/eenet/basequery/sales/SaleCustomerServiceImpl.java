package com.eenet.basequery.sales;

import java.util.ArrayList;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.biz.SimpleBizImpl;
import com.eenet.base.query.OrderBy;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.Rank;

public class SaleCustomerServiceImpl extends SimpleBizImpl implements SaleCustomerService {

	@Override
	public SimpleResultSet<SaleCustomer> getSaleCustomer(QueryCondition condition) {
		if(condition.getOrderBySet()== null ||condition.getOrderBySet().isEmpty()){
			ArrayList<OrderBy> orderList = new ArrayList<OrderBy>();
			OrderBy order = new OrderBy();
			order.setAttName("activateDt");
			order.setRank(Rank.DESC);
			orderList.add(order);
			condition.setOrderBySet(orderList);
		}
		return super.query(condition);
	}
	
	@Override
	public  Class<SaleCustomer> getPojoCLS() {
		return SaleCustomer.class;
	}

}
