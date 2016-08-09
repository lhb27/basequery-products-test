package com.eenet.basequery.learncenter;

import java.util.ArrayList;

import com.eenet.base.SimpleResultSet;
import com.eenet.base.biz.SimpleBizImpl;
import com.eenet.base.query.OrderBy;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.Rank;

public class LCStudentDynaServiceImpl extends SimpleBizImpl implements LCStudentDynaService {

	@Override
	public SimpleResultSet<LCStudentDyna> getLCStudentDyna(QueryCondition condition) {
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
	public Class<LCStudentDyna> getPojoCLS() {
		// TODO Auto-generated method stub
		return LCStudentDyna.class;
	}

}
