package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.ConditionItem;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.RangeType;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.resource.REStudentStatusService;
import com.eenet.util.EEBeanUtils;

public class REStudentStatusTest extends SpringEnv {

	@Test
	public void crud(){
		REStudentStatusService service = (REStudentStatusService)super.getContext().getBean("REStudentStatusService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getREStudentStatus(queryCondition));
		System.out.println("result----"+result);
		
		queryCondition.addCondition(new ConditionItem("productName", RangeType.INCLUDE, "心理咨询",""));
		result = EEBeanUtils.object2Json(service.getREStudentStatus(queryCondition));
		System.out.println("result----"+result);
	}
}
