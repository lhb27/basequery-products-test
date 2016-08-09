package com.eenet.basequery.local;

import org.junit.Test;

import com.eenet.base.query.ConditionItem;
import com.eenet.base.query.QueryCondition;
import com.eenet.base.query.RangeType;
import com.eenet.basequery.local.env.SpringEnv;
import com.eenet.basequery.resource.REStudentAssessService;
import com.eenet.util.EEBeanUtils;

public class REStudentAssessTest extends SpringEnv {

	@Test
	public void crud(){
		REStudentAssessService service = (REStudentAssessService)super.getContext().getBean("REStudentAssessService");		
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setMaxQuantity(10);
		queryCondition.setStartIndex(0);
		String result = EEBeanUtils.object2Json(service.getREStudentAssess(queryCondition));
		System.out.println("result----"+result);
		
		queryCondition.addCondition(new ConditionItem("courseName", RangeType.INCLUDE, "汽车传动系",""));
		result = EEBeanUtils.object2Json(service.getREStudentAssess(queryCondition));
		System.out.println("result----"+result);
	}
}
