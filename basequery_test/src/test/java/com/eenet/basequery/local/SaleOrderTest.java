package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.ConditionItem;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.RangeType;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.sales.SaleCustomerService;
import com.eenet.basequery.sales.SaleOrderService;
import com.eenet.util.EEBeanUtils;

public class SaleOrderTest extends SpringEnv {

	@Test
	public void crud(){
		SaleOrderService service = (SaleOrderService)super.getContext().getBean("SaleOrderService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getSaleOrder(queryCondition));
		System.out.println("result----"+result);
		
		queryCondition.addCondition(new ConditionItem("studentName", RangeType.INCLUDE, "明",""));
		result = EEBeanUtils.object2Json(service.getSaleOrder(queryCondition));
		System.out.println("result----"+result);
	}
}
