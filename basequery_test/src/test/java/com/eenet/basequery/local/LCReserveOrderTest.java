package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.QueryCondition;
import com.eenet.basequery.learncenter.LCReserveOrderService;
import com.eenet.basequery.learncenter.LCStudentDynaService;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.util.EEBeanUtils;

public class LCReserveOrderTest extends SpringEnv {

	@Test
	public void crud(){
		LCReserveOrderService service = (LCReserveOrderService)super.getContext().getBean("LCReserveOrderService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getLCReserveOrder(queryCondition));
		System.out.println("result----"+result);
	}
}
