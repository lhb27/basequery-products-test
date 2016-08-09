package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.ConditionItem;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.RangeType;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.sales.SaleStudentDynaService;
import com.eenet.util.EEBeanUtils;

public class SaleStudentDynaTest extends SpringEnv {

	@Test
	public void crud(){
		SaleStudentDynaService service = (SaleStudentDynaService)super.getContext().getBean("SaleStudentDynaService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getSaleStudentDyna(queryCondition));
		System.out.println("result----"+result);
		
		queryCondition.addCondition(new ConditionItem("studentName", RangeType.INCLUDE, "明",""));
		result = EEBeanUtils.object2Json(service.getSaleStudentDyna(queryCondition));
		System.out.println("result----"+result);
	}
}
